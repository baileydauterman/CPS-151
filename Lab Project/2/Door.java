public class Door {
  private String name;
  private boolean state;
  private String state1;

  public void setName(String n) {
    name = n;
  }

  public boolean isOpen() {
    return state;
  }

  public void open() {
    state = true;
  }

  public void closed() {
    state = false;
  }

  public void output() {
    if(state) {
      state1 = "open";
    } else {
      state1 = "closed";
    }
    System.out.println(name + " door is " + state1);
  }
}
