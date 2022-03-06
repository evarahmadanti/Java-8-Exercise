package model;

public class Invoice {
    public String customer, title;
    public Integer amount, id;

    public Invoice(String customer, String title, Integer amount, Integer id){
        this.customer = customer;
        this.title = title;
        this.amount = amount;
        this.id = id;
    }
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
