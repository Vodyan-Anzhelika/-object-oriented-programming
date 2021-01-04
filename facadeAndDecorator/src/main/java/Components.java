public abstract class Components implements Candles {
    protected Candles candle;
    protected String components;
    protected int price;

    public Components(String components, int price, Candles candle){
        this.candle=candle;
        this.components=components;
        this.price=price;
    }

    public abstract int getPrice();

    public String getLabel() {
        return candle.getName() + " with " + this.components;
    }
}

