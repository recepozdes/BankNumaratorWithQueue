import java.util.Random;

public class Counter {
    private CustomerQueue customerQueue = new CustomerQueue();
    private Random random = new Random();

    public CustomerQueue getCustomerQueue() {
        return customerQueue;
    }

    public void setCustomerQueue(CustomerQueue customerQueue) {
        this.customerQueue = customerQueue;
    }

    public void addCustomerToQueue(Customer customer) {
        customerQueue.addCustomer(customer);
        System.out.println("Sıra aldınız ve kuyruğa eklendiniz.");
        System.out.println("Kuyruk boyutu: " + customerQueue.getQueueSize() + "\n");
    }

    public void serveCustomers() {
        while (!customerQueue.isEmpty()) {
            Customer customer = customerQueue.getNextCustomer();
            System.out.println("Şimdiki işlem: "+customer+" a hizmet veriliyor  ");
            System.out.println("Kuyrukta bekleyen müşteri sayısı: " + customerQueue.getQueueSize());

            int processingTime = random.nextInt(9) + 2; // 2-10 seconds
            System.out.println("Müşteri işlem süresi : " + processingTime + " saniyedir");
            try {
                Thread.sleep(processingTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("İşleminiz tamamlandı.");
            System.out.println("İşlem sonucu kuyrukta bekleyen kişi sayısı: " + customerQueue.getQueueSize() + "\n");
        }

        System.out.println("Tüm müşterilere hizmet verildi. İyi günler dileriz!");
    }
}