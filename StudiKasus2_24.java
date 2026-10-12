import java.util.Scanner;

public class StudiKasus2_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nama mahasiswa  : ");
        String nama = sc.nextLine().trim();
        System.out.print("Jenis kegiatan  (BELNAWA/BAKORMA/MANDIRI/PKM/LAINNYA : ");
        String jenis = sc.nextLine().trim();

        boolean lomba = jenis.equalsIgnoreCase("BELMAWA")
                || jenis.equalsIgnoreCase("BAKORMA")
                ||jenis.equalsIgnoreCase("Mandiri");
        boolean pkm = jenis.equalsIgnoreCase("PKM");
        boolean lainnya = jenis.equalsIgnoreCase("LAINNYA");

        if (!lomba && !pkm && !lainnya) {
            System.out.print("Status : Jenis kegiatan tidak dikenal.");
            return;
        }

    }
    
}
