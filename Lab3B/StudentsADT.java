//MICHAEL POLONIO
//CSC 236-64
//LAB 3-#2
package Lab3B;


public interface StudentsADT {

    // sets max number of students with int parameter
    void setMaxNumberOfStudents(int max);
    // adds a student id to the array
    void addStudent(int id);
    // adds a course by taking the course name, section and number of credits as parameters
    void addCourse(String course, int section, int credits);
    // Drops the course with the string being passed
    void dropCourse(String className);

}
