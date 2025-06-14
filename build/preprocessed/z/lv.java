public final class lv extends ld {
  public int e;
  
  public int f;
  
  public int g;
  
  public String[] h;
  
  public lv(int paramInt) {
    super(paramInt);
  }
  
  public final String toString() {
    lv lv1;
    String str = "Skill " + (lv1 = this).a + ": " + this.b + "\n";
    str = String.valueOf(str) + this.d + "\n";
    str = String.valueOf(str) + "Level: " + this.f + "  Mana: " + this.e + "\n";
    str = String.valueOf(str) + "Max Level: " + this.g + "\n";
    if (this.h != null)
      for (byte b = 0; b < this.h.length; b++)
        str = String.valueOf(str) + this.h[b] + "\n";  
    return str;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\lv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */