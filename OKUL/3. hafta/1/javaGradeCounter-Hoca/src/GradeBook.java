import java.util.Scanner;

public class GradeBook {
    private String courseName;
    public GradeBook(String courseName){
        this.courseName=courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void displayMessage(){
        System.out.println("Welcome to the GradeBook for "+getCourseName());
    }
    public void determineClassAverage(){
        double total=0;
        double gradeCounter=1;
        Scanner input=new Scanner(System.in);
        while(gradeCounter<=10){
            System.out.print("Enter Next Grade: ");total+=input.nextDouble();
            gradeCounter++;
        }
        double average=total/(gradeCounter-1);
        System.out.println("Total Grade Counter is :"+ (gradeCounter-1));
        System.out.println("Average Grade is :"+ average);
    }
}