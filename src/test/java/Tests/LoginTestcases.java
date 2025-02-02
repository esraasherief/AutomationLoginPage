package Tests;
import org.testng.annotations.Test;
public class LoginTestcases extends  Basepage {


    @Test
    public void  happytestcascenario(){
         String[] credentials = login.extractLoginCredentials();
        login.Username(credentials[0]);
        login.Password(credentials[1]);
        login.radiobttn();
        login.Okmessg();
        login.dropdownlist();
        login.termschekbox();
        login.signin();

    }


}
