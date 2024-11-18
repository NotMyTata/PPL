import java.util.List;

public abstract class Artwork {
    public String title;
    public Artist artist;
    public double harga;
    public int tahun;
    public List<Transaction> riwayatTransaksi;

    public Artwork(String title, Artist artist, 
    double harga, int tahun) {
        this.title = title;
        this.artist = artist;
        this.harga = harga;
        this.tahun = tahun;
    }

    public abstract void displayInfo();
}

