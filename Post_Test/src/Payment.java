interface PaymentMethod {
    void pay(double amount);
}
interface RefundablePayment {
    void refund(double amount);
}

class CreditCardPayment implements PaymentMethod, RefundablePayment {
    public void pay(double amount) {
        System.out.println("Pembayaran Rp" + amount + " lewat Credit Card");
    }
    public void refund(double amount) {
        System.out.println("Refund Rp" + amount + " ke Credit Card");
    }
}

class OvoPayment implements PaymentMethod, RefundablePayment {
    public void pay(double amount) {
        System.out.println("Pembayaran Rp" + amount + " lewat OVO");
    }
    public void refund(double amount) {
        System.out.println("Refund Rp" + amount + " ke OVO");
    }
}

class BankTransferPayment implements PaymentMethod, RefundablePayment {
    public void pay(double amount) {
        System.out.println("Pembayaran Rp" + amount + " lewat Transfer Bank");
    }
    public void refund(double amount) {
        System.out.println("Refund Rp" + amount + " ke Transfer Bank");
    }
}

class GiftVoucherPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Pembayaran Rp" + amount + " lewat Gift Voucher");
    }
}