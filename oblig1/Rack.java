class Rack {
  private Node[] rack;
  private int antallNoder;

  public Rack(int maxNoder) {
    rack = new Node[maxNoder];
    antallNoder = 0;
  }

  public void settInn(Node node) {
    for (int i = 0; i < rack.length; i++) {
      if (rack[i] == null) {
        rack[i] = node;
        break;
      }
    }
  }

  public int getAntNoder() {
    antallNoder = 0;
    for (int i = 0; i < rack.length; i++) {
      if (rack[i] != null) {
        antallNoder++;
      }
    }
    return antallNoder;
  }

  public int antProsessorer() {
    int antallProsessorer = 0;
    for (int i = 0; i < rack.length; i++) {
      if (rack[i] != null) {
        antallProsessorer += rack[i].antProsessorer();
      }
    }
    return antallProsessorer;
  }

  public int noderMedNokMinne(int paakrevdMinne) {
    int antallNoderMedNokMinne = 0;
    for (int i = 0; i < rack.length; i++) {
      if (rack[i] != null) {
        if (rack[i].nokMinne(paakrevdMinne)) {
          antallNoderMedNokMinne++;
        }
      }
    }
    return antallNoderMedNokMinne;
  }
}
