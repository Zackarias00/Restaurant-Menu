package restaurant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Date lastUpdated = new Date();
    SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/yy");
    //System.out.println(dateForm.format(thisDate));



    public MenuItem(String name, Double price, String description, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.lastUpdated = new Date();
    }

    static boolean isItemNew(Date testDate){
        Date startDate = new Date(5/8/21);
        return !(testDate.before(startDate));
    }

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public Date getLastUpdated(){
        return lastUpdated;
    }

    public String toString() {
        return this.category + ("\n" + this.name + "\nPrice: " + this.price + "\n" + this.description);
    }

    public boolean equals(Object toBeCompared){
        if(toBeCompared==this){
            return false;
        } else if(toBeCompared==null){
            return false;
        } else if(toBeCompared.getClass() != getClass()){
            return false;
        } else {
            MenuItem theItem = (MenuItem) toBeCompared;
            return theItem.getDescription() == getDescription();
        }
    }

    void setName(String aName){
        this.name = aName;
        this.lastUpdated = new Date();
    }

    void setPrice(Double aPrice){
        this.price = aPrice;
        this.lastUpdated = new Date();
    }

    void setDescription(String aDescription){
        this.description = aDescription;
        this.lastUpdated = new Date();
    }

    void setCategory(String aCategory){
        this.category = aCategory;
        this.lastUpdated = new Date();
    }
}
