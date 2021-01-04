public class RegularComponents extends Components {
    //Добавка двойной порции чего-то в кофе
    public RegularComponents(String components, int price, Candles candle) {
        super(components, price, candle);
    }

    @Override
    public int getPrice() {
        return this.price + candle.getPrice();
    }

    @Override
    public String getName() {
        return candle.getName() + " with " + this.components;
    }
}

