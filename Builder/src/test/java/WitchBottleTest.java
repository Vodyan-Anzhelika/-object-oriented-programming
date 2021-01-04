import org.junit.jupiter.api.Test;

public class WitchBottleTest {
    @Test
public void test(){
    WitchBottle witchBottle1 = new WitchBottle.WitchBottleBuilder("purification and harmony")
            .addEssentialOil("\n" + "bergamot")
            .setBottle(Bottle.ROUND)
            .setSize(Size.ML30)
            .withIngridients("sage " + "thistle " + "lavender")
            .assembly();

    WitchBottle witchBottle2 = new WitchBottle.WitchBottleBuilder("Love")
            .addEssentialOil("lavender" +
                    "the Rose")
            .setBottle(Bottle.STRAIGHT)
            .setSize(Size.ML50)
            .withIngridients("rosePetals " + "roseQuartz " + "moonRock " + "fluorite " + "jasmineFlowers ")
            .assembly();


}

}
