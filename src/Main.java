public class Main {

    public static void main(String[] args) {

        Client client  = new Client("Felipe Martins Domareski", "lipelindo", 1);


        Menu menu = new Menu(client);
        menu.start();
//        System.out.println("Your name: " + felipe.getName());
//
//        System.out.println("Your password: " + felipe.getPassword());
//
//        System.out.println("Your Balance: " + felipe.getAccount().getBalance());
//
//        System.out.println("Your ID Account: " + felipe.getAccount().getId());


    }

}