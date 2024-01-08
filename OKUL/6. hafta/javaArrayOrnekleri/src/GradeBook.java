public class GradeBook {
    private String courseName;
    private int grades[];
    public GradeBook(String courseName, int[] grades){
        this.courseName=courseName;
        this.grades=grades;
    }
    public void setCourseName(String courseN){
        this.courseName=courseN;
    }
    public String getCourseName() {
        return courseName;
    }

}
