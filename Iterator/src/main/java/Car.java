import java.util.Iterator;

public class Car  implements Iterable<Car.Part> {



    @Override
    public Iterator<Part> iterator() {
        return new CarIterator(this);
    }

    public interface Part { }
    public static class Hood implements Part {
        @Override
        public String toString() {
            return "Hood";
        }
    }
    public static class BodyCar implements Part {
        @Override
        public String toString() {
            return "BodyCar";
        }
    }
    public static class Trunk implements Part {
        @Override
        public String toString() {
            return "Trunk";
        }
    }
    public static class Interior implements Part{
        @Override
        public String toString() {
            return "Interior";
        }
    }

    private Hood hood;
    private BodyCar bodyCar;
    private Trunk trunk;
    private Interior interior;
    private int numberPartsOfCar;


    public Car() {
        numberPartsOfCar=0;
    }
    public Car(BodyCar bodyCar) {
        this.bodyCar = bodyCar;
        numberPartsOfCar=1;
    }

    public Car(Interior interior, BodyCar bodyCar) {
        this.interior = interior;
        this.bodyCar = bodyCar;
        numberPartsOfCar=2;
    }

    public Car(Hood hood, Interior interior, BodyCar bodyCar) {
        this.hood = hood;
        this.interior = interior;
        this.bodyCar = bodyCar;
        numberPartsOfCar=3;
    }

    public Car(Hood hood, Trunk trunk, Interior interior, BodyCar bodyCar) {
        this.hood = hood;
        this.trunk = trunk;
        this.interior = interior;
        this.bodyCar = bodyCar;
        numberPartsOfCar=4;
    }

    public Hood getHood() {
        return hood;
    }

    public void setHood(Hood hood) {
        this.hood = hood;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public boolean hasHood(){
        return hood !=null;
    }

    public boolean hasIntrioi(){
        return interior !=null;
    }

    public boolean hasTrunk(){
        return trunk !=null;
    }

    public boolean hasBodyCar(){
        return bodyCar !=null;
    }


    public BodyCar getBodyCar() {
        return bodyCar;
    }

    public int getNumberPartsOfCar() {
        return numberPartsOfCar;
    }

    public void setBodyCar(BodyCar bodyCar) {
        this.bodyCar = bodyCar;
    }


}

