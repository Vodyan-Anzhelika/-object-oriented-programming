public final class Production {
    private Type type;
    private Style style;

    Production(MainFactory factory) {
        type = factory.createType();
        style = factory.createStyle();
    }



    public void create() {
        type.create();
        style.create();
    }


    public static Production configProd(String model) throws Exception {
        Production production;
        MainFactory factory;
        if(model.equalsIgnoreCase("oracle")){
            factory = OracleFactory.getInstance();
            production = new Production(factory);
        }else if(model.equalsIgnoreCase("tarot")){
            factory= TarotFactory.getInstance();
            production=new Production(factory);
        }else throw new Exception("Uncorrect ");
        return production;
    }
}
