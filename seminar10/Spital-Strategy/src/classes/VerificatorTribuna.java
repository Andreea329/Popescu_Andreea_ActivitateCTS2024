package classes;

public class VerificatorTribuna implements Verificator{
    @Override
    public void verificare(String numeSuporter) {
        System.out.println("Se verifica bagajul lui "+numeSuporter);
    }
}
