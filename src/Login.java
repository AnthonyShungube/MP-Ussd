
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Login {
    Scanner scanner = new Scanner(System.in);
    UserAccount[] userList = new UserAccount[3];
    int selected;

     public Login(){
         userList[0] = new UserAccount("Anthony", 1000.50, "password");
         userList[1] = new UserAccount("b", 2000.00, "pass");
         userList[2] = new UserAccount("c", 30000.00, "password1");
     }

    public void options(UserAccount loggedUser) {
        while(selected != 5) {
            System.out.println("1. Check balance");
            System.out.println("2. Send Money");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Exit");
            selected = scanner.nextInt();

            if (selected == 1) {
                System.out.println("You have R" + loggedUser.getBalance() + " in your account!!");
            } else if (selected == 2) {
                System.out.print("To: ");
                String to = scanner.next();
                System.out.print("Please enter amount: ");
                int amount = scanner.nextInt();

                for (UserAccount acc : userList){
                    if(acc.getName().equals(to)){
                        loggedUser.setBalance(loggedUser.getBalance() - amount);
                        acc.setBalance(acc.getBalance() + amount);
                        break;
                    }
                }
            } else if (selected == 3) {
                System.out.print("How much do you want to deposit: ");
                double depositAmount = scanner.nextDouble();

//                loggedUser.set
            } else if (selected == 4) {
                System.out.print("How much do you want to withdraw: ");
                double withdrawalAmount = scanner.nextDouble();


            }
        }
    }

    public void login() {
        try {
            System.out.print("Enter Username: ");
            String userName = scanner.next();

            System.out.print("Enter Password: ");
            String password = scanner.next();

            for(int i = 0; i < userList.length; i++) {
                if (userList[i].getName().equals(userName) && userList[i].getPassword().equals(password)) {
                    System.out.println("WELCOME TO MP BANK");
                    options(userList[i]);
                    return;
                }
            }
            System.out.println("Invalid login credentials...");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
