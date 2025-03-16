package questionset3;

import java.util.*;


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

        return removeDuplicate(resultList);
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
            if(i%2==0){
                evenList.add(i);
            }
        }
        System.out.println(evenList);
    }
    /*
    Question 9(ArrayLists)
Write a program to compare two ArrayLists and determine if they are equal (contains the
same elements in the same order
     */
    public boolean compareList(ArrayList<Integer> list1,ArrayList<Integer> list2){
        return list1.equals(list2);
    }
    /*
    Question 10(ArrayLists)
Write a function that counts the frequency of each element in the list. Print the frequency
information. (Example output: 1 occurs 3 times, 5 occurs 2 times, …
     */
    public void listFrequency(ArrayList<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:list){
            if(map.containsKey(i)){
                map.replace(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        for(int i : map.keySet()) {
            System.out.println(i + " occurs " +map.get(i)+ " times");
        }

    }
    /*
    Question 11(ArrayLists)
Create a 2D ArrayList (an ArrayList of ArrayLists) to store a matrix of integers. Write a
function that prints it in matrix form
     */
    public ArrayList<ArrayList<Integer>> createMatrixList(){
        ArrayList<ArrayList<Integer>> matrixList = new ArrayList<ArrayList<Integer> >();
        return matrixList;
    }
    public void printMatrixList(ArrayList<ArrayList<Integer>> matrixList){
        for(ArrayList<Integer> row : matrixList){
            for(int num: row){
                System.out.println(num + " ");
            }
        }
    }
    /*
    Question 12(ArrayLists)
Write two functions that finds the maximum and minimum elements in an ArrayList of
integers
     */
    public int findMax(ArrayList<Integer> list){
        int currentMax = list.getFirst();
        for(int i : list){
            if(currentMax<i){
                currentMax = i;
            }
        }
        return currentMax;
    }
    public int findMin(ArrayList<Integer> list){
        int currentMin = list.getFirst();
        for(int i: list){
            if(currentMin>i){
                currentMin = i;
            }
        }
        return currentMin;
    }
    /*
    Question 13(ArrayLists)
Implement a function shiftList(ArrayList<Integer> list, int k) that shifts the elements of the
ArrayList to the right by k positions. The resulting ArrayList should have the same size as the
initial array. Shifted array elements that exceed the size limit should appear in the front of the
ArrayList.
     */
    public ArrayList<Integer> shiftList(ArrayList<Integer> list, int k){
        int n = list.size();
        ArrayList<Integer> shiftedList = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            shiftedList.set(newIndex, list.get(i));
        }

        return shiftedList;
    }
    /*
    Question 14(ArrayLists)
Implement a function removeElement(ArrayList<String> list, String element) that removes all
occurrences of a specified string from the ArrayList.
     */
    public void removeElement(ArrayList<String> list,String element){
        ArrayList<String> result = new ArrayList<>(list);
        list.clear();
        for (String item : result) {
            if (!item.equals(element)) {
                list.add(item);
            }
        }
    }

}
