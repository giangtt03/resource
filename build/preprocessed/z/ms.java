public final class ms implements mr {
  private lg[][] q;
  
  public boolean a = false;
  
  public boolean b = false;
  
  public boolean c = false;
  
  public boolean d = false;
  
  public boolean e = false;
  
  public boolean f = true;
  
  public int g = 0;
  
  public int h;
  
  public mw[] i;
  
  public int j;
  
  public my k;
  
  public nj[][] l;
  
  private byte[] r;
  
  private byte[] s;
  
  public byte[] m;
  
  public int n = 0;
  
  private boolean t;
  
  private byte[] u;
  
  public byte[] o;
  
  public int[] p;
  
  private boolean v;
  
  private Object w = new Object();
  
  private boolean z = false;
  
  public ms(lh[] paramArrayOflh1, lh[] paramArrayOflh2) {
    h();
    this.q = new lg[2][];
    this.q[0] = new lg[paramArrayOflh1.length];
    this.q[1] = new lg[paramArrayOflh2.length];
    byte b;
    for (b = 0; b < paramArrayOflh1.length; b++) {
      this.q[0][b] = a(paramArrayOflh1[b]);
      this.q[0][b].f(3);
    } 
    for (b = 0; b < paramArrayOflh2.length; b++) {
      this.q[1][b] = a(paramArrayOflh2[b]);
      this.q[1][b].f(3);
    } 
  }
  
  public final void a(boolean paramBoolean) {
    this.b = paramBoolean;
    boolean bool = paramBoolean;
    ms ms1;
    (ms1 = this).c = bool;
  }
  
  private static lg a(lh paramlh) {
    return new lg(paramlh);
  }
  
  public final lg[][] a() {
    return this.q;
  }
  
  public final lg a(int paramInt1, int paramInt2) {
    return this.q[paramInt1][paramInt2];
  }
  
  public final boolean b() {
    return this.v;
  }
  
  public final void b(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  public final boolean c() {
    return this.v;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(this.l, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(nj[][] paramArrayOfnj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    nj nj1 = paramArrayOfnj[paramInt1][paramInt2];
    paramArrayOfnj[paramInt1][paramInt2] = paramArrayOfnj[paramInt3][paramInt4];
    paramArrayOfnj[paramInt3][paramInt4] = nj1;
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    synchronized (this.w) {
      this.u = paramArrayOfbyte;
      e();
      ms ms1 = this;
      return;
    } 
  }
  
  public final void a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, lh[] paramArrayOflh1, lh[] paramArrayOflh2) {
    this.t = false;
    this.m = this.r = this.s = null;
    this.u = null;
    byte[] arrayOfByte = paramArrayOfbyte1;
    ms ms1;
    (ms1 = this).o = arrayOfByte;
    f();
    this.n = 0;
    a(paramArrayOfbyte2);
    a(paramArrayOfbyte3);
    byte b;
    for (b = 0; b < (this.q[0]).length; b++) {
      lh lh1;
      (lh1 = this.q[0][b].a()).r = (paramArrayOflh1[b]).r;
      lh1.s = (paramArrayOflh1[b]).s;
      lh1.t = (paramArrayOflh1[b]).t;
      lh1.u = (paramArrayOflh1[b]).u;
      lh1.v = (paramArrayOflh1[b]).v;
      lh1.w = (paramArrayOflh1[b]).w;
    } 
    for (b = 0; b < (this.q[1]).length; b++) {
      this.q[1][b].a();
      lh lh1;
      (lh1 = this.q[1][0].a()).r = (paramArrayOflh2[b]).r;
      lh1.s = (paramArrayOflh2[b]).s;
      lh1.t = (paramArrayOflh2[b]).t;
      lh1.u = (paramArrayOflh2[b]).u;
      lh1.v = (paramArrayOflh2[b]).v;
      lh1.w = (paramArrayOflh2[b]).w;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3) {
    this.l[paramInt1][paramInt2] = nj.a(paramInt3);
  }
  
  public final nj b(int paramInt1, int paramInt2) {
    return this.l[paramInt1][paramInt2];
  }
  
  public final void d() {
    synchronized (this.w) {
      e();
      if (this.t) {
        if (this.s == null)
          f(); 
        this.m = this.s;
        this.s = null;
      } else {
        if (this.r == null)
          f(); 
        this.m = this.r;
        this.r = null;
      } 
      this.t = !this.t;
      this.n = 0;
      return;
    } 
  }
  
  public final boolean e() {
    if (this.u == null)
      return false; 
    if (this.t) {
      if (this.s == null) {
        this.s = this.u;
        this.u = null;
      } else if (this.r == null) {
        this.r = this.u;
        this.u = null;
      } 
    } else if (this.r == null) {
      this.r = this.u;
      this.u = null;
    } else if (this.s == null) {
      this.s = this.u;
      this.u = null;
    } 
    return true;
  }
  
  public final boolean f() {
    if (this.o == null)
      return false; 
    byte b1 = 0;
    for (byte b2 = 2; b2 < 10; b2++) {
      for (byte b = 2; b < 10; b++)
        this.l[b2][b] = nj.a(this.o[b1++]); 
    } 
    this.o = null;
    return true;
  }
  
  private void h() {
    this.l = new nj[12][12];
    byte b;
    for (b = 11; b >= 0; b--)
      this.l[0][b] = nj.b; 
    for (b = 11; b >= 0; b--)
      this.l[11][b] = nj.b; 
    for (b = 11; b >= 0; b--)
      this.l[b][0] = nj.b; 
    for (b = 11; b >= 0; b--)
      this.l[b][11] = nj.b; 
    for (b = 10; b > 0; b--)
      this.l[1][b] = nj.b; 
    for (b = 10; b > 0; b--)
      this.l[10][b] = nj.b; 
    for (b = 10; b > 0; b--)
      this.l[b][1] = nj.b; 
    for (b = 10; b > 0; b--)
      this.l[b][10] = nj.b; 
    for (b = 9; b >= 2; b--) {
      for (byte b1 = 9; b1 >= 2; b1--)
        this.l[b][b1] = nj.a; 
    } 
  }
  
  public final void g() {
    this.q = null;
    this.m = null;
    this.r = null;
    this.s = null;
    this.l = null;
    this.p = null;
    this.o = null;
    this.u = null;
    this.i = null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ms.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */