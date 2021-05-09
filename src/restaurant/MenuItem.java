package restaurant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Date lastUpdated = new Date();
    SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY");
    //System.out.println(dateForm.format(thisDate));



    public MenuItem(String name, Double price, String description, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.lastUpdated = new Date();
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
