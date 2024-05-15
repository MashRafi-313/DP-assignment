import java.util.ArrayList;
import java.util.List;

public class ProxyShell implements Terminal{
    private PowerShell powershell;
    private List<String> adminCommand;
    
    public ProxyShell() {
        powershell = new PowerShell();
        adminCommand = new ArrayList<>();
        adminCommand.add("rm -rf");
    }

    @Override
    public void run(String command, String user) {
        if(adminCommand.contains(command) && user != "admin"){
            System.out.println("'"+command + "' is not recognized as an internal or external command");
        }
        else{
            powershell.run(command,user);
        }
    }

  

}
