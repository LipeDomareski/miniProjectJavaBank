import java.util.Random;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    private Client client;

    public Menu(Client client) {
        this.client = client;
    }

    public void start() {

        boolean running = true;

        while(running) {

            System.out.println("==========| MENU |==========");
            System.out.println("1. Account information");
            System.out.println("2. Check your balance");
            System.out.println("3. deposit cash");
            System.out.println("4. withdraw cash");
            System.out.println("5. exit");

            int option = scanner.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("your ID Client: " + client.getId());
                    System.out.println("your ID Account: " + client.getAccount().getId());
                    System.out.println("Your Username: " + client.getName());
                    System.out.println("Your balance: " + client.getAccount().getBalance());
                    System.out.println("Your Password: " + client.getPassword());
                    break;

                case 2:
                    System.out.println("Your balance: " + client.getAccount().getBalance());
                    break;

                case 3:
                    System.out.println("type of value if you want deposit in account: ");
                    double value = scanner.nextDouble();
                    client.getAccount().deposit(value);
                    break;

                case 4:
                    System.out.println("type of value if you want withdraw in account: ");
                    double withdraw = scanner.nextDouble();
                    client.getAccount().withdraw(withdraw);
                    break;

                case 5:
                    System.out.println("you exit");
                    running = false;
                    break;
            }

        }



    }
}
