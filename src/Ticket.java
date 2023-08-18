public class Ticket {

    private static int nextTicketNumber = 1;
    private static int nextTicketNumber65 = 500;

    private int ticketNumber;
    private int ticketNumber65;

    public Ticket(int age) {
        if (age >= 65) {
            this.ticketNumber65 = nextTicketNumber65++;
            this.ticketNumber = this.ticketNumber65;
        } else {
            this.ticketNumber = nextTicketNumber++;
            this.ticketNumber65 = 0;
        }
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getTicketNumber65() {
        return ticketNumber65;
    }
}
