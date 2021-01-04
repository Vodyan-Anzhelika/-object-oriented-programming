public class HandyVisitor implements Visitors{


    public void visit(Handy handy) {
        print("Scanning handy....");
        print("The handy is normal");
    }
    public void visit(CPU cpu) {
        print("Scanning CPU....");
        print("The CPU is normal");
    }
    public void visit(Matrix matrix) {
        print("Scanning matrix....");
        print("The matrix is normal");
    }
    private void print(String string) {
        System.out.println(string);
    }

}
