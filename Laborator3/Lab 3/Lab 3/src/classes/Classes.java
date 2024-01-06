package classes;

public class Classes{
    public static void main(String[] args){
        Student[] students = new Student[]{new Student("Daniel", "Negoita", 2231, 6), new Student("Cornel", "Misica", 4221,6)};
        Student neadaugat = new Student("Alexandru", "Moja", 2231, 7);
        Professor prof = new Professor("Anton", "Panaitescu");

        Course course = new Course("Material Resistance", "Calculations of Reactions, \n" + "effort diagrams, calculations of geometric characteristics of\n" + "flat surfaces and calculations of resistance elements to simple stresses", prof, students);
        course.addStudent(neadaugat);

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course);
        courseManager.displayCoursesToConsole();
        courseManager.listStudentsInCourse("Material Resistance");
        courseManager.calculateAverageGradeForCourse("Material Resistance");
        courseManager.calculateAverageGradeByProfessor(prof);
    }
}