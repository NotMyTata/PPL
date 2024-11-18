import java.util.ArrayList;
import java.util.List;

public class ArtGallery {
    List<Staff> listStaff;
    int jumlahKarya;
    List<Artwork> listKarya;

    public ArtGallery() {
        this.listStaff = new ArrayList<>();
        this.listKarya = new ArrayList<>();
        this.jumlahKarya = 0;
    }

    public void displayArtworks() {
        System.out.println("Artworks in Gallery:");
        for (Artwork art : listKarya) {
            art.displayInfo();
        }
    }

    public void addArtwork(Artwork artwork) {
        listKarya.add(artwork);
        jumlahKarya++;
        System.out.println("Added artwork: " + artwork.title);
    }

    public void showStaffs() {
        System.out.println("Gallery Staffs:");
        for (Staff staff : listStaff) {
            staff.displayInfo();
        }
    }

    public void addStaff(Staff staff) {
        listStaff.add(staff);
        System.out.println("Added staff: " + staff.nama);
    }
}
