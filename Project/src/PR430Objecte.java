public class PR430Objecte {
    private String nom;
    private String cognom;
    private int edat;

    private static PR430Objecte instance;

    public static void main(String[] args){
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
    }

    private PR430Objecte(String n, String c, int e){
        this.nom = n;
        this.cognom = c;
        this.edat = e;
    }

    public static PR430Objecte getInstance(String n, String c, int e){
        //Per a que esperi 1000 ms
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }

        //Si no n'hi ha ningun d'aquest creat et dona un nou, sino retorna el ja creat
        if (instance == null) {
            instance = new PR430Objecte(n, c, e);
        }
        return instance;
    }

    @Override
    public String toString(){   //Per fer el print be
        return "Nom: "+nom+"  Cognom: "+cognom+"  Edat: "+Integer.toString(edat);
    }
}
