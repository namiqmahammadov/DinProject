package exception;

import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
static    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BankAccunt bankAccunt=new BankAccunt(200.0);

        int n;
        do {
            System.out.println("""
                    funksiyani cagir 
                    0---exit
                    1---divideByZero()
                    2---arrayIndexError()
                    3---numberFormat()
                    4---singleCatchBlock()
                    5---multipleCatchBlock()
                    6---finallyBlockPractice()
                    7---inputValidation()
                    8---invalidAge()
                    9---method1()
                    10---methodWithThrowAndThrows()
                    11---bankAccunt.withdrawing(pin,amount));
                    12---exceptionLogging();
                    """);
            n = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
                case 1 -> divideByZero();
                case 2 -> arrayIndexError();
                case 3 -> numberFormat();
                case 4 -> singleCatchBlock();
                case 5 -> multipleCatchBlock();
                case 6 -> finallyBlockPractice();
                case 7 -> inputValidation();
                case 8 -> invalidAge();
                case 9->method1();
                case 10-> methodWithThrowAndThrows();
                case 11 -> {
                    System.out.println("cixarilacaq meblegi daxil edin");
                    double amount =scanner.nextDouble();
                    System.out.println("PIn kodu daxil edin");
                    int pin=scanner.nextInt();
                    System.out.println(bankAccunt.withdrawing(pin,amount));}
                case 12 -> exceptionLogging();
            }
        } while (n != 0);

    }


    public static void divideByZero() {


        System.out.println("iki eded daxil edin :");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        try {
            a /= b;
            System.out.println(a);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void arrayIndexError() {
        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    public static void numberFormat() {
        String string = "salam";
        try {
            int str = Integer.parseInt(string);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void singleCatchBlock() {
        int[] array = {0, 1, 2, 3, 4, 5};
        try {
            double divide = array[1] / array[0];
            System.out.println(array[7]);
            System.out.println(divide);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void multipleCatchBlock() {
        try {

            int a = 10;
            int b = 0;
            int result = a / b;
            String text = null;
            System.out.println(text.length());

        } catch (ArithmeticException e) {
            throw new ArithmeticException(e.getMessage());
        } catch (NullPointerException e) {
            throw new NullPointerException(e.getMessage());
        }
    }

    public static void finallyBlockPractice() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            throw new NullPointerException(e.getMessage());
        } finally {
            System.out.println("this is finally block");
        }
    }

    public static void inputValidation() {

        System.out.println("Yaşınızı qeyd edin: ");
        try {
            int age = scanner.nextInt();
            if (age <= 0 || age > 120) {
                throw new InvalidAgeException("Yaş düzgün aralıqda deyil (1 - 120)");
            }
            System.out.println("Yaşınız: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("Xəta: " + e.getMessage());
        }


    }

    public static void invalidAge() {

        System.out.println("Yaşınızı qeyd edin: ");
        try {
            int age = scanner.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Yasiniz catmir");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void method3() {
        throw new ArithmeticException();
    }

    public static void method2() {
        method3();
    }

    public static void method1() {
        try {
          method3();
        } catch (ArithmeticException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }
    public static void methodWithThrowAndThrows()throws NullPointerException{

              String str=scanner.nextLine();
              try {
                  if(str.length()==0){
                      throw new NullPointerException();

                  }
              } catch (NullPointerException e) {
                  throw new RuntimeException(e);
              }

    }
    public static void exceptionLogging(){

        System.out.println("1-ci ededi daxil edin");
        int a= scanner.nextInt();
        System.out.println("2-ci ededi daxil edin");
        int b= scanner.nextInt();
        int divide =0;

        try{
            System.out.println(divide = a / b);

        }catch (ArithmeticException e){
            System.out.println("Message :"+e.getMessage());
            System.out.println("Cause :"+e.getCause());
            System.out.println("Stack trace :");
            e.printStackTrace();

        }
    }


}
