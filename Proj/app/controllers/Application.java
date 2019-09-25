package controllers;

import models.*;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {
    public static Result main(Html content) {return (Result) ok(Mymain.render(content));
    }
    public static Result index(){
        return main(home.render());
    }

    public static Result kak() {return (Result) ok(kak.render());}

    public static Result bar() {return (Result) ok(bar.render());}

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

   public static List<Company> companyList=new ArrayList<Company>();
   public static Form<Company> companyForm=Form.form(Company.class);
   public static Company company;

   public static Result listCompany(){
       companyList=Company.list();
       return Application.main(listCompany.render(companyList));
   }

   public static Result newCompany(){//ใช้สำหรับเรียกวิวรับข้อมูล หลังผู้ใช้กรอกข้อมูล
       companyForm= Form.form(Company.class);

       return Application.main(new_Company.render(companyForm));
   }

    public static Result createCompany(){//ใช้สำหรับรับค่าจากการป้อนของผู้ใช้ระบบนำไปบันทึกหรือเพิ่ม
        Form<Company>newForm=companyForm.bindFromRequest();
        if(newForm.hasErrors()){
            flash("err","ท่านป้อนข้อมูลไม่สมบูรณ์ กรุณาตรวจสอบและแก้ไขให้ถูกต้อง");
            return Application.main(new_Company.render(newForm));
        }else {
            company=newForm.get();
            Company test= Company.finder.byId(company.getId());
            if(test!= null){
                flash("err","รหัสบริษัทใหม่ที่กำหนด ซ้ำกับที่มีอยู่แล้วในระบบ กรุณาตรวจสอบและแก้ไขให้ถูกต้อง");
                return Application.main(new_Company.render(newForm));
            }else {
                Company.create(company);
                return listCompany();
            }
        }
    }

    public static Result editCompany(String id){//ใช้สำหรับการค้นหาบริษัทที่ต้องการแก้ไขและเรียกวิวแก้ไขข้อมูล
        company= Company.finder.byId(id);
        if(company==null){
            return listCompany();
        }else {
            companyForm=Form.form(Company.class).fill(company);
            return Application.main(editCompany.render(companyForm));
        }

    }
    public static Result updateCompany(){//ใช้สำหรับรับค่าที่ผู้ใช้ป้อนแล้วนำไปแก้ไข
        Form<Company>newForm=companyForm.bindFromRequest();
        if(newForm.hasErrors()){
            flash("err","ท่านป้อนข้อมูลไม่สมบูรณ์ กรุณาตรวจสอบและแก้ไขให้ถูกต้อง");
            return Application.main(editCompany.render(newForm));
        }else {
            company=newForm.get();
            Company.update(company);
            return listCompany();
            }
        }

    public static Result deleteCompany(String id){//ใช้สำหรับการค้นหาบริษัทที่ต้องการลบและทำการลบข้อมูล
       company=Company.finder.byId(id);
        if(company!=null){
            Company.delete(company);
        }
        return listCompany();
    }


    public static Result frmProduct(){
        return ok(frmProduct.render());
    }
    public static  Result postProduct(){
        DynamicForm pForm = play.data.Form.form().bindFromRequest();
        Product product = new Product();
        product.setId(pForm.get("id"));
        product.setName(pForm.get("name"));
        product.setPrice(Double.parseDouble(pForm.get("price")));
        product.setAmount(Double.parseDouble(pForm.get("amount")));

        return ok(showProduct.render(product));
    }
    public static List<Movie> movieList=new ArrayList<Movie>();
    public static Form<Movie> movieForm=Form.form(Movie.class);
    public static Movie movie;
    public static Result listMovie(){
        movieList=Movie.list();
        return Application.main(listMovie.render(movieList));
    }
    public static Result newMovie(){
        companyList=Company.list();
        movieForm=Form.form(Movie.class);
        return Application.main(newMovie.render(movieForm,companyList));
    }
    public static Result createMovie(){
        Form<Movie> newForm = movieForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("errMessage", "ป้อนข้อมูลไม่ถูกต้อง/ไม่สมบูรณ์");
            return Application.main(newMovie.render(newForm, companyList));
        } else {
            movie = newForm.get();
            if (movie.finder.byId(movie.getId()) != null) {
                flash("errMessage", "รหัสภาพยนต์ที่กำหนด มีแล้วในระบบ กรุณาแก้ไขใหม่");
                return Application.main(newMovie.render(newForm,companyList));
            } else {
                Movie.create(movie);
                return listMovie();
            }
        }

    }
    public static Result editMovie(String id){
        companyList=Company.list();
        movie=Movie.finder.byId(id);
        if(movie==null){
            return listMovie();
        }else{
            movieForm=Form.form(Movie.class).fill(movie);
            return Application.main(editMovie.render(movieForm,companyList));
        }
    }

    public static Result updateMovie(){
        Form<Movie>updateForm=movieForm.bindFromRequest();
        companyList=Company.list();
        if(updateForm.hasErrors()){
            flash("errMessage", "ป้อนข้อมูลไม่ถูกต้อง/ไม่สมบูรณ์");
            return Application.main(editMovie.render(updateForm,companyList));
        }else {
            movie=updateForm.get();
            movie.update(movie);
            return listMovie();
        }
    }
    public static Result deleteMovie(String id){
        movie=Movie.finder.byId(id);
        if(movie!=null){
            Movie.delete(movie);
        }
        return listMovie();
    }
}




