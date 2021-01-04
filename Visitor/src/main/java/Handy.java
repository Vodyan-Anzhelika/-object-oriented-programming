public class Handy implements HandyStruct{
    HandyStruct[] handysStruct;

    public Handy(){
        handysStruct = new HandyStruct[]{new CPU(), new Matrix()};
    }

    @Override
    public void accept(Visitors visitors) {
        for (int i = 0; i < handysStruct.length; i++) {
            handysStruct[i].accept(visitors);
        }
        visitors.visit(this);
    }


    public void startCPU() {
        System.out.println("Процессор запущен");
    }
    public void stopCPU() {
        System.out.println("Процессор выключен");
    }

}
