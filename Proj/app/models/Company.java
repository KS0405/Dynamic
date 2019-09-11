package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Yok on 9/10/2019.
 */
@Entity
@Table(name="tbCompany")
public class Company extends Model{
    @Id
    private String id;
    private String name,address,detail;


    public Company() {
    }

    public Company(String id, String name, String address, String detail) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    //DB Management
    public static Finder<String,Company> finder=new Finder<String, Company>(String.class,Company.class);
    public static List<Company> list(){
        return finder.all();
    }
    public static void create(Company company){
        company.save();
    }

    public static void update(Company company){
        company.update();
    }

    public static void delete(Company company){
        company.delete();
    }
}
