public abstract class Learner {
    protected ChatRoom chatRoom;

    public Learner(ChatRoom chatRoom){
        this.chatRoom=chatRoom;
    }

    public void send(String message){
        chatRoom.send(message, this);
    }

    public abstract void notify(String message);

}

