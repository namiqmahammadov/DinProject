package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        // 1. Sum of Elements
        //   - Input: {10, 20, 30, 40}
        //   - Output: 100
        int[] arr = {10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        //2. Find Maximum and Minimum
        //   - Input: {5, 2, 9, 1, 7}
        //   - Output: Max = 9, Min = 1
        int[] array = {5, 2, 9, 1, 7};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        //3. Count Even and Odd Numbers
        //   - Input: {3, 4, 6, 7, 9, 12}
        //   - Output: Even = 3, Odd = 3
        int[] numofArray = {3, 4, 6, 7, 9, 12};
        int count = 0;
        for (int i = 0; i < numofArray.length; i++) {
            if (numofArray[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers :" + count);
        System.out.println("odd numbers :" + (numofArray.length - count));
        //4. Reverse an Array
        //   - Input: {1, 2, 3, 4, 5}
        //   - Output: {5, 4, 3, 2, 1}
        int[] arrAY = {1, 2, 3, 4, 5};
        for (int i = arrAY.length - 1; i >= 0; i--) {
            System.out.println(arrAY[i]);
        }


        //5. Search Element
        //   - Task: Ask the user for a number and check if it exists in the array.
        int[] element = {2, 4, 6, 7, 9, 8, 7};
        System.out.println("Enter element");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean haveElemen = false;
        for (int i = 0; i < element.length; i++) {
            if (element[i] == n) {
                haveElemen = true;
                break;
            }

        }
        if (haveElemen == true) {
            System.out.println("eded massive daxildi");
        } else {
            System.out.println("eded massive daxil deyil");
        }

        //6. Copy Array
        //   - Task: Copy all elements from one array to another.
        int[] oldArray = {1, 3, 5, 7, 9};
        int[] newArray = new int[oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        for (int number : newArray) {
            System.out.print(number);
        }


    }
}
