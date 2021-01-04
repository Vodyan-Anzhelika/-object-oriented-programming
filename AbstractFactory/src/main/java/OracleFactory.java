public class OracleFactory implements MainFactory {
    private static OracleFactory instance;

    private OracleFactory(){}

    public static OracleFactory getInstance(){
        if(instance == null){
            instance = new OracleFactory();
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
