import java.util.Scanner;

/*[Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
<pre>
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
</pre>*/

public class DisplayGrades {
    static void CalculateGrade(int mark) {
        if (mark >= 91 && mark <= 100) {
            System.out.println("AA Grade");
        }
        if (mark >= 81 && mark <= 90) {
            System.out.println("AB Grade");
        }
        if (mark >= 71 && mark <= 80) {
            System.out.println("BB Grade");
        }
        if (mark >= 61 && mark <= 70) {
            System.out.println("BC Grade");
        }
        if (mark >= 51 && mark <= 60) {
            System.out.println("CD Grade");
        }
        if (mark >= 41 && mark <= 50) {
            System.out.println("DD Grade");
        }
        if (mark <= 40) {
            System.out.println("Fail!!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        int marks = sc.nextInt();
        CalculateGrade(marks);
    }
}
