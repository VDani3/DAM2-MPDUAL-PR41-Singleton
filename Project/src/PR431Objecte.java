import java.lang.reflect.Constructor;

public class PR431Objecte {
    public static void main(String[] args) {
        PR430Objecte instance0 = PR430Objecte.getInstance("Dani", "Villa", 18);
        PR430Objecte instance1 = null;
        PR430Objecte instance2 = null;

        try{
            Constructor[] constructors = PR430Objecte.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instance1 = (PR430Objecte) constructor.newInstance("Jaime", "Urquilla", 5);
                instance2 = (PR430Objecte) constructor.newInstance("Akane", "Minami", 21);
                break;
            }
        } catch (Exception e) { e.printStackTrace();}
            
          //Printea esperant els segons
        try {
            System.out.println("Instance 0");
            Thread.sleep(1000);
            System.out.println("Instance 1");
            Thread.sleep(1000);
            System.out.println("Instance 2");
            Thread.sleep(1000);
            System.out.println(instance0);
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println("\n");
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
