import java.util.Scanner;

// OVERLOADING
class Pembelian {
    public String nama;
    public int no_ktp;

    private String mobil;
    private String jenis;
    private String merek;
    private Scanner input;

    // ------- CONSTRUCTOR -------

    public Pembelian() {
        input = new Scanner(System.in);
        System.out.println("Memilih constructor kosong");
    }

    public Pembelian(String nama, int no_ktp) {
        input = new Scanner(System.in);
        this.nama = nama;
        this.no_ktp = no_ktp;
    }
    // -------- METHOD -----------

    public void setMobil() {
        System.out.println("Nama mobil yang ingin dibeli : ");
        this.mobil = input.next();
    }

    public void setJenis() {
        System.out.println("Jenis mobil : ");
        this.jenis = input.next();

    }

    public void setMerek() {
        System.out.println("Merek Mobil :\n[1] TOYOTA\n[2] HYUNDAI\n[3] DAIHATSU\n[4] HONDA\n[5] B5 ");
        System.out.println("=> pilih nomor");
        int choose = input.nextInt();

        if (choose == 1) {
            this.merek= "TOYOTA";

        } else if (choose == 2) {
            this.merek = "HYUNDAI";

        } else if (choose == 3) {
            this.merek = "DAIHATSU";

        } else if (choose == 4) {
            this.merek = "HONDA";

        } else if (choose == 5) {
            this.merek = "B5"; 
        
        } else {
            this.merek = " => Belum ada data";
        }

    }

    public String getMobil() {
        return this.mobil;
    }

    public String  getJenis() {
        return this.jenis;
    }

    public String getMerek() {
        return this.merek;
    }

    public void collectingTrash() {
        System.out.println("Mulai memilih merek mobil:  " + this.merek);
        System.out.println("-------------------------------");
    }

    public void bio() {
        System.out.println("Hallo " + this.nama + " dengan no_ktp " + this.no_ktp);
    }

}

// INHERITANCE
class PembelianBin extends Pembelian {

    private String warna;

    public void ThrowOut() {

        switch (getMerek()) {
            case "Toyota":
                this.warna = "merah";
                break;
            case "HYUNDAI":
                this.warna = "hitam";
                break;
            case "DAIHATSU":
                this.warna = "silver";
                break;
            
            case "HONDA":
                this.warna = "biru";
                break;    

            case "B4":
                this.warna = "lainnnya";
                break;
        }

        System.out.println(
                "Warna mobil yang dibeli " + warna + " > Memilih " + getMobil() + "Jenis: " + getJenis()
                        + " > pembelian berhasil.");
        System.out.println("\t");
    }
}