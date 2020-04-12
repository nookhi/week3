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
public class SushiDirectory implements Serializable{
    private String itemName;
    private String itemDescription;
    private String itemType;

    public SushiDirectory(String itemName, String itemType, String itemDescription) {
        this.itemName = itemName;
        this.itemType=itemType;
        this.itemDescription = itemDescription;
    }
 public SushiDirectory() {
        this.itemName = "";
        this.itemType = "";
        this.itemDescription = "";
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    
}