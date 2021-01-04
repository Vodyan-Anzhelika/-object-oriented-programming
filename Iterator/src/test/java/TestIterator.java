import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class TestIterator { /*
    Допустим у нас идет проверка некой базы данных авто,
    которые находятся в процессе покупки.
    Благодаря данному итератору, мы сможем выяснить состояние частей авто.
     */

    @Test
    public void hasNext() {
        Car.Interior interior = new Car.Interior();
        Car.Hood hood = new Car.Hood();
        Car.Trunk trunk = new Car.Trunk();
        Car.BodyCar bodyCar = new Car.BodyCar();
        Car car = new Car(hood,trunk, interior, bodyCar);

        Iterator it = car.iterator();

        while (it.hasNext()) {
            System.out.println("The car has "+it.next().toString());
        }


    }
}
