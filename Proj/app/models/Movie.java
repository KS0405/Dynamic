package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;


/**
 * Created by konkanok on 9/24/2019.
 */
@Entity
@Table(name ="tbMovie")
public class Movie extends Model{
    @Id
    private String id;
    private String title,actor,actress,year;
    @ManyToOne
    private Company company;

    public Movie() {
    }

    public Movie(String id, String title, String actor, String actress, String year, Company company) {
        this.id = id;
        this.title = title;
        this.actor = actor;
        this.actress = actress;
        this.year = year;
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public static Finder<String,Movie>finder=new Finder<String, Movie>(String.class,Movie.class);
    public static List<Movie>list(){
        return finder.all();
    }
    public static void create(Movie movie){
        movie.save();
    }
    public static void update(Movie movie){
        movie.update();
    }
    public static void delete(Movie movie){
        movie.delete();
    }

}
