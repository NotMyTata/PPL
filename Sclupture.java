public class Sclupture extends Artwork{
    public String material;

    public Sclupture(String title, Artist artist, int tahun, double harga, String material) {
        super(title, artist, tahun, harga); 
        this.material = material;
    }

    public void displayInfo() {
        System.out.println("Painting details:");
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist.nama);
        System.out.println("Year: " + tahun);
        System.out.println("Material: " + material);
        System.out.println("Price: " + harga);
    }

    public void concealArtwork() {
        System.out.println("Painting is now concealed.");
    }

    public void revealArtwork() {
        System.out.println("Painting is now revealed.");
    }
}
