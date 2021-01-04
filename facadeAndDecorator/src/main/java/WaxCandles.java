public class WaxCandles implements Candles {
        private int waxSheets;
        private int wickSM;
        private int price;

        public WaxCandles(){
            price=120;
            BeeswaxCandle beeswaxCandle = new BeeswaxCandle();
            this.waxSheets=beeswaxCandle.getWaxSheets();
            boilWax();
            this.wickSM=beeswaxCandle.getWickSM()/2;
        }

        void boilWax(){

        }

        public void makeWaxCandles(){

            System.out.println("Ваш восковая свеча");
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String getName() {
            return "Wax Candles";
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

