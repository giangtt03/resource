import javax.microedition.io.SocketConnection;

public final class ks implements Runnable, kn {
  private short k;
  
  private static ks l = null;
  
  private static final Object m = new Object();
  
  private boolean n;
  
  private final kr o;
  
  private SocketConnection p = null;
  
  private ky q = null;
  
  private kz r = null;
  
  private String[] s = null;
  
  private int t;
  
  int b = 3;
  
  private int u = 0;
  
  private kq v;
  
  private kp w;
  
  private ko x;
  
  String c;
  
  String d;
  
  private String y;
  
  private long z;
  
  String e;
  
  String f;
  
  a g = new a();
  
  public static int h = 0;
  
  public static String i;
  
  public static int j;
  
  private long A = 0L;
  
  private int B = 0;
  
  protected ks() {
    this.s = new String[1];
    this.s[0] = "210.211.116.157";
    this.t = 1238;
    this.y = System.getProperty("microedition.platform");
    if (this.y == null || this.y.length() == 0)
      this.y = "OlaJ2ME"; 
    this.b = 3;
    this.n = false;
    this.o = new kr(16);
    this.k = 1;
    this.z = 0L;
    (new Thread(this)).start();
  }
  
  public static ks a() {
    if (l == null)
      l = new ks(); 
    return l;
  }
  
  public final void b() {
    this.k = 4;
    l = null;
    d(false);
  }
  
  private static kx a(kw paramkw) {
    byte b;
    kx kx = new kx();
    switch (paramkw.a) {
      case 4:
        kx.a((short)9, paramkw.c);
        kx.a((short)10, paramkw.d);
        kx.a((short)1, paramkw.i);
        kx.a((short)11, paramkw.z);
        kx.b((short)37, paramkw.as);
        break;
      case 5:
        kx.b((short)41, paramkw.m);
        kx.a((short)11, "0.18.0");
        kx.b((short)170, paramkw.n);
        if (paramkw.o)
          kx.a((short)254, 1); 
        break;
      case 8:
        kx.a((short)16, paramkw.p);
        kx.a((short)15, paramkw.q);
        for (b = 0; b < paramkw.O.length; b++) {
          kx.b((short)90, (paramkw.O[b]).a);
          kx.b((short)96, (paramkw.O[b]).e.a);
        } 
        break;
      case 9:
        kx.a((short)9, paramkw.c);
        if (paramkw.P >= 0)
          kx.a((short)134, paramkw.P); 
        if (paramkw.ao > 0)
          kx.b((short)23, paramkw.ao); 
        break;
      case 30:
        kx.a((short)15, paramkw.q);
        break;
      case 29:
        kx.a((short)9, paramkw.c);
        break;
      case 10:
        kx.b((short)118, paramkw.E);
        kx.b((short)119, paramkw.F);
        kx.b((short)120, paramkw.G);
        kx.b((short)121, paramkw.H);
        break;
      case 27:
        for (b = 0; b < paramkw.I.length; b++) {
          kx.b((short)64, paramkw.I[b]);
          kx.b((short)67, paramkw.J[b]);
        } 
        break;
      case 6:
        kx.b((short)4, paramkw.e);
        if (paramkw.f >= 0)
          kx.b((short)7, paramkw.f); 
        break;
      case 11:
        kx.a((short)20, paramkw.B);
        if (paramkw.m != 0)
          kx.b((short)41, paramkw.m); 
        break;
      case 13:
        kx.a((short)20, paramkw.B);
        kx.b((short)21, paramkw.D);
        break;
      case 43:
        kx.a((short)20, paramkw.B);
        break;
      case 12:
        kx.a((short)192, paramkw.k);
        break;
      case 16:
        kx.a((short)9, paramkw.c);
        if (paramkw.i != null)
          kx.a((short)1, paramkw.i); 
        if (paramkw.L)
          kx.b((short)25, 1); 
        if (paramkw.ad > 0L)
          kx.a((short)132, paramkw.ad); 
        if (paramkw.ac)
          kx.a((short)141, 1); 
        if (paramkw.ae)
          kx.a((short)167, 1); 
        if (paramkw.af)
          kx.a((short)169, 1); 
        break;
      case 17:
        kx.a((short)31, paramkw.l ? 1 : 0);
        kx.a((short)28, paramkw.y);
        if (!i.b(paramkw.i))
          kx.a((short)1, paramkw.i); 
        break;
      case 23:
        kx.a((short)28, paramkw.y);
        break;
      case 14:
        kx.a((short)28, (a()).e);
        kx.b((short)41, paramkw.m);
        break;
      case 19:
        kx.a((short)28, (a()).e);
        kx.b((short)41, paramkw.m);
        kx.b((short)33, paramkw.s);
        kx.b((short)34, paramkw.t);
        kx.b((short)33, paramkw.u);
        kx.b((short)34, paramkw.v);
        break;
      case 20:
        kx.a((short)28, (a()).e);
        kx.b((short)41, paramkw.m);
        kx.b((short)64, paramkw.r);
        break;
      case 44:
        kx.a((short)28, (a()).e);
        kx.b((short)41, paramkw.m);
        kx.b((short)114, paramkw.M);
        break;
      case 47:
        kx.a((short)28, (a()).e);
        kx.b((short)41, paramkw.m);
        kx.b((short)33, paramkw.w);
        kx.b((short)34, paramkw.x);
        break;
      case 84:
        kx.b((short)114, paramkw.M);
        break;
      case 40:
        kx.a((short)28, paramkw.y);
        break;
      case 25:
        for (b = 0; b < paramkw.j.length; b++)
          kx.a((short)9, paramkw.j[b]); 
        kx.a((short)1, paramkw.i);
        break;
      case 32:
        kx.a((short)77, paramkw.K);
        break;
      case 41:
        kx.a((short)77, paramkw.K);
        break;
      case 33:
        kx.a((short)77, paramkw.K);
        break;
      case 42:
        kx.a((short)9, paramkw.c);
        break;
      case 37:
        for (b = 0; b < paramkw.R.length; b++) {
          if (paramkw.R[b] != null)
            kx.a((short)83, paramkw.R[b]); 
        } 
        kx.a((short)89, paramkw.S);
        break;
      case 127:
        kx.a((short)191, paramkw.N);
        break;
      case 48:
        kx.b((short)114, paramkw.M);
        kx.a((short)83, paramkw.Q);
        break;
      case 49:
        kx.a((short)9, paramkw.c);
        kx.a((short)40, paramkw.ab ? 1 : 0);
        break;
      case 55:
        kx.a((short)147, paramkw.T);
        switch (paramkw.T) {
          case 0:
            kx.a((short)9, paramkw.c);
            break;
          case 1:
            kx.a((short)150, paramkw.ag);
            kx.a((short)31, paramkw.l ? 1 : 0);
            break;
          case 4:
            kx.a((short)150, paramkw.ag);
            kx.a((short)83, paramkw.Q);
            kx.b((short)106, paramkw.g);
            break;
          case 3:
            kx.a((short)150, paramkw.ag);
            kx.b((short)114, paramkw.M);
            kx.b((short)106, paramkw.g);
            break;
          case 2:
            kx.a((short)150, paramkw.ag);
            kx.a((short)132, paramkw.ah);
            break;
          case 5:
            if (paramkw.ag != null)
              kx.a((short)150, paramkw.ag); 
            break;
          case 6:
            kx.a((short)150, paramkw.ag);
            kx.b((short)41, j);
            break;
          case 7:
            kx.a((short)150, paramkw.ag);
            break;
        } 
        break;
      case 56:
        kx.a((short)147, paramkw.T);
        switch (paramkw.T) {
          case 1:
            kx.a((short)152, paramkw.U);
            kx.b((short)148, paramkw.V);
            break;
          case 2:
            if (paramkw.Z != null)
              for (b = 0; b < paramkw.Z.length; b++)
                kx.b((short)153, paramkw.Z[b]);  
            break;
        } 
        break;
      case 129:
        kx.a((short)147, paramkw.T);
        switch (paramkw.T) {
          case 2:
            kx.a((short)162, paramkw.ai);
            break;
        } 
        break;
      case 7:
        kx.a((short)147, paramkw.T);
        switch (paramkw.T) {
          case 0:
            kx.a((short)165, paramkw.aj ? 1 : 0);
            break;
          case 1:
            kx.a((short)166, paramkw.aj ? 1 : 0);
            break;
        } 
        break;
      case 57:
        kx.a((short)147, paramkw.ak);
        kx.a((short)20, paramkw.B);
        kx.b((short)21, paramkw.D);
        break;
      case 65:
        kx.a((short)192, paramkw.k);
        break;
      case 18:
        kx.a((short)28, paramkw.y);
        break;
      case 131:
        kx.a((short)9, paramkw.c);
        kx.a((short)10, paramkw.d);
        kx.a((short)26, paramkw.al);
        kx.a((short)162, paramkw.ai);
        kx.a((short)179, paramkw.am.longValue());
        kx.a((short)177, paramkw.an);
        kx.a((short)16, paramkw.p);
        break;
      case 51:
        kx.b((short)114, paramkw.M);
        break;
      case 83:
        kx.b((short)114, paramkw.M);
        kx.b((short)106, paramkw.g);
        break;
      case 100:
        kx.a((short)186, paramkw.C);
        kx.a((short)187, paramkw.A);
        if (paramkw.Q != null)
          kx.a((short)83, paramkw.Q); 
        if (paramkw.M > 0) {
          kx.b((short)114, paramkw.M);
          kx.b((short)106, paramkw.g);
        } 
        break;
      case 112:
        if (paramkw.Q != null) {
          kx.a((short)83, paramkw.Q);
          kx.a((short)132, paramkw.ah);
          break;
        } 
        if (paramkw.M > 0) {
          kx.b((short)114, paramkw.M);
          kx.b((short)106, paramkw.g);
          kx.a((short)132, paramkw.ah);
          break;
        } 
        if (paramkw.aa != null)
          kx.a((short)175, paramkw.aa); 
        break;
      case 113:
        kx.a((short)175, paramkw.aa);
        break;
      case 114:
        switch (paramkw.W) {
          case 1:
            kx.a((short)152, paramkw.U);
            kx.b((short)13, paramkw.X);
            kx.b((short)148, paramkw.V);
            break;
        } 
        break;
      case 115:
        kx.a((short)175, paramkw.aa);
        break;
      case 101:
        kx.a((short)186, paramkw.C);
        if (paramkw.R != null)
          for (b = 0; b < paramkw.R.length; b++)
            kx.a((short)83, paramkw.R[b]);  
        if (paramkw.Y != null)
          for (b = 0; b < paramkw.Y.length; b++) {
            kx.b((short)114, paramkw.Y[b]);
            kx.b((short)106, paramkw.h[b]);
          }  
        if (paramkw.ah > 0L)
          kx.a((short)132, paramkw.ah); 
        break;
      case 96:
        kx.a((short)83, paramkw.Q);
        break;
      case 97:
        kx.a((short)186, paramkw.C);
        kx.a((short)187, paramkw.A);
        if (paramkw.Q != null)
          kx.a((short)83, paramkw.Q); 
        if (paramkw.M > 0) {
          kx.b((short)114, paramkw.M);
          kx.b((short)106, paramkw.g);
        } 
        break;
      case 98:
        kx.a((short)186, paramkw.C);
        if (paramkw.R != null)
          for (b = 0; b < paramkw.R.length; b++)
            kx.a((short)83, paramkw.R[b]);  
        if (paramkw.Y != null)
          for (b = 0; b < paramkw.Y.length; b++) {
            kx.b((short)114, paramkw.Y[b]);
            kx.b((short)106, paramkw.h[b]);
          }  
        if (paramkw.ah > 0L)
          kx.a((short)132, paramkw.ah); 
        break;
      case 52:
        kx.a((short)208, paramkw.T);
        break;
      case 133:
        if (paramkw.an != null)
          kx.a((short)182, paramkw.an); 
        kx.a((short)183, paramkw.ar);
        kx.a((short)185, paramkw.ap);
        kx.a((short)184, paramkw.aq);
        break;
      case 0:
        kx.a((short)0, paramkw.b);
        kx.a((short)1, paramkw.i);
        break;
    } 
    return kx;
  }
  
  private void x() {
    if (this.q != null) {
      this.q.b = this.v;
      this.q.c = this.w;
      this.q.d = this.x;
    } 
  }
  
  private static void y() {
    synchronized (m) {
      try {
        m.wait();
      } catch (Throwable throwable) {}
      return;
    } 
  }
  
  private void b(kw paramkw) {
    this.o.a(paramkw);
  }
  
  private final void a(kw paramkw, boolean paramBoolean) {
    this.o.a(paramkw);
    d(true);
  }
  
  public final void run() {
    while (!this.n) {
      try {
        ks ks1;
        kw kw;
        String[] arrayOfString;
        byte b;
        switch (this.k) {
          case 4:
            ct.a("[ConnetionHanldle] Disconnecting...");
            ks1.o.c();
            if ((ks1 = this).q != null) {
              ks1.q.b = ks1.v = null;
              ks1.q.c = ks1.w = null;
              ks1.q.d = ks1.x = null;
            } 
            try {
              if (this.q != null)
                this.q.a(); 
              if (this.r != null)
                this.r.a(); 
              if (this.p != null)
                this.p.close(); 
            } catch (Throwable throwable) {}
            this.q = null;
            this.r = null;
            this.p = null;
            this.b = 3;
            this.n = true;
            this.k = 0;
            ct.a(" [ConnetionHanldle] Disconnected!!");
            return;
          case 0:
            y();
          case 1:
            ks1 = this;
            ct.a("[ConnetionHanldle] Opening connection ...");
            if ((arrayOfString = pd.l()) != null)
              ks1.s = arrayOfString; 
            b = 0;
            while (b < ks1.s.length) {
              try {
                ks1.p = g.a(ks1.s[b].trim(), ks1.t);
                ks1.q = new ky(ks1.p.openInputStream());
                ks1.r = new kz(ks1.p.openOutputStream());
                ks1.x();
                String str = ks1.s[0];
                ks1.s[0] = ks1.s[b];
                ks1.s[b] = str;
                pd.a(ks1.s);
                ks1.k = 3;
                ct.a("[ConnetionHanldle] Connected to " + ks1.s[0]);
                if (ks1.v != null);
                break;
              } catch (SecurityException securityException) {
                ks1.k = 0;
                if (ks1.v != null)
                  ks1.v.a(2, "Thiết bị không cho phép kết nối mạng."); 
                ct.a("[ConnetionHanldle] Connection FAIL!!!");
                break;
              } catch (Throwable throwable) {
                ct.a("[ConnetionHanldle] Connection FAIL!!!");
                b++;
              } 
            } 
            if (b >= ks1.s.length) {
              ks1.k = 0;
              if (ks1.v != null)
                ks1.v.a(1, "Không thể kết nối với máy chủ."); 
            } 
          case 2:
            try {
              ct.a(" [ConnetionHanldle] Changing connection ...");
              if (this.q != null)
                this.q.a(); 
              if (this.r != null)
                this.r.a(); 
              if (this.p != null)
                this.p.close(); 
              this.q = null;
              this.r = null;
              this.p = null;
              this.p = g.a(this.s[0].trim(), this.t);
              this.q = new ky(this.p.openInputStream());
              this.r = new kz(this.p.openOutputStream());
              x();
              ct.a("[ConnetionHanldle] Change success to " + this.s[0]);
              pd.a(this.s);
              this.k = 3;
              kw kw1;
              (kw1 = new kw((short)3)).c = go.e;
              b(kw1);
              if (this.v != null)
                this.v.x(); 
              continue;
            } catch (SecurityException securityException) {
              if (this.v != null)
                this.v.a(2, (String)null); 
            } catch (Throwable throwable) {
              if (this.v != null)
                this.v.a(1, (String)null); 
            } 
            this.k = 0;
          case 3:
            if ((kw = (kw)(ks1 = this).o.b()) != null) {
              kx kx = a(kw);
              try {
                this.r.a(kx, kw.a);
              } catch (Throwable throwable) {
                (kw = null).printStackTrace();
                z();
              } 
              continue;
            } 
            y();
        } 
      } catch (Throwable throwable2) {
        Throwable throwable1;
        (throwable1 = null).printStackTrace();
        z();
      } 
    } 
  }
  
  private void z() {
    if (this.k == 0)
      return; 
    if (this.v != null)
      this.v.z(); 
    this.k = 0;
  }
  
  private void d(boolean paramBoolean) {
    if (paramBoolean && this.k != 3 && this.k != 2)
      return; 
    try {
      synchronized (m) {
        m.notify();
        return;
      } 
    } catch (Throwable throwable) {
      return;
    } 
  }
  
  public final void a(kq paramkq) {
    this.v = paramkq;
    if (this.q != null)
      this.q.b = paramkq; 
  }
  
  public final void a(kp paramkp) {
    this.w = paramkp;
    if (this.q != null)
      this.q.c = paramkp; 
  }
  
  public final void a(ko paramko) {
    this.x = paramko;
    if (this.q != null)
      this.q.d = paramko; 
  }
  
  public final void c() {
    long l = System.currentTimeMillis();
    if (this.A == 0L) {
      this.A = l;
    } else {
      this.B++;
      if (this.B >= 100) {
        if (l - this.A <= 3000L && this.v != null)
          this.v.W(); 
        this.B = 0;
        this.A = l;
      } 
    } 
    if (l - this.z >= 30000L) {
      if (this.b == 0) {
        z();
        return;
      } 
      this.b--;
      if (this.k == 3) {
        kw kw = new kw((short)1);
        b(kw);
      } 
      this.z = l;
      d(true);
    } 
  }
  
  public final void a(String paramString) {
    ct.a(paramString);
    if (paramString != null) {
      if (this.v != null)
        this.v.y(); 
      for (byte b = 0; b < this.s.length; b++) {
        if (paramString.equals(this.s[b])) {
          String str = this.s[0];
          this.s[0] = paramString;
          this.s[b] = str;
          break;
        } 
      } 
      if (b >= this.s.length) {
        String[] arrayOfString;
        (arrayOfString = new String[this.s.length + 1])[0] = paramString;
        System.arraycopy(this.s, 0, arrayOfString, 1, this.s.length);
        this.s = arrayOfString;
      } 
      this.k = 2;
      d(false);
      return;
    } 
    if (this.v != null)
      this.v.x(); 
    ks ks1 = this;
    kw kw = new kw((short)3);
    ks1.b(kw);
    ks1.d(true);
  }
  
  final void a(String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    kw kw;
    (kw = new kw((short)4)).c = paramString;
    kw.d = paramArrayOfbyte1;
    kw.m = this.u;
    kw.z = "0.18.0";
    kw.i = System.getProperty("microedition.platform");
    int i = 17;
    for (byte b = 0; b < paramString.length(); b++)
      i = i * 31 + paramString.charAt(b); 
    kw.as = ((paramString = paramString) != null) ? i : -1;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt) {
    ks ks1;
    if ((ks1 = this).k == 0) {
      ks1.k = 1;
      ks1.d(false);
    } 
    this.c = paramString1;
    this.d = paramString2;
    this.u = paramInt;
    kw kw = new kw((short)2);
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt) {
    kw kw;
    (kw = new kw((short)6)).e = paramInt;
    kw.f = -1;
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    kw kw;
    (kw = new kw((short)6)).e = paramInt1;
    kw.f = paramInt2;
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    ct.a("Request installation: resRev=" + paramInt2 + ", offlineResMode=false");
    kw kw;
    (kw = new kw((short)5)).m = paramInt2;
    kw.n = paramInt1;
    kw.o = false;
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt1, int paramInt2, df paramdf1, df paramdf2, df paramdf3) {
    kw kw;
    (kw = new kw((short)8)).p = (byte)paramInt1;
    kw.q = (byte)paramInt2;
    kw.O = new df[3];
    kw.O[0] = paramdf1;
    kw.O[1] = paramdf2;
    kw.O[2] = paramdf3;
    b(kw);
    d(true);
  }
  
  public final void b(String paramString) {
    kw kw;
    (kw = new kw((short)42)).c = paramString;
    b(kw);
    d(true);
  }
  
  public final void a(String[] paramArrayOfString) {
    kw kw;
    (kw = new kw((short)37)).R = paramArrayOfString;
    kw.S = 2;
    b(kw);
    d(true);
  }
  
  public final void b(String[] paramArrayOfString) {
    kw kw;
    (kw = new kw((short)37)).R = paramArrayOfString;
    kw.S = 1;
    b(kw);
    d(true);
  }
  
  public final void c(String[] paramArrayOfString) {
    kw kw;
    (kw = new kw((short)37)).R = paramArrayOfString;
    kw.S = 0;
    b(kw);
    d(true);
  }
  
  public final void d() {
    kw kw;
    (kw = new kw((short)127)).N = 1;
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt, String paramString) {
    kw kw;
    (kw = new kw((short)48)).M = paramInt;
    kw.Q = paramString;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString, byte paramByte) {
    kw kw;
    (kw = new kw((short)9)).c = paramString;
    kw.P = paramByte;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString, int paramInt, byte paramByte) {
    kw kw;
    (kw = new kw((short)9)).ao = 91;
    kw.c = paramString;
    kw.P = 101;
    b(kw);
    d(true);
  }
  
  public final void b(int paramInt) {
    kw kw;
    (kw = new kw((short)30)).q = (byte)paramInt;
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    kw kw;
    (kw = new kw((short)10)).E = paramInt1;
    kw.F = paramInt2;
    kw.G = paramInt3;
    kw.H = paramInt4;
    b(kw);
    d(true);
  }
  
  public final void a(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    kw kw;
    (kw = new kw((short)27)).I = paramArrayOfint1;
    kw.J = paramArrayOfint2;
    b(kw);
    d(true);
  }
  
  public final void c(int paramInt) {
    kw kw;
    (kw = new kw((short)52)).T = (byte)paramInt;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString, int paramInt) {
    kw kw;
    (kw = new kw((short)11)).B = paramString;
    kw.m = paramInt;
    a(kw, true);
  }
  
  public final void c(String paramString) {
    System.out.println("requestCurrentLocation()");
    kw kw;
    (kw = new kw((short)29)).c = paramString;
    a(kw, true);
  }
  
  public final void b(String paramString, int paramInt) {
    kw kw;
    (kw = new kw((short)13)).B = paramString;
    kw.D = paramInt;
    a(kw, true);
  }
  
  public final void d(String paramString) {
    kw kw;
    (kw = new kw((short)43)).B = paramString;
    b(kw);
    d(true);
  }
  
  public final void e(String paramString) {
    kw kw;
    (kw = new kw((short)12)).k = paramString;
    b(kw);
    d(true);
  }
  
  public final void e() {
    kw kw = new kw((short)28);
    b(kw);
    d(true);
  }
  
  public final void a(String paramString, boolean paramBoolean) {
    kw kw;
    (kw = new kw((short)16)).c = paramString;
    kw.L = paramBoolean;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean1, long paramLong, boolean paramBoolean2, boolean paramBoolean3) {
    kw kw;
    (kw = new kw((short)16)).c = paramString1;
    kw.i = paramString2;
    kw.ac = paramBoolean1;
    kw.ad = paramLong;
    kw.ae = paramBoolean2;
    kw.af = paramBoolean3;
    b(kw);
    d(true);
  }
  
  public final void a(boolean paramBoolean, String paramString1, String paramString2) {
    kw kw;
    (kw = new kw((short)17)).l = paramBoolean;
    kw.y = paramString1;
    kw.i = paramString2;
    b(kw);
    d(true);
  }
  
  public final void f() {
    kw kw = new kw((short)126);
    b(kw);
    d(true);
  }
  
  public final void f(String paramString) {
    kw kw;
    (kw = new kw((short)49)).c = paramString;
    kw.ab = true;
    b(kw);
    d(true);
  }
  
  public final void g() {
    kw kw;
    (kw = new kw((short)49)).c = this.c;
    kw.ab = false;
    b(kw);
    d(true);
  }
  
  public final void d(int paramInt) {
    kw kw;
    (kw = new kw((short)14)).y = this.e;
    kw.m = paramInt;
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    kw kw;
    (kw = new kw((short)19)).s = (byte)paramInt1;
    kw.t = (byte)paramInt2;
    kw.u = (byte)paramInt3;
    kw.v = (byte)paramInt4;
    kw.m = paramInt5;
    b(kw);
    d(true);
  }
  
  public final void b(int paramInt1, int paramInt2) {
    kw kw;
    (kw = new kw((short)20)).r = paramInt1;
    kw.m = paramInt2;
    b(kw);
    d(true);
  }
  
  public final void c(int paramInt1, int paramInt2) {
    kw kw;
    (kw = new kw((short)44)).M = paramInt1;
    kw.m = paramInt2;
    b(kw);
    d(true);
  }
  
  public final void h() {
    kw kw;
    (kw = new kw((short)40)).y = this.e;
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3) {
    kw kw;
    (kw = new kw((short)47)).w = paramInt1;
    kw.x = paramInt2;
    kw.m = paramInt3;
    b(kw);
    d(true);
  }
  
  public final void e(int paramInt) {
    kw kw;
    (kw = new kw((short)84)).M = paramInt;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString, long paramLong) {
    kw kw;
    (kw = new kw((short)112)).Q = paramString;
    kw.ah = paramLong;
    b(kw);
    d(true);
  }
  
  public final void g(String paramString) {
    kw kw;
    (kw = new kw((short)112)).aa = paramString;
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt1, int paramInt2, long paramLong) {
    kw kw;
    (kw = new kw((short)112)).M = paramInt1;
    kw.g = paramInt2;
    kw.ah = paramLong;
    b(kw);
    d(true);
  }
  
  public final void h(String paramString) {
    kw kw;
    (kw = new kw((short)113)).aa = paramString;
    b(kw);
    d(true);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3) {
    kw kw;
    (kw = new kw((short)114)).W = 1;
    kw.U = paramInt1;
    kw.X = 10;
    kw.V = paramInt3;
    b(kw);
    d(true);
  }
  
  public final void i() {
    kw kw;
    (kw = new kw((short)114)).W = 0;
    b(kw);
    d(true);
  }
  
  public final void j() {
    kw kw = new kw((short)116);
    b(kw);
    d(true);
  }
  
  public final void i(String paramString) {
    kw kw;
    (kw = new kw((short)115)).aa = paramString;
    b(kw);
    d(true);
  }
  
  public final void f(int paramInt) {
    kw kw;
    (kw = new kw((short)51)).M = paramInt;
    b(kw);
    d(true);
  }
  
  public final void k() {
    kw kw;
    (kw = new kw((short)56)).T = 0;
    b(kw);
    d(true);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    kw kw;
    (kw = new kw((short)56)).T = 1;
    kw.U = paramInt1;
    kw.V = paramInt2;
    b(kw);
    d(true);
  }
  
  public final void a(int[] paramArrayOfint) {
    kw kw;
    (kw = new kw((short)56)).T = 2;
    kw.Z = paramArrayOfint;
    b(kw);
    d(true);
  }
  
  public final void j(String paramString) {
    kw kw;
    (kw = new kw((short)55)).c = paramString;
    kw.T = 0;
    b(kw);
    d(true);
  }
  
  public final void a(boolean paramBoolean) {
    kw kw;
    (kw = new kw((short)55)).l = paramBoolean;
    kw.T = 1;
    kw.ag = (String)this.g.c();
    if (!paramBoolean) {
      this.g.a(this.g.d() - 1);
    } else {
      paramBoolean = false;
      int i = this.g.d() - 1;
      while (paramBoolean < i) {
        kw kw1;
        (kw1 = new kw((short)55)).l = false;
        kw1.T = 1;
        kw1.ag = (String)this.g.b(paramBoolean);
        b(kw1);
        paramBoolean++;
      } 
      this.g.a();
      j = 0;
    } 
    b(kw);
    d(true);
  }
  
  public final void k(String paramString) {
    kw kw;
    (kw = new kw((short)55)).T = 4;
    kw.ag = this.f;
    kw.Q = paramString;
    kw.g = 1;
    b(kw);
    d(true);
  }
  
  public final void l(String paramString) {
    kw kw;
    (kw = new kw((short)55)).T = 4;
    kw.ag = this.f;
    kw.Q = paramString;
    kw.g = 0;
    b(kw);
    d(true);
  }
  
  public final void e(int paramInt1, int paramInt2) {
    kw kw;
    (kw = new kw((short)55)).T = 3;
    kw.ag = this.f;
    kw.M = paramInt1;
    kw.g = paramInt2;
    b(kw);
    d(true);
  }
  
  public final void g(int paramInt) {
    kw kw;
    (kw = new kw((short)55)).T = 2;
    kw.ag = this.f;
    kw.ah = paramInt;
    b(kw);
    d(true);
  }
  
  public final void l() {
    kw kw;
    (kw = new kw((short)55)).T = 5;
    kw.ag = this.f;
    b(kw);
    d(true);
  }
  
  public final void m() {
    kw kw;
    (kw = new kw((short)55)).T = 6;
    kw.ag = this.f;
    b(kw);
    d(true);
  }
  
  public final void n() {
    kw kw;
    (kw = new kw((short)55)).T = 7;
    kw.ag = this.f;
    b(kw);
    d(true);
  }
  
  public final void o() {
    kw kw = new kw((short)31);
    b(kw);
    d(true);
  }
  
  public final void m(String paramString) {
    kw kw;
    (kw = new kw((short)32)).K = paramString;
    b(kw);
    d(true);
  }
  
  public final void n(String paramString) {
    kw kw;
    (kw = new kw((short)41)).K = paramString;
    b(kw);
    d(true);
  }
  
  public final void o(String paramString) {
    kw kw;
    (kw = new kw((short)33)).K = paramString;
    b(kw);
    d(true);
  }
  
  public final void a(String[] paramArrayOfString, String paramString) {
    kw kw;
    (kw = new kw((short)25)).i = paramString;
    kw.j = paramArrayOfString;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString1, String paramString2) {
    kw kw;
    (kw = new kw((short)25)).i = paramString2;
    kw.j = new String[1];
    kw.j[0] = paramString1;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString1, byte[] paramArrayOfbyte, String paramString2, String paramString3, Long paramLong, String paramString4, byte paramByte) {
    kw kw;
    (kw = new kw((short)131)).c = paramString1;
    kw.d = paramArrayOfbyte;
    kw.al = paramString2;
    kw.ai = paramString3;
    kw.am = paramLong;
    kw.an = paramString4;
    kw.p = paramByte;
    b(kw);
    d(true);
  }
  
  public final void p() {
    kw kw = new kw((short)130);
    b(kw);
    d(true);
  }
  
  public final void q() {
    kw kw;
    (kw = new kw((short)129)).T = 1;
    b(kw);
    d(true);
  }
  
  public final void p(String paramString) {
    kw kw;
    (kw = new kw((short)129)).T = 2;
    kw.ai = paramString;
    b(kw);
    d(true);
  }
  
  public final void b(boolean paramBoolean) {
    kw kw;
    (kw = new kw((short)7)).T = 0;
    kw.aj = paramBoolean;
    b(kw);
    d(true);
  }
  
  public final void c(boolean paramBoolean) {
    kw kw;
    (kw = new kw((short)7)).T = 1;
    kw.aj = paramBoolean;
    b(kw);
    d(true);
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2) {
    kw kw;
    (kw = new kw((short)57)).ak = paramInt1;
    kw.B = paramString;
    kw.D = paramInt2;
    b(kw);
    d(true);
  }
  
  public final void r() {
    kw kw = new kw((short)64);
    b(kw);
    d(true);
  }
  
  public final void q(String paramString) {
    kw kw;
    (kw = new kw((short)65)).k = paramString;
    b(kw);
    d(true);
  }
  
  public final void s() {
    ct.a("[ConnetionHanldle] requestMatchReady");
    kw kw;
    (kw = new kw((short)18)).y = this.e;
    b(kw);
    d(true);
  }
  
  public final void t() {
    ct.a("[ConnetionHanldle] requestSyncData");
    kw kw;
    (kw = new kw((short)23)).y = this.e;
    b(kw);
    d(true);
  }
  
  public final void u() {
    kw kw = new kw((short)86);
    b(kw);
    d(true);
  }
  
  public final void f(int paramInt1, int paramInt2) {
    kw kw;
    (kw = new kw((short)83)).M = paramInt1;
    kw.g = paramInt2;
    b(kw);
    d(true);
  }
  
  public final void v() {
    kw kw = new kw((short)99);
    b(kw);
    d(true);
  }
  
  public final void a(String paramString1, byte paramByte, String paramString2) {
    kw kw;
    (kw = new kw((short)100)).C = paramString1;
    kw.A = paramByte;
    kw.Q = paramString2;
    b(kw);
    d(true);
  }
  
  public final void b(String paramString1, byte paramByte, String paramString2) {
    kw kw;
    (kw = new kw((short)97)).C = paramString1;
    kw.A = paramByte;
    kw.Q = paramString2;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString, byte paramByte, int paramInt1, int paramInt2) {
    kw kw;
    (kw = new kw((short)100)).C = paramString;
    kw.A = paramByte;
    kw.M = paramInt1;
    kw.g = paramInt2;
    b(kw);
    d(true);
  }
  
  public final void b(String paramString, byte paramByte, int paramInt1, int paramInt2) {
    kw kw;
    (kw = new kw((short)97)).C = paramString;
    kw.A = paramByte;
    kw.M = paramInt1;
    kw.g = paramInt2;
    b(kw);
    d(true);
  }
  
  public final void a(String paramString, String[] paramArrayOfString, int[] paramArrayOfint1, int[] paramArrayOfint2, long paramLong) {
    kw kw;
    (kw = new kw((short)101)).C = paramString;
    kw.R = paramArrayOfString;
    kw.Y = paramArrayOfint1;
    kw.h = paramArrayOfint2;
    kw.ah = paramLong;
    b(kw);
    d(true);
  }
  
  public final void b(String paramString, String[] paramArrayOfString, int[] paramArrayOfint1, int[] paramArrayOfint2, long paramLong) {
    kw kw;
    (kw = new kw((short)98)).C = paramString;
    kw.R = paramArrayOfString;
    kw.Y = paramArrayOfint1;
    kw.h = paramArrayOfint2;
    kw.ah = paramLong;
    b(kw);
    d(true);
  }
  
  public final void r(String paramString) {
    if (ct.b())
      ct.a("[requestUpgradeEquipment] eqipKey  " + paramString); 
    kw kw;
    (kw = new kw((short)96)).Q = paramString;
    b(kw);
    d(true);
  }
  
  public final void w() {
    kw kw = new kw((short)132);
    b(kw);
    d(true);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4) {
    kw kw;
    (kw = new kw((short)133)).ap = paramString1;
    kw.aq = paramString2;
    kw.ar = paramString3;
    kw.an = paramString4;
    b(kw);
    d(true);
  }
  
  public final void b(int paramInt, String paramString) {
    kw kw;
    (kw = new kw((short)0)).b = (byte)paramInt;
    kw.i = paramString;
    a(kw, true);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ks.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */