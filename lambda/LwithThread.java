package com.lambda;

/*Without Lambda Expression*/
//defining a thread
class threads1 implements Runnable
{
    @Override
    public void run() {

        for (int i=0;i<9;i++){  //job of child thread
            System.out.println("Child thread");
        }
    }


}
public class LwithThread {
    public static void main(String[] args) {

        Runnable r= new threads1();
        Thread t=new Thread(r);
        t.start();  //main thread started child thread
        for (int i=0;i<9;i++){
            System.out.println("Main thread");
        }
    }
}


/*With Lambda Expression*/

//public class LwithThread {
//    public static void main(String[] args) {
//
//        Runnable r = () -> {
//            for (int i = 0; i < 4; i++) {
//                System.out.println("Child Thread");
//            }
//
//        };
//        Thread t=new Thread(r);
//        t.start();
//        for (int i=0;i<3;i++){
//            System.out.println("Main thread");
//        }
//
//    }
//
//}