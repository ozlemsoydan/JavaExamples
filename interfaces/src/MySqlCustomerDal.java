public class MySqlCustomerDal implements ICustomerDal,IRepostory {
    //Bir Class birden fazla interface'i implement edebilir. extends 'den farkı budur.
    @Override
    public void add() {
        System.out.println("MySql Eklendi");
    }
}
