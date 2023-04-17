package pe.edu.upao.servdelivcomidadp1.models;

import java.util.ArrayList;
import java.util.List;

public class Food {
    //ATRIBUTES
    private String name;
    private String description;
    private float price;


    //CONSTRUCTORS
    public Food() {
    }

    public Food(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
//METODOS

    //GETTERS
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\n\u001B[32mNombre: \u001B[33m" + name.toUpperCase() + "\n" +
                "\u001B[32mDescripcion: \n\u001B[33m" + description + "\n" +
                "\u001B[32mPrecio: \u001B[33m" + price+"\u001B[0m\n";
    }
}
