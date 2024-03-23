package builder;

public class PacientBuilder implements Builder{
    private Pacient pacient; //ar ramane daca as avea clasa abstracta

    @Override
    public Pacient build() { // ara ramane daca as avea calsa abstracta
        return this.pacient;
    }

    public PacientBuilder() { //in constructorul de pacient_builder construim un obiect  //ar ramane daca asa avea clasa abstracta
        //constructorul PacientBuilder initailizeaza obiectul pacient
       this.pacient= new Pacient(false,false,false,false);
    }

    //metode care seteaza obtiunile extra ale pacientului
    public PacientBuilder setPatRabatabil(boolean patRabatabil){
        this.pacient.setPatRabatabil(patRabatabil);
        return  this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus){
        this.pacient.setMicDejunInclus(micDejunInclus);
        return  this;
    }

    public PacientBuilder setPapuciCamera(boolean papuciCamera){
        this.pacient.setPapuciCamera(papuciCamera);
        return this;
    }

    //metoda care retuneaza un pacientBuilder stetat cu o valoare booleana
    public PacientBuilder setHalatInterior(boolean halatInterior){
        this.pacient.setHalatInterior(halatInterior);
        return this;
    }

}
