public class Main {
    public static void main(String[] args) {

        // constructor kullanıldığında
        //Product product =new Product(1,"Laptop", "Asus Laptop",5000,2);

        //Bu şekilde de kullanılır. bunun için parametresiz constructor kullanılır.
        Product product =new Product();

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