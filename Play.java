// Kelas Utama
public class Play {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku1 = new Buku("John Doe", "Java Programming", 50000, 123);
        Buku buku2 = new Buku("Jane Smith", "Python Basics", 40000, 456);
        Buku buku3 = new Buku("David Brown", "C++ Fundamentals", 60000, 789);

        // Menghitung total harga buku yang dibeli
        int totalHarga = buku1.getHarga() + buku2.getHarga() + buku3.getHarga();

        // Menampilkan total harga
        System.out.println("Total harga semua buku yang dibeli: Rp." + totalHarga);
    }
}
