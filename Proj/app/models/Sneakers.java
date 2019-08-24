package models;

/**
 * Created by Konkanok on 7/21/2019.
 */
public class Sneakers extends Shoes {
    private String rubberSoles;
    private String shoeHeadStyle;
    private String shoelinetype;
    private String typeOfFabric;
    private String design;

    public Sneakers() {
    }


    public Sneakers(String name, String color, int size, String brand, boolean gender, double price, String rubberSoles, String shoeHeadStyle, String shoelinetype, String typeOfFabric, String design) {
        super(name, color, size, brand, gender,price);
        this.rubberSoles = rubberSoles;
        this.shoeHeadStyle = shoeHeadStyle;
        this.shoelinetype = shoelinetype;
        this.typeOfFabric = typeOfFabric;
        this.design = design;
    }

    public String getRubberSoles() {
        return rubberSoles;
    }

    public void setRubberSoles(String rubberSoles) {
        this.rubberSoles = rubberSoles;
    }

    public  String getShoeHeadStyle(){
        return shoeHeadStyle;
    }

    public void setShoeHeadStyle(String shoeHeadStyle) {
        this.shoeHeadStyle = shoeHeadStyle;
    }

    public String getShoelinetype() {
        return shoelinetype;
    }

    public void setShoelinetype(String shoelinetype) {
        this.shoelinetype = shoelinetype;
    }

    public String getTypeOfFabric() {
        return typeOfFabric;
    }

    public void setTypeOfFabric(String typeOfFabric) {
        this.typeOfFabric = typeOfFabric;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }
}
