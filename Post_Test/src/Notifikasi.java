interface EmailSender {
    void sendEmail(String tujuan, String pesan);
}
interface SmsSender {
    void sendSMS(String nomor, String pesan);
}
interface WhatsAppSender {
    void sendWhatsApp(String nomor, String pesan);
}
class EmailSystem implements EmailSender {
    public void sendEmail(String tujuan, String pesan) {
        System.out.println("Email dikirim ke " + tujuan);
        System.out.println("Pesan: " + pesan);
    }
}