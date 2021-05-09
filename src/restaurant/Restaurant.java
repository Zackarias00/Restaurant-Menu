package restaurant;

public class Restaurant {
    public static void main(String[] args){
        Menu.addMenuItem("chicken",9.99,"chicken dinner","main course");
        Menu.addMenuItem("burger",8.99,"burger dinner","main course");
        Menu.addMenuItem("ice cream",7.99,"vanilla ice cream","dessert");
        Menu.addMenuItem("mozzarella sticks",5.99,"cheesy sticks","appetizer");
        Menu.addMenuItem("chicken wings",6.99,"buffalo wings","appetizer");
        System.out.println("\nPrint full menu.\n");
        Menu.getFullMenu();
        System.out.println("\nPrint individual item.\n");
        Menu.getItem("ice cream");
        Menu.removeMenuItem("ice cream");
        System.out.println("\n\nReprint full menu with one item deleted.\n");
        Menu.getFullMenu();
    }
}
