import com.mg.smsgame.MGMIDlet;

public abstract class cd extends an implements bf {
  private int[] a;
  
  private int b;
  
  private String c;
  
  private boolean d;
  
  private az k;
  
  private boolean l;
  
  private cc[] m;
  
  public final void d() {
    this.c = cs.h();
    this.a = cs.f();
    this.b = 0;
    for (int i = this.a.length - 1; i >= 0; i--) {
      if (this.a[i] < 0) {
        this.b = i;
        break;
      } 
    } 
    cd cd1;
    byte[] arrayOfByte;
    (cd1 = this).d = ((arrayOfByte = cs.e()) == null);
    cd1.m = new cc[null.length];
    for (byte b = 0; b < cd1.m.length; b++) {
      if (cd1.a[b] != -1 && cd1.a[b] != 0);
      cd1.m[b] = new cc(null, null[b], null[b]);
      cd1.m[b].k(0);
    } 
    if (!cd1.d) {
      az az2 = a("Trở về", 5);
      cd cd3;
      (cd3 = cd3 = cd1).b(az2, true);
    } 
    az az1 = a("Cần biết", 6);
    cd cd2;
    (cd2 = cd2 = cd1).a(az1, true);
    cd1.k = a("Mở", 1);
    cd1.a((az)null);
    if (cd1.a[cd1.b] < 0)
      cd1.a(cd1.k); 
    this.l = cs.a(this.a);
    if (this.l) {
      byte[] arrayOfByte1;
      if ((arrayOfByte1 = cs.g()) == null) {
        cs.i();
        MGMIDlet mGMIDlet;
        (mGMIDlet = MGMIDlet.d()).notifyDestroyed();
        return;
      } 
      if (this.c != null)
        bx.a("Chúc mừng bạn đã sưu tập đủ bộ Vật phẩm. Hãy bấm nút gửi để nhận phần thưởng: " + this.c, this.f - 10); 
      az1 = null;
      (cd2 = this).b(az1, true);
      a((az)null);
      az1 = null;
      (cd2 = this).a(az1, true);
      a(a("Gửi", 2));
    } 
  }
  
  private static az a(String paramString, int paramInt) {
    return new bd(paramString, paramInt);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */