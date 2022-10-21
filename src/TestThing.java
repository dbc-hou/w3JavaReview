import java.util.ArrayList;
import java.util.List;

public class TestThing {

    public static class Cohort {
        private List<Student> listOfStudents;

        public Cohort() {
            this.listOfStudents = new ArrayList<>();
        }

        public void addStudent(Student newStu) {
            listOfStudents.add(newStu);
        }

        public List<Student> getListOfStudents() {
            return listOfStudents;
        }
    }

}

