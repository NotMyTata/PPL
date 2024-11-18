public class Staff {
    String nama;
    boolean gender;
    String notelp;
    String email;
    String posisi;

    public Staff(String nama, boolean gender, 
    String notelp, String email, String posisi) {
        this.nama = nama;
        this.gender = gender;
        this.notelp = notelp;
        this.email = email;
        this.posisi = posisi;
    }

    public void displayInfo() {
        System.out.println("Staff Info:");
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
    }
}

