package design;

public abstract class AbstractEmployeeClass implements Employee{
    public final String CompanyName="PNT";
    static String address="21-10,37th avenue,Long IsLand Road, NY";
    public void service(){
        System.out.println(CompanyName+"provide training for selenium,qtp from"+address);
    }
    public abstract void describeCompany(String Mission);

}
