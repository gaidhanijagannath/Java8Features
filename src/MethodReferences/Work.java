package MethodReferences;

public class Work {
    public static void doActivity(){
        System.out.println("A static reference method doActivity() is being called for work interface.");
        System.out.println("1)Aeeee vedya aisa bat ka grip..");
    }

    public void doActivityInstance(){
        System.out.println("A instance reference method doActivityInstance() is being called for work interface.");
        System.out.println("1)Gaddari kar be...");
    }

    public static void doThreadTask(){

        for (int i = 1; i <11 ; i++) {

            System.out.println(i*2);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

    }
    public void printNumbers(){

        for (int i = 1; i <26 ; i++) {

            System.out.println(i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
