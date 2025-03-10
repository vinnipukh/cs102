package questionset2;
import java.util.Random;


public class Sudoku {
    private final int SIZE = 4;
    private int[][] board = new int[SIZE][SIZE];

    public Sudoku(){

    }
    public void initializeBoard(){
        for(int i = 0; i<SIZE; i++){
            for(int j = 0; j<SIZE;j++){
                board[i][j] = 0;
            }

        }
    }
    public void fillBoard(){
        for(int i = 0; i<SIZE; i++){
            Random rastgele = new Random();
            for(int j = 0; j<SIZE;j++){
                board[i][j] = rastgele.nextInt(SIZE+1);

            }
        }
    }
    public void printBoard(){
        for(int i=0; i<SIZE; i++){
            for(int j = 0; j<SIZE;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
