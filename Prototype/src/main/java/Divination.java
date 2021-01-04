public class Divination implements Cloneable {
    private String tarologist;
    private String oracle;

    public Divination(String author, String theme) {
        this.tarologist = tarologist;
        this.oracle = oracle;
    }

    public String getTarologist() {
        return tarologist;
    }


    public String getOracle() {
        return oracle;
    }

    @Override
    public Divination clone() throws CloneNotSupportedException {
        Divination copy = (Divination) super.clone();
        return copy;
    }
}