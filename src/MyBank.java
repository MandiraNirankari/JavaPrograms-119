public class MyBank {
    public static void main(String[] args)
    {
        Bank b=new Bank();
        try
        {
            b.withdrawal(1200);
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
