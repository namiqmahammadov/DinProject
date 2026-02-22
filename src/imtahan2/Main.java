package imtahan2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//         task21
        List<Integer> nums = List.of(3, 10, 15, 20, 7, 8);
        List<Integer> newNums = nums.stream().filter(n -> n % 2 != 0)
                .map(n -> n * 3)
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println(newNums);
        System.out.println("\n");
        //task22
        List<String>names=  List.of("Ali","Aysel","Murad","Nigar","Amin");
        Map<Character,Long>newNAmes=names.stream().collect(Collectors.groupingBy(n->n.charAt(0),Collectors.counting()));
        System.out.println(newNAmes);
        System.out.println("\n");
//        task23
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        List<Callable<Integer>> task=new ArrayList<>();
        for (int i = 1; i <=5; i++) {
            int number=i;
            task.add(()->number*number);

        }
        List<Future<Integer>>futures=executorService.invokeAll(task);
        for(Future<Integer> future:futures){
            System.out.println(future.get());
        }
        executorService.shutdown();
        System.out.println("\n");

//        task24
List<Integer> numbers=  List.of(1,2,3,4,5);
    List<Integer>newNumbers=numbers.stream().filter(n->n%2==0)
            .map(n->n*2).toList();
        System.out.println(newNumbers);
        System.out.println("\n");
//task25
List<Integer> number=  List.of(1,2,3,4,5,6);
ExecutorService executorService1=Executors.newFixedThreadPool(3);
List<Callable<Integer>> tasks=number.stream().map(n->(Callable<Integer>)()->faktorial(n)).toList();
        List<Future<Integer>> futuress=executorService1.invokeAll(tasks);
        int sum=0;
     for (Future<Integer> future:futuress){

       sum+=future.get();
     }
        System.out.println(sum);

     executorService1.shutdown();

    }
    public static int faktorial (int n){
        int faktorial=1;
        for(int i=1;i<=n;i++){
            faktorial*=i;
        }
        return faktorial;
    }
}
