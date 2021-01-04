public class ChurchCandles implements Candles {
    private int paraffinWax;
    private int waxSheets;
    private int wickSM;
    private int price;




    public ChurchCandles() {
        BeeswaxCandle beeswaxCandle = new BeeswaxCandle();
        paraffinWax=beeswaxCandle.getParaffinWax();
        wickSM=beeswaxCandle.getWickSM()/2;
        waxSheets=beeswaxCandle.getWaxSheets()/(3/2);
        boilWax();

        this.price = 100;
    }
    void boilWax(){

    }

    public void makeChurchCandles(){
        System.out.println("Ваша церковная свеча");
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Church Candles";
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
