import org.junit.jupiter.api.Test;

public class ProductionTest {

    @Test
    public void ProdTest() throws Exception {
        Production production1 = Production.configProd("tarot");
        production1.create();
        System.out.println("------------------------------");
        Production production2 = Production.configProd("oracle");
        production2.create();
        System.out.println("------------------------------");
        try {
            Production production = Production.configProd("NightSun");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }




}