interface OrderStorage {
    void simpan(Order order);
}
class MemoryOrderStorage implements OrderStorage {
    public void simpan(Order order) {
        System.out.println("Pesanan " + order.namaPelanggan + " disimpan");
    }
}