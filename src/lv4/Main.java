package lv4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Menu> menus = new ArrayList<>();
        List<MenuItem> coffee = new ArrayList<>();

        coffee.add(new MenuItem("Espresso", 2500, "고온ㆍ고압하에서 곱게 간 커피 가루에 물을 가해, 30초 이내에 내린 커피."));
        coffee.add(new MenuItem("Americano", 3000, "에스프레소에 물을 넣어 연하게 마시는 커피."));
        coffee.add(new MenuItem("Caffé Latte", 3500, "에스프레소에 따뜻한 우유를 1:2 또는 1:3 정도의 비율로 섞은 커피."));
        coffee.add(new MenuItem("Caramel Macchiato", 4000, "에스프레소에 캐러멜 소스와 우유를 넣고 우유 거품만 살짝 올린 커피."));
        coffee.add(new MenuItem("Café Mocha", 4500, "에스프레소에 우유와 초콜릿을 넣고 휘핑크림을 올린 커피."));

        List<MenuItem> tea = new ArrayList<>();
        tea.add(new MenuItem("Iced Peach Black Tea", 5000, "복숭아의 진한 맛과 홍차의 조화가 매력적인 음료."));
        tea.add(new MenuItem("Grapefruit Honey Black Tea", 5300, "새콤한 자몽과 달콤한 꿀, 블랙티의 만남."));
        tea.add(new MenuItem("Yuja Mint Tea", 6100, "국내산 고흥 유자와 생강, 우릴수록 상쾌한 민트티가 조화로운 유자 민트 티."));
        tea.add(new MenuItem("Chamomile Blend Brewed Tea", 4500, "캐모마일과 레몬 그라스, 레몬밤, 히비스커스 등 블렌딩되어 은은하고 차분한 향이 기분을 좋게 하는 허브 티."));
        tea.add(new MenuItem("Earl Grey Brewed Tea", 4500, "꽃향 가득한 라벤더와 베르가못 향이 진한 홍차와 블렌딩된 향긋한 블랙티."));

        List<MenuItem> smoothie = new ArrayList<>();
        smoothie.add(new MenuItem("Strawberry Yogurt Smoothie", 4700, "딸기와 상큼한 요거트가 조화롭게 어우러진 스무디."));
        smoothie.add(new MenuItem("Honey Peach Smoothie", 3900, "복숭아의 리얼한 풍미와 꿀의 달콤함이 최적의 조화를 이룬 달콤하고 시원한 스무디."));
        smoothie.add(new MenuItem("Vanilla Milk Shake", 6100, "부드럽고 밀키한 우유의 맛을 진하게 즐길 수 있는 밀크 쉐이크."));
        smoothie.add(new MenuItem("Cookie Shake", 6500, "부드러운 쉐이크에 달콤한 쿠키를 가득 올린 밀크 쉐이크."));
        smoothie.add(new MenuItem("Milk Tea Shake", 5500, "홍차의 향긋한 풍미를 깊고 부드럽게 즐기는 밀크티 쉐이크."));

        menus.add(new Menu("COFFEE", coffee));
        menus.add(new Menu("TEA", tea));
        menus.add(new Menu("SMOOTHIE", smoothie));

        Kiosk kiosk = new Kiosk(menus);
        // 키오스크 시작
        kiosk.start();
    }
}
