import java.util.Scanner;

public class SwitchingTwoFlows {
    public static void main(String[] args) {    //first thread


        Scanner inp = new Scanner(System.in);
        MyThread myThread = new MyThread(); // creating new Thread object
        myThread.start();   //running new Thread

        while (true) {   // entering endless cycle
            if (MyThread.running) {    //if second is running, waiting for keyboard input
                inp.nextLine();
                MyThread.stopContinue();   //switches running if there was a keyboard input, while running second thread
            }else{
                try {
                    Thread.sleep(500);      // else if second isn't running print "first" every 0.5 seconds

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("first");
            }
        }


    }
}






class MyThread extends Thread{
    public static volatile boolean running = true;    //switch which is volatile so that CPU not gonna put it into cash
    public void run() {     //second thread
        Scanner inp = new Scanner(System.in);

        while (true) {      //entering endless cycle
            if (running) {    //if second is running (true)
                try {       //print "second" every 0.5 seconds
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("second");


            } else {
                inp.nextLine();   //if second thread is not running(false), wait for keyboard input to switch running
                MyThread.stopContinue();   //switches running if there was a keyboard input, while running first thread
            }
            ;

        }
    }
    public static void stopContinue () {
        running = !running;


    }
}
