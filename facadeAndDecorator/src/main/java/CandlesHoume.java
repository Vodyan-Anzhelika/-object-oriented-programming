public class CandlesHoume {


    public void makeCandles(String nameOfCandles){
        switch (nameOfCandles) {
            case  ("Church Candles"):
                ChurchCandles churchCandles = new ChurchCandles();
                churchCandles.makeChurchCandles();
                break;
            case ("beeswax Candle"):
                BeeswaxCandle beeswaxCandle = new BeeswaxCandle();
                beeswaxCandle.makeBeeswaxCandle();
                break;
            case ("wax Candles"):
                WaxCandles waxCandles = new WaxCandles();
                waxCandles.makeWaxCandles();
                break;
            default:
                throw new IllegalArgumentException("Неизвестная свеча");
        }
    }


}
