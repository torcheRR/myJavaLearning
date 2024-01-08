public class Main {
    public static void main(String[] args) {
    WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
    womanGameCalculator.hesapla();
    womanGameCalculator.gameOver();


    //hepsini döndürme denemesi
    GameCalculator[] gameCalculators=new GameCalculator[]{new KidsGameCalculator(), new ManGameCalculator(), new WomanGameCalculator()};
    for(GameCalculator gameCalculator:gameCalculators){
        gameCalculator.hesapla();
    }
    }
}
