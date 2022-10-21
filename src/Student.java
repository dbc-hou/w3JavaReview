import java.util.ArrayList;

public class Student {

    private long id;
    public String name;
    private ArrayList<Integer> grades;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public Student() {

    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

    public double getGradeAverage(){
        int length = grades.size();

        // default sum value.
        double sum = 0;
        // sum of all values in array using for loop
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / length;
    }


    //accessors
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
