public class NoCostComponents extends Components {
    public NoCostComponents(String components, int price, Candles candle) {
        super(components, price, candle);
    }

    @Override
    public int getPrice() {
        return candle.getPrice();
    }

    @Override
    public String getName() {
        return candle.getName() + " with " + this.components;
    }


}

