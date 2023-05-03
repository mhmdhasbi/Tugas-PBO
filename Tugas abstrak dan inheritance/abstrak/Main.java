package abstrak;
abstract public class Main {
    public static void main (String[] args){

        Klasik jadul = new Klasik("Catur,", "Game yang dimainkan oleh 2 orang");
        jadul.info();

        Modern now = new Modern("mobile legend,", "game yang dimainkan oleh 2 tim berjumlah 5 orang tiap tim");
        now.info();
    }
}