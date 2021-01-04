public class Tarologist implements ChatObserver {
    private ConcreteChatRoom chatRoom;

    public Tarologist(ConcreteChatRoom concreteChatRoom) {
        chatRoom = concreteChatRoom;
    }

    @Override
    public void update() {
        chatRoom.getDialog();
    }
}

