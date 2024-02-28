public class Item02 {
    public static String name;
    public static double price;
    public static int stock;

    public Item02(){

    }

    public Item02 (String itemName, double itemPrice, int itemStock){
        name = itemName;
        price = itemPrice;
        stock = itemStock;
    }

    public static void displayInfo(){
        System.out.println("Nama  :" + name);
        System.out.println("Harga :Rp." + price);
        System.out.println("Stok  :" + stock);        
    }
}
