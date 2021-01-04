import java.util.Iterator;
import java.util.NoSuchElementException;

public class CarIterator implements Iterator<Car.Part> {
    private Car car;
    private int wordPartsCount;

    public CarIterator(Car car1) {
        car = car1;
        this.wordPartsCount = car1.getNumberPartsOfCar();
    }

    @Override
    public boolean hasNext() {
        if (wordPartsCount == 4) {
            return car.hasIntrioi() || car.hasBodyCar() || car.hasHood() || car.hasTrunk();
        } else if (wordPartsCount == 3) {
            return car.hasIntrioi() || car.hasBodyCar() || car.hasHood();
        } else if (wordPartsCount == 2) {
            return car.hasIntrioi() || car.hasBodyCar();
        } else if (wordPartsCount == 1) {
            return car.hasBodyCar();
        }
        return false;
    }

    @Override
    public Car.Part next() throws NoSuchElementException {
        if (wordPartsCount <= 0) {
            throw new NoSuchElementException("No more elements in this word!");
        }

        try {
            if (wordPartsCount == 4) {
                return car.getTrunk();
            }
            if (wordPartsCount == 3) {
                return car.getHood();
            }
            if (wordPartsCount == 2) {
                return car.getInterior();
            }
            return car.getBodyCar();
        } finally {
            wordPartsCount--;
        }
    }


}
