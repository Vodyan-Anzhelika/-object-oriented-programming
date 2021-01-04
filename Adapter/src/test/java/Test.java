public class Test {



    /*
        В данной программе есть две стороны - расклад и таролог.
        Допустим таролог не может изнеоткуда получить знания или вопросы по раскладу напрямую и использует
        таро которое является средством взаимодействия с информацией.
     */
    @org.junit.jupiter.api.Test
    public void makeDivinationOnTarot() {
        Tarot tarot = new WorkWithADeck(new Tarologist());
        tarot.chooseTarot();
        tarot.shuffleTarot();
        tarot.takeTheCard("BottomOfTheDeck");
        tarot.interpretCard();
        tarot.returnTheCardToTheDeck();
        tarot.putTarotInPlace();

    }
}