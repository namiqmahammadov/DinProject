//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task16
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        //task 17
        MYThread myThread=new MYThread();
        myThread.start();
        System.out.println("\n");
    //  task 18

        int [] arr={3,7,2,9,5};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
        System.out.println("\n");
    }
}
