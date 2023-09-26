import java.lang.reflect.Constructor;

public class Main {
        public static void main(String[] args){
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
                //Printea
            System.out.println(instance0);
            System.out.println(instance1);
            System.out.println(instance2);


            /* 
              //Exercici 0
               //Fa la primera instancia
            System.out.println("Iniciant 0");
            PR430Objecte instance0 = PR430Objecte.getInstance("Dani", "Villa", 18);
               //Intenta crear la segona (encara que rebra la primera)
            System.out.println("Iniciant 1");
            PR430Objecte instance1 = PR430Objecte.getInstance("Jaime", "Urquilla", 5);
               //Intenta crear la tercera (encara que rebra la primera tambe)
            System.out.println("Iniciant 2");
            PR430Objecte instance2 = PR430Objecte.getInstance("Akane", "Minami", 21);
               //Printea
            System.out.println(instance0);
            System.out.println(instance1);
            System.out.println(instance2);
            */
        }
}

