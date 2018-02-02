class Node {
  private int minnestorrelse;
  private int prosessorantall;

  public Node(int minne, int antPros) {
    minnestorrelse = minne;
    prosessorantall = antPros;
  }

  public int antProsessorer() {
    return prosessorantall;
  }

  public boolean nokMinne(int paakrevdMinne) {
    return minnestorrelse >= paakrevdMinne;
  }
}
