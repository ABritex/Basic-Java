import java.util.*;

public class Basic_Login1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Emails = "123";
        String Passwords = "123";
        int MidtermGrade, FinaltermGRade, FinalRating;
        
        System.out.print("Enter your Email    : ");
        String type1 = input.next();
        
        System.out.print("Enter your Password : ");
        String type2 = input.next();

        if (type1.equals(Emails) && type2.equals(Passwords)) {
            System.out.println("Welcome!");
            
            System.out.print("\nEnter your Midterm grade   : ");
            MidtermGrade = input.nextInt();
            
            System.out.print("Enter your Finalterm grade : ");
            FinaltermGRade = input.nextInt();
            
            FinalRating = (40 * MidtermGrade + 60 * FinaltermGRade) / (40 + 60);
      
            System.out.println("Your final rating is       : " + FinalRating);
            System.out.println("***************************************");
            if (FinalRating > 100) {
                System.out.println("Remarks: Invalid Score");
            } else if (FinalRating >= 75)
                System.out.println("Remarks: Passed");
            else if (FinalRating >= 65)
                System.out.println("Remarks: Failed");
            else
                System.out.println("Remarks: Invalid Score");
        } else
            System.out.println("Account is not found");
    }
}
