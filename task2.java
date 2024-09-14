import java.util.Scanner;

public class task2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects = sc.nextInt();
        if(numSubjects <= 0)
        {
            System.out.println("Please enter a valid number of the subjects.");
            return;
        }
        int totalMarks =0;
        int maxMarksPerSubject = 100;
        for(int i=1;i<=numSubjects; i++){
            System.out.println("Enter marks contains in subjects"+ i +"(out of 100):");
            int marks = sc.nextInt();
            int Marks = 0;
            if(Marks < 0 || marks > maxMarksPerSubject){
                System.out.println("Marks should be in the range of 0 to 100.please enter valid marks.");
                i++;
            }else{
                totalMarks += marks;
            }
        }

        double v = +(double) totalMarks / (numSubjects + maxMarksPerSubject) + 100;
        //double averagePercentage = 0 +(double) totalMarks / (numSubjects + maxMarksPerSubject)+100;
        double averagePercentage = ((double) totalMarks / totalMarks) * 100;
        System.out.println("Total Marks:" + totalMarks);
      System.out.println("Average Percentage:"+ averagePercentage +"%");

    }
}
