public enum Size{
    ML30,
    ML100,
    ML150,
    ML50;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}