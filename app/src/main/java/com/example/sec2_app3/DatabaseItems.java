package com.example.sec2_app3;

import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class DatabaseItems {

    private List<MenuItem> items = new ArrayList<MenuItem>();

    public DatabaseItems(){
        items.add(new MenuItem("Coffee", 10, "Hot Drinks"));
        items.add(new MenuItem("Tea", 8, "Hot Drinks"));
        items.add(new MenuItem("Ice Coffee", 15, "Cold Drinks"));
        items.add(new MenuItem("Sprite", 5, "Cold Drinks"));
        items.add(new MenuItem("Chicken Sandwitch", 20, "Sandwitches"));

    }

    public List<MenuItem> getMenuItems(String category){
        List<MenuItem> result = new ArrayList<>();
        for(MenuItem m: items){
            if(m.getCategory().equals(category)){
                result.add(m);
            }
        }
        return result;


    }

    public String[] getCategories(){
        //assume we are reading data from database
        String[] categories = {"Hot Drinks", "Cold Drinks", "Sandwitches"};
        return categories;

    }


}
