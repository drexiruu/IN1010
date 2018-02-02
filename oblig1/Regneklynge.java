import java.util.ArrayList;

class Regneklynge {
  private ArrayList<Rack> regneklynge;
  private int antallRacks;
  private int maxNoderPerRack;

  public Regneklynge(int maxNoder) {
    maxNoderPerRack = maxNoder;
    regneklynge = new ArrayList<Rack>();
    regneklynge.add(new Rack(maxNoderPerRack));
    antallRacks = 1;
  }

  public void settInnNode(Node node) {
    Rack lastRack = regneklynge.get(regneklynge.size() - 1);
    if (lastRack.getAntNoder() < maxNoderPerRack) {
      lastRack.settInn(node);
    }
    else {
      Rack newRack = new Rack(maxNoderPerRack);
      newRack.settInn(node);
      regneklynge.add(newRack);
    }
  }

  public int antProsessorer() {
    int totaltAntPros = 0;
    for (int i = 0; i < regneklynge.size(); i++) {
      totaltAntPros += regneklynge.get(i).antProsessorer();
    }
    return totaltAntPros;
  }

  public int noderMedNokMinne(int paakrevdMinne) {
    int totaltAntNoderMedNokMinne = 0;
    for (int i = 0; i < regneklynge.size(); i++) {
      totaltAntNoderMedNokMinne += regneklynge.get(i).noderMedNokMinne(paakrevdMinne);
    }
    return totaltAntNoderMedNokMinne;
  }

  public int antRacks() {
    antallRacks = regneklynge.size();
    return antallRacks;
  }
}
