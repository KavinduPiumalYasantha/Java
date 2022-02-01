package thread;

public class ThreadBase{

    public static void main(String[]args){
        NumberThread Red = new NumberThread();
        NumberThread Blue = new NumberThread();
        NumberThread Green = new NumberThread();

        Red.start();
        Blue.start();
        Green.start();

        for(int i=0;i<100; i++){
            
        }
    }
}