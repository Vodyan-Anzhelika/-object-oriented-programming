import java.util.HashMap;
import java.util.Map;

public class Test {
    /*
   У нас есть список услуг. В любой момент мы можем сохранить его состояние,
   и продолжить добавлять/удалять услуги. В любой момент мы сможем вернуться к сохраненному
   состоянию и лист примет прежней вид.
    */
    @org.junit.jupiter.api.Test
    public void test() {
        Map<Integer, String> products = new HashMap<>();

        Order order = new Order(products);
        order.addProduct(150, "WitchBottle");
        order.addProduct(5000, "Cleaning");
        order.addProduct(550, "NegativCheck");
        order.printProducts();
        Snapshot snapshot = order.createSnapshot();
        System.out.println("---------------------");
        order.addProduct(100, "makeProtection");
        order.printProducts();
        System.out.println("---------------------");
        System.out.println("Cost before:= "+order.getCost());
        snapshot.restore();
        System.out.println("Cost after:= "+order.getCost());
        System.out.println("Order after restore");
        order.printProducts();




    }
}
