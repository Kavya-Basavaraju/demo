class person
{
    private String  name="kavya";
    private int age=21;
    public String getName()
    {
        return name;
    }
    public int  getage()
    {
        return age;
    }
    public void setname(String name1)
    {
        name=name1;
    }
    public void   setage(int age1)
    {
        age = age1;
    }

}
public class encapsulation
{
    public static void main(String[] args) {
        person ee1 = new person();
        System.out.println("name:"+ee1.getName());
        System.out.println("name:"+ee1.getage());

        ee1.setname("Hydar");
        ee1.setage(23);

        System.out.println("name:"+ee1.getName());
        System.out.println("name:"+ee1.getage());
    }

}
