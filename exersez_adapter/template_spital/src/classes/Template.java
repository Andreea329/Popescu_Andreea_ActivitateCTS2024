package classes;

public abstract class Template {
    public final void internare(Pacient pacient){
        analizeazaStarea(pacient);
        if(verificaDisponibilitatea()>0){
            emitereFisa(pacient);
        } else {
            refuzaInternarea(pacient);
        }
    }

    protected abstract void analizeazaStarea(Pacient pacient);
    protected abstract int verificaDisponibilitatea();
    protected abstract void  emitereFisa(Pacient pacient);
    protected abstract void  refuzaInternarea(Pacient pacient);

}
