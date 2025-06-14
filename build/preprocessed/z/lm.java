public final class lm extends ld {
  public byte e = 0;
  
  public int f = 0;
  
  public int g;
  
  public long h;
  
  public int i;
  
  public int j;
  
  public long k;
  
  public int l = -1;
  
  public byte m = 1;
  
  public lm(int paramInt) {
    super(paramInt);
  }
  
  public final boolean a() {
    return (this.m == 1);
  }
  
  public final String toString() {
    return "Item[id=" + this.a + "; qty=" + this.g + "; $=" + this.h + "        type = " + this.e + " res id = " + this.j + "     ] name = " + this.b + "  displaynam = " + this.c + "  requireKen = " + this.k + "  des = " + this.d + "  slotCapacity = " + this.l + "   trade   " + this.m;
  }
  
  public final lm b() {
    lm lm1;
    (lm1 = new lm(this.a)).e = this.e;
    lm1.d = this.d;
    lm1.g = this.g;
    lm1.f = this.f;
    lm1.h = this.h;
    lm1.i = this.i;
    lm1.b = this.b;
    lm1.c = this.c;
    lm1.j = this.j;
    lm1.k = this.k;
    lm1.l = this.l;
    lm1.m = this.m;
    return lm1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\lm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */