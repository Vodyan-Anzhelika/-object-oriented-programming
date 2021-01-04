import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BridgeTest
    {

    /*
    Мы делаем заказ в зотерическом магазине.
    У нас есть абстрактный класс Order, который описывает заказ, и абстрактный класс наборов трав.
    И у нас есть реализация - это классы наборов трав по свойствам.
    Мост разделяет абстракцию и реализацию
     */

        @Test
        public void test() {
        List<Order> order = new ArrayList();
        order.add(new PurposeOfHerbs(new Calmness()));
        order.add(new PurposeOfHerbs(new ChakraCleansing()));
        order.add(new PurposeOfHerbs(new Cleansing()));
        order.add(new PurposeOfHerbs(new HarmonyAndHappiness()));
        for(Order elem: order){
            elem.make();
        }

    }
    }
