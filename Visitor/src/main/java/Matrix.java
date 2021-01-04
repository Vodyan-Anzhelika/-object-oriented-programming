public class Matrix implements HandyStruct {
    @Override
    public void accept(Visitors visitors) {
        visitors.visit(this);
    }
}
