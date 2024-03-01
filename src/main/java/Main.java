import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        compute();
    }

    public static void compute() {
        int num;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        //Get input number from user
        System.out.println("Enter a number");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            sum = sum + i;


        }
        System.out.println(sum);
    }

    }

