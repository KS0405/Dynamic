package models;

/**
 * Created by konkanok on 9/18/2019.
 */
public class Product {
    private String id;
    private String name;

    private Double price,amount,total,discount,totalDiscount,totalprice;

    public Product() {
    }

    public Product(String id, String name, Double price, Double amount, Double total, Double discount, Double totalDiscount,Double totalprice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.total = total;
        this.discount = discount;
        this.totalDiscount = totalDiscount;
        this.totalprice = totalprice;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTotal() {
        total=price*amount;
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getDiscount() {

        if (total<5000)
            discount=total*0.05;
        else if (total>5001 && total<20000)
            discount=total*0.1;
        else
            discount=total*0.25;
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {

        this.totalDiscount = totalDiscount;
    }

    public Double getTotalPrice() {
        totalprice=total-discount;
        return totalprice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalprice = totalprice;
    }
}
