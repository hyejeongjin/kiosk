package lv4;

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

    // 기능
    public void start() {

        Scanner input = new Scanner(System.in);

        // 선택한 메뉴를 담을 list
        List<String> selectList = new ArrayList<>();

        // while문 break 용도
        boolean check = true;

        // 메뉴 출력
        System.out.println("[ SKY CAFE ]");

        while (check) {

            for (int i = 0; i < menus.size(); i++) {
                System.out.println(i + 1 + ". " + menus.get(i).getCategory());
            }
            System.out.print("카테고리를 선택해주세요(종료 시 0 입력): ");

            int cate = 0;

            try {
                cate = input.nextInt();
            } catch (Exception e) {
                System.out.println("숫자를 입력해주세요!");
                // 버퍼를 비워서 select에 들어간 값을 비워줘야함.
                input.nextLine();
                continue;
            }

            switch (cate) {
                case 1:
                    System.out.println("선택한 카테고리: " + 1 + ". " + menus.get(cate - 1).getCategory());
                    menus.get(cate - 1).showMenuItems();
                    break;
                case 2:
                    System.out.println("선택한 카테고리: " + 2 + ". " + menus.get(cate - 1).getCategory());
                    menus.get(cate - 1).showMenuItems();
                    break;
                case 3:
                    System.out.println("선택한 카테고리: " + 3 + ". " + menus.get(cate - 1).getCategory());
                    menus.get(cate - 1).showMenuItems();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    // 강제 종료하는 느낌이 강함. break 추천.
                    check = false;
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다!");
                    break;

            }
        }
    }
}
