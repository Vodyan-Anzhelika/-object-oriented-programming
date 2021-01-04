import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class templateMethodAndStrategyTest {


        @Test
        public void templateMethodAndStrategyTest() {
            BakeryProducts bakeryProducts1 = null;
            List<String> ingr1 = new ArrayList<>();
            ingr1.add("apple");
            ingr1.add("strawberry");
            bakeryProducts1 = new CharlottePie("Charlotte Pie", ingr1);
            bakeryProducts1.cook();
            System.out.println("---------------------------------");

            BakeryProducts bakeryProducts2 = null;
            List<String> ingr2 = new ArrayList<>();
            ingr2.add("mozzarella");
            ingr2.add("DorBlue");
            ingr2.add("MarbleCheese");
            bakeryProducts2 = new Khachapuri("Khachapuri", ingr2);
            bakeryProducts2.cook();
            System.out.println("---------------------------------");

            BakeryProducts bakeryProducts3 = null;
            List<String> ingr3 = new ArrayList<>();
            ingr3.add("Blueberry");
            bakeryProducts3=new Fritter("Fritter", ingr3);
            bakeryProducts3.cook();
            System.out.println("---------------------------------");

        }


    }