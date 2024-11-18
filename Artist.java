public class Artist {
    public String nama;
    public boolean gender;
    public String notelp;

    public Artist(String nama, 
    boolean gender, String notelp) {
        this.nama = nama;
        this.gender = gender;
        this.notelp = notelp;
    }

    public void Info() {
        System.out.println("Artist details: " + nama);
        System.out.println("gender: " + gender);
        System.out.println("Phone number: " + notelp);
    }

}
