import java.util.*;

public class kurt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char Ans = ' ';
        int Choice, Answer, num1, num2;

        do {
            System.out.print("1st Number : ");
            num1 = s.nextInt();
            System.out.print("2nd Number : ");
            num2 = s.nextInt();

            System.out.println("\n\n\n");
            System.out.println("1. Add");
            System.out.println("2. Multiply");
            System.out.println("3. Subtract");
            System.out.print("Choice  :");
            Choice = s.nextInt();
            switch (Choice) {
                case 1:
                    Answer = num1 + num2;
                    System.out.println("The sum is " + Answer);
                    break;
                case 2:
                    Answer = num1 * num2;
                    System.out.println("The product is " + Answer);
                    break;
                case 3:
                    Answer = num1 - num2;
                    if (num1 > num2) {
                        System.out.println("The difference is " + Answer);
                    } else {
                        System.out.println("The num1 is less than num 2 so negative answer will diplay" + "-" + Answer);
                    }
                    break;
            }

            System.out.print("\n\ntry again? press y/n :");
            Ans = s.next().charAt(0);

        } while (Ans == 'y');
        if (Ans == 'n')
            System.out.print("\n\n\nThanks for Trying out!");

    }

}
