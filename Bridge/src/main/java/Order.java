
public abstract class Order {
    Herbs herbs;

    public Order(Herbs herbs){
        this.herbs = herbs;
    }

    public void make(){
        herbs.fill();
    }
}