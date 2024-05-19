public class Client {
    public static void main(String[] args) {
        Phone phone;
        phone = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
        phone.getResult();
    }
}
