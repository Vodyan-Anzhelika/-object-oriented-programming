
import org.junit.jupiter.api.Test;

public class CandlesHoumeTest {


    //Если, что покупатель заказывает свечу в аккаунте через сайт.
    //Ему не нужно выбирать составляющие свечи
    //Ему только требуется выбрать название, и заказ на ее приготовление будет оформлен.

    @Test
    public void facadPattern() {
        CandlesHoume candlesHoume = new CandlesHoume();
        candlesHoume.makeCandles("Church Candles");
        candlesHoume.makeCandles("beeswax Candle");
        candlesHoume.makeCandles("wax Candles");

        try {
            candlesHoume.makeCandles("GelCandleWax");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }


    //Этот метод будет использоваться когда будем отправлять заказ на приготовление через директ.
    //Человек расскажет какую свечу он хочет, и что нужно добавить
    //Мы будем знать, какую именно свечу ему изготовить, и что туда добавить.
    @Test
    public void DecoratorPattern() {
        Candles candle = new ChurchCandles();

        candle = new RegularComponents("sagebrush", 10, candle);
        System.out.println(candle.getName()+" cost:"+candle.getPrice());
        //При попытке добавить бесплатную добавку за деньги, цена меняться не будет
        candle = new NoCostComponents("essential oil lavender", 2, candle);
        System.out.println(candle.getName()+" cost:"+candle.getPrice());

    }
}
