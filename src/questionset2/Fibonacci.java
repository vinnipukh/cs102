package questionset2;
import java.util.Arrays;
public class Fibonacci {
    private int firstxnumber;
    private int[] fibonacci;;


    public Fibonacci(){

    }
    public void generateFibonacci(int firstxnumber){
        this.firstxnumber = firstxnumber;
        int[] fibonacci = new int[firstxnumber];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i<firstxnumber; i++){
            fibonacci[i] =fibonacci[i-1]+ fibonacci[i-2];
        }


    }

}
