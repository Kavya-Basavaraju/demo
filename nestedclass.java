class p
{
    public void out(){
        System.out.println(" additation");
    }
    class q
    {
        public void out(){
            System.out.println("Subtraction");
        }
    }

}
public class nestedclass {
    public static void main(String[] args) {
        p ob1=new p();
        p.q ob2=ob1.new q();   //----- nested class syntax -------
        ob1.out();
        ob2.out();
    }
}
