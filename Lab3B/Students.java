//MICHAEL POLONIO
//CSC 236-64
//LAB 3-#2
package Lab3B;


public class Students implements StudentsADT {


    private int max;
    int MAXSTUDENTS[];
    Course first, last, newCourse;


    public Students() {
        first = null;
        last = null;
    }

    public void setMaxNumberOfStudents(int max)
    {
        MAXSTUDENTS = new int[max];

        for (int i = 0; i < max; i++)
        {
            MAXSTUDENTS[i] = 0;
        }
    }

    public void addStudent(int id) {
        int i = 0;
        if (MAXSTUDENTS[i] == 0)
            MAXSTUDENTS[i] = id;
        else if (MAXSTUDENTS[i + 1] == 0)
            MAXSTUDENTS[i + 1] = id;
        else
            MAXSTUDENTS[i + 2] = id;
    }

    @Override
    public void addCourse(String course, int section, int credits) {
        newCourse = new Course(course, section, credits, null);

        if (first == null)
        {
            first = newCourse;
            last = newCourse;
        }else
        {
            newCourse.link = first.getLink();
            first = newCourse;
        }
    }
    @Override
    public void dropCourse(String className) {
        Course current = first;

        while (!current.equals(className))
            current = current.link;

        current = current.link;
    }
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < max; i++)
            str += MAXSTUDENTS[i] + "\n";

        return str;
    }

    class Student {

        int id;
        private String courses;
        Course first, last;

        public Student() {
            first = null;
        }

        public Student(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCourses() {
            return courses;
        }

        public void setCourses(String courses) {
            this.courses = courses;
        }

        public void addCourse(String course, int section, int credits) {
            newCourse = new Course(course, section, credits, null);

            if (first == null)
            {
                first = newCourse;
                last = newCourse;
            }else
            {
                newCourse.link = first.getLink();
                first = newCourse;
            }
        }
        public void dropCourse(String course) {
            Course current = first;

            while (!current.equals(course))
                current = current.link;

            current = current.link;

        }
    }
}
