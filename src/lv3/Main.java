package lv3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Espresso", 2500, "고온ㆍ고압하에서 곱게 간 커피 가루에 물을 가해, 30초 이내에 내린 커피."));
        menuItems.add(new MenuItem("Americano", 3000, "에스프레소에 물을 넣어 연하게 마시는 커피."));
        menuItems.add(new MenuItem("Caffé Latte", 3500, "에스프레소에 따뜻한 우유를 1:2 또는 1:3 정도의 비율로 섞은 커피."));
        menuItems.add(new MenuItem("Caramel Macchiato", 4000, "에스프레소에 캐러멜 소스와 우유를 넣고 우유 거품만 살짝 올린 커피."));
        menuItems.add(new MenuItem("Café Mocha", 4500, "에스프레소에 우유와 초콜릿을 넣고 휘핑크림을 올린 커피."));

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();

    }


}
