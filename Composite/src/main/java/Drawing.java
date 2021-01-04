import java.util.ArrayList;
import java.util.List;

public class Drawing implements RunicLigature {
    private List<RunicLigature> runicLigatures = new ArrayList<RunicLigature>();
    public void draw(String place) {
        for(RunicLigature runicLigature : runicLigatures) {
            runicLigature.draw(place);
        }
    }
    public void add(RunicLigature f){
        this.runicLigatures.add(f);
    }
    public void clear(){
        System.out.println();
        this.runicLigatures.clear();
    }
}
