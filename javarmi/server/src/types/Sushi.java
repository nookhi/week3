/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

/**
 *
 * @author dvoeg
 */
import java.io.Serializable;

public class Sushi implements Serializable{
    private String name;
    private int quantity;
    private int weight;
    private int price;

    public Sushi(String name, int quantity, int weight, int price) {
   
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
    }

    public Sushi() {
       
        this.name = "";
        this.quantity = 0;
        this.weight = 0;
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}