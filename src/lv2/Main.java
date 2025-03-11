package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Espresso", 2500, "고온ㆍ고압하에서 곱게 간 커피 가루에 물을 가해, 30초 이내에 내린 커피."));
        menuItems.add(new MenuItem("Americano", 3000, "에스프레소에 물을 넣어 연하게 마시는 커피."));
        menuItems.add(new MenuItem("Caffé Latte", 3500, "에스프레소에 따뜻한 우유를 1:2 또는 1:3 정도의 비율로 섞은 커피."));
        menuItems.add(new MenuItem("Caramel Macchiato", 4000, "에스프레소에 캐러멜 소스와 우유를 넣고 우유 거품만 살짝 올린 커피."));
        menuItems.add(new MenuItem("Café Mocha", 4500, "에스프레소에 우유와 초콜릿을 넣고 휘핑크림을 올린 커피."));

        // 선택한 메뉴를 담을 list
        List<String> selectList = new ArrayList<>();

        //Scanner
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("[ SKY COFFEE MENU ]");

            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println(i + 1 + ". " + menuItems.get(i).toString());
            }

            System.out.print("메뉴를 선택해주세요(종료 시 0 입력): ");

            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println(1+ ". " + menuItems.get(0).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(0).getCoffee());
                    break;
                case 2:
                    System.out.println(2+ ". " + menuItems.get(1).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(1).getCoffee());
                    break;
                case 3:
                    System.out.println(3+ ". " + menuItems.get(2).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(2).getCoffee());
                    break;
                case 4:
                    System.out.println(4+ ". " + menuItems.get(3).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(3).getCoffee());
                    break;
                case 5:
                    System.out.println(5+ ". " + menuItems.get(4).getCoffee() + "을 선택하셨습니다.\n");
                    selectList.add(menuItems.get(4).getCoffee());
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("선택하신 음료는 ");

                    for(String s : selectList){
                        for (MenuItem menuItem : menuItems) {
                            if (menuItem.getCoffee().equals(s)) {
                                System.out.println(menuItem);
                            }
                        }
                    }
                    System.out.println("입니다.");

                    System.exit(0);
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다!");
            }
        }

    }
}
