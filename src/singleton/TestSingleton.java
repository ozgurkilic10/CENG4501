package singleton;

public class TestSingleton {

    static MySingleton s = null;
    static  MySingleton s2 = null;

    public static void main(String... args) throws InterruptedException {


        Thread t = new Thread(){
            public void run(){
                 s = MySingleton.getInstance();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                 s2 = MySingleton.getInstance();
            }
        };

        t.start();
        t2.start();

        t.join();
        t2.join();

        if (s == null){
            System.out.println("s is null");
        }
        if (s2 == null){
            System.out.println("s2 is null");
        }

        if (s == s2){
            System.out.println("Objects are same");
        }else{
            System.out.println("Objects are different");
        }
    }
}
