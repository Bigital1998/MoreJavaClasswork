package Introduction;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int num1=1;num1<=100; num1++) {
            if (num1 % 3 == 0) {
                System.out.println("fizz");
            } else if (num1 % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num1);
            }
        }
