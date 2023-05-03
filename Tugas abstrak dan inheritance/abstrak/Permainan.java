package abstrak;

class Permainan {
    protected String game;

    public Permainan (String game) {
      this.game = game;
    }
  
    public void info() {
      System.out.println("Deskripsi: " + game);
    }
  }
  

