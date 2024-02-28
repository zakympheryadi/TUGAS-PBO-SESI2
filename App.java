/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSisi(5);
        square.hitungLuas(); // Hitung luas
        square.hitungKeliling(); // Hitung keliling
        
        double luas = square.getLuas();
        double keliling = square.getKeliling();
        
        System.out.println("Luas Persegi dengan sisi:"+ square.getLuas() + " "+"adalah" +" "+ luas);
        System.out.println("Keliling Persegi dengan sisi:"+ square.getKeliling() + " "+"adalah" +" "+ keliling);
        
    } 
}
