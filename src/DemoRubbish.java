import java.util.Scanner;

public class DemoRubbish {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama;
        int nim;

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
                    System.out.println("NIM : ");
                    nim = input.nextInt();
                    int nimR = nim;

                    if ((namaR != "0") && (nimR != 0)) {
                        Rubbish ouser = new Rubbish(namaR, nimR);
                        ouser.bio();
                    } else {
                        Rubbish ouser = new Rubbish();
                        ouser.bio();
                    }
                    break;
                // // ------------------------------------

                case 2:
                    // ----------- INHERITANCE ------------
                    RubbishBin iuser = new RubbishBin();
                    iuser.setSampah();
                    System.out.println("\t");
                    iuser.setBentuk();
                    System.out.println("\t");
                    iuser.setJenis();
                    iuser.collectingTrash();
                    iuser.ThrowOut();
                    break;
                // -----------------------------------------
                case 3:
                    System.out.println("Terimakasih telah membuang sampah");
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
        System.out.println("|||PROGRAM PILAH SAMPAH|||");
        System.out.println("--------------------------");
        System.out.println("[1] Overloading");
        System.out.println("[2] Inheritance");
        System.out.println("[3] Stop");
        System.out.println("Masukkan pilihan : ");
    }

}