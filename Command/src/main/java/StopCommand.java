public class StopCommand implements Command {
    private final CoffeeMachine coffeeMachine;

    public StopCommand(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        coffeeMachine.stopCoffeeMachine();
    }

}