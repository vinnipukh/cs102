package questionset2;


import java.awt.*;
import java.util.Arrays;

public class Restaurant {
    private int capacity;
    private int index = 0 ;
    private String[] MenuItems;
    private int[] MenuPrices;
    private double[] MenuRatings;

    public Restaurant(int capacity) {
        this.capacity = capacity;
        this.MenuItems = new String[capacity];
        this.MenuPrices = new int[capacity];
        this.MenuRatings = new double[capacity];
    }
    public int getCapacity(){
        return this.capacity;
    }  
    public void addMenuItem(String item,int price){
        if(index>= capacity){
            System.out.println("No more items can be added, because no space is left on the menu.");
        }
        else{
            MenuItems[capacity-MenuPrices.length]=item;
            MenuPrices[index]=price;
            MenuRatings[index]=0.0;
            index++;
        }

    }
    public void printMenu(){
        for(int i = 0; i<index;i++){
            System.out.println(MenuItems[i] +": " + MenuPrices[i] +", Rating: "+MenuRatings[i] );
        }
    }
    public  int findIndex(String targetName){
        String currentName;
        for(int i = 0; i<(capacity +1); i++){
            currentName = MenuItems[i];

            if(currentName.equals(targetName)){
                return i;
            }
        }
        return -1;
    }
    public void removeMenuItem(String itemToRemove){
        removeItemOneMenu(MenuItems,itemToRemove);
        removeItemOneMenu(MenuPrices,itemToRemove);
        removeItemOneMenu(MenuRatings,itemToRemove);

    }
    private int[] removeItemOneMenu(int[] array,String itemToRemove){
        for(int i = findIndex(itemToRemove); i<array.length; i++){
            array[i] = array[i+1];
        }
        array = Arrays.copyOf(array, array.length -1);
        return array;
    }
    private double[] removeItemOneMenu(double[] array,String itemToRemove){
        for(int i = findIndex(itemToRemove); i<array.length; i++){
            array[i] = array[i+1];
        }
        array = Arrays.copyOf(array, array.length -1);
        return array;
    }
    private String[] removeItemOneMenu(String[] array,String itemToRemove){
        for(int i = findIndex(itemToRemove); i<array.length; i++){
            array[i] = array[i+1];
        }
        array = Arrays.copyOf(array, array.length -1);
        return array;
    }

}
