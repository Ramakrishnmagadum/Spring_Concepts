package Proxy_Design_Pattern;

/**
 * Hello world!
 *
 */
public class Teacher 
{
    public static void main( String[] args )
    {
    	Studentimpl student =new Student_proxy(new Attendence("ramakrishna",true));
    	student.attendlession();
    	System.out.println("completed");
    }
}
