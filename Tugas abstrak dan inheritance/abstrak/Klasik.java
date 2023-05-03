package abstrak;

class Klasik extends Permainan {
    private String deskripsi;
    public Klasik (String game, String deskripsi) {
      super(game);
      this.deskripsi=deskripsi;
    }
  
    public void info() {
      System.out.println("Game Klasik : " + game +" Adalah "+ deskripsi);
    }
  }
  