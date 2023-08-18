import java.util.Scanner;

public class BankSimulation {
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        Counter counter = new Counter();
        Scanner scanner=new Scanner(System.in);

        int choice = 0;
        while (choice != 3) {
            choice = customerView.getMenuChoice();
            switch (choice) {
                case 1:
                    System.out.print("Müşteri adı: ");
                    String name = scanner.nextLine();
                    System.out.print("Müşteri yaş: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Customer customer = customerView.takeCustomerInput(name,age);
                    counter.addCustomerToQueue(customer);
                    break;
                case 2:
                    counter.serveCustomers();
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçenek!");
            }
            counter.getCustomerQueue().displayQueueContents();
        }
    }
}