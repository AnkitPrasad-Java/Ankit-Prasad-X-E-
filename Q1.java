public class Q1
{
    public static void main(int n)
    {
        int number=1;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+"");
                number++;
            }
            System.out.println();
        }
    }
}
            