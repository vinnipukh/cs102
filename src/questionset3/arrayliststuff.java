package questionset3;

import java.util.ArrayList;
import java.util.HashSet;


public class arrayliststuff {
    public arrayliststuff(){

    }

    /*
    Question 1 (ArrayLists)
 Write a function that takes an ArrayList of integers and removes any duplicate values,
 keeping only the first occurrence.
    */

    public ArrayList<Integer> removeDuplicate(ArrayList<Integer> integerArrayList){
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i : integerArrayList){
            if(!seen.contains(i)){
                seen.add(i);
                result.add(i);
            }
        }

        return result;
    }
    /*
    Question 2 (ArrayLists)
Create a function with two ArrayLists of integers as parameters. Merge the two lists into a
third ArrayList without duplicates. Return the resulting ArrayList
     */
    public ArrayList<Integer> mergeArrayLists(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> resultList = new ArrayList<>(list1);
        resultList.addAll(list2);
        removeDuplicate(list2);
        return resultList;
    }
    /*
    Question 3(ArrayLists)
    Create a function with two ArrayLists of integers as parameters. Return an ArrayList that
    contains integers that exist in both ArrayLists.
     */
    public ArrayList<Integer> sameIntegerList(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i : list1){
            if(list2.contains(i)){
                resultList.add(i);
            }
        }
        return resultList;
    }
    /*
    Question 4(ArrayLists)
  Write a program that first creates an integer ArrayList with integers from 0 to 100 ( [0, 1, 2,
  …,100] ), then filters the ArrayList of integers keeping only the even numbers, and print the
  result.
     */
    public void evenList(){
        ArrayList<Integer> hundredList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for(int i = 0; i<=100; i++){
            hundredList.add(i);
        }
        for(int i : hundredList){
            if(hundredList.get(i)%2==0){
                evenList.add(i);
            }
        }
        evenList.toString();
    }
}
