package ClassesWithAttr;

public class Main {
    public static void main(String[] args) {

        // Product product = new Product(id:1, name:"laptop", description:"asus laptop",
        // price:5000, stockAmount:2, renk:"siyah");

        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Lenovo Laptop");
        product.setPrice(3000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}
