import com.mg.sq.a;

public final class ll {
  public static final int[] a = new int[] { 
      1, 4, 2, 3, 5, 9, 6, 10, 99, 99, 
      99, 99 };
  
  public int b;
  
  public String c;
  
  public String d;
  
  public byte e;
  
  public byte f;
  
  public String g;
  
  public byte h;
  
  public int i;
  
  public int j;
  
  public long k = -1L;
  
  public long l;
  
  private String u;
  
  public int m = 0;
  
  public int n;
  
  public long o;
  
  public int p;
  
  public int q;
  
  public lb r;
  
  public byte s;
  
  public byte t = 1;
  
  public ll(String paramString, byte paramByte) {
    this.c = paramString;
    this.e = paramByte;
  }
  
  public final boolean a() {
    return (this.t == 1);
  }
  
  public final boolean b() {
    return (this.q > 0 && this.p < this.q);
  }
  
  public final boolean c() {
    return (this.k > 0L);
  }
  
  public final ll d() {
    ll ll1;
    (ll1 = new ll(this.c, this.e)).d = this.d;
    ll1.f = this.f;
    ll1.h = this.h;
    ll1.i = this.i;
    ll1.k = this.k;
    ll1.j = this.j;
    ll1.m = this.m;
    ll1.n = this.n;
    ll1.p = this.p;
    ll1.q = this.q;
    ll1.r = this.r;
    ll1.b = this.b;
    ll1.u = this.u;
    ll1.s = this.s;
    ll1.t = this.t;
    return ll1;
  }
  
  public final String toString() {
    return "Equip[key=" + this.c + " resid = " + this.n + " ; name=" + this.d + "; type=" + this.e + " rank = " + this.m + "    \n" + this.r + " levle = " + this.j + " tradeable" + this.t;
  }
  
  public static d a(int paramInt) {
    d d;
    try {
      switch (paramInt) {
        case 2:
        case 3:
          return new by(11731964);
        case 4:
        case 7:
        case 8:
          return new if(new int[] { 9008914, 16776960 });
        case 1:
          return a.g;
        case 0:
          return bx.d;
      } 
      d = bx.d;
    } catch (Exception exception) {
      d = bx.d;
    } 
    return d;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ll.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */