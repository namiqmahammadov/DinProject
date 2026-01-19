package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("\n 1. Filter Even Numbers");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> odd = numbers.stream().filter(a -> a % 2 != 0)
                .toList();
        System.out.println(odd);
        //task2
        System.out.println("\n 2. Convert Strings to Uppercase");
        List<String> names = List.of("java", "stream", "api");
        List<String> result = names.stream().map(String::toUpperCase)
                .toList();
        System.out.println(result);
        //task3
        System.out.println("\n 3. Count Elements Greater Than 10");
        List<Integer> nums = List.of(5, 10, 15, 20);
        int count = (int) nums.stream().filter(a -> a > 10)
                .count();
        System.out.println(count);
        //task 4
        System.out.println("\n 4. Remove Null Values");
        List<String> data = Arrays.asList("A", null, "B", null, "C");
        List<String> newData = data.stream().filter(Objects::nonNull)
                .toList();
        System.out.println(newData);
        //task 5
        System.out.println("\n 5. Find the First Element Starting with \"A\"");
        List<String> namess = List.of("Bob", "Alice", "Andrew", "Charlie");
        String name = namess.stream().filter(n -> n.startsWith("A")).findFirst().get();
        System.out.println(name);
        //task6
        System.out.println("\n 6. Square and Sort Numbers");
        List<Integer> numberss = List.of(3, 1, 4, 2);
        var newNumbers = numberss.stream().map(a -> a * a)
                .sorted()
                .toList();
        System.out.println(newNumbers);
        //task7
        System.out.println("\n 7. Sum of All Even Numbers");
        List<Integer> numbersss = List.of(1, 2, 3, 4, 5, 6);
        int sumofEven = numbersss.stream().filter(a -> a % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumofEven);
        //task8
        System.out.println("\n 8. Convert List to Map");
        List<String> words = List.of("apple", "banana", "kiwi");
        Map<String, Integer> wordLengthMap =
                words.stream()
                        .collect(Collectors.toMap(
                                Function.identity(),
                                String::length,
                                (oldVal, newVal) -> oldVal
                        ));
        System.out.println(wordLengthMap);
        //task9
        System.out.println("\n 9. Find Maximum Value");
        List<Integer> numbersM = List.of(10, 50, 30);
        int max = numbersM.stream().max(Integer::compareTo)
                .orElseThrow();
        System.out.println(max);
        //task10
        System.out.println("\n 10. Group Strings by Length");
        List<String> wordsS = List.of("a", "bb", "ccc", "dd");

        Map<Integer, List<String>> wordLength = wordsS.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(wordLength);

        //task11
        System.out.println("\n 11. Partition Numbers into Even and Odd");
        List<Integer> numbersS = List.of(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> evenVsOdd = numbersS.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(evenVsOdd);
        //task12
        System.out.println("\n 12. Find Duplicate Elements");
        List<Integer> numbersDup = List.of(1, 2, 3, 2, 4, 3, 5);

        Set<Integer> duplicateNUm = new HashSet<>();
        numbersDup.stream()
                .filter(n -> !duplicateNUm.add(n))
                .forEach(System.out::println);
        //task13
        System.out.println("\n 13. Flatten a List of Lists");
        List<List<String>> list = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );
        List<String> newList = list.stream().flatMap(Collection::stream)
                .toList();
        System.out.println(newList);
        //task 14
        System.out.println("\n 14. Sort Employees by Salary");
        List<Employee> employers = new ArrayList<>(List.of(
                new Employee("Namiq", 123.0),
                new Employee("Elvin", 380.0),
                new Employee("Tural", 100.0)
        ));
        Collections.sort(employers);
        employers.forEach(e ->
                System.out.println(e.getName() + " " + e.getSalary()));

        //task15
        System.out.println("\n 15. Find Average Salary of Employees");
        var average0fSAlary = employers.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(average0fSAlary);
        //task16
        System.out.println("\n 16. Print All Elements");
        List<String> nameS = List.of("A", "B", "C");
        nameS.forEach(System.out::println);
        //task17
        System.out.println("\n 17. Filter Numbers Greater Than 5");
        List<Integer> numberM = List.of(1, 4, 6, 8, 2);
        var numMAx = numberM.stream().filter(n -> n > 5)
                .toList();
        System.out.println(numMAx);
        //task18
        System.out.println("\n 18. Multiply Each Number by 2");
        List<Integer> numbers1 = List.of(1, 2, 3);
        var numMultipy = numbers1.stream().map(n -> n * 2)
                .toList();
        System.out.println(numMultipy);
        //task19
        System.out.println("\n 19. Find Length of Each String");
        List<String> wordString = List.of("java", "stream");
        var lenghtWOrd = wordString.stream().map(String::length).toList();
        System.out.println(lenghtWOrd);
        //task20
        System.out.println("\n 20. Check If Any Number Is Even");
        List<Integer> numberEven = List.of(1, 3, 5, 6);
        boolean hasEven = numberEven.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);
        //task21
        System.out.println("\n 21. Check If All Numbers Are Positive");
        List<Integer> numberPositive = List.of(1, 2, 3, -1);

        boolean allPositive = numberPositive.stream()
                .allMatch(n -> n > 0);

        System.out.println(allPositive);
            //task22
        System.out.println("\n 22. Check If No Number Is Negative");
        List<Integer> numberNegative = List.of(1,2,3);
        boolean hasNegative=numberNegative.stream()
                .noneMatch(n->n<0);
        System.out.println(hasNegative);
        //task23
        System.out.println("\n 23. Sort Strings Alphabetically");
        List<String> nameSort = List.of("Banana","Apple","Mango");
        nameSort.stream().sorted()
                .forEach(System.out::println);
          //task24
        System.out.println("\n 24. Sort Numbers in Descending Order");
        List<Integer> numberDescending = List.of(4,1,7,2);
        numberDescending.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        //task 25
        System.out.println("\n 25. Find Minimum Number");
        List<Integer> numbersMin = List.of(9,3,6);
        int min=numbersMin.stream().min(Integer::compareTo)
                .orElseThrow();
        System.out.println(min);
       //task26
        System.out.println("\n 26. Find First Element");
        List<String> nameFisrt = List.of("Java","Python","C++");
         Optional<String> firstString=nameFisrt.stream().findFirst();
        System.out.println(firstString);
        //task27
        System.out.println("\n 27. Skip First 2 Elements");
        List<Integer> numbersSkip = List.of(1,2,3,4,5);
        numbersSkip.stream().skip(2).forEach(System.out::println);
        //task28
        System.out.println("\n 28. Limit to First 3 Elements");
        List<Integer> numberElement = List.of(10,20,30,40,50);
        numberElement.stream().limit(3).forEach(System.out::println);
        //task 29
        System.out.println("\n 29. Remove Duplicate Elements");
        List<Integer> numberDuplicate = List.of(1,2,2,3,3,4);
        numberDuplicate.stream().distinct().forEach(System.out::println);
        //task30
        System.out.println("\n 30. Convert Integer List to String List");
        List<Integer> numberCOnvert = List.of(1,2,3);
        List<String>convertNUm=numberCOnvert.stream().map(String::valueOf).toList();
        System.out.println(convertNUm);
        //task31
        System.out.println("\n  31. Join Strings with Comma");
        List<String> wordComma = List.of("A","B","C");

         String newWord = wordComma.stream().collect(Collectors.joining(","));
        System.out.println(newWord);
        //task32
        System.out.println("\n 32. Find Sum of All Numbers");
        List<Integer> numberAll = List.of(1,2,3,4);
        int sum=numberAll.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        //task33
        System.out.println("\n 33. Count Total Elements");
        List<String> items = List.of("pen","pencil","eraser");
        long element=items.stream().count();
        System.out.println(element);
        //task34
        System.out.println("\n 34. Check If List Is Empty Using Stream");
        List<String> listEm = List.of();
       boolean isEmpty=listEm.stream().findAny().isEmpty();
        System.out.println(isEmpty);
        //task35
        System.out.println("\n 35. Convert List to Set");
        List<String> nameSet= List.of("A","B","A");
        Set<String>newSet=nameSet.stream().collect(Collectors.toSet());
        System.out.println(newSet);
    }
}
