package abstrak;

class Modern extends Permainan {
    private String deskripsi;
    public Modern (String game, String deskripsi) {
      super(game);
      this.deskripsi=deskripsi;
    }
  
    public void info() {
      System.out.println("Game modern : " + game +" adalah "+ deskripsi);
    }
  }
  
