import java.util.*;

public class gradecalculator
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
         {
            System.out.println("Enter the number of subjects");
            int numofsubjects=sc.nextInt();

            if (numofsubjects<=0)
             {
                System.out.println("please enter a valid number of subject");
                return;
            }
            int totalmarks=0;
            int maxmarks=100;

            for(int i=1;i<=numofsubjects;i++)
            {
                System.out.println("enter mark obtained in subject "+i+"(out of 100):");

                int marks =sc.nextInt();

                if (marks < 0 || marks > maxmarks)
                {
                    System.out.println("please enter a valid mark");
                    i--;

                    
                }
                else
                {
                    totalmarks+=marks;
                }
            }

            double avgpercentage=(double) totalmarks/(numofsubjects*maxmarks)*100;
            System.out.println("total marks:"+totalmarks);
            System.out.println("Average percentage:"+avgpercentage);


            String grade;

            if (avgpercentage>=90)
            {
                grade="A+";              
            }
            else if (avgpercentage>=80)
            {
                grade="A";
                
            }
            else if (avgpercentage>=70) 
            {
                grade="B";
                
            }
            else if (avgpercentage>=60)
            {
                grade="C";
                
            }
            else if (avgpercentage>=50)
            {
                grade="D";
                
            }
            else
            {
                grade="F";
            }

            System.out.println("grade:"+grade);
        }
        

    }
    

    
}