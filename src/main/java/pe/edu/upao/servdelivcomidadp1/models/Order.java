package pe.edu.upao.servdelivcomidadp1.models;

import pe.edu.upao.servdelivcomidadp1.models.Food;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private String id;
    private String customerName;
    private String customerEmail;
    private String status;
    private LocalDateTime creationTime;
    private String estimatedDeliveryTime;


    ArrayList<Food>  items = new ArrayList<Food>();


    //CONSTRUCTORES
    public Order() {
    }

    public Order(String id, String customerName, String customerEmail, String status, String estimatedDeliveryTime, ArrayList<Food> items) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.items = items;
    }

    //GETTERS
    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public ArrayList<Food> getItems() {
        return items;
    }

    //SETTERS
    public void setId(String id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public void setItems(ArrayList<Food> items) {
        this.items = items;
    }


}
