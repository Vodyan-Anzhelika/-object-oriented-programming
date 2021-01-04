public class ConcreteLearner2 extends Learner {

    public ConcreteLearner2(ChatRoom chatRoom) {
        super(chatRoom);
    }

    @Override
    public void notify(String message) {
        System.out.println("Learner2 get message: "+message);
    }

}
