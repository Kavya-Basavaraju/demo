import javax.swing.plaf.synth.SynthUI;
import java.security.PublicKey;

interface  s // --- 1  INTERFACE -----
{
    void set();
}
interface s2 extends s
{
    void set1();
}
class s3 implements s,s2
{
    public void set()
    {
        System.out.println(" MULTIPLELEVEL INTERFACE");
        System.out.println("HI   I AM KAVYA ");
    }
    public void set1()
    {
        System.out.println(" HI I AM CHANDANA ");
    }

}

public class multilevelinterface {
    public static void main(String[] args) {
        s3 ob2=new s3();
        ob2.set();
        ob2.set1();
    }
}
