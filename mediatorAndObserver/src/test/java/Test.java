public class Test {
    /*
            В данной программе реализован чат между 2 людьми.
           Mediator
            В роли посредника между двумя людьми выступает класс - чат,
            в котором люди обмениваются своими сообщениями.
           Observer
            В роли наблюдателя выступает таролог, он может подключиться к чату
            и к нему будут поступать уведомление о новых сообщениях пользователей.
         */
    @org.junit.jupiter.api.Test
    public void test() {
        ConcreteChatRoom chat = new ConcreteChatRoom();
        ConcreteLearner1 learner1 = new ConcreteLearner1(chat);
        ConcreteLearner2 learner2 = new ConcreteLearner2(chat);
        Tarologist tarologist = new Tarologist(chat);
        chat.setLearner1(learner1);
        chat.setLearner2(learner2);
        chat.setTarologist(tarologist);

        learner1.send("New message for learner2");

        learner2.send("Learner1 response");

        System.out.println("---------------");

        tarologist.update();
    }
}
