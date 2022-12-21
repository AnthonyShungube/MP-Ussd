
import java.util.Scanner;

public class Login {
    static Scanner scanner = new Scanner(System.in);
    static int selected;

     static User user;

    public  Login(User user2)
     {
         user = user2;
     }
    public static void options() {

        System.out.println("1. Check balance");
        System.out.println("2. Send Money");
        System.out.println("3. Deposit money");
        System.out.println("4. Withdraw money");
        System.out.println("5. Exit");

        selected = scanner.nextInt();

        if (selected == 1) {
            System.out.println(user.checkBalance());
        } else if (selected == 2) {
            System.out.println("Please enter amount");
            selected = scanner.nextInt();
            System.out.println(user.withdraw(selected));
            System.out.println(user.deposit(selected));
        } else if (selected == 3) {
            System.out.println(user.deposit(100));
        } else if (selected == 4) {
            System.out.println(user.withdraw(200));
        }
    }

    public void login() {
        try {
            System.out.print("Enter Username: ");
            String userName = scanner.next();

            System.out.print("Enter Password: ");
            String password = scanner.next();

            if ("Anthony".equals(userName) && "password".equals(password)) {
                options();
            } else {
                System.out.print("Invalid UserName or password");
            }

            //User user = new User(1000);
            //User user = new User("Anthony", 1000, "password");
           if((userName == user.getName() && (password == user.getPassword())))
           {
               options();
           }
           else
           {
              throw new Exception("Username or password incorrect");
           }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
