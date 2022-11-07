import java.util.*;

public class Basic_Login {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String emails[] = { "abeleda100@gmail.com", "Nics1123@gmail.com" };
        String passwords[] = { "123456789", "abcdefghi" };

        System.out.print("Enter your Email    : ");
        String email = s.next();
        System.out.print("Enter your Password : ");
        String passowrd = s.next();

        boolean Existing = false;
        for (int a = 0; a < emails.length; a++) {
            if (email.equals(emails[a]) && passowrd.equals(passwords[a])) {
                Existing = true;
            }
        }
        if (Existing) {
            System.out.println("Welcome!\n");
            System.out.println("Enter your midterm grade   : ");
            int Mgrade = s.nextInt();
            System.out.println("Enter your finalterm grade : ");
            int Fgrade = s.nextInt();
            int Frating = (Mgrade + Fgrade) / 2;
            System.out.println("Your final rating is       : " + Frating);
            System.out.println("---------------------------------------");
            if (Frating > 100)
                System.out.println("Remarks: Invalid Score");
            else if (Frating >= 75)
                System.out.println("Remarks: Passed");
            else if (Frating >= 65)
                System.out.println("Remarks: Failed");
            else
                System.out.println("Remarks: Invalid Score");

        } else
            System.out.println("Account not found");
    }
}
