public final class lh extends ld {
  public byte e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public int q;
  
  public int r;
  
  public int s;
  
  public int t;
  
  public int u;
  
  public int v;
  
  public int w;
  
  public int x;
  
  public int y;
  
  public int z;
  
  public int A;
  
  public int B;
  
  public int C;
  
  public ll[] D;
  
  public lv[] E;
  
  public lm[] F;
  
  public int G;
  
  public int H;
  
  public int I;
  
  public int J;
  
  public int K;
  
  public int L;
  
  public int M;
  
  public int N;
  
  public boolean O = false;
  
  public String P = "";
  
  public String Q = null;
  
  public String R = "";
  
  public String S = "";
  
  public byte T;
  
  public df U;
  
  public df V;
  
  public df W;
  
  public long X;
  
  public int Y;
  
  public boolean Z = false;
  
  public boolean aa = false;
  
  public int ab;
  
  public lt[] ac;
  
  public boolean ad = true;
  
  public final lh a() {
    lh lh1;
    (lh1 = new lh(this.a)).b = this.b;
    lh1.d = this.d;
    lh1.c = this.c;
    lh1.f = this.f;
    lh1.g = this.g;
    lh1.s = this.s;
    lh1.r = this.r;
    lh1.u = this.u;
    lh1.t = this.t;
    lh1.w = this.w;
    lh1.v = this.v;
    lh1.z = this.z;
    if (this.D != null) {
      lh1.D = new ll[this.D.length];
      for (byte b = 0; b < lh1.D.length; b++)
        lh1.D[b] = this.D[b].d(); 
    } 
    if (this.F != null) {
      lh1.F = new lm[this.F.length];
      for (byte b = 0; b < lh1.F.length; b++)
        lh1.F[b] = this.F[b].b(); 
    } 
    if (this.E != null) {
      lh1.E = new lv[this.E.length];
      for (byte b = 0; b < lh1.E.length; b++) {
        lv lv1 = this.E[b];
        lv lv2;
        (lv2 = new lv(lv1.a)).d = lv1.d;
        lv2.c = lv1.c;
        lv2.b = lv1.b;
        lv2.f = lv1.f;
        lv2.e = lv1.e;
        lv2.g = lv1.g;
        lv2.h = lv1.h;
        lh1.E[b] = lv2;
      } 
    } 
    lh1.G = this.G;
    lh1.H = this.H;
    lh1.J = this.J;
    lh1.K = this.K;
    lh1.L = this.L;
    lh1.M = this.M;
    lh1.N = this.N;
    lh1.O = this.O;
    lh1.Z = this.Z;
    lh1.C = this.C;
    lh1.i = this.i;
    lh1.A = this.A;
    lh1.B = this.B;
    lh1.k = this.k;
    lh1.x = this.x;
    lh1.y = this.y;
    lh1.h = this.h;
    lh1.j = this.j;
    lh1.U = this.U.a();
    lh1.W = this.W.a();
    lh1.V = this.V.a();
    return lh1;
  }
  
  public lh(int paramInt) {
    super(paramInt);
  }
  
  public final String toString() {
    String str = "[CHARATER ] name = " + this.b + "   id = " + this.a + "\n";
    str = String.valueOf(str) + "Streng = " + this.h + "\n";
    str = String.valueOf(str) + "vitalit = " + this.k + "\n";
    str = String.valueOf(str) + "agility = " + this.j + "\n";
    str = String.valueOf(str) + "magic = " + this.i + "\n";
    str = String.valueOf(str) + "addStreng = " + this.l + "\n";
    str = String.valueOf(str) + "addvitalit = " + this.o + "\n";
    str = String.valueOf(str) + "addagility = " + this.m + "\n";
    str = String.valueOf(str) + "addmagic = " + this.l + "\n";
    str = String.valueOf(str) + "   - HP: " + this.s + " / " + this.r + "\n";
    str = String.valueOf(str) + "   - Mana: " + this.u + " / " + this.t + "\n";
    str = String.valueOf(str) + "   - Power: " + this.w + " / " + this.v + "\n";
    str = String.valueOf(str) + "   - MinDam: " + this.x + " / " + this.y + "\n";
    str = String.valueOf(str) + "   - Dodgerate: " + this.A + " hitrate: " + this.B + "\n";
    str = String.valueOf(str) + "   - Defende: " + this.z + " criticaldamge " + this.C + "\n";
    str = String.valueOf(str) + "   - Skills: ";
    str = String.valueOf(str) + "    - hệ: " + this.g + "\n";
    byte b;
    for (b = 0; b < this.E.length; b++)
      str = String.valueOf(str) + this.E[b].toString(); 
    str = String.valueOf(str) + "\n   - Equinemt: ";
    for (b = 0; b < this.D.length; b++)
      str = String.valueOf(str) + this.D[b].toString() + "\n"; 
    return str = String.valueOf(str) + "\n";
  }
  
  public final ll a(int paramInt) {
    if (this.D != null && this.D.length > 0)
      for (byte b = 0; b < this.D.length; b++) {
        if ((this.D[b]).e == paramInt)
          return this.D[b]; 
      }  
    return null;
  }
  
  public final ll b() {
    if (this.D != null && this.D.length > 0)
      for (byte b = 0; b < this.D.length; b++) {
        if ((this.D[b]).e == 4) {
          this.ad = true;
          return this.D[b];
        } 
      }  
    this.ad = false;
    return null;
  }
  
  public final int c() {
    byte b = 0;
    if (this.D != null) {
      byte b1;
      for (b1 = 0; b1 < this.D.length; b1++) {
        if ((this.D[b1]).j >= 7 && (this.D[b1]).e != 8 && (this.D[b1]).e != 4)
          b++; 
      } 
      b1 = 0;
      if (b >= 4)
        for (b = 0; b < this.D.length; b++) {
          if ((this.D[b]).e != 8 && (this.D[b]).e != 4) {
            if ((this.D[b]).j < 9)
              return 1; 
            if ((this.D[b]).j < 11)
              return 2; 
            if ((this.D[b]).j < 13)
              return 3; 
            if ((this.D[b]).j >= 13)
              b1++; 
            if (b1 >= 4)
              return 4; 
          } 
        }  
    } 
    return 0;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\lh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */