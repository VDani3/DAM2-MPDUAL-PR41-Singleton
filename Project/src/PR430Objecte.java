public class PR430Objecte {
    private String nom;
    private String cognom;
    private int edat;

    private static PR430Objecte instance;

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
