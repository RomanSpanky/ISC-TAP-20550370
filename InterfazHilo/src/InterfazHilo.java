
public class InterfazHilo {


    public static void main(String[] args) {
        
        Proceso1 H1 = new Proceso1();
        Proceso1 H2 = new Proceso1();

        
        H1.start();
        H2.start();
    }
    
}
