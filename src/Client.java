public class Client {
    private String name;
    private String password;
    private int id;
    private Account account;

    public Client (String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.account = new Account(2, 0.0);
    }


    // Getters
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public Account getAccount() { return this.account; }

    //Stters
    public void setName (String name){
        this.name = name;
    }

    public void setPassword (String password){
        this.password = password;
    }

    public void setAccount (Account account) { this.account = account; }
}
