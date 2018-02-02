class Hovedprogram {
  public static void main(String[] args) {

    Regneklynge abel = new Regneklynge(12);

    for (int i = 0; i < 650; i++) {
      abel.settInnNode(new Node(64, 1));
    }
    for (int j = 0; j < 16; j++) {
      abel.settInnNode(new Node(1024, 2));
    }

    int minst32 = abel.noderMedNokMinne(32);
    int minst64 = abel.noderMedNokMinne(64);
    int minst128 = abel.noderMedNokMinne(128);
    int totAntProsessorer = abel.antProsessorer();
    int totAntRacks = abel.antRacks();

    System.out.println("Noder med minst 32 GB: " + minst32);
    System.out.println("Noder med minst 64 GB: " + minst64);
    System.out.println("Noder med minst 128 GB: " + minst128 + "\n");
    System.out.println("Antall prosessorer: " + totAntProsessorer);
    System.out.println("Antall rack: " + totAntRacks);
  }
}
