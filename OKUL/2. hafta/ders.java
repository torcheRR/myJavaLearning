public class GradeBook {

    // instance field
    private String courseName, teacher;
    private int pageNumber;

    // constructor
    public GradeBook(String courseName, String teacher, int pageNumber) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.pageNumber = pageNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setAll(String courseName, String teacher, int pageNumber) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.pageNumber = pageNumber;
    }

    public void displayMessage() {
        System.out.printIn("Welcome to the gradebook for " + getCourseName());
        System.out.println("Welcome to the gradebook for " + courseName);

        System.out.printf("Welcome to the gradebook for %s", getCourseName());

        System.out.printf("CourseName: %s", getCourseName());
        System.out.printf("Teacher: %s", getTeacher());
    }

}

