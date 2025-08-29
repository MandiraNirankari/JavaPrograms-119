public class MyNewException {
    public static void main(String[] arge){
        UserDefineException udf = new UserDefineException();
        try
        {
            udf.validate(12);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
