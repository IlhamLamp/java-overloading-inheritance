import java.util.Scanner;

// OVERLOADING
class Rubbish {
    public String nama;
    public int nim;

    private String sampah;
    private String bentuk;
    private String jenis;
    private Scanner input;

    // ------- CONSTRUCTOR -------

    public Rubbish() {
        input = new Scanner(System.in);
        System.out.println("Memilih constructor kosong");
    }

    public Rubbish(String nama, int nim) {
        input = new Scanner(System.in);
        this.nama = nama;
        this.nim = nim;
    }
    // -------- METHOD -----------

    public void setSampah() {
        System.out.println("sampah yang dibuang : ");
        this.sampah = input.next();
    }

    public void setBentuk() {
        System.out.println("bentuk : ");
        this.bentuk = input.next();
    }

    public void setJenis() {
        System.out.println("jenis :\n[1] organik\n[2] anorganik\n[3] B3 ");
        System.out.println("=> pilih nomor");
        int choose = input.nextInt();

        if (choose == 1) {
            this.jenis = "organik";

        } else if (choose == 2) {
            this.jenis = "anorganik";

        } else if (choose == 3) {
            this.jenis = "B3";

        } else {
            this.jenis = " => Belum ada data";
        }

    }

    public String getSampah() {
        return this.sampah;
    }

    public String getBentuk() {
        return this.bentuk;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void collectingTrash() {
        System.out.println("mulai mengumpulkan sampah jenis " + this.jenis);
        System.out.println("-------------------------------");
    }

    public void bio() {
        System.out.println("Hallo " + this.nama + " dengan nim " + this.nim);
    }

}

// INHERITANCE
class RubbishBin extends Rubbish {

    private String color;

    public void ThrowOut() {

        switch (getJenis()) {
            case "organik":
                this.color = "hijau";
                break;
            case "anorganik":
                this.color = "kuning";
                break;
            case "B3":
                this.color = "merah";
                break;
        }

        System.out.println(
                "Membuka tempat sampah warna " + color + " > Membuang " + getSampah() + " Berbentuk " + getBentuk()
                        + " > Menutup Kembali.");
        System.out.println("\t");
    }
}