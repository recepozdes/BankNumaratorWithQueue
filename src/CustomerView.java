import java.util.Scanner;

public class CustomerView {
    Scanner scanner = new Scanner(System.in);

    public Customer takeCustomerInput(String name,int age) {

        return new Customer(name, age);
    }

    public int getMenuChoice() {
        System.out.println("\n1 - Sıra almak için basınız");
        System.out.println("2 - Gişe işlemlerini başlatınız");
        System.out.println("3 - Çıkış");
        System.out.print("Seçenek: ");
        return scanner.nextInt();
    }
}