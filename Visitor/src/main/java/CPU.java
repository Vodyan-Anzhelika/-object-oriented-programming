public class CPU  implements HandyStruct {
    private boolean state;

    public CPU(){
        state=false;
    }

    public void start(){
        state=true;
    }

    public void stop(){
        state=false;
    }

    @Override
    public void accept(Visitors visitors) {
        visitors.visit(this);
    }

}

