import org.junit.jupiter.api.Test;

public class CommandTest {
    /*
    Эта программа является краткой реализацией ключей с дистанционным доступом для кофе машины.
    У ключей задано две команда - включить и выключить.
    При выборе первой команде - автомат включается.
    При выборе второй - выключается.
    Все это реализовано на основе паттерна Команда.
    В нашем случае объект ключ/нопка power заклюает в себя два действия,
    которые он может осуществлять.
     */
    @Test
    public void test() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Command start = new StartCommand(coffeeMachine);
        Command stop = new StopCommand(coffeeMachine);

        Power power = new Power();
        power.saveCommand("start", start);
        power.saveCommand("stop", stop);

        power.execute("start");
        power.execute("stop");
    }
}

