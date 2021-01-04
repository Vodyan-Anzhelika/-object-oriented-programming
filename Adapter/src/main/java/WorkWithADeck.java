public class WorkWithADeck  implements Tarot {
    private boolean status;
    private String positionInTheDeck;
    private Tarologist tarologist;

    public WorkWithADeck(Tarologist tarologist){
        this.tarologist=tarologist;
    }

    @Override
    public void chooseTarot() {
        status=true;
        System.out.println("Колода выбрана и взята");
    }

    @Override
    public void shuffleTarot() {
        status=true;
        System.out.println("Колода перемешана");
    }

    @Override
    public void takeTheCard(String positionInTheDeck) {
        if (status==false){
            this.positionInTheDeck=positionInTheDeck;
        }
        System.out.println("Карта из колоды выбрана");
    }

    @Override
    public void interpretCard() {
        status=true;
        System.out.println("Карта интрепретирована");
    }

    @Override
    public void returnTheCardToTheDeck() {
        status=true;
        System.out.println("Карта в колоде");
    }

    @Override
    public void putTarotInPlace(){
        status=false;
        System.out.println("Колода убрана");
    }


}