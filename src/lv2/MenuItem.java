package lv2;


public class MenuItem {

    // 불변객체 설정
    private final String coffee;
    private final int price;
    private final String info;

    // 생성자
    public MenuItem(String coffee, int price, String info){
        this.coffee = coffee;
        this.price = price;
        this.info = info;
    }

    // 재정의 없이 toString()을 사용하면 값이 출력되는 게 아니라 메모리 주소가 나오게 됨.
    // 오버라이딩을 이용해 toString() 메서드를 재정의해서 해결할 수 있음.
    // 참고 블로그 : https://velog.io/@wnajsldkf/toString-%EB%A9%94%EC%84%9C%EB%93%9C-%EC%98%AC%EB%B0%94%EB%A5%B4%EA%B2%8C-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0
    @Override
    public String toString() {
        return coffee + "   | W " + price + " | " + info;
    }

    //불필요한 getter, setter 삭제
    public String getCoffee() {
        return coffee;
    }
}
