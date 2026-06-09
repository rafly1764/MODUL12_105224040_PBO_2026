public class OrderService {
    private OrderStorage storage;
    private PaymentMethod payment;
    private EmailSender emailSender;
    public OrderService(OrderStorage storage, PaymentMethod payment, EmailSender emailSender) {
        this.storage = storage;
        this.payment = payment;
        this.emailSender = emailSender;
    }
    public void prosesOrder(Order order, String emailPelanggan) {
        storage.simpan(order);
        payment.pay(order.totalHarga);
        emailSender.sendEmail(emailPelanggan, "Pesanan berhasil diproses. Total: Rp" + order.totalHarga);
    }
}