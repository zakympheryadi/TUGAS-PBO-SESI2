// Kelas Buku
class Buku {
    // Atribut
    private String penulis;
    private String judul;
    private int harga;
    private int nomorPenerbit;

    // Konstruktor
    public Buku(String penulis, String judul, int harga, int nomorPenerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomorPenerbit = nomorPenerbit;
    }

    // Getter untuk mendapatkan harga buku
    public int getHarga() {
        return harga;
    }
}
