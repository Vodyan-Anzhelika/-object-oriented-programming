public class StartCommand implements Command {
    private final CoffeeMachine coffeeMachine;

    public StartCommand(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        coffeeMachine.startCoffeeMachine();
    }
}