package UAS;

// Kelas Atlet
public class Atlet {
    // Atribut dan enkapsulasi
    private String id;
    private String nama;

    // Konstruktor
    public Atlet(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Mutator (setter)
    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Accessor (getter)
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    // Metode untuk menampilkan informasi
    public String displayInfo() {
        return "id: " + getId() + "\n Nama: " + getNama();
    }

    // Polimorfisme (overloading) dengan parameter tambahan
    public String displayInfo(String jeka) {
        return displayInfo() + "\njeka: " + jeka;
    }
}
