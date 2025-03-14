package lv5;

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


    //메뉴를 순차적으로 보여주는 기능
    public void showMenuItems(){
        for (int i=0; i<menuItems.size(); i++) {
            System.out.println( i + 1 + ". " + menuItems.get(i));
        }
    }

    //선택된 메뉴를 출력하는 기능
    public void pickedItem(int select) {
            MenuItem menuItem = menuItems.get(select);
            System.out.println(menuItem.getItem() + " | " + menuItem.getPrice() + "원 | " + menuItem.getInfo() + "\n");
    }

    }





