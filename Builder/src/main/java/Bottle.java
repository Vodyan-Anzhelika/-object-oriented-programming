public enum Bottle {
    STRAIGHT,
    ROUND;
    @Override
    public String toString() {
        return name().toLowerCase();
    }
}