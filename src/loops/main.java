package loops;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // 1. Print 1 to 10

        for (int i = 1; i <=10; i++) {
            System.out.println(i);

        }
       // 2. Sum of 1 to N
        System.out.println("N-i daxil edin");
        int N = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;

        }
        System.out.println("Sum :" + sum);
        //3 . even number
        for (int i = 1; i <=50; i++) {
            if(i%2==0){
                System.out.println(i);
            }

        }
        //4 Countdown
        int n = 10;
        while (n > 0) {
            System.out.println(n);
            n--;

        }
        //5. Multiplication Table
        System.out.println("ededi daxil edin");
        int number = input.nextInt();
        for (int i = 1; i <=10 ; i++) {

            System.out.println(number+"*"+i+"="+(number*i));
        }
        //6. Sum of Even and Odd Numbers
        System.out.println("ededi daxil edin");
        int N1 = input.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= N1; i++) {
            if (i % 2 == 0) {
                sumEven += i;

            } else {
                sumOdd += i;
            }
        }
        System.out.println("sum of Even:" + sumEven);
        System.out.println("sum of Odd:" + sumOdd);
        //7. Factorial
        System.out.println("ededi daxil edin");
        int N2 = input.nextInt();
        int fact=1;
        for (int i = 1; i <=N2; i++) {
            fact=fact*i;

        }
        System.out.println(N+ " ededinin facktoriali : "+fact);
        //8. Reverse a Number
        System.out.println("ededi daxil edin");
        int num = input.nextInt();
        int reverse = 0;
        while (num != 0) {
            int d = num % 10;
            reverse = reverse * 10 + d;
            num /= 10;
        }
        System.out.println("tersine cevrilmis eded " + reverse);
        // 9. Sum of Digits
        System.out.println("ededi daxil edin");
        int number1 = input.nextInt();
        int sumOfDigit = 0;
        while (number1!= 0) {
            int d =  number1 % 10;
            sumOfDigit+=d;
            number1 /= 10;
        }
        System.out.println("daxil edilmis ededin reqemleri cemi :"+sumOfDigit);
        //10. Prime Number Check
        System.out.println("eded daxil edin");
        int b = input.nextInt();

        for (int i = 2; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println(i);
            }

        }
       // 11. Nested Loop Pattern – Stars
        int a=10;
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
