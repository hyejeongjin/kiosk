package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("[ SKY COFFEE MENU ]\n" +
                    "1. Espresso           | W 2.5 | 고온ㆍ고압하에서 곱게 간 커피 가루에 물을 가해, 30초 이내에 내린 커피.\n" +
                    "2. Americano          | W 3.0 | 에스프레소에 물을 넣어 연하게 마시는 커피.\n" +
                    "3. Caffé Latte        | W 3.5 | 에스프레소에 따뜻한 우유를 1:2 또는 1:3 정도의 비율로 섞은 커피.\n" +
                    "4. Caramel Macchiato  | W 4.0 | 에스프레소에 캐러멜 소스와 우유를 넣고 우유 거품만 살짝 올린 커피.\n" +
                    "5. Café Mocha         | W 4.5 | 에스프레소에 우유와 초콜릿을 넣고 휘핑크림을 올린 커피.\n" +
                    "0. 종료      | 종료\n");

            System.out.print("메뉴를 선택해주세요: ");
            int select = input.nextInt();

            switch(select){
                case 1:
                    System.out.println("1. Espresso 를 선택하셨습니다.");
                    break;
                case 2:
                    System.out.println("2. Americano 를 선택하셨습니다.");
                    break;
                case 3:
                    System.out.println("3. Caffé Latte 를 선택하셨습니다.");
                    break;
                case 4:
                    System.out.println("4. Caramel Macchiato 를 선택하셨습니다.");
                    break;
                case 5:
                    System.out.println("5. Café Mocha 를 선택하셨습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다!");
            }
        }








    }
}