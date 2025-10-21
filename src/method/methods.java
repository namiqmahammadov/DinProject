package method;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printGreeting();
        int a = 9, b = 10;
        System.out.println(add(a, b));
        System.out.println(isEven(a));
        System.out.println(" vurmaq cevelinin elemenitini  daxil edin ");
        int n = input.nextInt();
        System.out.println(printTable(n));
        System.out.println(max(1, 2));
        System.out.println("ededi daxil edin");
        int number = input.nextInt();

        System.out.println(isPrime(number));
        System.out.println("ededi daxil edin");
        int num1 = input.nextInt();
        System.out.println(factorial(num1));
        int [] array={1,2,3,4,5};
        System.out.println(sumArray(array));
        System.out.println("Stringi elave edin");
    String word = input.nextLine();
        System.out.println(reverseString(word));
        System.out.println("Stringi elave edin");
        String str = input.nextLine();
        System.out.println(countVowels(str));
        System.out.println(isPalindrome(word));
        System.out.println("kvadratin terefini daxil edin :");
        int sqrt = input.nextInt();
        System.out.println(area(sqrt));
        System.out.println("duzbucaqlinin terefleri daxil edin :");
        int rect1=input.nextInt();
        int rect2=input.nextInt();
        System.out.println(area(rect1, rect2));

        int []avg={1,2,3,4,5,6};
        System.out.println(average(avg));
        System.out.println("havanin tepmereaturunudaxil edin : ");
        double selsi = input.nextDouble();
        System.out.println(celsiusToFahrenheit(selsi));


    }


    //1: Write a method printGreeting() that prints "Hello, welcome to Java!"

    public static void printGreeting() {
        System.out.println("Hello, welcome to Java!");
    }

    //2.
    //
    //: Write a method add(int a, int b) that returns the sum of two numbers.
    public static int add(int a, int b) {
        return a + b;
    }

    //3. : Write a method isEven(int number) that returns true if the number is even, false otherwise.
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //4.
    //
    //: Write a method printTable(int n) that prints the multiplication table of the given number up to 10.
    public static int printTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
        return 0;
    }

    //5.
    //
    //: Write a method max(int a, int b) that returns the larger of two numbers.
    public static double max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //6.
    //
    //: Write a method isPrime(int number) that returns true if the number is prime.
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    //7.
    //
    //: Write a method factorial(int n) that returns the factorial of a number.
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;

    }

    //8.
    //
    //: Write a method sumArray(int[] arr) that returns the sum of all elements in the array.
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //9.
    //
    //: Write a method reverseString(String str) that returns the reverse of the given string.
    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        char[] reserved = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reserved[i] = arr[arr.length - 1 - i];

        }
        return new String(reserved);
    }

    //10.
    //
    //: Write a method countVowels(String str) that returns the number of vowels in the string.
    public static String countVowels(String str) {
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        char[] vowelsU = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowelsU.length; j++) {
                if (arr[i] == vowelsU[j]) {
                    count++;
                }
            }

        }
        char[] vowels = new char[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (arr[i] == vowelsU[j]) {
                    vowels[index++] = arr[i];
                }
            }

        }

        return new String(vowels);
    }
       //11.
    //
    //: Write a method isPalindrome(String str) that returns true if the string is a palindrome.
    public static boolean isPalindrome(String str)  {
        return str.equals(reverseString(str));
    };
    //12.
    //
    //: Write two versions of a method area():
    //
    //
    //area(int side) → returns area of square
    //
    //
    //area(int length, int width) → returns area of rectangle
    public static double  area(int side){
           return  Math.pow(side,2);
    }
    public static double  area(int length, int width){
        return  length*width;
    }
    //13.
    //
    //: Write a method average(int... numbers) that returns the average of any number of integers passed.
    public static double average(int... numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum/numbers.length;
        return average;

    }
    //14.
    //
    //: Write a method celsiusToFahrenheit(double celsius) that converts temperature.
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

}



