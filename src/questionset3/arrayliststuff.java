package questionset3;

import java.util.ArrayList;
import java.util.HashSet;


public class arrayliststuff {
    public arrayliststuff(){

    }


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
}
