public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager =new CustomerManager();
        customerManager.baseDbManager=new OracleDbManager();
        customerManager.getCustomer();

    }
}