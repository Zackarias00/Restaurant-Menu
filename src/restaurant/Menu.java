package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Menu {
    Date updated = new Date();
    SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY");

    public static void main(String[] args){

    }

    static boolean isWithinRange(Date testDate){
        Date startDate = new Date(05/8/21);
        return !(testDate.before(startDate));
    }

    public static void getMenuItems(){
        Date updated = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY");
        ArrayList<MenuItem> itemList = new ArrayList<>();
        MenuItem dinner = new MenuItem("dinner",9.99,"A good meal","main course");
        MenuItem appetizer = new MenuItem("appetizer",5.99,"A good appetizer","appetizer");
        MenuItem dessert = new MenuItem("dessert",7.99,"A good dessert","dessert");
        itemList.add(dinner);
        itemList.add(appetizer);
        itemList.add(dessert);
        for(MenuItem item: itemList){
            String name = item.getName();
            Double price = item.getPrice();
            String description = item.getDescription();
            String category = item.getCategory();
            if(isWithinRange(item.getLastUpdated())){
                System.out.println("NEW ITEM!\n" + name + "\nPrice: " + price + "\n" + description + "\n" + category + "\n");
            } else {
                System.out.println(name + "\nPrice: " + price + "\n" + description + "\n" + category + "\n");
            }

        }
        System.out.println("Menu last updated on: " + dateForm.format(updated));
    }

}
