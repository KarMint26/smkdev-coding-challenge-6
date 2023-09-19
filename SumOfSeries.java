package sumof_series_upto_n_terms;

import java.util.Scanner; // Mengimport Scanner agar user bisa melakukan aksi input

/**
 *
 * @author karel trisnanto utomo
 */
public class SumOfSeries { // deklarasi Main Class nya sesuai nama file (SumOfSeries.java)
    public static Scanner in = new Scanner(System.in); // deklarasi variable untuk scanner
    
    public static int Solve(int N){ // Membuat method atau function Solve sebagai logic untuk menghasilkan output yang diharapkan
        int ans = 0; // Inisialisasi variable ans sebagai return value atau mengembalikan hasil dari perhitungan logic algortima
        
        while(N > 0){ // Melakukan perulangan dengan while untuk mengiterasi sampai sebanyak jumlah value dari N
            String numToStr = ""; // Inisialisasi variable numToStr sebagai string untuk menambahkan angka 2 sesuai jumlah N misal ("2222")
            int count = N; // Inisialisasi variable count untuk menampung value dari N
            
            while(count > 0) { // Melakukan perulangan while kembali di dalam while atau disebut nested loop
                numToStr += "2"; // Variable numToStr akan ditambahkan character '2' untuk dibuat sebagai string sesuai dengan loop jumlah value dari N misal ("22222")
                count--; // Setelah melakukan penambahan character 2 maka count akan dikurangkan dengan 1 sampai dengan kondisi iterasi while false
            }
            
            ans += Integer.parseInt(numToStr); // Menambahkan value dari numToStr yang sudah dilakukan iterasi untuk menambahkan karakter '2', namun diubah ke integer terlebih dahulu
            
            N--; // pada N-- artinya iterasi pada while yang pertama akan dilakukan pengurangan value N sampai kondisi while menjadi false
        }
        
        
        return ans; // pada akhir logika algoritma yang dilakukan akan mengembalikan value dari variable ans yang sudah dihitung pada blok while
    }
    
    public static void main(String[] args) { // ini adalah main method yang berisi sekumpulan argumen yang akan ditampilkan pada console
        System.out.print("Input N Number : "); // Menampilkan tulisan "Input N Number : " di console
        int N = in.nextInt(); // Menginisialisasi variable N dan menambahkan value didalamnya berdasarkan inputan user melalui variable in dari Scanner yang telah di deklarasi
        
        int result = Solve(N); // Menginisialisasi variable result yang menampung return value dari Method atau Function Solve dengan parameter N bertipe integer
        
        System.out.println("Result is : " + result); // Menampilkan hasil perhitungan dari method dan function Solve yang ditampung pada variable result dan menampilkannya di console
    }
}
