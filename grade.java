import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Student Name: ");
        String studName = s.nextLine();

        System.out.print("Enter the DSA Mark: ");
        int DSAMark = s.nextInt();

        System.out.print("Enter the DPCO Mark: ");
        int DPCOMark = s.nextInt();

        System.out.print("Enter the Math Mark: ");
        int mathMark = s.nextInt();

        System.out.print("Enter the Data Science Mark: ");
        int DataScienceMark = s.nextInt();

        System.out.print("Enter the OOPS-Java Mark: ");
        int OOPSMark = s.nextInt();


        int totalSubjects = 5;
        int totalMarks = DSAMark + DPCOMark + mathMark + DataScienceMark + OOPSMark;
        
        if(totalMarks <= 500 && DSAMark > 0 && DPCOMark > 0 && mathMark > 0 && DataScienceMark > 0 && OOPSMark > 0){
            float averageMark = (totalMarks) / totalSubjects;

            String grade = "a";
            
            if(averageMark <= 50 && averageMark >= 0){
                grade = "D";
            }
            else if(averageMark <= 60 && averageMark > 50){
                grade = "C";
            }
            else if(averageMark <= 70 && averageMark > 60){
                grade = "B";
            }
            else if(averageMark <= 80 && averageMark > 70){
                grade = "B+";
            }
            else if(averageMark <= 90 && averageMark > 80){
                grade = "A";
            }
            else if(averageMark <= 100 && averageMark > 90){
                grade = "A+";
            }
            
            System.out.println("\n \n \n");

            
            System.out.println("The Grade Sheet of " + studName);
            System.out.println("-------------------------------------------");
            System.out.println("DSA Mark    :   " + DSAMark);
            System.out.println("DPCO Mark  :   " + DPCOMark);
            System.out.println("Math Mark     :   " + mathMark);
            System.out.println("DataScience Mark  :   " + DataScienceMark);
            System.out.println("OOPS Mark   :   " + OOPSMark);
            System.out.println("-------------------------------------------");
            System.out.println("And Your Overall Grade is : " + grade);       
            System.out.println("-------------------------------------------");
        }
        else{
            System.out.println("Enter the Valid Mark ||| Run again!..");
        }

        s.close();
    }  
}
