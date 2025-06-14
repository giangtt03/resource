import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class du implements eg, Runnable {
  private static du D;
  
  private boolean E = false;
  
  boolean a = false;
  
  boolean b = false;
  
  private String[] F;
  
  private String G = null;
  
  private int H = 0;
  
  private Object I = new Object();
  
  private dv J;
  
  boolean c;
  
  private em K;
  
  private en L;
  
  private a M;
  
  private int N = 3;
  
  boolean d;
  
  boolean e;
  
  String f;
  
  String g;
  
  String h;
  
  short i;
  
  short j;
  
  int k;
  
  byte[] l;
  
  byte[] m;
  
  byte[] n;
  
  private byte[] O;
  
  dz o;
  
  private long P = 0L;
  
  long p = 0L;
  
  private long Q = 0L;
  
  int q = 0;
  
  int r = 0;
  
  int s = 0;
  
  private int R = 0;
  
  int t = 0;
  
  int u;
  
  private int S;
  
  int v;
  
  int w;
  
  private int T;
  
  private int U;
  
  int x;
  
  private long V;
  
  String y;
  
  private short W;
  
  private long X;
  
  short z = 0;
  
  short A = 0;
  
  private SocketConnection Y;
  
  private du() {
    this.G = "1236";
    this.F = eg.B;
    this.c = false;
    this.M = new a(10);
    this.H = 0;
    this.V = 0L;
  }
  
  public static du a() {
    if (D == null)
      D = new du(); 
    return D;
  }
  
  public final void a(dz paramdz) {
    if (this.H == 0) {
      if (this.F == null || this.F.length == 0)
        throw new RuntimeException("No IP address for connection. Please use setIp() to assign array of IP address"); 
      this.H = 1;
    } 
    this.o = paramdz;
    if (!this.E) {
      this.E = true;
      (new Thread(this)).start();
      return;
    } 
    t();
  }
  
  public final void b() {
    this.h = null;
    this.a = false;
    this.c = false;
    this.b = false;
    this.H = 0;
    this.M.a();
    if (this.K != null) {
      this.K.a();
      this.K = null;
    } 
    if (this.L != null) {
      this.L.a();
      this.L = null;
    } 
    if (this.Y != null)
      try {
        this.Y.close();
        return;
      } catch (Exception exception) {} 
  }
  
  public final void c() {
    b();
    this.E = false;
    t();
    D = null;
    System.gc();
  }
  
  private void t() {
    try {
      synchronized (this.I) {
        this.I.notify();
        return;
      } 
    } catch (Throwable throwable) {
      return;
    } 
  }
  
  final void d() {
    b();
    this.b = true;
    this.H = 4;
    t();
  }
  
  public final void run() {
    while (this.E) {
      try {
        short s;
        switch (this.H) {
          case 0:
            synchronized (this.I) {
              try {
                this.I.wait();
              } catch (Throwable throwable) {}
            } 
          case 4:
            s = 0;
            while (s < this.F.length) {
              try {
                ct.a("[OLA] Reconnecting to " + this.F[s]);
                this.Y = (SocketConnection)Connector.open("socket://" + this.F[s].trim() + ":" + this.G);
                this.Y.setSocketOption((byte)1, 5);
                this.K = new em(this.Y.openInputStream());
                this.L = new en(this.Y.openOutputStream());
                if (this.J != null) {
                  this.K.a(this.J);
                  this.L.a(this.J);
                } 
                String str = this.F[0];
                this.F[0] = this.F[s];
                this.F[s] = str;
                this.H = 2;
                u();
                break;
              } catch (SecurityException securityException) {
                this.H = 0;
                if (this.J != null)
                  this.J.a(31, (String)null, (short)0); 
                break;
              } catch (Throwable throwable) {
                s++;
              } 
            } 
            if (s >= this.F.length) {
              this.H = 0;
              if (this.J != null)
                this.J.a(1, (String)null, (short)0); 
            } 
          case 1:
            s = 0;
            while (s < this.F.length) {
              try {
                String str1 = this.F[s].trim();
                if (this.J != null)
                  this.J.i_(); 
                ct.a("[OLA] Connect to " + this.F[s]);
                this.Y = (SocketConnection)Connector.open("socket://" + str1 + ":" + this.G);
                this.Y.setSocketOption((byte)1, 5);
                this.K = new em(this.Y.openInputStream());
                this.L = new en(this.Y.openOutputStream());
                if (this.J != null) {
                  this.K.a(this.J);
                  this.L.a(this.J);
                } 
                String str2 = this.F[0];
                this.F[0] = this.F[s];
                this.F[s] = str2;
                this.H = 2;
                u();
                break;
              } catch (SecurityException securityException) {
                this.H = 0;
                if (this.J != null)
                  this.J.a(31, (String)null, (short)0); 
                break;
              } catch (Throwable throwable) {
                s++;
              } 
            } 
            if (s >= this.F.length) {
              this.H = 0;
              if (this.J != null)
                this.J.a(1, (String)null, (short)0); 
            } 
          case 3:
            s = 0;
            while (s < this.F.length) {
              try {
                ct.a("[OLA] Changing to " + this.F[s]);
                String str1 = this.F[s].trim();
                if (this.J != null)
                  this.J.i_(); 
                this.Y = (SocketConnection)Connector.open("socket://" + str1 + ":" + this.G);
                this.Y.setSocketOption((byte)1, 5);
                this.K = new em(this.Y.openInputStream());
                this.L = new en(this.Y.openOutputStream());
                if (this.J != null) {
                  this.K.a(this.J);
                  this.L.a(this.J);
                } 
                String str2 = this.F[0];
                this.F[0] = this.F[s];
                this.F[s] = str2;
                this.H = 2;
                ct.a("[OLA] Connect success to " + this.F[s]);
                v();
                break;
              } catch (SecurityException securityException) {
                this.H = 0;
                if (this.J != null)
                  this.J.a(31, (String)null, (short)0); 
                break;
              } catch (Throwable throwable) {
                s++;
              } 
            } 
            if (s >= this.F.length) {
              this.H = 0;
              if (this.J != null)
                this.J.a(1, (String)null, (short)0); 
            } 
          case 2:
            if (this.M.d() > 0) {
              eh eh4;
              du du1;
              eh eh3;
              String str1;
              eh eh2;
              el el3;
              eh eh5;
              el el2;
              String str3;
              el el4;
              String str2;
              byte b;
              String str4;
              String str5;
              String str7;
              long l1;
              String str6;
              short s1;
              String str9;
              long l2;
              String str8;
              String str10;
              eh eh1 = (eh)this.M.a(0);
              el el1 = new el();
              switch (s = eh1.C) {
                case 95:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)52, "5.1.2");
                  el3.a((short)38, eh4.D);
                  el3.a((short)61, eh4.c);
                  if (eh4.o != null)
                    el3.a((short)94, eh4.o); 
                  el3.a((short)50, eh4.d);
                  if (eh4.a != null)
                    el3.a((short)86, eh4.a); 
                  el3.a((short)51, String.valueOf(String.valueOf(eh4.x)) + "x" + String.valueOf(eh4.y));
                  if (eh4.p != null)
                    el3.a((short)14, eh4.p); 
                  break;
                case 96:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)52, "5.1.2");
                  el3.a((short)38, eh4.D);
                  el3.a((short)61, eh4.c);
                  if (eh4.o != null)
                    el3.a((short)94, eh4.o); 
                  el3.a((short)50, eh4.d);
                  if (eh4.a != null)
                    el3.a((short)86, eh4.a); 
                  el3.a((short)51, String.valueOf(String.valueOf(eh4.x)) + "x" + String.valueOf(eh4.y));
                  if (eh4.p != null)
                    el3.a((short)14, eh4.p); 
                  break;
                case 97:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)2, eh4.b);
                  el3.a((short)43, eh4.M);
                  el3.a((short)12, (byte)eh4.E);
                  el3.a((short)52, eh4.f);
                  el3.a((short)38, (byte)eh4.D);
                  el3.a((short)61, eh4.c);
                  if (eh4.o != null)
                    el3.a((short)94, eh4.o); 
                  if (eh4.d != null)
                    el3.a((short)50, eh4.d); 
                  if (eh4.a != null)
                    el3.a((short)86, eh4.a); 
                  el3.a((short)51, String.valueOf(eh4.x) + "x" + eh4.y);
                  if (eh4.p != null)
                    el3.a((short)14, eh4.p); 
                  if (eh4.n != null) {
                    el3.a((short)79, eh4.n);
                    break;
                  } 
                  str3 = g.a();
                  str7 = g.b();
                  str9 = g.c();
                  str10 = g.d();
                  if (str3 != null)
                    el3.a((short)81, str3); 
                  if (str7 != null)
                    el3.a((short)82, str7); 
                  if (str10 != null)
                    el3.a((short)80, str10); 
                  if (str9 != null)
                    el3.a((short)79, str9); 
                  break;
                case 14:
                  el3 = el1;
                  if ((eh4 = eh1).J > 0)
                    el3.a((short)220, (byte)eh4.J); 
                  el3.a((short)7, eh4.h);
                  el3.a((short)8, eh4.g);
                  if (!i.a(eh4.q))
                    el3.a((short)109, eh4.q); 
                  break;
                case 50:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)7, eh4.j);
                  if (eh4.K != 0)
                    el3.a((short)255, (byte)eh4.K); 
                  break;
                case 54:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)7, eh4.j);
                  if (!i.a((String)null))
                    el3.a((short)22, (String)null); 
                  break;
                case 55:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)7, eh4.j);
                  el3.a((short)62, (byte)0);
                  break;
                case 65:
                  el3 = el1;
                  if ((eh4 = eh1).j != null)
                    el3.a((short)7, eh4.j); 
                  el3.a((short)30, eh4.m);
                  break;
                case 66:
                  el3 = el1;
                  if ((eh4 = eh1).B != 0)
                    el3.a((short)124, eh4.B); 
                  break;
                case 44:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)7, eh4.j);
                  break;
                case 21:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)12, (byte)eh4.E);
                  if (!i.a(str3 = eh4.k))
                    el3.a((short)13, str3); 
                  if (!eh4.Q)
                    el3.a((short)10, new byte[] { 1 }); 
                  break;
                case 23:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)200, eh4.u);
                  el3.a((short)204, eh4.A);
                  break;
                case 25:
                  el3 = el1;
                  if ((eh4 = eh1).K != 0)
                    el3.a((short)255, (byte)eh4.K); 
                  el3.a((short)43, eh4.M);
                  el3.a((short)46, (byte[])null);
                  break;
                case 115:
                  el3 = el1;
                  if ((eh4 = eh1).l == null) {
                    el3.a((short)214, (short)eh4.A);
                    break;
                  } 
                  el3.a((short)218, eh4.B);
                  break;
                case 9:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)39, eh4.B);
                  el3.a((short)53, (byte)0);
                  break;
                case 11:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)7, eh4.j);
                  if (eh4.K != 0)
                    el3.a((short)255, (byte)eh4.K); 
                  break;
                case 12:
                  el3 = el1;
                  if ((str3 = (eh4 = eh1).e) != null)
                    el3.a((short)4, str3); 
                  if (eh4.N != null) {
                    el3.a((short)23, eh4.N);
                    break;
                  } 
                  if (eh4.l != null)
                    el3.a((short)24, eh4.l); 
                  break;
                case 15:
                  a(eh1, el1);
                  break;
                case 16:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)7, eh4.j);
                  if (eh4.i != null)
                    el3.a((short)21, eh4.i); 
                  break;
                case 17:
                  el3 = el1;
                  eh4 = eh1;
                  el3.a((short)21, eh4.i);
                  break;
                case 103:
                  el3 = el1;
                  if ((str3 = (eh4 = eh1).j) != null)
                    el3.a((short)7, str3.toLowerCase()); 
                  l1 = eh4.v;
                  if (0L != l1)
                    el3.a((short)72, l1); 
                  if (eh4.K != 0)
                    el3.a((short)255, (byte)eh4.K); 
                  break;
                case 116:
                  el3 = el1;
                  if ((str3 = (eh4 = eh1).m) != null)
                    el3.a((short)30, str3); 
                  if (eh4.K != 0)
                    el3.a((short)255, (byte)eh4.K); 
                  break;
                case 124:
                  if (eh1.K != 0)
                    el1.a((short)255, (byte)eh1.K); 
                  break;
                case 125:
                  el4 = el1;
                  eh5 = eh1;
                  du1 = this;
                  if (!eh5.j.toLowerCase().equals(du1.f.toLowerCase()))
                    el4.a((short)7, eh5.j); 
                  el4.a((short)205, eh5.A);
                  el4.a((short)45, (byte)eh5.F);
                  break;
                case 106:
                  el2 = el1;
                  if ((str2 = (eh3 = eh1).g) != null)
                    el2.a((short)8, str2); 
                  if ((str6 = eh3.l) != null)
                    el2.a((short)24, str6); 
                  if (eh3.L != 0)
                    el2.a((short)12, (byte)eh3.L); 
                  if (eh3.J != 0)
                    el2.a((short)220, (byte)eh3.J); 
                  if ((l2 = eh3.v) != 0L)
                    el2.a((short)72, l2); 
                  str2 = g.a();
                  str4 = g.b();
                  str1 = g.c();
                  str5 = g.d();
                  if (str2 != null && str4 != null && str1 != null && str5 != null) {
                    el2.a((short)81, str2);
                    el2.a((short)82, str4);
                    el2.a((short)79, str1);
                    el2.a((short)80, str5);
                  } 
                  break;
                case 109:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)7, eh2.j);
                  el2.a((short)209, eh2.O);
                  break;
                case 111:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)72, eh2.v);
                  break;
                case 114:
                  el2 = el1;
                  if ((str2 = (eh2 = eh1).l) != null) {
                    el2.a((short)24, str2);
                  } else {
                    el2.a((short)214, (short)eh2.A);
                  } 
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 39:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)7, eh2.h);
                  el2.a((short)24, eh2.l);
                  if (!i.a(eh2.q))
                    el2.a((short)109, eh2.q); 
                  break;
                case 104:
                  el2 = el1;
                  str2 = (eh2 = eh1).j;
                  s1 = eh2.H;
                  str8 = eh2.g;
                  if (str2 != null)
                    el2.a((short)7, str2); 
                  if (s1 != 0)
                    el2.a((short)66, (byte)s1); 
                  if (str8 != null)
                    el2.a((short)8, str8); 
                  break;
                case 130:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)20, (byte)0);
                  break;
                case 131:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)20, (byte)0);
                  el2.a((short)7, eh2.j);
                  break;
                case 132:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)20, (byte)0);
                  el2.a((short)7, eh2.j);
                  break;
                case 133:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)20, (byte)0);
                  break;
                case 134:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)4, eh2.e);
                  break;
                case 135:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)4, eh2.e);
                  break;
                case 193:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)4, eh2.e);
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 194:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)72, eh2.v);
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 199:
                  el2 = el1;
                  if ((eh2 = eh1).q != null)
                    el2.a((short)109, eh2.q); 
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 147:
                  el2 = el1;
                  if ((eh2 = eh1).j != null)
                    el2.a((short)7, eh2.j); 
                  break;
                case 148:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)114, (byte)eh2.E);
                  break;
                case 149:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)110, eh2.j);
                  el2.a((short)114, (byte)0);
                  break;
                case 150:
                  el1.a((short)110, eh1.j);
                  break;
                case 158:
                  el2 = el1;
                  if ((eh2 = eh1).K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  if (eh2.j != null)
                    el2.a((short)7, eh2.j); 
                  el2.a((short)22, (String)null);
                  break;
                case 159:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)7, eh2.j);
                  el2.a((short)129, (String)null);
                  break;
                case 160:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)129, (String)null);
                  el2.a((short)12, (byte)eh2.E);
                  break;
                case 162:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)129, (String)null);
                  if (eh2.g != null)
                    el2.a((short)8, eh2.g); 
                  if (eh2.J != 0)
                    el2.a((short)220, (byte)eh2.J); 
                  if (!i.a(eh2.q))
                    el2.a((short)109, eh2.q); 
                  break;
                case 163:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)129, (String)null);
                  el2.a((short)24, eh2.l);
                  if (!i.a(eh2.q))
                    el2.a((short)109, eh2.q); 
                  break;
                case 164:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)39, eh2.B);
                  break;
                case 165:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)129, (String)null);
                  break;
                case 166:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)7, eh2.j);
                  el2.a((short)110, (String)null);
                  if (0L != 0L)
                    el2.a((short)130, 0L); 
                  if (0L != 0L)
                    el2.a((short)59, 0L); 
                  break;
                case 167:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)111, eh2.j);
                  el2.a((short)114, eh2.P);
                  break;
                case 169:
                  if (0L != 0L)
                    el1.a((short)9, 0L); 
                  if (eh1.K != 0)
                    el1.a((short)255, (byte)eh1.K); 
                  break;
                case 170:
                  el1.a((short)109, eh1.j);
                  break;
                case 171:
                  el2 = el1;
                  if ((eh2 = eh1).j != null)
                    el2.a((short)7, eh2.j); 
                  el2.a((short)115, eh2.P);
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 175:
                  el2 = el1;
                  if ((eh2 = eh1).K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 172:
                  el2 = el1;
                  if ((eh2 = eh1).g != null)
                    el2.a((short)8, eh2.g); 
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 173:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)110, eh2.j);
                  el2.a((short)114, (byte)0);
                  break;
                case 161:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)129, (String)null);
                  break;
                case 113:
                  el2 = el1;
                  if ((b = (eh2 = eh1).P) == 1) {
                    el2.a((short)213, m.a((short)eh2.A));
                    el2.a((short)212, eh2.P);
                    el2.a((short)37, 0);
                    el2.a((short)68, (byte)0);
                    str8 = g.a();
                    str10 = g.b();
                    String str = g.c();
                    str4 = g.d();
                    if (str8 != null && str10 != null && str != null && str4 != null) {
                      el2.a((short)81, str8);
                      el2.a((short)82, str10);
                      el2.a((short)79, str);
                      el2.a((short)80, str4);
                    } 
                  } else {
                    el2.a((short)214, m.a((short)eh2.A));
                    el2.a((short)23, eh2.N);
                  } 
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 101:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)200, eh2.u);
                  el2.a((short)204, eh2.z);
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 102:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)65, eh2.t);
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 20:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)21, eh2.i);
                  el2.a((short)26, (String)null);
                  break;
                case 18:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)21, eh2.i);
                  break;
                case 19:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)7, eh2.j);
                  el2.a((short)21, eh2.i);
                  break;
                case 91:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)72, eh2.v);
                  if (eh2.E != 0)
                    el2.a((short)90, (byte)eh2.E); 
                  break;
                case 92:
                  el2 = el1;
                  eh2 = eh1;
                  el2.a((short)108, eh2.w);
                  if (eh2.v != 0L)
                    el2.a((short)72, eh2.v); 
                  if (eh2.K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  break;
                case 79:
                  el2 = el1;
                  if ((eh2 = eh1).j != null)
                    el2.a((short)7, eh2.j); 
                  if (eh2.q != null)
                    el2.a((short)109, eh2.q); 
                  el2.a((short)114, (byte)0);
                  break;
                case 80:
                  el2 = el1;
                  if ((eh2 = eh1).K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  el2.a((short)114, (byte)0);
                  el2.a((short)109, eh2.q);
                  break;
                case 82:
                  el2 = el1;
                  if ((eh2 = eh1).K != 0)
                    el2.a((short)255, (byte)eh2.K); 
                  el2.a((short)109, eh2.q);
                  break;
              } 
              try {
                this.L.a(el1, s);
              } catch (Exception exception) {
                this.M.a(eh1);
              } 
              continue;
            } 
            synchronized (this.I) {
              try {
                this.I.wait();
              } catch (Throwable throwable) {}
            } 
        } 
      } catch (Exception exception) {}
    } 
  }
  
  private static void a(eh parameh, el paramel) {
    paramel.a((short)21, parameh.i);
    for (byte b = 0; b < parameh.r.length; b++) {
      paramel.a((short)7, ds.e(parameh.r[b]));
      if (parameh.s != null && !i.a(parameh.s[b]))
        paramel.a((short)22, parameh.s[b]); 
    } 
  }
  
  public final void a(dv paramdv) {
    this.J = paramdv;
    if (this.K != null)
      this.K.a(paramdv); 
    if (this.L != null)
      this.L.a(paramdv); 
  }
  
  public final void a(String paramString1, String paramString2, short paramShort) {
    this.b = false;
    if (!this.a)
      throw new RuntimeException("Connection is not READY. Please wait until ChatConnectionListener with method notifyConnected returns"); 
    if (!i.a(paramString1) && !i.b(paramString2)) {
      this.f = paramString1.toLowerCase().trim();
      this.g = paramString2;
      this.i = paramShort;
      e();
    } 
  }
  
  private void u() {
    if (this.o == null)
      throw new RuntimeException("There's no device information. Please call setDevice before start connection"); 
    eh eh;
    (eh = new eh((short)95)).D = 0;
    eh.c = this.o.b;
    eh.o = null;
    eh.d = this.o.a;
    eh.a = this.o.d;
    eh.x = this.o.e;
    eh.y = this.o.f;
    eh.p = this.o.c;
    this.M.a(eh);
  }
  
  final void a(String paramString) {
    if (paramString != null) {
      if (this.K != null) {
        this.K.a();
        this.K = null;
      } 
      if (this.L != null) {
        this.L.a();
        this.L = null;
      } 
      this.H = 3;
      if (this.F == null) {
        this.F = new String[] { paramString };
      } else {
        for (byte b = 0; b < this.F.length; b++) {
          if (i.a(paramString, this.F[b])) {
            String str = this.F[0];
            this.F[0] = paramString;
            this.F[b] = str;
            break;
          } 
        } 
        if (b >= this.F.length) {
          String[] arrayOfString = new String[this.F.length + 1];
          System.arraycopy(this.F, 0, arrayOfString, 1, this.F.length);
          arrayOfString[0] = paramString;
          this.F = arrayOfString;
        } 
      } 
      if (this.J != null && !this.b);
      t();
      return;
    } 
    v();
  }
  
  private void v() {
    ct.a("[OLA] Request Authentication");
    eh eh;
    (eh = new eh((short)96)).D = 0;
    eh.c = this.o.b;
    eh.o = null;
    eh.d = this.o.a;
    eh.a = this.o.d;
    eh.x = this.o.e;
    eh.y = this.o.f;
    eh.p = this.o.c;
    this.M.a(eh);
    t();
  }
  
  final void e() {
    ct.a("[OLA] Submit Authentication");
    if (this.J != null && !this.b);
    this.l = j.a(this.m, this.g);
    eh eh;
    (eh = new eh((short)97)).E = this.i;
    eh.b = this.f;
    eh.M = this.l;
    eh.D = 0;
    eh.c = this.o.b;
    eh.f = "5.1.2";
    eh.o = null;
    eh.d = this.o.a;
    eh.a = this.o.d;
    eh.x = this.o.e;
    eh.y = this.o.f;
    eh.p = this.o.c;
    if (!i.b((String)null))
      if (!i.b((String)null))
        eh.n = String.valueOf((Object)null) + " " + null;  
    this.M.a(eh);
    t();
  }
  
  final void f() {
    this.N = 3;
    this.P = 0L;
  }
  
  public final void g() {
    if (this.c) {
      long l1;
      if ((l1 = System.currentTimeMillis()) - this.P >= 120000L) {
        if (this.N == 0) {
          d();
          return;
        } 
        this.N--;
        if (this.H == 2) {
          eh eh = new eh((short)42);
          this.M.a(eh);
        } 
        this.P = l1;
        t();
      } 
      du du1 = this;
      long l2;
      if ((l2 = System.currentTimeMillis()) - du1.Q >= 300000L) {
        du1.Q = System.currentTimeMillis();
        eh eh = new eh((short)168);
        du1.M.a(eh);
        du1.t();
      } 
    } 
  }
  
  final void h() {
    this.N = 3;
  }
  
  public final void a(int paramInt) {
    eh eh;
    (eh = new eh((short)9)).B = paramInt;
    eh.G = 0;
    this.M.a(eh);
    t();
  }
  
  public final void i() {
    eh eh = new eh((short)140);
    this.M.a(eh);
    t();
  }
  
  public final void a(String paramString1, String paramString2, String paramString3) {
    a(paramString1, paramString2, (String)null, (short)0);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, short paramShort) {
    if (paramString1 == null)
      throw new RuntimeException("Null receiver Id"); 
    eh eh = new eh((short)14);
    if (paramShort > 0)
      eh.J = paramShort; 
    eh.h = ds.e(paramString1);
    eh.g = paramString2;
    if (!i.a(paramString3))
      eh.q = "id=" + paramString3; 
    this.M.a(eh);
    t();
  }
  
  public final void b(String paramString) {
    eh eh;
    (eh = new eh((short)44)).j = ds.e(paramString);
    this.M.a(eh);
    t();
  }
  
  private void a(short paramShort, String paramString, boolean paramBoolean) {
    this.h = paramString;
    this.i = paramShort;
    eh eh;
    (eh = new eh((short)21)).E = paramShort;
    if (!i.a(paramString)) {
      this.i = 2;
      eh.k = paramString;
      eh.E = this.i;
    } else {
      this.h = null;
    } 
    eh.Q = true;
    this.M.a(eh);
    t();
  }
  
  public final void c(String paramString) {
    a((short)2, paramString, true);
  }
  
  public final void a(short paramShort) {
    a(paramShort, (String)null, true);
  }
  
  public final void j() {
    eh eh = new eh((short)6);
    this.M.a(eh);
    t();
  }
  
  public final void b(int paramInt) {
    this.q = 0;
    this.R = 0;
    this.t = 0;
    this.X = 0L;
    this.r = 0;
    this.q = 0;
    eh eh;
    (eh = new eh((short)115)).l = "Test";
    eh.B = paramInt;
    this.M.a(eh);
    t();
  }
  
  final void c(int paramInt) {
    this.R++;
    if (paramInt > 0) {
      if (this.R % 9 == 0) {
        long l;
        if ((l = System.currentTimeMillis()) - this.X <= 1000L)
          try {
            Thread.sleep(1000L);
          } catch (Throwable throwable2) {
            Throwable throwable1;
            (throwable1 = null).printStackTrace();
          }  
        this.X = System.currentTimeMillis();
      } 
    } else {
      this.X = System.currentTimeMillis();
    } 
    eh eh = new eh((short)115);
    this.t = paramInt + 1;
    eh.A = this.t;
    this.M.a(eh);
    t();
  }
  
  public final void a(String paramString1, String paramString2) {
    (new String[1])[0] = paramString2;
    paramString1 = null;
    String[] arrayOfString1 = new String[1];
    paramString2 = paramString1;
    du du1 = this;
    String[] arrayOfString2;
    if (!(((arrayOfString2 = arrayOfString1) == null || arrayOfString2.length == 0) ? 1 : 0)) {
      eh eh;
      (eh = new eh((short)15)).i = paramString2;
      eh.r = arrayOfString1;
      eh.s = null;
      du1.M.a(eh);
      du1.t();
    } 
  }
  
  public final void a(String paramString, long paramLong, short paramShort) {
    eh eh;
    (eh = new eh((short)103)).j = paramString;
    eh.v = paramLong;
    eh.K = paramShort;
    this.z = paramShort;
    this.M.a(eh);
    t();
  }
  
  public final void a(long paramLong1, long paramLong2, short paramShort) {
    eh eh;
    (eh = new eh((short)92)).v = paramLong2;
    eh.w = paramLong1;
    this.p = paramLong1;
    eh.K = paramShort;
    this.z = paramShort;
    this.M.a(eh);
    t();
  }
  
  public final void a(long paramLong, short paramShort) {
    eh eh;
    (eh = new eh((short)91)).v = paramLong;
    eh.E = paramShort;
    this.M.a(eh);
    t();
  }
  
  public final void b(String paramString1, String paramString2, short paramShort) {
    a(paramString1, 0L, paramString2, (short)0, paramShort);
  }
  
  public final void a(String paramString1, long paramLong, String paramString2, short paramShort) {
    a(paramString1, paramLong, null, (short)1, paramShort);
  }
  
  private void a(String paramString1, long paramLong, String paramString2, short paramShort1, short paramShort2) {
    eh eh;
    (eh = new eh((short)106)).g = paramString1;
    eh.v = paramLong;
    eh.l = paramString2;
    eh.L = paramShort1;
    eh.J = paramShort2;
    this.M.a(eh);
    t();
  }
  
  final void b(String paramString1, String paramString2) {
    byte[] arrayOfByte;
    if (i.a(paramString2))
      return; 
    eh eh = new eh((short)109);
    try {
      arrayOfByte = i.c(paramString2, null);
    } catch (Exception exception) {
      arrayOfByte = paramString2.getBytes();
    } 
    if (arrayOfByte != null) {
      byte[] arrayOfByte1;
      (arrayOfByte1 = new byte[arrayOfByte.length + 1])[0] = 5;
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, 1, arrayOfByte.length);
      eh.j = paramString1;
      eh.O = arrayOfByte1;
      this.M.a(eh);
      t();
    } 
  }
  
  public final void a(long paramLong) {
    eh eh;
    (eh = new eh((short)111)).v = paramLong;
    this.M.a(eh);
    t();
  }
  
  public final void a(String paramString, short paramShort) {
    eh eh;
    (eh = new eh((short)116)).m = paramString;
    eh.K = paramShort;
    this.M.a(eh);
    this.A = paramShort;
    t();
  }
  
  public final void b(String paramString, short paramShort) {
    if (this.d) {
      this.J.c_();
      return;
    } 
    du du1;
    (du1 = this).d = true;
    du1.n = null;
    du1.u = 0;
    du1.w = 0;
    du1.U = 0;
    du1.v = 0;
    du1.J.a(du1.u, du1.w);
    this.y = paramString;
    this.W = paramShort;
    eh eh;
    (eh = new eh((short)114)).l = paramString;
    eh.K = this.W;
    this.M.a(eh);
    t();
  }
  
  public final void c(String paramString, short paramShort) {
    l();
    this.y = null;
    this.W = paramShort;
    eh eh;
    (eh = new eh((short)114)).l = null;
    eh.K = this.W;
    this.M.a(eh);
    t();
  }
  
  public final void k() {
    d(0);
  }
  
  final void d(int paramInt) {
    int i = paramInt;
    du du1;
    if ((du1 = this).d) {
      du1.U++;
      du1.J.a(du1.u, du1.w);
      if (i > 0) {
        if (du1.U % 9 == 0) {
          long l;
          if ((l = System.currentTimeMillis()) - du1.V <= 1000L)
            try {
              Thread.sleep(1000L);
            } catch (Throwable throwable2) {
              Throwable throwable1;
              (throwable1 = null).printStackTrace();
            }  
          du1.V = System.currentTimeMillis();
        } 
      } else {
        du1.V = System.currentTimeMillis();
      } 
    } 
    eh eh = new eh((short)114);
    this.v = paramInt + 1;
    eh.A = this.v;
    eh.K = this.W;
    this.M.a(eh);
    t();
  }
  
  public final void l() {
    this.y = null;
    this.d = false;
    this.n = null;
    this.u = 0;
    this.w = 0;
    this.W = 0;
  }
  
  public final void m() {
    this.e = false;
    this.O = null;
    this.S = 0;
    this.T = 0;
  }
  
  public final void b(String paramString1, String paramString2, String paramString3) {
    eh eh;
    (eh = new eh((short)39)).h = ds.e(paramString1);
    eh.l = paramString3;
    if (!i.a((String)null))
      eh.q = "id=" + null; 
    this.M.a(eh);
    t();
  }
  
  private void a(String paramString1, short paramShort, String paramString2) {
    eh eh;
    (eh = new eh((short)104)).j = ds.e(paramString1);
    eh.H = paramShort;
    eh.g = null;
    this.M.a(eh);
    t();
  }
  
  public final void d(String paramString) {
    a(paramString, (short)1, (String)null);
  }
  
  public final void e(String paramString) {
    a(paramString, (short)0, (String)null);
    if (this.J != null);
  }
  
  public final void n() {
    eh eh = new eh((short)100);
    this.M.a(eh);
    t();
  }
  
  public final void a(long paramLong, int paramInt) {
    eh eh;
    (eh = new eh((short)101)).u = paramLong;
    eh.z = paramInt;
    this.M.a(eh);
    t();
  }
  
  public final void b(long paramLong) {
    eh eh;
    (eh = new eh((short)102)).t = paramLong;
    this.M.a(eh);
    t();
  }
  
  public final void o() {
    eh eh = new eh((short)128);
    this.M.a(eh);
    t();
  }
  
  public final void b(short paramShort) {
    eh eh;
    (eh = new eh((short)124)).K = 2412;
    this.M.a(eh);
    t();
  }
  
  public final void a(String paramString, int paramInt, short paramShort) {
    eh eh;
    (eh = new eh((short)125)).j = ds.e(paramString);
    eh.A = paramInt;
    eh.F = paramShort;
    this.M.a(eh);
    t();
  }
  
  public final void f(String paramString) {
    if (i.a(paramString))
      return; 
    eh eh;
    (eh = new eh((short)134)).e = paramString;
    this.M.a(eh);
    t();
  }
  
  public final void g(String paramString) {
    if (i.a(paramString))
      return; 
    eh eh;
    (eh = new eh((short)135)).e = paramString;
    this.M.a(eh);
    t();
  }
  
  public final void p() {
    eh eh = new eh((short)136);
    this.M.a(eh);
    t();
  }
  
  public final void q() {
    eh eh = new eh((short)35);
    this.M.a(eh);
    t();
  }
  
  public final void r() {
    eh eh = new eh((short)137);
    this.M.a(eh);
    t();
  }
  
  public final void s() {
    eh eh = new eh((short)138);
    this.M.a(eh);
    t();
  }
  
  public final void c(String paramString1, String paramString2) {
    eh eh;
    (eh = new eh((short)65)).j = paramString2;
    eh.m = paramString1;
    this.M.a(eh);
    t();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\du.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */