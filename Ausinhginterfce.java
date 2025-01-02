interface l{
    void load();
    void mul();
    void div();
}
public class Ausinhginterfce {
    public static void main(String[] args) {
        l ob1=new l() {
            @Override
            public void load() {
                System.out.println("adg");
            }
            public void mul() {
                System.out.println("mul");
            }
            public void div() {
                System.out.println("div");
            }

        };
        ob1.load();
        ob1.div();
        ob1.mul();
    }

}
