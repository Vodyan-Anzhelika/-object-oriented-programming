public class BeeswaxCandle implements Candles {
    private int waxSheets;
    private int wickSM;
    private int price;
    private int paraffinWax;

    public BeeswaxCandle(){
        this.price=250;
        waxSheets=3;
        wickSM=10;
    }

    public void makeBeeswaxCandle(){

        System.out.println("Ваша свеча из вощины");
    }



    public int getWaxSheets() {
        return waxSheets;
    }

    public int getWickSM() {
        return wickSM;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Beeswax Candle";
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getParaffinWax() {
        return paraffinWax;
    }

    public void setParaffinWax(int paraffinWax) {
        this.paraffinWax = paraffinWax;
    }
}