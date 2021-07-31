package InsuranceManagementSystem;

import java.util.Date;

public  abstract class Insurance {

    private int id;
    private String name;
    private double price;
    private Date beginningDate;
    private Date expiryDate;


    public Insurance(int id, String name, double price, Date beginningDate, Date expiryDate) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.beginningDate = beginningDate;
        this.expiryDate = expiryDate;
    }


    public abstract double calculate();


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Date getBeginningDate() {
        return beginningDate;
    }
    public void setBeginningDate(Date beginningDate) {
        this.beginningDate = beginningDate;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }


}