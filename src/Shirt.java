
public class Shirt {

    public int shirtID = 120370;
    public String description = "Very beautiful";
    
    public String colorCode = "Red";
    public double price = 10.20;
    public int quantityInStock = 10;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
