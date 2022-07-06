import java.util.stream.Stream;

public class ProductManager extends Manager{

    //inheritance ortak methodları tekrar tekrar yazmamak için kullanılır. extends ile aktarılır.
    public void Add(Product product) {
        System.out.println("ürün eklendi: " + product.getName());
    }

}
