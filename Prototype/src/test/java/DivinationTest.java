import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivinationTest{

    @Test
    public void testClone() throws CloneNotSupportedException{
        Divination divination = new Divination("Raven", "Negativ");
        MakeDivination md = new MakeDivination(divination);
        Divination divination1 =md.makeDivination();
        assertEquals(divination.getTarologist(),divination1.getTarologist());
        assertEquals(divination.getOracle(), divination1.getOracle());
    }
}
