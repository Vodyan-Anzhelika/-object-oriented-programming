import java.util.List;

public class Fritter extends BakeryProducts {


    public Fritter(String name, List<String> ingredients) {
        super(name, ingredients);
        this.cookingStrategy = new FryInAFryingPan();
    }

    @Override
    public void filling() {
        StringBuilder nameAllIngridients = new StringBuilder();
        for(String elem: ingredients){
            nameAllIngridients.append(elem+", ");
            mass=+20;
        }
        nameAllIngridients.deleteCharAt(nameAllIngridients.length()-2);
        name=name+" with "+nameAllIngridients;
    }

    @Override
    public void makeTheDough() {
        mass=mass+40;
    }

    @Override
    public void serveBakedGoods() {
        System.out.println("Pancakes: "+name+" is cooked");
    }
}
