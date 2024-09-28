import java.util.Scanner;

class InvalidMarkException_3035_kika extends Exception {
    public InvalidMarkException_3035_kika(String output){
        super(output);
    }
}

public class Student_3035_kika {
    static Scanner sc = new Scanner(System.in);
    public String name;
    private int mark;
    private int rollno;

    public Student_3035_kika(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public void setMark(int mark) throws InvalidMarkException_3035_kika {
        if (mark < 0 || mark > 100) {
            throw new InvalidMarkException_3035_kika("Invalid mark" + mark);
        }
        this.mark = mark;
        System.out.println(name + " has acquired mark " + mark);
    }

    public static void main(String[] args) {
        Student_3035_kika student = new Student_3035_kika("Krithika", 2022503035);
        try{
            System.out.println("Enter the mark:");
            int score ;
            score = sc.nextInt();
            student.setMark(score);

        }
        catch (InvalidMarkException_3035_kika mark){
            System.out.println("The value is not within the range");
        }
    }

}