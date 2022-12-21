public class User {
    private double balance;
    private static String name;
    private static String password;

    public User(String _name, double _balance, String _password) {
        name = _name;
        balance = _balance;
        password = _password;
    }

    public User()
    {

    }

    public  String getName()
    {
        return name;
    }

    // Method 2 - Setter
    public  void setName(String N)
    {
        // This keyword refers to current instance itself
        name = N;
    }

    public  String getPassword()
    {
        return password;
    }

    // Method 2 - Setter
    public void setPassword(String N)
    {
        // This keyword refers to current instance itself
        password = N;
    }



    public  double checkBalance() {
        return balance;
    }

    public double withdraw(double amount) {
        return balance =  balance - amount;
    }


    public  double deposit(double amount) {


        return balance = balance + amount;


        }



    }
