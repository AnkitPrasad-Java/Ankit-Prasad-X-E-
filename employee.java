public class employee
{
    public static void main(String name, float sal)
    {
        employee obj1= new employee();
        System.out.println("Name="+name);
        System.out.println("total salary=" + obj1.salary(sal));
    }
    static float salary(float sal)
    {
        float HRA=50*sal/100;
        float finsal= HRA + sal;
        return finsal;
    }
}    
        
            