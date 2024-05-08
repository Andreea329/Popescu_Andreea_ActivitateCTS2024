package classes;

public class VerificatorPeluza implements Verificator{
    @Override
    public void verificare(String numeSuporter) {
        System.out.println("Se verifica bagajele si hainele pentru "+numeSuporter);
    }
}
