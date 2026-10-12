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

        System.out.print("Jumlah dokumen  : ");
        int dokumen = sc.nextInt();
        int kurang = 4 - dokumen;

        if (lomba) { 
            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3){
                if (dokumen >= 4 ) {
                    System.out.println("Status : berhak memperoleh dana penghargaan (Juara " + peringkat + ", dokumen lengkap.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + "dokumen). Dana penghargaan tidak diberikan .");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaaan).");                
            }
        } else {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan.");
        }
    }
    
}
