
public class Shirt {

    public int shirtID = 120370;
    public String description = "Very beautiful";
    // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
    public char colorCode = 'U';
    public double price = 10.20;
    public int quantityInStock = 0;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
