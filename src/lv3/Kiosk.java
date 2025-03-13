package lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private final List<MenuItem> menuItems;

    // 생성자
    public Kiosk(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    // 기능
    public void start() {

        Scanner input = new Scanner(System.in);

        // 선택한 메뉴를 담을 list
        List<String> selectList = new ArrayList<>();

        // while문 break 용도
        boolean check = true;

        while (check) {

            // 메뉴 출력
            System.out.println("[ SKY COFFEE MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println(i + 1 + ". " + menuItems.get(i).toString());
            }


            System.out.print("메뉴를 선택해주세요(종료 시 0 입력): ");
            int select = 0;

            try {
                select = input.nextInt();
            } catch(Exception e) {
                System.out.println("숫자를 입력해주세요!");
                // 버퍼를 비워서 select에 들어간 값을 비워줘야함.
                input.nextLine();
                continue;
            }

            switch (select) {
                case 1:
                    System.out.println(1 + ". " + menuItems.get(0).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(0).getCoffee());
                    break;
                case 2:
                    System.out.println(2 + ". " + menuItems.get(1).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(1).getCoffee());
                    break;
                case 3:
                    System.out.println(3 + ". " + menuItems.get(2).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(2).getCoffee());
                    break;
                case 4:
                    System.out.println(4 + ". " + menuItems.get(3).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(3).getCoffee());
                    break;
                case 5:
                    System.out.println(5 + ". " + menuItems.get(4).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(4).getCoffee());
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    // 선택된 음료가 있을 경우에만 출력
                    if(!selectList.isEmpty()){
                        System.out.println("선택하신 메뉴는 ");
                        // 개선할 필요가 있는 코드.
                        for (String s : selectList) {
                            for (MenuItem menuItem : menuItems) {
                                if (menuItem.getCoffee().equals(s)) {
                                    System.out.println(menuItem);
                                }
                            }
                        }
                        System.out.println("입니다.");
                    }else{
                        System.out.println("선택하신 음료가 없습니다.");
                    }
                    // 강제 종료하는 느낌이 강함. break 추천.
                    check = false;
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다!");
            }
        }
    }
}
