public class Main {
    public static void main(String[] args) {
        //interface new'lenemezler. implement ettiği classın referansını tutabilir.
        ICustomerDal iCustomerDal = new OracleCustomerDal();
        iCustomerDal.add();


    }
}