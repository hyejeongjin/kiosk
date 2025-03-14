package lv4;

import lv3.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private final List<Menu> menus;

    // 생성자
    public Kiosk(List<Menu> menus){
        this.menus = menus;
    }


    Scanner input = new Scanner(System.in);
    // 기능
    public void start() {


        // while문 break 용도
        boolean check = true;

        while (check) {
            // 카테고리 목룍
            System.out.println("[ SKY CAFE ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println(i + 1 + ". " + menus.get(i).getCategory());
            }
            System.out.print("카테고리를 선택해주세요(종료 시 0 입력): ");

            int cate = 0;

            try {
                cate = input.nextInt();
            } catch (Exception e) {
                System.out.println("숫자를 입력해주세요!");
                // 버퍼를 비워서 cate에 들어간 값을 비워줘야함.
                input.nextLine();
                continue;
            }
            int select = 0;

            if(cate == 1){
                System.out.println("[ "+ menus.get(cate - 1).getCategory() + " ]\n");
                menus.get(cate - 1).showMenuItems();
                System.out.println();
                System.out.print("메뉴를 선택해주세요 (0 입력 시 뒤로가기): ");
                selectMenuItem(select, cate);

            }else if(cate == 2){
                System.out.println("[ " + menus.get(cate - 1).getCategory() + "]\n");
                menus.get(cate - 1).showMenuItems();
                System.out.println();
                System.out.print("메뉴를 선택해주세요 (0 입력 시 뒤로가기): ");
                selectMenuItem(select, cate);

            }else if(cate == 3){
                System.out.println("[ " + menus.get(cate - 1).getCategory() + "]\n");
                menus.get(cate - 1).showMenuItems();
                System.out.println();
                System.out.print("메뉴를 선택해주세요 (0 입력 시 뒤로가기): ");
                selectMenuItem(select, cate);

            }else if(cate == 0){
                System.out.println("프로그램을 종료합니다.");
                // 강제 종료하는 느낌이 강함. break 추천.
                check = false;
                break;
            }else{
                System.out.println("잘못된 번호를 입력하셨습니다!");
                break;
            }

        }
    }
    public void selectMenuItem(int select, int cate){
        try {
            select = input.nextInt();
        } catch (Exception e) {
            System.out.println("숫자를 입력해주세요!");
            // 버퍼를 비워서 select에 들어간 값을 비워줘야함.
            input.nextLine();
        }
        if(select == 0){
            System.out.println("카테고리 메뉴로 돌아갑니다.");

        }else{
            menus.get(cate - 1).pickedItem(select - 1);
        }
    }

}
