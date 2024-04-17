
import java.util.Scanner;

class UsernameException extends Exception {
    UsernameException(String msg) {
        super(msg);
    }
}

class PasswordException extends Exception {
    PasswordException(String msg) {
        super(msg);
    }
}

public class UserNamePass {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username, password;
        System.out.println("Enter the username:");
        username = reader.nextLine();
        System.out.println("Enter the password:");
        password = reader.nextLine();
        int len = username.length();
        try {
            if (len < 8)
                throw new UsernameException("Username must be greater than 8 characters");
            else if (!password.equals("admin"))
                throw new PasswordException("Incorrect password");
            else
                System.out.println("Login successful");
        } catch (UsernameException u) {
            System.out.println(u);
        } catch (PasswordException p) {
            System.out.println(p);
        }
    }
}
