public abstract class GameCalculator {
    //abstract edildiğinde override edilmek zorunda.
    //abstract class asla new'lenmez.
    public abstract void hesapla();

    //final edildiğinde override edilmez; default olarak gelir.
    public final void gameOver(){
        System.out.println("Oyun Bitti");
    }
}
