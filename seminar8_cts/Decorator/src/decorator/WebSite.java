package decorator;

import spital.DiagnosticAbstract;

public class WebSite extends  Decorator{
    public WebSite(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("In cadrul aplicatiei mobile ati primit diagnosticul "
                + super.getNumeDiagnostic()
                + " cu simptomele " + super.getSimptome()
                + " si " + (super.isNecesitaSpitalizare() ? " ": " nu ") +  " aveti nevoie de spitalizare: "+ super.isNecesitaSpitalizare());
    }
}
