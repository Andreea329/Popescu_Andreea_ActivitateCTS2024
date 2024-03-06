package sustinereExamen.main;

import BazaDeDate.classes.ConexiuneBazaDeDate;
import sustinereExamen.classes.Student;
import sustinereExamen.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {

        Student student1=new Student(123,"Andreea Popescu","apopescu@gmail.com",3);
        Student student2=new Student(124,"Andreea Simion","asimion@gmail.com",2);
        Student student3=new Student(125,"Ana Roamn","aroman@gmail.com",3);
        Student student4=new Student(126,"Andrei Puiu","apuiu@gmail.com",2);

        SustinereExamen examenPOO= new SustinereExamen("Programare orientata obiect");
        SustinereExamen examenCTS= new SustinereExamen("Calitate si testare software");

        examenPOO.inregistrareStudent(student4);
        examenPOO.inregistrareStudent(student4);
        examenCTS.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student2);
        examenPOO.inregistrareStudent(student3);

    }
}