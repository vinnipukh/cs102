package questionset1;

public class NumberPattern {
    public void printPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public int evenSum() {
        int sum = 0;
        int num = 1;

        while (num <= 10) {
            if (num % 2 == 0) {
                sum += num;
            }
            num++;
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberPattern pattern = new NumberPattern();

        pattern.printPattern();

        int sum = pattern.evenSum();
        System.out.println("Sum of even numbers from 1 to 10: " + sum);
    }
}

