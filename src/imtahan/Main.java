package imtahan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = input.nextInt();
        if (age > 0) {
            if (age < 18) {
                System.out.println("You are underage");
            } else if (18 <= age && age > 65) {
                System.out.println("Adult”");

            } else if (age > 65) {
                System.out.println("Senior");
            }
        }

        /// //////////////////////////////////////////////// task 2

        int[] arr = new int[5];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0.0;
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];

            sum += arr[i];
        }


            }
        for (int i = 0; i < 5; i++) {
          if (arr[i] < min) {
                min= arr[i];

            }

        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        System.out.println("Average:" + sum / 5);

        cleanText("salam123");
      Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100.0);
        bankAccount.deposit(500.0);
        bankAccount.withdraw(500.0);
    }
/// //////////////task3
    public static String cleanText(String s) {
        String[] newString = s.trim().toLowerCase().split(" ");
        char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < newString.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (newString[i].equals(num[j])) {
                    newString[i]. replace(num[j],' ');
                    newString[i].trim();

        }
    }



}  String join=    String.join("",newString);
        return join;


}}

