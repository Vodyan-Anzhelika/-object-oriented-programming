public class Mastercard extends Account {
        public Mastercard(int balance){
            this.balance=balance;
        }

        @Override
        public String getName() {
            return "Mastercard";
        }
    }

