package classes;
public class Student extends Person{

    int groupNumber;
    int grade;
    public Student(String name, String surname, int groupNumber, int grade) {
        super(name, surname);
        this.groupNumber = 0;
        this.grade = 0;
    }

    public int getGrade(){
        return grade;
    }

}
