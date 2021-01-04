import org.junit.jupiter.api.Test;

public class HandyVisitorTest {
    /*
    Программа демонстрирует процесс работы компьютера, который
    подключается к телефону для получения информации о его
    состоянию. Паттерн посетитель позволяет нам отправить своих
    "посетителей" в класс частей телефона, которые вследствии и
    будут нам сообщать о состоянии машины.
     */
    @Test
    public void Test() {
        HandyStruct comp = new Handy();
        HandyVisitor handyVisitor = new HandyVisitor();
        comp.accept(handyVisitor);
    }
}

