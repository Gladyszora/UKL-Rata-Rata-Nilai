import java.util.Scanner;
public class UKLNilaiRataRata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa (N): ");
        
        if (!input.hasNextInt()) {
            System.out.println("Input tidak valid. Harap masukkan angka bulat positif.");
            input.close();
            return;
        }
        int jumlahSiswa = input.nextInt();

        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih besar dari nol.");
            input.close();
            return;
        }
        
        double[] nilaiUjian = new double[jumlahSiswa];
        double totalNilai = 0;
       
        System.out.println("\n--- Masukkan Nilai Ujian Siswa ---");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.printf("Nilai siswa ke-%d: ", (i + 1));
            
            if (!input.hasNextDouble()) {
                 System.out.println("Nilai tidak valid. Harap masukkan angka.");
                 input.next(); 
                 i--; 
                 continue;
            }
            
            double nilai = input.nextDouble();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai harus antara 0 dan 100.");
                i--; 
                continue;
            }
            
            nilaiUjian[i] = nilai;
            totalNilai += nilai; 
        input.close();
       
        double rataRata = totalNilai / jumlahSiswa;
        
        System.out.println("\n==================================");
        System.out.println("        HASIL PERHITUNGAN");
        System.out.println("==================================");
        System.out.println("Jumlah Siswa              : " + jumlahSiswa);
        System.out.printf("Total Keseluruhan Nilai   : %.2f\n", totalNilai);
        System.out.printf("**Nilai Rata-Rata Kelas** : **%.2f**\n", rataRata);
        System.out.println("==================================");
    }
}
}