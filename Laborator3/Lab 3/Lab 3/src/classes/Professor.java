package classes;
public class Professor extends Person{


    public Professor(String name, String surname ){
        super(name,surname);

    }
    @Override
    public String toString() {
        return "Professor { " + "name=" + name + " , surname=" + surname + " } ";
    }
}

