
import java.util.Scanner;

public class BasicEmailValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create scanner to get user input
        System.out.print("Input an email: ");
        // Ask user to input email
        String email = scanner.nextLine();

        if (!email.contains("@")) {
            //Email must contain at least one '@'
            System.out.println("Invalid");

        } else if (email.indexOf("@") != email.lastIndexOf("@")) {
            //Email must not contain more than one '@'
            System.out.println("Invalid");

        } else if (email.startsWith(".") || email.endsWith(".")) {
            //Email must not start or end with a dot
            System.out.println("Invalid");

        } else if (email.contains(" ")) {
            //Email must not contain spaces
            System.out.println("Invalid");

        } else {
            String local = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            // Split the email into local part and domain part

            if (local.length() < 1 || local.length() > 64) {
                System.out.println("Invalid");
                //Local part length must be between 1 and 64 characters

            } else if (!domain.contains(".")) {
                //Domain must contain at least one dot
                System.out.println("Invalid");

            } else {
                String extension = domain.substring(domain.lastIndexOf('.') + 1);
                // Get the domain extension
                if (extension.length() < 2 || extension.length() > 6) {
                System.out.println("Invalid");
                //Extension length must be between 2 and 6 characters

                } else {
                System.out.println("Valid");
                // If all rules pass, the email is valid
}
}
}
}
}