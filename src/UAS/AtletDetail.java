package UAS;

// Kelas turunan AtletDetail
public class AtletDetail extends Atlet {

    // Konstruktor
    public AtletDetail(String id, String nama) {
        super(id, nama);
    }

    // Metode untuk mendapatkan tahun lahir dari ID
    public Integer getTahunLahir() {
        return Integer.parseInt(getId().substring(2, 4)) + 2000;
    }

    // Metode untuk mendapatkan jenis cabang olahraga (cabor) dari ID
    public String getJenisCabor() {
        String kodeCabor = getId().substring(2, 4);
        switch (kodeCabor) {
            case "01":
                return "Cabor Bola Basket";
            case "02":
                return "Cabor Sepak Bola";
            case "03":
                return "Cabor Renang";
            case "04":
                return "Cabor Atletik";
            default:
                return "Cabor lain";
        }
    }

    // Metode untuk mendapatkan prestasi juara dari ID
    public String getPrestasiJuara() {
        String kodePrestasi = getId().substring(4, 6);
        switch (kodePrestasi) {
            case "01":
                return "Juara 1 Provinsi";
            case "02":
                return "Juara 2 Provinsi";
            case "03":
                return "Juara 3 Provinsi";
            default:
                return "Tidak ada juara";
        }
    }

    // Metode untuk mendapatkan nomor induk dari ID
    public int getNoInduk() {
        return Integer.parseInt(getId().substring(6));
    }

    // Overriding metode displayInfo untuk menambahkan informasi tambahan
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nTahun Lahir: " + getTahunLahir() +
                "\nJenis Cabor: " + getJenisCabor() +
                "\nPrestasi Juara: " + getPrestasiJuara() +
                "\nNo Induk: " + getNoInduk();
    }
}