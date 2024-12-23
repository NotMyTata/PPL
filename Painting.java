public class Painting extends Artwork {
    public String medium;

    public Painting(String title, Artist artist, int tahun, double harga, String medium) {
        super(title, artist, tahun, harga); 
        this.medium = medium;
    }

    public void displayInfo() {
        System.out.println("Painting details:");
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist.nama);
        System.out.println("Year: " + tahun);
        System.out.println("Medium: " + medium);
        System.out.println("Price: " + harga);
    }

    public void concealArtwork() {
        System.out.println("Painting is now concealed.");
    }

    public void revealArtwork() {
        System.out.println("Painting is now revealed.");
    }
}
