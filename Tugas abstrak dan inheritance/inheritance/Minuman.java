package inheritance;
class Minuman extends Warung {
    private String pake;
    public Minuman (String Menu, String pake) {
      super(Menu);
      this.pake=pake;
    }
  
    public void info() {
      System.out.println("Minuman : " + Menu +" pake "+ pake);
    }
  }
  