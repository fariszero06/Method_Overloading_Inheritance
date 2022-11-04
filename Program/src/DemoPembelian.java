import java.util.Scanner;

public class DemoPembelian {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama;
        int no_ktp;

        int option = 0;
        do {
            menu();
            option = input.nextInt();

            switch (option) {
                case 1:
                    // // ----------- OVERLOADING ------------
                    System.out.println("\n");
                    System.out.println("BIO (opsional) ->masukan 0 untuk skip");

                    System.out.println("nama : ");
                    nama = input.next();
                    String namaR = nama;
                    System.out.println("No KTP : ");
                    no_ktp = input.nextInt();
                    int no_ktpR = no_ktp;

                    if ((namaR != "0") && (no_ktpR != 0)) {
                        Pembelian ouser = new Pembelian (namaR, no_ktpR);
                        ouser.bio();
                    } else {
                        Pembelian ouser = new Pembelian();
                        ouser.bio();
                    }
                    break;
                // // ------------------------------------

                case 2:
                    // ----------- INHERITANCE ------------
                    PembelianBin iuser = new PembelianBin();
                    iuser.setMobil();
                    System.out.println("\t");
                    iuser.setJenis();
                    System.out.println("\t");
                    iuser.setMerek();
                    iuser.collectingTrash();
                    iuser.ThrowOut();
                    break;
                // -----------------------------------------
                case 3:
                    System.out.println("Terimakasih telah memesan mobil...");
                    input.close();
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

        while (option != 3);

    }

    public static void menu() {
        System.out.println("\t");
        System.out.println("--------------------------");
        System.out.println("|||PROGRAM Pembelian Mobil|||");
        System.out.println("--------------------------");
        System.out.println("[1] Overloading");
        System.out.println("[2] Inheritance");
        System.out.println("[3] Stop");
        System.out.println("Masukkan pilihan : ");
    }

}