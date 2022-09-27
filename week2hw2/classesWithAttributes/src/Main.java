public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus laptop",3000,2,"Siyah");

        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}