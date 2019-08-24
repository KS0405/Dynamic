package controllers;

import models.Shoes;
import models.Sneakers;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;




public class Application extends Controller {
    public static Result main(Html content) {
        return ok(Mymain.render(content));
    }
    public static Result index(){
        return main(home.render());
    }

    public static Result kak() {return ok(kak.render());}

    public static Result bar() {return ok(bar.render());}

    public static Result Pro() {return main(kak.render());}


    public static Result hobby() {return main(hobby.render());}
    public static Result travel() {return main(travel.render());}
    public static Result Target() {return  main(Target.render());}
    public static Result Mains() {return  main(Mains.render());}
   public  static Result ShowSneakers(){
       Sneakers sneak;
       sneak = new Sneakers();
       sneak.setName("MIKE AIR ZOOM PEGASUS 35");
       sneak.setColor("ดำ");
       sneak.setSize(6);
       sneak.setBrand("NIKE");
       sneak.setGender(true);
       sneak.setPrice(4600.00);

       sneak.setRubberSoles("พื้นยาง");
       sneak.setShoeHeadStyle("หัวเรียวมน");
       sneak.setShoelinetype("ผ้า");
       sneak.setTypeOfFabric("ไนลอน");
       sneak.setDesign("ธรรมดา");

       return main(table.render(sneak));
   }
   public static  Result ShowSneakersList() {
       List<Sneakers> sneaks = new ArrayList<Sneakers>();
       Sneakers sn = new Sneakers();
       sn.setName("Luna Rose");
       sn.setColor("ขาว");
       sn.setSize(7);
       sn.setBrand("Luna Rose");
       sn.setGender(false);
       sn.setPrice(1600.00);

       sn.setRubberSoles("พื้นยาง");
       sn.setShoeHeadStyle("หัวเรียวมน");
       sn.setShoelinetype("สายผ้า");
       sn.setTypeOfFabric("หนัง");
       sn.setDesign("ลายปักรูปดอกกุหลาบ");
       sneaks.add(sn);
       sneaks.add(new Sneakers("OLD SKOOL", "ดำ", 8, "Vans", false, 2400.00, "พื้นยาง", "หัวเรียวมน", "สายผ้า", "ไนลอน", "ลายสีดำขีดขาว"));
       sneaks.add(new Sneakers("Nike Air Monarch IV", "ขาวดำ", 7, "Nike", true, 1900.00, "พื้นยาง", "หัวเรียวมน", "สายผ้า", "หนัง", "ลายขาวดำ"));
       sneaks.add(new Sneakers("Venom", "ขาวแดงดำ", 7, "FILA", false, 3390.00, "พื้นยาง", "หัวเรียวมน", "สายผ้า", "หนัง", "ลายขาวแดงดำสลับ"));
       sneaks.add(new Sneakers("The Converse Jack Purcell Classic", "ขาว", 6, "Converse", false, 2000.00, "พื้นยาง", "หัวเรียวมน", "สายผ้า", "ไนลอน", "ลายพื้นสีขาว"));
       sneaks.add(new Sneakers("Ace Embroidered Leather Sneaker", "ขาว", 8, "Gucci", false, 20800.00, "พื้นยาง", "หัวเรียวมน", "สายผ้า", "หนัง", "ลายงู"));
       return main(showSneakersListView.render(sneaks));

       //String name, String color, int size, String brand, boolean gender, double price, String rubberSoles, String shoeHeadStyle, String shoelinetype, String typeOfFabric, String design


   }
   public static Result sneakersForm(){
       return main(frmPostSneakers.render());
   }

   public static Result post(){
       DynamicForm myForm = Form.form().bindFromRequest();
       String name,color,brand,rubberSoles,shoeHeadStyle,shoelinetype,typeOfFabric,design;
       double price;
       int size;
       Sneakers ss = new Sneakers();

       name = myForm.get("name");
       color = myForm.get("color");
       brand = myForm.get("brand");
       rubberSoles= myForm.get("rubberSoles");
       shoeHeadStyle = myForm.get("shoeHeadStyle");
       shoelinetype = myForm.get("shoelinetype");
       typeOfFabric = myForm.get("typeOfFabric");
       design = myForm.get("design");
       price = Double.parseDouble(myForm.get("price"));
       size = Integer.parseInt(myForm.get("size"));

       /*public Shoes(String name, String color, int size, String brand, double price){
       this.name=name;
       this.color=color;
       this.size=size;
       this.brand=brand;
       this.price=price;*/

       ss.setName(name);
       ss.setColor(color);
       ss.setSize(size);
       ss.setBrand(brand);
       ss.setPrice(price);
       ss.setRubberSoles(rubberSoles);
       ss.setShoeHeadStyle(shoeHeadStyle);
       ss.setShoelinetype(shoelinetype);
       ss.setTypeOfFabric(typeOfFabric);
       ss.setDesign(design);

       return  main(showPostSneakers.render(ss));
   }
   public static Sneakers sneak;
   public static Form<Sneakers> sneek = Form.form(Sneakers.class);

   public static Result shoes_form_helper(){

       return main(shoes_form_helper.render(sneek));
   }

   public static Result shoes_post_helper(){
       Form<Sneakers> newForm = sneek.bindFromRequest();
       if (newForm.hasErrors()){
           return main(shoes_form_helper.render(newForm));
       }
       else {
           sneak = newForm.get();
           return main(shoes_post_helper.render(sneak));

       }
   }
}




