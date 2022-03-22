
public class Proceso1 extends Thread{
    
    
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Este es el proceso del Hilo #1");
        }
    
    }
    
}
