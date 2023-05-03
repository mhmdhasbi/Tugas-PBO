package inheritance;
class Makanan extends Warung {
    private String pake;
    public Makanan (String Menu, String pake) {
      super(Menu);
      this.pake = pake;
    }
  
    public void info() {
      System.out.println("Makanan : " + Menu +" pake "+ pake);
    }
  }
  