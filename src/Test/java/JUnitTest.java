package Test.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTest {


    TestThing.Cohort thisCohort;
    TestThing.Cohort empty;

    @Before
    public void setup() {
        empty = new TestThing.Cohort();
        thisCohort = new TestThing.Cohort();
        thisCohort.addStudent(new Student());
    }

    @Test
    public void testingAddStudent() {
        assertEquals(1,empty.getListOfStudents().size());
    }

}
