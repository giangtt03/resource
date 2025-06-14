import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public final class pa implements il, Runnable {
  private static int a = 2;
  
  private static pa b;
  
  private u c;
  
  private a d;
  
  private int e = pd.F();
  
  private final Object f = new Object();
  
  private ik g;
  
  private ij h;
  
  private jn i;
  
  private int[] j;
  
  private byte[][] k;
  
  private int l;
  
  private int m;
  
  private pb n;
  
  private boolean o = false;
  
  private int p;
  
  private boolean q;
  
  private int r;
  
  private boolean s = false;
  
  private int t;
  
  private long u = 0L;
  
  private long v = 0L;
  
  private boolean w = false;
  
  private boolean x = false;
  
  private int y = 0;
  
  public static pa a() {
    if (b == null)
      b = new pa(); 
    return b;
  }
  
  protected pa() {
    if (v.ah || gr.j) {
      this.r = 180000;
      a = 1;
    } else {
      this.r = Integer.MAX_VALUE;
      a = 2;
    } 
    h();
    this.n = new pb(this);
    ks.a().a(this.n);
    Thread thread;
    (thread = new Thread(this)).setPriority(10);
    thread.start();
  }
  
  private boolean f() {
    MGMIDlet mGMIDlet;
    long l = System.currentTimeMillis();
    for (int i = 0; i < this.d.d(); i++) {
      u u1;
      int j;
      if ((j = (u1 = (u)this.d.b(i)).a()) < 0) {
        if (!gr.j && j == -2) {
          b();
          String[] arrayOfString;
          if ((arrayOfString = RecordStore.listRecordStores()) != null)
            for (byte b = 0; b < arrayOfString.length; b++) {
              if (arrayOfString[b] != null && (i = arrayOfString[b].indexOf("installcacher")) >= 0)
                g.b(arrayOfString[b]); 
            }  
          pd.d(0);
          pd.h(0);
          pd.o();
          pd.s();
          (mGMIDlet = MGMIDlet.d()).notifyDestroyed();
          return false;
        } 
        b(j);
        return false;
      } 
    } 
    this.u += System.currentTimeMillis() - mGMIDlet;
    return true;
  }
  
  private static void b(int paramInt) {
    if (paramInt == -2) {
      a.s().j(2);
      return;
    } 
    if (paramInt < 0)
      a.s().j(3); 
  }
  
  public final void b() {
    if (this.d == null)
      return; 
    for (byte b = 0; b < this.d.d(); b++) {
      u u1;
      if ((u1 = (u)this.d.b(b)) != null)
        u1.d(); 
    } 
  }
  
  public final void c() {
    if (this.d == null)
      return; 
    for (byte b = 0; b < this.d.d(); b++) {
      u u1;
      if ((u1 = (u)this.d.b(b)) != null)
        u.a(u1); 
    } 
  }
  
  private u a(u paramu, int paramInt, byte[] paramArrayOfbyte) {
    long l = System.currentTimeMillis();
    byte b = 0;
    while (b < this.d.d()) {
      boolean bool1;
      u u2;
      if (!(u2 = (u)this.d.b(b)).equals(paramu) && u2.c(paramInt)) {
        if (bool1 = u2.a(paramInt, paramArrayOfbyte))
          return paramu; 
        break;
      } 
      bool1++;
    } 
    this.v += System.currentTimeMillis() - l;
    boolean bool;
    if (paramu.c() < 300 && (bool = paramu.a(paramInt, paramArrayOfbyte)))
      return paramu; 
    u u1;
    (u1 = g()).a(paramInt, paramArrayOfbyte);
    return u1;
  }
  
  private u g() {
    u u1 = a("installcacher" + this.e);
    this.e++;
    pd.h(this.e);
    this.d.a(u1);
    return u1;
  }
  
  private u a(String paramString) {
    return u.a(paramString, 512, 15360, 0, 0, this.r, false);
  }
  
  private void h() {
    this.d = new a();
    String[] arrayOfString;
    if ((arrayOfString = RecordStore.listRecordStores()) != null)
      for (byte b = 0; b < arrayOfString.length; b++) {
        int i;
        if (arrayOfString[b] != null && (i = arrayOfString[b].indexOf("installcacher")) >= 0 && !arrayOfString[b].equals("tmpinstallcacher"))
          this.d.a(a(arrayOfString[b])); 
      }  
  }
  
  private int c(int paramInt) {
    if (this.d == null)
      h(); 
    for (byte b = 0; b < this.d.d(); b++) {
      u u1;
      int i;
      if ((i = (u1 = (u)this.d.b(b)).d(paramInt)) > 0)
        return i; 
    } 
    return 0;
  }
  
  private static u b(String paramString) {
    return u.a("map" + paramString, 512, 5120);
  }
  
  public final Image a(int paramInt, boolean paramBoolean) {
    paramInt = 0;
    int i = paramInt;
    pa pa1;
    return f.a((pa1 = this).a(i));
  }
  
  public final byte[] b(int paramInt, boolean paramBoolean) {
    return a(paramInt);
  }
  
  public final byte[] a(int paramInt) {
    if (this.d == null)
      h(); 
    for (byte b = 0; b < this.d.d(); b++) {
      u u1;
      if ((u1 = (u)this.d.b(b)).c(paramInt))
        return u1.a(paramInt); 
    } 
    return null;
  }
  
  public final void a(String paramString, ik paramik) {
    ct.b("[SQDataCacher] getMapResource");
    if (this.o)
      return; 
    this.o = true;
    if (a.s().d(11111) != null) {
      a.s().v();
      a.s().a(null, null);
    } 
    int i = -1;
    String str = paramString;
    if (!paramString.toUpperCase().equals("M99") && g.a("map" + str)) {
      u u1 = b(paramString);
      i = -1;
      byte[] arrayOfByte;
      if ((arrayOfByte = u1.a(-1987)) != null)
        i = m.a(arrayOfByte, 0); 
      i = (u1 == null) ? -1 : i;
    } 
    this.g = paramik;
    ks.a().a(paramString, i);
  }
  
  public final void a(int paramInt1, int[] paramArrayOfint, int paramInt2, ij paramij) {
    this.h = paramij;
    if (paramArrayOfint == null) {
      if (this.h != null)
        this.h.a(); 
      return;
    } 
    long l = pd.b(paramArrayOfint);
    this.t = pd.a(l);
    if (this.t >= paramArrayOfint.length) {
      pd.j();
      pd.b(l);
      this.t = 0;
    } 
    int i = 0;
    for (byte b = 0; b < this.t; b++) {
      int j;
      if ((j = c(paramArrayOfint[b])) > 0) {
        i += j;
      } else {
        pd.j();
        pd.b(l);
        this.t = 0;
        i = 0;
        break;
      } 
    } 
    if (this.t > 0) {
      int[] arrayOfInt = new int[paramArrayOfint.length - this.t];
      System.arraycopy(paramArrayOfint, this.t, arrayOfInt, 0, arrayOfInt.length);
      paramArrayOfint = arrayOfInt;
    } 
    a(i, paramInt2);
    pa pa1 = this;
    String str = "installcacher" + (pa1.e - 1);
    boolean bool = false;
  }
  
  private static void a(int paramInt1, int paramInt2) {
    nx.a = paramInt2;
    nx.b = paramInt1;
    nx.c = System.currentTimeMillis();
  }
  
  public final void a(jn paramjn, int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2) {
    paramjn.m = paramArrayOfint1;
    paramjn.n = paramInt1;
    this.i = paramjn;
    a(this.i.l);
    int i = 0;
    a a1 = new a(10);
    if (paramArrayOfint2 != null)
      for (byte b = 0; b < paramArrayOfint2.length; b++) {
        int j;
        if ((j = c(paramArrayOfint2[b])) <= 0) {
          a1.a(new Integer(paramArrayOfint2[b]));
        } else {
          i += j;
        } 
      }  
    if (a1.d() > 0) {
      this.s = true;
      paramjn.n += paramInt2 - i;
      if (paramArrayOfint2 != null && paramArrayOfint2.length != a1.d()) {
        paramArrayOfint2 = new int[a1.d()];
        for (byte b = 0; b < paramArrayOfint2.length; b++)
          paramArrayOfint2[b] = ((Integer)a1.b(b)).intValue(); 
      } 
      a(2147483647, paramArrayOfint2, paramjn.n, null);
      return;
    } 
    this.s = false;
    a(paramArrayOfint1, 0, paramInt1);
  }
  
  private void a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    ct.a("[SQDataCache] receiveMapInfo()");
    a(paramInt1, paramInt2);
    String str = this.i.a;
    g.b("map" + str);
    this.p = this.i.c;
    this.k = new byte[paramArrayOfint.length][];
    i();
    this.c = b(this.i.a);
    this.c.a(-1988, this.i.a());
    this.c.a(-1989, m.a(System.currentTimeMillis()));
    int i;
    b(i = this.c.a());
    a(1, paramArrayOfint);
  }
  
  public final void a(String paramString, jm[] paramArrayOfjm) {
    al al;
    ct.a("[SQDataCache] receiveMapUpToDate()");
    this.i = new jn();
    if (!paramString.toUpperCase().equals("M99")) {
      u u1;
      (u1 = b(paramString)).a(-1989, m.a(System.currentTimeMillis()));
      int j;
      b(j = u1.a());
      byte[] arrayOfByte = u1.a(-1988);
      jn jn1 = this.i;
      if (arrayOfByte != null) {
        jn1.f = m.a(arrayOfByte, 0);
        jn1.e = m.a(arrayOfByte, 4);
        jn1.g = m.a(arrayOfByte, 8);
        jn1.c = m.a(arrayOfByte, 12);
        jn1.d = m.a(arrayOfByte, 16);
        jn1.k = m.a(arrayOfByte, 20);
        int m;
        byte[] arrayOfByte1 = new byte[m = m.a(arrayOfByte, 24)];
        System.arraycopy(arrayOfByte, 28, arrayOfByte1, 0, m);
        jn1.a = i.a(arrayOfByte1);
        int k = m + 28;
        m = m.a(arrayOfByte, k);
        k += 4;
        arrayOfByte1 = new byte[m];
        System.arraycopy(arrayOfByte, k, arrayOfByte1, 0, m);
        jn1.b = i.a(arrayOfByte1);
        k += m;
        m = m.a(arrayOfByte, k);
        k += 4;
        jn1.h = new byte[m];
        System.arraycopy(arrayOfByte, k, jn1.h, 0, m);
        k += m;
        m = m.a(arrayOfByte, k);
        k += 4;
        jn1.i = new byte[m];
        System.arraycopy(arrayOfByte, k, jn1.i, 0, m);
        k += m;
        m = m.a(arrayOfByte, k);
        k += 4;
        jn1.j = new byte[m];
        System.arraycopy(arrayOfByte, k, jn1.j, 0, m);
        k += m;
        m = m.a(arrayOfByte, k);
        k += 4;
        arrayOfByte1 = new byte[m];
        System.arraycopy(arrayOfByte, k, arrayOfByte1, 0, m);
        jn1.m = new int[m / 4];
        int n;
        for (n = 0; n < jn1.m.length; n++)
          jn1.m[n] = m.a(arrayOfByte1, n << 2); 
        k += m;
        m = m.a(arrayOfByte, k);
        k += 4;
        arrayOfByte1 = new byte[m];
        System.arraycopy(arrayOfByte, k, arrayOfByte1, 0, m);
        n = 0;
        a a1 = new a();
        while (n < arrayOfByte1.length - 1) {
          int i1 = m.a(arrayOfByte1, n);
          n += 4;
          byte[] arrayOfByte2 = new byte[i1];
          System.arraycopy(arrayOfByte1, n, arrayOfByte2, 0, i1);
          a1.a(arrayOfByte2);
          n += i1;
        } 
        jn1.l = new jm[a1.d()];
        for (byte b = 0; b < jn1.l.length; b++) {
          jn1.l[b] = new jm();
          arrayOfByte1 = (byte[])a1.b(b);
          jm jm1;
          (jm1 = jn1.l[b]).a = m.a(arrayOfByte1, 0);
          jm1.c = m.a(arrayOfByte1, 4);
          jm1.d = m.a(arrayOfByte1, 8);
          jm1.e = m.a(arrayOfByte1, 12);
          jm1.f = m.a(arrayOfByte1, 16);
          jm1.g = m.a(arrayOfByte1, 20);
          byte[] arrayOfByte2 = new byte[n = m.a(arrayOfByte1, 24)];
          System.arraycopy(arrayOfByte1, 28, arrayOfByte2, 0, n);
          jm1.b = i.a(arrayOfByte2);
        } 
      } 
      this.i.l = paramArrayOfjm;
      a(this.i.l);
      this.j = this.i.m;
      this.k = new byte[this.j.length][];
      int i = this.k.length;
      a(0, i);
      for (i = 0; i < this.j.length; i++) {
        if ((al = a.s().d(11111)) != null)
          al.a(al.a); 
        this.k[i] = u1.a(this.j[i]);
        nx.b++;
      } 
    } else {
      this.i.l = (jm[])al;
    } 
    if (this.g != null)
      this.g.a(this.i, this.k); 
    l();
  }
  
  private void i() {
    String[] arrayOfString;
    if ((arrayOfString = RecordStore.listRecordStores()) == null)
      return; 
    a a1 = new a();
    for (byte b = 0; b < arrayOfString.length; b++) {
      int i;
      if (arrayOfString[b] != null && (i = arrayOfString[b].indexOf("map")) >= 0)
        a1.a(arrayOfString[b]); 
    } 
    if (a1.d() >= a) {
      long l = Long.MAX_VALUE;
      byte b1 = -1;
      for (byte b2 = 0; b2 < a1.d(); b2++) {
        u u1;
        byte[] arrayOfByte;
        String str;
        long l1;
        if ((u1 = b((str = (String)a1.b(b2)).substring(3))) != null && u1.c(-1989) && (l1 = m.d(arrayOfByte = u1.a(-1989))) < l) {
          l = l1;
          b1 = b2;
        } 
      } 
      if (b1 >= 0)
        g.b((String)a1.b(b1)); 
    } 
  }
  
  private static void a(jm[] paramArrayOfjm) {
    if (paramArrayOfjm == null)
      return; 
    for (byte b = 0; b < paramArrayOfjm.length; b++) {
      jm jm1;
      (jm1 = paramArrayOfjm[b]).d = jm1.d - (jm1.f >> 1) - (jm1.f & 0x1);
      jm1.e = jm1.e - (jm1.g >> 1) - (jm1.g & 0x1);
    } 
  }
  
  private void a(int paramInt, int[] paramArrayOfint) {
    this.j = paramArrayOfint;
    this.m = paramInt;
    this.l = 0;
    pa pa1;
    (pa1 = this).q = false;
    pa1.k();
  }
  
  public final void t() {
    if (this.m == 1) {
      if (this.g != null)
        this.g.d(); 
    } else if (this.h != null) {
      this.h.b();
    } 
    l();
  }
  
  private void j() {
    synchronized (this.f) {
      try {
        this.f.wait();
      } catch (InterruptedException interruptedException2) {
        InterruptedException interruptedException1;
        (interruptedException1 = null).printStackTrace();
      } 
      return;
    } 
  }
  
  private void k() {
    synchronized (this.f) {
      this.f.notify();
      return;
    } 
  }
  
  private void l() {
    this.y = 0;
    this.c = null;
    this.i = null;
    this.g = null;
    this.h = null;
    this.k = null;
    this.j = null;
    this.o = false;
    this.s = false;
    System.gc();
  }
  
  public final void run() {
    while (!this.w) {
      if (this.j != null) {
        while (this.l < this.j.length) {
          int i = this.j[this.l];
          nx.a((new StringBuffer(String.valueOf(i))).toString());
          ks.a().a(i);
          j();
          if (!this.q) {
            al al;
            if ((al = a.s().d(11111)) != null)
              al.a(al.a); 
            if (this.m == 1) {
              this.k[this.l] = this.n.a;
            } else {
              int j = this.j[this.l];
              this.c = a(this.c, j, this.n.a);
              j = 0;
              this.y++;
              if (this.y >= 200) {
                j = 1;
                this.y = 0;
              } 
              boolean bool;
              if (j != 0 && (bool = f())) {
                int k;
                if ((k = this.l + 1) > this.j.length)
                  k = this.j.length; 
                pd.a(this.t + k);
              } 
            } 
            this.n.a = null;
            this.l++;
            continue;
          } 
          l();
          break;
        } 
        if (!this.q && this.l >= this.j.length) {
          if (this.m == 1) {
            int i;
            for (i = 0; i < this.j.length; i++)
              this.c.a(this.j[i], this.k[i]); 
            b(i = this.c.a());
            this.c.a(-1987, m.a(this.i.c));
            b(i = this.c.a());
            if (this.g != null) {
              ct.a("[sqDataCacher ]+run");
              this.g.a(this.i, this.k);
            } 
            ct.a("[sqDataCacher ] complete get map resource");
          } else {
            f();
            pd.j();
            if (!this.s) {
              pd.d(this.p);
              if (this.h != null)
                this.h.a(); 
              ct.a("[sqDataCacher ] complete download file install");
            } else {
              this.s = false;
              a(this.i.m, nx.b, this.i.n);
              this.q = false;
              ct.a("[sqDataCacher ] download tiep map sau khi da down du monster");
              continue;
            } 
          } 
          l();
        } 
        continue;
      } 
      this.q = false;
      j();
    } 
  }
  
  public final void d() {
    this.w = true;
    k();
    b = null;
  }
  
  public final void e() {
    this.q = true;
    this.w = true;
    boolean bool;
    if (this.j != null && (bool = f())) {
      int i;
      if ((i = this.l) > this.j.length)
        i = this.j.length; 
      pd.a(this.t + i);
    } 
  }
  
  static void a(pa parampa) {
    parampa.k();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\pa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */