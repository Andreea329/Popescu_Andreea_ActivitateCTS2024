package main;

import singleton.ContClient;
import singleton.RezervareClient;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        RezervareClient instanta= RezervareClient.getInstance();

        ContClient contClient1= new ContClient(1,"Popescu Andreea","07243583","apopescu29@gmail.com");
        ContClient contClient2= new ContClient(1,"Mirel Ion","07354834","mion29@gmail.com");
        ContClient contClient3= new ContClient(2,"Ionescu Tudor","0768405","tionescu@gmail.com");
        ContClient contClient4= new ContClient(3,"Avram Simona","07238439","asimion@gmail.com");


        instanta.inregistrareClient(contClient1);
        instanta.inregistrareClient(contClient2);
        instanta.inregistrareClient(contClient3);
        instanta.inregistrareClient(contClient4);
    }
}