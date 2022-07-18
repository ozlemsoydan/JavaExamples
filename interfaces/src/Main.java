public class Main {
    public static void main(String[] args) {
        //interface new'lenemezler. implement ettiği classın referansını tutabilir.
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();


    }
}