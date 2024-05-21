package classes;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertTrue;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnFeminin() {
        Persoana persoana1=new Persoana("Simona","6021133343545");
       assertEquals(persoana1.getSex(),"F");


    }

    @org.junit.Test
    public void getSexReturnMasculine() {
        Persoana persoana2=new Persoana("Andrei","5021133343545");
        assertEquals(persoana2.getSex(),"M");
    }

    @org.junit.Test
    public void getSexBoundery() { //limita inferioara
        Persoana persoana=new Persoana("Andrei","1021133343545");
        assertEquals(persoana.getSex(),"M");
    }

    @org.junit.Test
    public void getSexCrossCheck(){
        String cnp="102939485665";
        Persoana persoana=new Persoana("Andrei",cnp);
        String sex;
        if(Integer.valueOf(cnp.charAt(0))%2==0){
            sex=String.valueOf('F');
        }else{
            sex=String.valueOf('M');
        }
        assertEquals(persoana.getSex(),sex);
    }

    @org.junit.Test(expected = IllegalArgumentException.class) //.class pentru ca primeste fisierul class
    public void getSexErrorCondition(){
        String cnp="902939485665";
        Persoana persoana=new Persoana("Andrei",cnp);
        persoana.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorConditionEmptyString(){
        String cnp=" ";
        Persoana persoana=new Persoana("Andrei",cnp);
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
    public void getSexPerformance(){
        Persoana persoana=new Persoana("Andrei","5021133343545");
        persoana.getSex();
    }

    @org.junit.Test
    public void getSexCorrect(){
        Persoana persoana=new Persoana("Andrei","5021133343545");
        assertEquals(1,persoana.getSex().length());
    }

    @org.junit.Test
    public void getSexCorrectByLetter(){
        Persoana persoana=new Persoana("Andrei","5021133343545");
        boolean isCorrect=persoana.getSex().toLowerCase().equals("m") || persoana.getSex().toLowerCase().equals("f");
        assertTrue(isCorrect);
    }

    @org.junit.Test
    public void getSexOrder(){
        Persoana persoana1=new Persoana("Andrei","5021133343545");
        Persoana persoana2=new Persoana("Andreea","6021133343545");

        //codul ascii al lui f este 70
        //codul ascii al lui m este 77
        //verificam f<m
        // rezultatul lui compareTo sa fie mai mare decat 0

        assertTrue(persoana1.getSex().compareTo(persoana2.getSex())>0);
    }

    @org.junit.Test
    public void getSexRange(){
        //testam in interiorul, in afara si limitele intervalului
        Persoana persoana=new Persoana("Andreea","8021133343545");

        assertEquals(persoana.getSex(),"F");
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistance(){
        Persoana persoana=new Persoana("Andreea",null);
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexCardinality(){
        Persoana persoana=new Persoana("Andreea","03847935566");
        persoana.getSex();
    }


}