import java.util.*;

public class Basic_Login {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String emails[] = { "abeleda100@gmail.com", "Nicholas1@gmail.com" };
        String passwords[] = { "123456789", "abcdefghi" };
        int Weight1 = 40, Weight2 = 60;
        String Remarks;
        System.out.print("Enter your Email    : ");
        String email = s.next();
        System.out.print("Enter your Password : ");
        String passowrd = s.next();

        boolean Exist = false;

        for (int a = 0; a < emails.length; a++) {
            if (email.equals(emails[a]) && passowrd.equals(passwords[a])) {
                Exist = true;
            }
        }
        if (Exist) {
            System.out.println("Welcome!\n");
            System.out.print("Enter your midterm grade   : ");
            int Mgrade = s.nextInt();
            System.out.print("Enter your finalterm grade : ");
            int Fgrade = s.nextInt();
            int Frating = (Weight1 * Mgrade + Weight2 * Fgrade) / (Weight1 + Weight2);
            if (Frating > 100)
                Remarks = "Invalid";
            else if (Frating >= 75)
                Remarks = "Passed";
            else if (Frating >= 65)
                Remarks = "Failed";
            else if (Frating <= 64)
                Remarks = "Invalid";
            else
                Remarks = "Error";

            System.out.println("Your final rating is       : " + Frating);
            System.out.println("---------------------------------------");
            System.out.println("Remarks : " + Remarks);

            /*
             * if (Frating > 100)
             * System.out.println("Remarks: Invalid Score");
             * else if (Frating >= 75)
             * System.out.println("Remarks: Passed");
             * else if (Frating >= 65)
             * System.out.println("Remarks: Failed");
             * else
             * System.out.println("Remarks: Invalid Score");
             */
        } else
            System.out.println("Account not found");
    }
}
