public class Main {
    public static void main(String[] args){
    //polymorphism
//        BaseLogger[] Loggers = new BaseLogger[]{new FileLogger(),new DataBaseLogger(),new EmailLogger()};
//        for(BaseLogger logger:Loggers){
//            logger.Log("Log mesaji");
//        }

    CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
    customerManager.add();
    }
}