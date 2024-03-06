package BazaDeDate.classes;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDeDate instanta=null;


    public ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConectare='" + linkConexiune + '\'' +
                '}';
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    public static void setInstanta(ConexiuneBazaDeDate instanta) {
        ConexiuneBazaDeDate.instanta = instanta;
    }

    //syncronized -> sa fie threadSafe
    //daca nu il avem, apeleaza constructorul de doua ori
    public static synchronized ConexiuneBazaDeDate getInstance(String numeBaza,int nrTabele, String linkConexiune){
        if(instanta ==null) {
            instanta =new ConexiuneBazaDeDate(numeBaza, nrTabele, linkConexiune);
        }
        return instanta;
    }
}
