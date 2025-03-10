package questionset3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        arrayliststuff stuff = new arrayliststuff();
        ArrayList<Integer> arlist = new ArrayList<Integer>();
        arlist.add(1);
        arlist.add(1);
        arlist.add(2);
        arlist.add(3);
        arlist.add(4);
        arlist.add(5);
        arlist.add(1);
       arlist = stuff.removeDuplicate(arlist);
        for(int i :arlist){
            System.out.println(i);
        }
    }
}
