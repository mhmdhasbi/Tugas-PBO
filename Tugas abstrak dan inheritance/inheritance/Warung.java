package inheritance;
class Warung {
    protected String Menu;

    public Warung(String Menu) {
      this.Menu = Menu;
    }
  
    public void info() {
      System.out.println("Menu: " + Menu);
    }
  }
  
