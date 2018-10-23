/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author stefan
 */
public class StorageItem {
    
    private int id;
    private String desc;
    private int place;
    private int amount;

    public StorageItem(int id, String desc, int place) {
        this.id = id;
        this.desc = desc;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getPlace() {
        return place;
    }
    
    public String toString()
    {
     return String.format("%d is a %s and is located at place %d", id,desc,place);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    
           
}
