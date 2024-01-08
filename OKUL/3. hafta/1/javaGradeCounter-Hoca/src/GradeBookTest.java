public class GradeBookTest {
    public static  void main(String[] args){
        GradeBook gradeBookObj= new GradeBook("Java");
        gradeBookObj.setCourseName("Java");
        gradeBookObj.displayMessage();

        GradeBook gradeBookObj2=new GradeBook("Pattern Analysis");
        gradeBookObj2.displayMessage();
        gradeBookObj2.determineClassAverage();
    }
}
