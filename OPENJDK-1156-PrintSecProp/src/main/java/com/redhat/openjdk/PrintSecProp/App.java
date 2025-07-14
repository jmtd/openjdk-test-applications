import java.security.Security;

public class App
{
    public static void main(String[] arg)
    {
        String disabledAlgorithms = Security.getProperty("jdk.certpath.disabledAlgorithms");
        System.out.println(disabledAlgorithms);
    }
}
