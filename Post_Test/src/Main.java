public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Rafly", 250000);
        OrderStorage storage = new MemoryOrderStorage();
        PaymentMethod payment = new GiftVoucherPayment();
        EmailSender email = new EmailSystem();
        OrderService service = new OrderService(storage, payment, email);
        service.prosesOrder(order1, "reinsv@gmail.com");

        System.out.println();
        Order order2 = new Order("Kenzo", 500000);
        PaymentMethod payment2 = new CreditCardPayment();
        OrderService service2 = new OrderService(storage, payment2, email);
        service2.prosesOrder(order2, "Bekal_Kenzo@gmail.com");

        System.out.println();
        Order order3 = new Order("Wawan", 150000);
        PaymentMethod payment3 = new OvoPayment();
        OrderService service3 = new OrderService(storage, payment3, email);
        service3.prosesOrder(order3, "Mak_Wawan@gmail.com");
    }
}