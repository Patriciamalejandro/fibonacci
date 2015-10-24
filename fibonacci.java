import java.util.Scanner;

public class fibonacci {

    public static void main(String args[]) {

                System.out.print("Enter a number: ");
        int num = new Scanner(System.in).nextInt();


        for(int i=1; i<=num; i++){
            System.out.print(fibonacciRecusion(i) +" ");
        }
    }
    public static int fibonacciRecusion(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        return fibonacciRecusion(num-1) + fibonacciRecusion(num -2);
    }

      public static int fibonacciLoop(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= num; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci;
    }
}
