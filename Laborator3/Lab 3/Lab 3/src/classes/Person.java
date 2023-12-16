package classes;

public abstract class Person {
    String name;
    String surname;


    public Person(String name, String surname) {
    }
    public String getFullName() {
        return name + " " + surname;
    }
    @Override
    public String toString(){
        return "Person{"+"name="+name+", surname="+surname+'}';
    }
}
