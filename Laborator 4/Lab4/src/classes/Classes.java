package classes;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Classes{
    public static void main(String[] args){
        Student student1 = new Student("Alexandru", "Moja", 4623, 2);
        Student student2 = new Student("Raul", "Popescu", 4621, 10);
        Student student3 = new Student("Robert", "Ciupala", 4623, 6);
        Student student4 = new Student("Cornel", "Misica", 4622, 9);
        Student student5 = new Student("Marian", "Pomana", 2221, 5);
        Student student6 = new Student("Radu", "Rotaru", 4221, 4);
        Student student7 = new Student("Mihai", "Mocanu", 3224, 10);

        Set<Student> MR_students = new TreeSet<>();
        Set<Student> SS_students = new TreeSet<>();
        Set<Student> ED_students = new TreeSet<>();


        MR_students.add(student1);
        MR_students.add(student2);
        MR_students.add(student6);
        MR_students.add(student7);
        SS_students.add(student4);
        SS_students.add(student5);
        ED_students.add(student3);
        ED_students.add(student1);

        Professor profMR = new Professor("Ciupala", "Codruta");
        Professor profSS = new Professor("Ivanovici", "Laurentiu");
        Professor profED = new Professor("Stanca", "Cornel");

        Course MR = new Course("Material Resistance", "Calculations of reactions,\n"
                + "effort diagrams, calculations of geometric characteristics of\n" +
                "flat surfaces and calculations of resistance elements to simple stresses\n",
                profMR, MR_students, 0);
        Course SS = new Course("Signals and Systems I", "Processing and analysis of signals",
                profSS, SS_students, 0);
        Course courseED = new Course("Electronic Devices", "Study of electronic devices", profED, ED_students, 0);
    }
}
