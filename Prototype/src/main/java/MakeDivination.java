public class MakeDivination {

    private Divination divination;

    public MakeDivination(Divination divination) {
        this.divination =divination;
    }

    public Divination makeDivination() throws CloneNotSupportedException {
        return (Divination) this.divination.clone();
    }
}