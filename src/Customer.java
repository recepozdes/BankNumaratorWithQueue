public class Customer {
    String name;
    int age;
    Ticket ticket;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.ticket=new Ticket(age);
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (getAge()>=65){
            return "Sıra Numaranız: " + ticket.getTicketNumber65()+" , İsim : " + getName() + " , Yaş : " + getAge();
        }else{
            return "Sıra Numaranız: " + ticket.getTicketNumber()+" , İsim : " + getName() + " , Yaş : " + getAge();
        }

    }
}