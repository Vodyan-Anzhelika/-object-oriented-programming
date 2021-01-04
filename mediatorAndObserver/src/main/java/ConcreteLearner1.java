public class ConcreteLearner1 extends Learner {


    public ConcreteLearner1(ChatRoom chatRoom) {
        super(chatRoom);
    }


    @Override
    public void notify(String message) {
        System.out.println("Learner1 get message: "+message);
    }


}
