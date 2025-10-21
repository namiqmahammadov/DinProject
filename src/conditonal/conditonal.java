package conditonal;

import java.util.Scanner;

public class conditonal {
    public static void main(String[] args) {
        // 1.Even or Odd
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: :");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even!");
        } else {
            System.out.println("Number is odd!");
        }
        // 2. Positive, Negative, or Zero
        if (num > 0) {
            System.out.println("Number is Positive!");
        } else if (num == 0) {
            System.out.println("Number is Zero!");
        } else {
            System.out.println("Number is Negative!");
        }
        //3. Largest of Two Numbers
        int num1= input.nextInt();
        if(num>num1){
            System.out.println(num+"daha boyukdur"+num1+"den");
        } else if (num<num1) {
            System.out.println(num1+"daha boyukdur"+num+"den");
        }
        else {
            System.out.println(num1+" "+num+"-a beraberdir") ;
        }

        //4. Pass or Fail
        if(num>0 && num<=100){
            if(num>=50){
                System.out.println("Student passed from exam");
            }
            else{
                System.out.println("Student failed from exam");
            }
        }

        // 5.Check Vowel or Consonant
        System.out.println("enter letter");
        char letter=input.next().charAt(0);
        char [] vowels = {'a','e','i','o','u'};
        boolean vowelsFound = false;
        for (int i = 0; i < 5; i++) {
            if(letter==vowels[i]){
             vowelsFound = true;
            }
        }
        if(vowelsFound){
            System.out.println(letter+" is a vowel");
        }
        else{
            System.out.println(letter+" is consonant");
        }
       // 6. Leap Year Checker
        int year= input.nextInt();

        if((year%4==0 && !(year%100==0))&&year%400==0){
            System.out.println(year + " artıq ildir.");

        }
        else{
            System.out.println(year + " artıq il deyil");
        }
        //7. Grade Calculator
        System.out.print("Enter your score: ");
        int score = input.nextInt();
        if (score > 0 && score <= 100) {
            if (score >= 90 && score <= 100) {
                System.out.println("You are score A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("You are score B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("You are score C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("You are score D");
            } else {
                System.out.println("You are score F");
            }

        }
        //8. Largest of Three Numbers
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number3: ");
        int number3 = input.nextInt();
        int[] nums = {number1, number2, number3};
        int max = number1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        System.out.println("Maximum number is " + max);

     //   9. Simple Calculator
        System.out.print("Enter a: ");
        int a=input.nextInt();
        System.out.print("Enter b: ");
        int b=input.nextInt();
        System.out.print("Enter operator: ");
      char operator = input.next().charAt(0);
      switch (operator) {
        case '+'-> System.out.println("Sum :"+(a+b));
        case '-'-> System.out.println("cixma :"+(a-b));
        case '*'-> System.out.println("multipy :"+(a*b));
        case '/'-> System.out.println("divide :"+(a/b));
      }

                //        10. Day of Week
        System.out.println("Enter day of week");
        int days = input.nextInt();
        switch (days) {
            case 1-> System.out.println(days+"= Monday");
            case 2-> System.out.println(days+"= Tuesday");
            case 3-> System.out.println(days+"= Wednesday");
            case 4-> System.out.println(days+"= Thursday");
            case 5-> System.out.println(days+"= Friday");
            case 6-> System.out.println(days+"= Saturday");
            case 7-> System.out.println(days+"= Sunday");


        }
        //11. Discount System
        System.out.print("Enter total purchase amount: ");
        int amount = input.nextInt();
        if(amount>0){
            if(amount>=1000){
                System.out.println("Sizin endirimli qiymetiniz "+ (0.8*amount));
            }
            else if(amount>=500 && amount<=999){
                System.out.println("sizin endirimli qiymetiniz "+ (0.9*amount));
            }
            else {
                System.out.println("sizin odenisiniz :"+amount);
            }

        }

    }
}
