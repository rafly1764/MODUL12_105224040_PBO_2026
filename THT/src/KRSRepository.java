public class KRSRepository {
    private DatabaseConnection databaseConnection;
    public KRSRepository(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    public void simpanRiwayat(KRS krs) {
        System.out.println("Menyimpan riwayat KRS mahasiswa " + krs.getMahasiswa().getNama());
        databaseConnection.simpanDataKRS();
    }
}