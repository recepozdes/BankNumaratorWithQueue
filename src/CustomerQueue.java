import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class CustomerQueue {
    Customer custemer;
    private PriorityQueue<Customer> queue = new PriorityQueue<>((c1, c2) -> {
        if (c1.age >= 65 && c2.age >= 65) {
            return Integer.compare(c1.getTicket().getTicketNumber65(), c2.getTicket().getTicketNumber65());
        } else if (c1.age >= 65) {
            return -1;
        } else if (c2.age >= 65) {
            return 1;
        } else {
            return Integer.compare(c1.getTicket().getTicketNumber(), c2.getTicket().getTicketNumber());
        }
    });


    public void addCustomer(Customer customer) {
        queue.offer(customer);
    }

    public Customer getNextCustomer() {
        return queue.poll();
    }

    public int getQueueSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueueContents() {
        System.out.println("Kuyruk elemanları:");
        List<Customer> sortedCustomers = new ArrayList<>(queue);
        sortedCustomers.sort((c1, c2) -> {
            if (c1.getAge() >= 65 && c2.getAge() >= 65) {
                int result = Integer.compare(c1.ticket.getTicketNumber65(), c2.ticket.getTicketNumber65());
                return result != 0 ? result : Integer.compare(System.identityHashCode(c1), System.identityHashCode(c2));
            } else if (c1.getAge() >= 65) {
                return -1; // c1 has higher priority if 65 or older
            } else if (c2.getAge() >= 65) {
                return 1; // c2 has lower priority if 65 or older
            } else {
                int result = Integer.compare(c1.ticket.getTicketNumber(), c2.ticket.getTicketNumber());
                return result != 0 ? result : Integer.compare(System.identityHashCode(c1), System.identityHashCode(c2));
            }
        });

        for (Customer customer : sortedCustomers) {
            if (customer.getAge() >= 65) {
                System.out.println("Sıra Numaranız: " + customer.ticket.getTicketNumber65() + " , İsim : " + customer.getName() + " , Yaş : " + customer.getAge());
            } else {
                System.out.println("Sıra Numaranız: " + customer.ticket.getTicketNumber() + " , İsim : " + customer.getName() + " , Yaş : " + customer.getAge());
            }
        }
    }

}