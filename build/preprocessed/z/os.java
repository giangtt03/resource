import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class os extends aq implements bf, bg, bq {
  private oa m;
  
  private k n;
  
  private k o;
  
  private ay p;
  
  private int q;
  
  private boolean r = false;
  
  private do s;
  
  lh i;
  
  private dd t;
  
  private byte u = -1;
  
  public String j;
  
  fk k = new fk();
  
  private int v = 0;
  
  private String w;
  
  private ol x;
  
  private if y = new if(new int[] { 5939728, 16776960 });
  
  public static lr[] l;
  
  private String z;
  
  private long A;
  
  private int B;
  
  public os(int paramInt, oa paramoa, ol paramol) {
    this.m = paramoa;
    this.x = paramol;
    a_(3);
    a(0, 0, v.t, v.u);
    a((byte)0);
    this.x.a(new gb(105, 0));
    this.x.b(new gb(109, 1));
    this.x.c(a.n);
    this.x.a(new ba());
    this.x.a(this);
  }
  
  private void a(byte paramByte) {
    do do1;
    boolean bool;
    this.u = paramByte;
    os os1;
    switch ((os1 = this).u) {
      case 1:
        os1.n = new k(0, 73, v.t, 1);
        os1.o = new k(0, os1.n.b + 4, os1.e(), os1.f() - os1.n.b + 4 - ba.a);
        break;
      default:
        os1.n = new k(0, 5, v.t, 1);
        os1.o = new k(0, os1.n.b + 5, os1.e(), os1.f() - os1.n.b + 4 - ba.a);
        break;
    } 
    this.k = new fk();
    this.k.i = true;
    this.k.a(this);
    this.k.a_(this.o.a, this.o.b);
    this.p = new ay(0);
    this.p.a(this.o);
    this.p.b(this.k);
    this.p.h(1);
    switch (paramByte) {
      case 1:
        this.v = 0;
        if (bool = go.k.aa) {
          go.k.e = 2;
        } else if (go.k.e == 2) {
          go.k.e = 0;
        } 
        (do1 = new do()).a = go.k.b;
        do1.d = go.k.ab;
        do1.b = go.k.G;
        do1.c = go.k.e;
        do1.f = go.k.X;
        do1.e = go.k.P;
        a(this.j, new do[] { do1 });
        ks.a().d();
        break;
      case 0:
        this.j = null;
        if (l != null)
          a(l); 
        break;
    } 
    this.x.c(true);
  }
  
  public final void c(boolean paramBoolean) {
    this.p.c(true);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.p != null && this.p.k()) {
      Graphics graphics = paramGraphics;
      os os1 = this;
      graphics.setColor(v.am);
      graphics.fillRect(0, 0, os1.e(), os1.f());
      graphics.drawImage(pc.d, os1.c() + os1.e(), os1.d() + os1.f() - ba.a, 40);
      switch (os1.u) {
        case 1:
          if (os1.t != null)
            os1.t.a(graphics, 0, 0); 
          pc.a(graphics, os1.n.a, os1.n.b, os1.n.c);
          if (os1.z != null) {
            long l = (os1.A - System.currentTimeMillis() > 0L) ? (os1.A - System.currentTimeMillis()) : 0L;
            paramInt2 = v.t - bx.c.a(os1.z) - bx.c.a(i.b(l, "hh:mm:ss")) - 5;
            a.h.a(graphics, String.valueOf(os1.z) + " " + i.b(l, "hh:mm:ss"), paramInt2, v.u - 35, 0);
          } 
          break;
      } 
      if (os1.p != null) {
        cw.a(graphics);
        cw.b(graphics, os1.p.h());
        os1.p.a(graphics, os1.c(), os1.d());
        cw.b(graphics);
      } 
    } 
  }
  
  public final void n() {
    if (this.t != null)
      this.t.i(); 
    if (this.p != null)
      this.p.n(); 
    if (this.q > 0) {
      this.q--;
      if (this.q == 1)
        ks.a().a(this.w, 91, (byte)101); 
    } 
  }
  
  public final void a() {
    this.x.c(true);
  }
  
  public final boolean f(int paramInt) {
    boolean bool;
    return (paramInt == 97 || paramInt == 96) ? false : (bool = this.p.f(paramInt));
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    return this.p.e(paramInt1, paramInt2);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    return this.p.c(paramInt1, paramInt2);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    return this.p.f(paramInt1, paramInt2);
  }
  
  public final synchronized void a(String paramString, do[] paramArrayOfdo) {
    if (paramString == null || !this.x.t)
      return; 
    a.s().v();
    if (this.u != 1)
      a((byte)1); 
    try {
      if (a(paramString))
        for (byte b = 0; b < paramArrayOfdo.length; b++) {
          if (paramArrayOfdo[b] != null)
            a(paramArrayOfdo[b]); 
        }  
    } catch (OutOfMemoryError outOfMemoryError) {
      a.m.G();
    } 
    int i;
    if ((i = b(go.k.b)) >= 0) {
      this.k.i(i);
    } else {
      this.k.i(0);
    } 
    t();
  }
  
  private void a(do paramdo) {
    try {
      boolean bool;
      ew ew;
      if (paramdo.a.length() < 6) {
        ew = new ew(paramdo, e(), this.y);
      } else {
        ew = new ew(paramdo, e());
      } 
      ew.a_(this.v++);
      String str = paramdo.a;
      os os1;
      if ((os1 = this).k.r() == 0) {
      
      } else {
        int i = 0;
        int j = os1.k.r();
        int m = j + 0 >> 1;
        while (true) {
          boolean bool1;
          do do1 = ((ew)os1.k.j(m)).i;
          if (str.compareTo(do1.a) > 0) {
            m = (i = m) + j >> 1;
          } else if (str.compareTo(do1.a) < 0) {
            j = m;
            m = i + j >> 1;
          } else {
          
          } 
          if (i == m) {
            do1 = ((ew)os1.k.j(m)).i;
            if (str.compareTo(do1.a) < 0) {
            
            } else {
            
            } 
          } else {
          
          } 
        } 
      } 
    } catch (OutOfMemoryError outOfMemoryError) {
      a.m.G();
      ct.a("[RoomTab] khong du bo nho them ng choi vao room");
      return;
    } 
  }
  
  private boolean a(String paramString) {
    return paramString.equals(this.j);
  }
  
  public final void a(lh paramlh) {
    this.i = paramlh;
    this.t = new dd(this.i);
    c(true);
  }
  
  public final void b(aq paramaq, int paramInt) {
    if (paramaq instanceof ew)
      if (this.k.r() > 1) {
        paramaq = paramaq;
        do do1 = ((ew)paramaq).i;
        paramaq = this;
        if (!do1.a.equals(go.k.b)) {
          ((os)paramaq).s = do1;
          bs bs = new bs();
          if (a.m != null && a.o) {
            fc fc = (fc)((os)paramaq).x.l();
            switch (((os)paramaq).s.c) {
              case 2:
                if (fc.b(a.m)) {
                  if ((((os)paramaq).B & 0x2) != 0)
                    bs.a(new br("Giao dịch", 10100)); 
                  bs.a(new br[] { new br("Chat!", 10101), new br("Xem ME", 10102) });
                  break;
                } 
                bs.a(new br[] { new br("Giao dịch", 10100) });
                break;
              case 3:
                if (fc.b(a.m)) {
                  bs.a(new br[] { new br("Chat!", 10101), new br("Xem ME", 10102) });
                  break;
                } 
              case 1:
                if (fc.b(a.m)) {
                  if ((((os)paramaq).B & 0x4) != 0)
                    bs.a(new br("Xem Trận đánh", 10103)); 
                  bs.a(new br[] { new br("Chat!", 10101), new br("Xem ME", 10102) });
                  break;
                } 
                bs.a(new br[] { new br("Xem Trận đánh", 10103) });
                break;
              default:
                if (fc.b(a.m)) {
                  if (((os)paramaq).s.f > 0L) {
                    bs.a(new br[] { new br("Đánh!", 10104), new br("Giao dịch", 10100), new br("Chat!", 10101), new br("Xem ME", 10102) });
                    break;
                  } 
                  if ((((os)paramaq).B & 0x1) != 0)
                    bs.a(new br("Khiêu Chiến", 10105)); 
                  if ((((os)paramaq).B & 0x2) != 0)
                    bs.a(new br("Giao dịch", 10100)); 
                  bs.a(new br[] { new br("Chat!", 10101), new br("Xem ME", 10102) });
                  break;
                } 
                if (((os)paramaq).s.f > 0L) {
                  bs.a(new br[] { new br("Đánh!", 10104), new br("Giao dịch", 10100) });
                  break;
                } 
                if ((((os)paramaq).B & 0x1) != 0)
                  bs.a(new br("Khiêu Chiến", 10105)); 
                if ((((os)paramaq).B & 0x2) != 0)
                  bs.a(new br("Giao dịch", 10100)); 
                break;
            } 
          } else {
            switch (((os)paramaq).s.c) {
              case 2:
                if ((((os)paramaq).B & 0x2) != 0)
                  bs.a(new br("Giao dịch", 10100)); 
                break;
              case 3:
                return;
              case 1:
                if ((((os)paramaq).B & 0x4) != 0)
                  bs.a(new br("Xem Trận đánh", 10103)); 
                break;
              default:
                if (((os)paramaq).s.f > 0L) {
                  bs.a(new br[] { new br("Đánh!", 10104), new br("Giao dịch", 10100) });
                  break;
                } 
                if ((((os)paramaq).B & 0x1) != 0)
                  bs.a(new br("Khiêu Chiến", 10105)); 
                if ((((os)paramaq).B & 0x2) != 0)
                  bs.a(new br("Giao dịch", 10100)); 
                break;
            } 
          } 
          aq aq1 = ((os)paramaq).k.u();
          k k1 = ((os)paramaq).p.r();
          int j = (v.t - bs.e()) / 2;
          int i;
          if ((i = ((os)paramaq).p.d() + aq1.d() - k1.b) + bs.f() > v.u - ba.a)
            i = v.u - ba.a - bs.f(); 
          bs.a_(v.t + bs.e(), i);
          bs.d(j, i);
          bs.a((bg)paramaq);
          bs.a(new gb(113, 2));
          bs.b(new gb(106, 3));
          bs.c(a.n);
          bs.a_(1);
          ((os)paramaq).x.a(bs);
        } 
        return;
      }  
    if (paramaq instanceof fz && !((fz)(paramaq = paramaq)).i.a()) {
      ks.a().q(((fz)paramaq).i.b);
      a.s().a(null, null);
    } 
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {
    t();
    if (paramaq = this.k.j(paramInt2) instanceof ew) {
      paramaq = this.k.j(paramInt2);
      if (this.i != null && this.i.b.equals(((ew)paramaq).i.a))
        return; 
      if (((ew)paramaq).i.a.equals(go.k.b)) {
        a(go.k);
        return;
      } 
      this.w = ((ew)paramaq).i.a;
      this.q = 10;
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    os os1;
    bs bs;
    int i;
    gb gb1;
    gb gb2;
    switch (paramInt2) {
      case 106:
        this.x.t();
        return;
      case 113:
        this.x.l.f(95);
        return;
      case 109:
        ((fc)this.x.l()).a();
        return;
      case 105:
        os1 = this;
        (bs = new bs()).a(oa.a(os1.x));
        i = (bs.e() > bs.f()) ? bs.e() : bs.f();
        bs.a_(-i, os1.f() - bs.f() + i);
        bs.d(0, v.u - ba.a - bs.f());
        bs.a(os1);
        gb1 = new gb(113, 2);
        gb2 = new gb(106, 3);
        bs.c(a.n);
        bs.a(gb1);
        bs.b(gb2);
        os1.x.a(bs);
        return;
      case 0:
        ag.b().a(-9, false);
        break;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    ds ds;
    if (paramObject == null)
      return; 
    br br = (br)paramObject;
    switch (paramInt2) {
      case 10101:
        if (a.m != null)
          (ds = a.m.c(this.s.a)).d("patriot"); 
        break;
      case 10105:
        a.d(this.s.a);
        break;
      case 10102:
        if (a.m != null)
          a.m.a(this.s.a, 0L); 
        break;
      case 10103:
        a.s().r(this.s.a);
        break;
      case 10100:
        a.p(this.s.a);
        break;
      case 10104:
        this.m.a(this.s.a, false, 0, false, false);
        break;
      case 99028:
        ks.a().e();
        ks.a().r();
        a.s().a(null, null);
        break;
      default:
        this.m.a(paramInt2, (br)ds);
        break;
    } 
    this.x.t();
  }
  
  public final void b(lh paramlh) {
    aq aq1;
    if (aq1 = this.k.u() instanceof ew && ((ew)(aq1 = aq1)).i.a.equals(paramlh.b)) {
      a(paramlh);
      this.i = paramlh;
    } 
  }
  
  public final synchronized void a(String paramString1, do paramdo, String paramString2, long paramLong) {
    if (paramdo == null)
      return; 
    if (this.u == 0)
      return; 
    int i;
    if (a(paramString1) && (i = b(paramdo.a)) >= 0)
      try {
        ((ew)this.k.j(i)).a(paramdo, paramString2, paramLong);
        return;
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
        System.gc();
      }  
  }
  
  public final void a(lr[] paramArrayOflr) {
    if (this.u != 0)
      a((byte)0); 
    this.k.t();
    for (byte b = 0; b < paramArrayOflr.length; b++)
      this.k.b(new fz(paramArrayOflr[b])); 
    this.k.i(0);
    a.s().v();
    c(true);
  }
  
  public final void b(lr[] paramArrayOflr) {
    if (this.u == 0) {
      a((byte)0);
      for (byte b = 0; b < paramArrayOflr.length; b++) {
        for (byte b1 = 0; b1 < l.length; b1++) {
          if ((paramArrayOflr[b]).b.equals((l[b1]).b)) {
            (l[b1]).f = (paramArrayOflr[b]).f;
            (l[b1]).e = (paramArrayOflr[b]).e;
            (l[b1]).a = (paramArrayOflr[b]).a;
            (l[b1]).c = (paramArrayOflr[b]).c;
            (l[b1]).d = (paramArrayOflr[b]).d;
            (l[b1]).b = (paramArrayOflr[b]).b;
            (l[b1]).g = (paramArrayOflr[b]).g;
          } 
        } 
      } 
    } 
  }
  
  private int b(String paramString) {
    if (this.k.r() == 0)
      return -1; 
    int i = 0;
    int j = this.k.r();
    int m = j + 0 >> 1;
    while (true) {
      do do1 = ((ew)this.k.j(m)).i;
      if (paramString.compareTo(do1.a) > 0) {
        m = (i = m) + j >> 1;
      } else if (paramString.compareTo(do1.a) < 0) {
        j = m;
        m = i + j >> 1;
      } else {
        return m;
      } 
      if (i == m) {
        do1 = ((ew)this.k.j(m)).i;
        return paramString.equals(do1.a) ? m : -1;
      } 
    } 
  }
  
  public final synchronized void a(String paramString1, String paramString2) {
    int i;
    if (a(paramString1) && (i = b(paramString2)) >= 0) {
      this.k.c(this.k.j(i));
      if (i == this.k.q())
        if (this.k.q() >= this.k.r()) {
          this.k.i(this.k.r() - 1);
        } else {
          this.k.i(i);
        }  
      t();
    } 
  }
  
  private void t() {
    int i = (this.p.r()).b;
    int j = this.k.q();
    aq aq1 = this.k.j(j);
    int m = 0;
    if (aq1.d() - i < 0) {
      m = aq1.d() - i;
    } else if (aq1.d() + aq1.f() > i + (this.p.r()).d) {
      m = aq1.d() + aq1.f() - i + (this.p.r()).d;
    } 
    this.p.j(m);
  }
  
  public final void a(String paramString1, String paramString2, long paramLong, int paramInt) {
    this.j = paramString1;
    this.z = paramString2;
    this.A = paramLong + System.currentTimeMillis();
    this.B = paramInt;
    if (this.u != 1)
      a((byte)1); 
    ks.a().e(paramString1);
  }
  
  public final byte q() {
    return this.u;
  }
  
  public final synchronized void b(String paramString1, do paramdo, String paramString2, long paramLong) {
    if (paramdo == null)
      return; 
    if (a(paramString1)) {
      int i;
      if ((i = b(paramdo.a)) >= 0) {
        a(paramString1, paramdo, paramString2, paramLong);
        return;
      } 
      a(paramdo);
      t();
    } 
  }
  
  public final void r() {
    if (this.u == 1)
      a((byte)0); 
  }
  
  public final void s() {
    if (this.u == 1) {
      ks.a().e();
      this.k.t();
      System.gc();
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\os.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */