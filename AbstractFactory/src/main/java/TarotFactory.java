public class TarotFactory implements MainFactory {
    private static TarotFactory instance;

    private TarotFactory(){}

    public static TarotFactory getInstance(){
        if(instance == null){
            instance = new TarotFactory();
        }
        return instance;
    }

    @Override
    public Style createStyle() {
        return new StyleOracle();
    }

    @Override
    public Type createType() {
        return new TypeOracle();
    }
}
