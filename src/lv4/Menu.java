package lv4;

import java.util.List;

public class Menu {

    // 속성
    private final String category;
    private final List<MenuItem> menuItems;

    // 생성자
    public Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    // 기능


    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


    //메뉴를 순차적으로 보여주는 함수
    public void showMenuItems(){
        for (int i=0; i<menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println( i + 1 + ". " + menuItems.get(i));
        }
    }

    public void pickedItem(int select) {
            MenuItem menuItem = menuItems.get(select);
            System.out.println(menuItem.getItem() + " | " + menuItem.getPrice() + "원 \n");
    }

    }





