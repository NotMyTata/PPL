import java.sql.Date;

public class Transaction {
    public Artwork artwork;
    public Collector buyer;
    public int quantitty;
    public Date date;
    public PaymentMethod paymentMethod;

    public void setArtwork(Artwork artwork, Collector buyer, int quantitty) {
        this.artwork = artwork;
        this.buyer = buyer;
        this.quantitty = quantitty;
        this.date = new Date(System.currentTimeMillis());
    }

    public void displayTransaction() {
        System.out.println("Transaction details:");
        System.out.println("Artwork: " + artwork.title);
        System.out.println("Buyer: " + buyer.nama);
        System.out.println("Quantity: " + quantitty);
        System.out.println("Date: " + date);
    }

    public void payViaBank() {
        System.out.println("Processing payment via bank...");
    }

    public void payViaCash() {
        System.out.println("Processing payment via cash...");
    }

    public void payViaEWallet() {
        System.out.println("Processing payment via e-wallet...");
    }
}
