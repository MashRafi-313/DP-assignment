public class Client {
    public static void main(String[] args) {

        Terminal proxyShell = new ProxyShell();
        proxyShell.run("dir /s", "admin");
        proxyShell.run("dir /s", "user");
        
        proxyShell.run("rm -rf", "admin");
        proxyShell.run("rm -rf", "user");
        
    }
}
