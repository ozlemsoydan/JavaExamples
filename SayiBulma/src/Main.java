public class Main {
    public static void main(String[] args) {


        int [] sayilar=new int[]{1,3,4,6,9,0};
        int wanted=5;
        boolean isThere=false;

        for(int sayi: sayilar){
            if(wanted==sayi){
                isThere=true;
                break;
            }
        }
        if(isThere){
            System.out.println("sayı mevcuttur.");
        }else {
            System.out.println("sayı mevcut değildir.");
        }
    }
}