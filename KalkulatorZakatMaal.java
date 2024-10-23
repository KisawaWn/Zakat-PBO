import java.util.Scanner;

public class KalkulatorZakatMaal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            // Menampilkan pilihan jenis zakat
            System.out.println("Silahkan memilih jenis zakat yang ingin dihitung:");
            System.out.println("1. Zakat Maal (2.5% dari harta)");
            System.out.println("2. Zakat Fitrah (per orang)");
            System.out.print("Silahkan Input pilihan Anda (1 atau 2): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Menghitung Zakat Maal
                    System.out.print("Input jumlah harta yang dimiliki: ");
                    double harta = input.nextDouble();
                    double zakatMaal = harta * 2.5 / 100;
                    System.out.printf("Jumlah zakat maal yang harus dibayarkan: Rp %.2f%n", zakatMaal);
                    break;

                case 2:
                    // Menghitung Zakat Fitrah
                    System.out.print("Masukkan jumlah orang yang harus dibayarkan zakat fitrah: ");
                    int jumlahOrang = input.nextInt();
                    double zakatFitrah = jumlahOrang * 35000; // Asumsi zakat fitrah per orang Rp 35.000
                    System.out.printf("Jumlah zakat fitrah yang harus dibayarkan: Rp %.2f%n", zakatFitrah);
                    break;

                default:
                    // Jika pilihan tidak valid
                    System.out.println("Input tidak valid. Silakan pilih 1 atau 2.");
                    break;
            }

            // Tanya apakah ingin mengulang perhitungan
            System.out.print("Apakah Anda ingin menghitung zakat lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y'); // Mengulangi jika pengguna memilih 'y'

        System.out.println("Terima kasih sudah menghitung kalkulator zakat!");

        input.close();
    }
}