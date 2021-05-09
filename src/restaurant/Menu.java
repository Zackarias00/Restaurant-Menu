package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Menu {

    public static void main(String[] args){

    }
    static ArrayList<MenuItem> itemList = new ArrayList<>();

    static void menuUpdated(){
        Date updated = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/yy");
        System.out.println("Menu last updated on: " + dateForm.format(updated));
    }

    static void addMenuItem(String name,Double price,String description,String category){
        itemList.add(new MenuItem(name,price,description,category));
    }

    static void removeMenuItem(String name){
        itemList.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    public static void getFullMenu(){
        for(MenuItem item: itemList){
          System.out.println(item.toString() + "\n");
        }
    }

    static void getItem(String name){
        for(MenuItem item: itemList){
            if(item.getName().equalsIgnoreCase(name)){
                System.out.print(item);
            }
        }
    }

}
