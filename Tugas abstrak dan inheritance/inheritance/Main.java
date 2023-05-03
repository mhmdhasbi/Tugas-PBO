package inheritance;
public class Main {
    public static void main (String[] args){
        System.out.println("Warung kopi Madura");
        Makanan makan = new Makanan("gorengan", "saos udang");
        makan.info();

        Minuman minum = new Minuman("kopi", "garem");
        minum.info();
    }
}