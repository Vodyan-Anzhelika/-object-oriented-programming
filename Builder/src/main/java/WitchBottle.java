

import java.util.ArrayList;
import java.util.List;

public final class WitchBottle {
    private final String name;
    private final Size size;
    private final Bottle bottle;
    private final String essentialOil;
    private final List<String> ingridients;



    public WitchBottle(WitchBottleBuilder witchBottleBuilder) {
        this.name = witchBottleBuilder.name;
        this.size = witchBottleBuilder.size;
        this.bottle = witchBottleBuilder.bottle;
        this.essentialOil = witchBottleBuilder.essentialOil;
        this.ingridients = witchBottleBuilder.ingridients;
    }


    public static class WitchBottleBuilder {
        private final String name;
        private Size size;
        private Bottle bottle;
        private List<String> ingridients;
        private String essentialOil;


        public WitchBottleBuilder(String name) {
            this.name = name;
        }

        public WitchBottleBuilder setSize(Size size) {
            this.size = size;
            return this;
        }

        public WitchBottleBuilder setBottle(Bottle bottle) {
            this.bottle = bottle;
            return this;
        }

        public WitchBottleBuilder addEssentialOil(String essentialOil) {
            this.essentialOil = essentialOil;
            return this;
        }

        public WitchBottleBuilder withIngridients(String ... ingridients) {
            this.ingridients=new ArrayList<>();
            for(String name: ingridients){
                this.ingridients.add(name);
            }
            return this;
        }

        public WitchBottle assembly(){
            System.out.println(name+"\n \n" + "volume: ["+size.toString()+"], bottle: ["+bottle.toString()+"], with ["+essentialOil+" essential Oil]"+", with "+ingridients.toString());
            System.out.println("________________");
            return new WitchBottle(this);
        }
    }


}