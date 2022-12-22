public class UserAccount {
    private  double balance;
    private  String name;
    private  String password;

    public UserAccount(String _name, double _balance, String _password) {
        name = _name;
        balance = _balance;
        password = _password;
    }

    public  String getName()
    {
        return name;
    }
    public String getPassword()
    {
        return password;
    }
    public Double getBalance()
    {
        return balance;
    }
    public void setName(String N) { name = N; }
    public void setPassword(String N) { password = N; }
    public void setBalance(Double N) { balance = N; }
}
