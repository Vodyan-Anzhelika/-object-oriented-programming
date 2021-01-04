public class ConcreteChatRoom extends ChatRoom {
    private String lastMessage;
    private ConcreteLearner1 learner1;
    private ConcreteLearner2 learner2;
    private Tarologist tarologist;


    public void setLearner1(ConcreteLearner1 learner1){
        this.learner1=learner1;
    }

    public void setLearner2(ConcreteLearner2 learner2){
        this.learner2=learner2;
    }

    public void setTarologist(Tarologist tarologist){
        this.tarologist=tarologist;
    }


    public void getDialog(){
        System.out.println(lastMessage);
    }


    @Override
    public void send(String message, Learner sender) {
        if (sender.equals(learner1)) {
            lastMessage="learner1:"+message;
            tarologist.update();
            learner2.notify(message);
        } else {
            lastMessage="learner2:"+message;
            tarologist.update();
            learner1.notify(message);
        }
    }

}
