import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        User user = new User("Anthony", 1000, "password");
        Login l = new Login(new User("Anthony", 1000, "password"));
        l.login();
    }
}
