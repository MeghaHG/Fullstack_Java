package controlflowstatement;

public class MarkExample {
    public static void main(String[] args) {
        int mark=85;



        if (mark >90) {
            System.out.println("grade is A+");
        } else if (mark>=80) {
            System.out.println("grade is A");
        } else if (mark>=70) {
            System.out.println("grade is B+");

        }else if (mark>=60) {
            System.out.println("grade is B");
        }else if (mark>=50) {
            System.out.println("grade is C+");
        }
    }
}
