package L3B;

public class Course {

    String courseName;
    int sectionNum;
    int credits;
    Course link;

    public Course() {
        link = null;
    }

    public Course(String courseName, int sectionNum, int credits, Course link) {
        this.courseName = courseName;
        this.sectionNum = sectionNum;
        this.credits = credits;
        this.link = link;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(int sectionNum) {
        this.sectionNum = sectionNum;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Course getLink() {
        return link;
    }

    public void setLink(Course link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Course:" + courseName + ", Section: =" + sectionNum +
                " , Credits: " + credits ;
    }
}
