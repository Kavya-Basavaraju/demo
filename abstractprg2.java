abstract  class persondetails
{
    abstract  void officeworkdetails(int id,String login);

}
class detailss extends persondetails
{
       void officeworkdetails(int id, String login)
    {
        System.out.println("details");
    }
    public void personalworkdetails(String login,int sleepinghours,int redinghpurs)
    {
        System.out.println("login:"+login);
        System.out.println("sleepinhgHours:"+sleepinghours);
        System.out.println("re4ading hours:"+redinghpurs);
    }
    detailss(String name,int age)
    {

        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}

public class abstractprg2 {
    public static void main(String[] args) {
        detailss ab1=new detailss( "kavya",21);
        ab1.officeworkdetails( 123,"nigth");
        ab1.personalworkdetails("moring ",3,4);


    }
}
