import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mt implements mr {
  private ms h;
  
  public mh a;
  
  private ml i;
  
  private Image j;
  
  private Image k;
  
  private a[] l;
  
  private a m;
  
  private a n;
  
  private a o;
  
  private a p;
  
  private mm q;
  
  public mx b;
  
  private k r;
  
  private na s;
  
  private y t;
  
  public y c;
  
  private y u;
  
  private nm[][] v;
  
  private gz w;
  
  public ff d;
  
  private mj z;
  
  public np e;
  
  private mv A;
  
  lz f = new lz(30, 30, 30, (byte)10);
  
  private io[] B;
  
  private in[] C;
  
  public hl g;
  
  private String[][] D = new String[][] { { "Đại hiệp tha mạng!!", "Em vô tội T.T", "Hey! Có gì từ từ nói...", "Eck eck...Sợ quá!!" } };
  
  public mt(ms paramms) {
    try {
      this.h = paramms;
      this.r = new k();
      m();
    } catch (Exception exception) {
      (paramms = null).printStackTrace();
    } 
    this.f.b(false);
  }
  
  public final void a(String paramString) {
    if (paramString == null || paramString.length() <= 0)
      return; 
    this.z.a(paramString, 0);
    if (!(this.h.a(1, 0).a()).O) {
      if (a.m != null) {
        a.m.a(this.h.a(1, 0).j(), paramString);
        return;
      } 
      String[] arrayOfString = new String[(this.h.a()[1]).length];
      for (byte b = 0; b < arrayOfString.length; b++)
        arrayOfString[b] = this.h.a()[1][b].j(); 
      ks.a().a(arrayOfString, paramString);
    } 
  }
  
  public final void b(String paramString) {
    this.z.a(paramString, 1);
  }
  
  public final void a(String paramString, int paramInt) {
    this.z.a(paramString, 1, 50, 20);
  }
  
  public final void a() {
    if (this.h.a(1, 0).b())
      return; 
    if (!this.d.i()) {
      this.d.a(true);
      if (v.z)
        this.d.g(true); 
    } 
  }
  
  public final void b() {
    this.d.a(false);
    ag.a().e();
  }
  
  public final void a(lm[] paramArrayOflm) {
    this.g = new hl(paramArrayOflm, new bd("Dùng", 1008), new bd("Đóng", 1009), new bd("", 1008));
    this.g.c(true);
    this.g.b(true);
  }
  
  public final void c() {
    this.B = null;
    this.n = null;
    this.m = null;
    this.o = null;
    this.t = null;
    this.u = null;
    this.v = null;
    this.c = null;
    this.s = null;
    this.a = null;
    this.z = null;
    this.w = null;
    this.p = null;
    this.b.b = null;
    this.b = null;
    if (this.h != null)
      this.h.g(); 
    this.h = null;
    this.g = null;
    if (this.A != null)
      this.A.c(); 
    this.A = null;
    this.k = null;
    this.j = null;
    this.i = null;
    this.q = null;
    this.C = null;
    this.l = null;
    this.d = null;
  }
  
  private void m() {
    this.A = new mv(this, gr.r);
    this.m = new a();
    this.B = new io[2];
    this.C = new in[2];
    this.l = new a[2];
    byte b;
    for (b = 0; b < this.l.length; b++)
      this.l[b] = new a(); 
    this.v = new nm[2][];
    this.v[0] = new nm[oq.i.length];
    this.v[1] = new nm[oq.j.length];
    for (b = 0; b < this.v.length; b++) {
      for (byte b1 = 0; b1 < (this.v[b]).length; b1++) {
        this.v[b][b1] = new nm();
        this.v[b][b1].a(a.h);
        this.v[b][b1].a(40);
      } 
    } 
    this.n = new a();
    this.o = new a();
    this.p = new a();
    this.s = new na(v.t / 2, v.u / 2 - 15);
    this.t = new y();
    this.t.a(40);
    this.c = new y();
    this.c.a(2147483647);
    this.u = new y();
    this.u.a(20);
    this.k = (mp.a()).b;
    this.a = new mh();
    this.a.c((v.t - mv.a()) / 2 + ((a.k == 0) ? 8 : 48) + 14, (v.u - mv.b()) / 2 + 4 + 14);
    this.i = new ml();
    nd nd = this.a.a(0, 0);
    this.i.a(nd.n(), nd.o());
    lg[][] arrayOfLg = this.h.a();
    mh mh2;
    this.b = new mx(this.h, (mh2 = this.a).a, a.k, (v.t - mv.a()) / 2, (v.u - mv.b()) / 2);
    this.j = (mp.a()).a;
    this.q = new mm();
    if (oq.o != 9) {
      arrayOfLg = arrayOfLg;
      mt mt1 = this;
      for (byte b1 = 0; b1 < (arrayOfLg[0]).length; b1++) {
        if (arrayOfLg[0][b1].j().equals(go.k.b)) {
          lh lh;
          if ((lh = arrayOfLg[0][b1].a()).E.length != 0) {
            for (b1 = 0; b1 < lh.E.length; b1++) {
              for (byte b2 = 0; b2 < go.k.E.length; b2++) {
                if ((lh.E[b1]).a == (go.k.E[b2]).a) {
                  lh.E[b1] = go.k.E[b2];
                  for (b2 = 0; b2 < go.r.length; b2++) {
                    if ((go.r[b2]).a == (lh.E[b1]).a) {
                      (lh.E[b1]).e = ((go.r[b2]).c[(lh.E[b1]).f - 1]).d;
                      break;
                    } 
                  } 
                  break;
                } 
              } 
            } 
            mt1.w = new gz(lh);
            mt1.w.b(true);
            mt1.w.c(true);
          } 
          break;
        } 
      } 
    } 
    this.d = new ff(null, 255, 2);
    int i = v.t;
    this.d.a(0, v.u - 20, i, 20);
    this.d.h(30);
    this.d.a(new mu(this));
    this.d.d(true);
    b();
    this.e = new np();
    mh mh1;
    k k1 = (mh1 = this.a).a;
    int j = this.b.h()[0];
    int m = (m = this.b.g()[0]) + this.b.g()[2];
    this.z = new mj(j, this.b.h()[1], m - j, 20);
    this.z.a(this.b.g()[1] - this.b.h()[1]);
    if (a.k == 0) {
      this.e.c(k1.a + k1.c / 2 - 5, k1.b + k1.d + 10);
      return;
    } 
    this.e.c(this.b.e()[0], this.b.e()[1] + this.b.e()[3] + 6);
  }
  
  public final void d() {
    try {
      this.a.i();
      this.i.i();
      int i;
      for (i = this.m.d() - 1; i >= 0; i--) {
        if (this.m.b(i) != null)
          if (!((ne)this.m.b(i)).m()) {
            this.m.a(i);
          } else if (this.m.b(i) != null) {
            ((ne)this.m.b(i)).i();
          }  
      } 
      for (i = this.n.d() - 1; i >= 0; i--) {
        if (this.n.b(i) != null)
          if (!((nb)this.n.b(i)).m()) {
            this.n.a(i);
          } else if (this.n.b(i) != null) {
            ((nb)this.n.b(i)).i();
          }  
      } 
      for (i = this.o.d() - 1; i >= 0; i--) {
        if (this.o.b(i) != null)
          if (!((im)this.o.b(i)).m()) {
            this.o.a(i);
          } else if (this.o.b(i) != null) {
            ((im)this.o.b(i)).i();
          }  
      } 
      for (i = this.p.d() - 1; i >= 0; i--) {
        if (this.p.b(i) != null)
          ((nh)this.p.b(i)).i(); 
      } 
      for (i = 0; i < this.v.length; i++) {
        for (byte b = 0; b < (this.v[i]).length; b++)
          this.v[i][b].b(); 
      } 
      for (i = 0; i < this.B.length; i++) {
        if (this.B[i] != null)
          this.B[i].i(); 
      } 
      for (i = 0; i < this.C.length; i++) {
        if (this.C[i] != null)
          this.C[i].i(); 
      } 
      for (i = 0; i < this.l.length; i++) {
        a a1;
        if ((a1 = this.l[i]) != null)
          for (byte b = 0; b < a1.d(); b++) {
            if (a1.b(b) != null)
              ((ip)a1.b(b)).i(); 
          }  
      } 
      this.q.i();
      this.b.i();
      this.s.i();
      this.t.b();
      this.c.b();
      this.u.b();
      this.e.i();
      this.d.n();
      this.z.i();
      if (this.f != null) {
        this.f.i();
        return;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    try {
      if (v.t > mv.a() || v.u > mv.b()) {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, v.t, (v.u - mv.b()) / 2);
        paramGraphics.fillRect(0, (v.u + mv.b()) / 2, v.t, (v.u - mv.b()) / 2);
        paramGraphics.fillRect(0, (v.u - mv.b()) / 2, (v.t - mv.a()) / 2, mv.b());
        paramGraphics.fillRect((v.t + mv.a()) / 2, (v.u - mv.b()) / 2, (v.t - mv.a()) / 2, mv.b());
      } 
      int i = (v.t - mv.a()) / 2;
      int j = (v.u - mv.b()) / 2;
      paramGraphics.setClip(i, j, mv.a(), mv.b());
      this.A.a(paramGraphics, i, j, 0);
      cw.a(paramGraphics, this.r);
      mh mh1;
      cw.a(paramGraphics, (mh1 = this.a).a, this.r);
      this.a.a(paramGraphics);
      cw.c(paramGraphics, this.r);
      this.i.a(paramGraphics);
      if (this.f != null)
        this.f.a(paramGraphics); 
      try {
        if (this.q != null)
          this.q.a(paramGraphics); 
      } catch (Exception exception) {
        ct.a("[SQCViewManager] loi view" + exception.toString());
      } 
      this.b.a(paramGraphics);
      this.t.a(paramGraphics, 0, 0);
      this.c.a(paramGraphics, 0, 0);
      this.u.a(paramGraphics, 0, 0);
      for (j = 0; j < this.l.length; j++) {
        a a1 = this.l[j];
        nk nk;
        int m = (nk = this.b.a[j]).n() + (nk.p() - a1.d() * 17) / 2;
        int n = nk.o() - 15;
        for (byte b = 0; b < a1.d(); b++) {
          ip ip;
          (ip = (ip)a1.b(b)).a(paramGraphics, m + ((j == 0) ? (nk.p() / 2 - 20) : (-nk.p() / 2 + 20)), n);
          m += 15;
        } 
      } 
      for (j = 0; j < this.m.d(); j++)
        ((ne)this.m.b(j)).a(paramGraphics, 0, 0); 
      for (j = this.p.d() - 1; j >= 0; j--)
        ((nh)this.p.b(j)).a(paramGraphics); 
      for (j = 0; j < this.n.d(); j++)
        ((nb)this.n.b(j)).a(paramGraphics, 0, 0); 
      for (j = 0; j < this.o.d(); j++)
        ((im)this.o.b(j)).a(paramGraphics); 
      for (j = 0; j < this.B.length; j++) {
        if (this.B[j] != null)
          this.B[j].a(paramGraphics); 
      } 
      for (j = 0; j < this.C.length; j++) {
        if (this.C[j] != null)
          this.C[j].a(paramGraphics); 
      } 
      if (oq.o != 1)
        this.e.a(paramGraphics); 
      this.z.a(paramGraphics);
      for (j = 0; j < this.v.length; j++) {
        for (byte b = 0; b < (this.v[j]).length; b++)
          this.v[j][b].a(paramGraphics, 0, 0); 
      } 
      this.s.a(paramGraphics);
      paramGraphics.setClip(0, 0, v.t, v.u);
      this.d.a(paramGraphics, 0, 0);
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3) {
    this.i.a(paramInt1);
    nd nd = this.a.a(paramInt2 - 2, paramInt3 - 2);
    this.i.a(nd.n(), nd.o());
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3) {
    this.i.a(paramInt1);
    nd nd = this.a.a(paramInt2 - 2, paramInt3 - 2);
    if (paramInt1 == 0 && oq.o != 9) {
      this.i.b(nd.n(), nd.o());
      return;
    } 
    this.i.a(nd.n(), nd.o());
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.i.a(0);
    nd nd = this.a.a(paramInt1 - 2, paramInt2 - 2);
    int i = 0;
    if (paramInt2 > 2)
      i = 1; 
    if (paramInt2 < 9)
      i |= 0x2; 
    if (paramInt1 > 2)
      i |= 0x4; 
    if (paramInt1 < 9)
      i |= 0x8; 
    this.i.b(i, nd.n(), nd.o());
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b = 0;
    if (paramInt2 < paramInt4) {
      b = 2;
    } else if (paramInt2 > paramInt4) {
      b = 1;
    } else if (paramInt1 < paramInt3) {
      b = 8;
    } else if (paramInt1 > paramInt3) {
      b = 4;
    } 
    return b;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.i.a(paramInt1);
    nd nd1 = this.a.a(paramInt4 - 2, paramInt5 - 2);
    nd nd2 = this.a.a(paramInt2 - 2, paramInt3 - 2);
    this.i.c(nd2.n(), nd2.o(), nd1.n(), nd1.o());
  }
  
  public final void e() {
    this.f.b(false);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt4 = b(paramInt2, paramInt3, paramInt4, paramInt5);
    this.i.a(paramInt1);
    nd nd = this.a.a(paramInt2 - 2, paramInt3 - 2);
    this.i.b(paramInt4, nd.n(), nd.o());
  }
  
  public final void a(my parammy) {
    int n;
    int j = parammy.a;
    int m = parammy.b;
    if ((parammy.e[0] & 0xFF) >= 3 || (parammy.e[1] & 0xFF) >= 3) {
      n = b(parammy.c, parammy.d, parammy.a, parammy.b);
      j = parammy.c;
      m = parammy.d;
    } else {
      n = b(parammy.a, parammy.b, parammy.c, parammy.d);
    } 
    int i = (m - 2) * 28 + this.a.n();
    j = (j - 2) * 28 + this.a.o();
    this.q.b(i, j, n);
  }
  
  public final void f() {
    this.q.a();
  }
  
  public final void g() {
    this.i.a();
  }
  
  public final int h() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < 8; b2++) {
      int i = b1 + 0;
      for (byte b = 0; b < 8; b++) {
        nd nd;
        (nd = this.a.a(b2, b)).i(28, i);
        i++;
      } 
      b1++;
    } 
    return 22;
  }
  
  public final int i() {
    byte b1 = 0;
    ms ms1;
    nj[][] arrayOfNj = (ms1 = this.h).l;
    int[] arrayOfInt = new int[12];
    for (byte b2 = 2; b2 < 10; b2++) {
      byte b3 = 0;
      for (byte b4 = 9; b4 >= 2; b4--) {
        a(b3, b2, b4, b2, arrayOfNj[b4][b2], arrayOfInt[b2] + b1);
        arrayOfInt[b2] = arrayOfInt[b2] + 1;
        b3--;
      } 
      b1++;
    } 
    return 21;
  }
  
  public final void a(int paramInt1, int paramInt2, nj paramnj, int paramInt3) {
    this.a.a(paramInt1, paramInt2, paramnj, paramInt3);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, nj paramnj1, nj paramnj2) {
    this.a.a(paramInt1, paramInt2, paramInt3, paramInt4, paramnj1, paramnj2);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, nj paramnj, int paramInt5) {
    this.a.a(paramInt1, paramInt2, paramInt3, paramInt4, paramnj, paramInt5);
  }
  
  public final int a(mw parammw, int paramInt) {
    int i = 0;
    if (parammw.k) {
      if ((parammw.a.e & 0x1) != 0) {
        paramInt = (paramInt + 1) % 2;
        int m = paramInt;
        mw mw1 = parammw;
        mt mt1 = this;
        (new int[4])[0] = mt1.b.a[0].n();
        (new int[4])[1] = mt1.b.a[0].o();
        (new int[4])[2] = mt1.b.a[0].p();
        (new int[4])[3] = mt1.b.a[0].q();
        (new int[4])[0] = mt1.b.a[1].n();
        (new int[4])[1] = mt1.b.a[1].o();
        (new int[4])[2] = mt1.b.a[1].p();
        (new int[4])[3] = mt1.b.a[1].q();
        int[] arrayOfInt1;
        int i1 = (arrayOfInt1 = (m == 0) ? new int[4] : new int[4])[0] + arrayOfInt1[2] / 2 + cv.a() % 10;
        int n = arrayOfInt1[1] + arrayOfInt1[3] / 2 + cv.a() % 10;
        if (mw1.d == 1 && mw1.g == 1) {
          mt1.a(mw1, i1, n);
        } else if (mw1.d == 1) {
          mt1.b(mw1, i1, n);
        } else if (mw1.g == 1) {
          mt1.a(mw1, i1, n);
        } else {
          mt1.a(mw1, i1, n);
          mt1.b(mw1, i1, n);
        } 
        mt1.a(m, 36, 26, true);
      } 
      nj nj = parammw.a;
      int[] arrayOfInt = null;
      k k1 = new k();
      switch (nj.e) {
        case 1:
        case 16:
        case 32:
        case 64:
          if (paramInt == 0) {
            this.b.a[0].g();
            break;
          } 
          this.b.a[1].g();
          break;
        case 2:
        case 4:
        case 8:
          if ((nj.e & 0x2) != 0) {
            arrayOfInt = (paramInt == 0) ? this.b.a() : this.b.b();
          } else if ((nj.e & 0x4) != 0) {
            arrayOfInt = (paramInt == 0) ? this.b.c() : this.b.d();
          } else if ((nj.e & 0x8) != 0) {
            arrayOfInt = (paramInt == 0) ? this.b.e() : this.b.f();
          } 
          if (arrayOfInt != null) {
            k1.a = arrayOfInt[0] + arrayOfInt[2] / 2;
            k1.b = arrayOfInt[1] + arrayOfInt[3] / 2;
            k1.c = arrayOfInt[2] - 2;
            k1.d = arrayOfInt[3] - 2;
          } 
          break;
      } 
      this.a.n();
      this.a.o();
      paramInt = a(parammw);
      int j = b(parammw);
      i = (parammw.d == 1 && parammw.g == 1) ? a(parammw) : ((parammw.d < 3) ? a(parammw) : ((parammw.g < 3) ? b(parammw) : ((paramInt > j) ? paramInt : j)));
    } 
    return i;
  }
  
  private int a(mw parammw) {
    return this.a.b(parammw);
  }
  
  private int b(mw parammw) {
    return this.a.a(parammw);
  }
  
  public final int a(int paramInt) {
    Image image = null;
    switch (paramInt) {
      case 1:
        image = f.d("/strwin");
        break;
      case 0:
        image = f.d("/strlose");
        break;
    } 
    return this.s.a(image);
  }
  
  private void a(int paramInt1, int paramInt2, k paramk, nj paramnj, int paramInt3, boolean paramBoolean) {
    if ((paramnj.e & 0x1) != 0)
      return; 
    try {
      nh nh = null;
      for (int i = this.p.d() - 1; i >= 0; i--) {
        nh nh1;
        if (!(nh1 = (nh)this.p.b(i)).m()) {
          nh = nh1;
          break;
        } 
      } 
      if (nh == null) {
        nh = new nh(this.k);
        this.p.a(nh);
      } 
      nh.a(paramInt1, paramInt2, paramk, paramnj.g, 0, false);
      return;
    } catch (OutOfMemoryError outOfMemoryError) {
      b(true);
      if (a.m != null)
        a.m.G(); 
      return;
    } 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    int[] arrayOfInt = null;
    k k1 = new k();
    switch (paramInt2) {
      case 1:
        arrayOfInt = (paramInt1 == 0) ? this.b.a() : this.b.b();
        break;
      case 2:
        arrayOfInt = (paramInt1 == 0) ? this.b.c() : this.b.d();
        break;
      case 3:
        arrayOfInt = (paramInt1 == 0) ? this.b.e() : this.b.f();
        break;
    } 
    if (arrayOfInt != null) {
      k1.a = arrayOfInt[0] + arrayOfInt[2] / 2;
      k1.b = arrayOfInt[1] + arrayOfInt[3] / 2;
      k1.c = arrayOfInt[2] - 2;
      k1.d = arrayOfInt[3] - 2;
      if (a.k == 0) {
        paramInt1 = arrayOfInt[0] + arrayOfInt[2] + 30;
        i = arrayOfInt[1] - 50;
        for (byte b1 = 0; b1 < 9; b1++) {
          if (b1 == 0 || b1 == 8) {
            a(paramInt1 + 30, i, k1, nj.a(paramInt2), 0, false);
          } else {
            a(paramInt1, i, k1, nj.a(paramInt2), 0, false);
          } 
          i += 12;
        } 
        return;
      } 
      paramInt1 = i[0] - 50;
      int i = i[1] - 30;
      for (byte b = 0; b < 9; b++) {
        if (b == 0 || b == 8) {
          a(paramInt1, i - 30, k1, nj.a(paramInt2), 0, false);
        } else {
          a(paramInt1, i, k1, nj.a(paramInt2), 0, false);
        } 
        paramInt1 += 12;
      } 
    } 
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramInt2 == 0)
      return; 
    boolean bool1 = this.h.b;
    boolean bool2 = this.h.e;
    d d = a.h;
    lg[][] arrayOfLg = this.h.a();
    String str = String.valueOf((paramInt2 >= 0) ? ((paramInt2 == 0) ? ((paramInt1 != 0) ? "-" : "+") : "+") : "") + paramInt2;
    for (paramInt1 = 0; paramInt1 < arrayOfLg.length; paramInt1++) {
      for (byte b = 0; b < (arrayOfLg[paramInt1]).length; b++) {
        if (arrayOfLg[paramInt1][b].j().equals(paramString)) {
          if ((bool1 || paramBoolean || bool2) && paramInt2 < 0) {
            d = bx.a;
            if (bool1 && paramBoolean) {
              d.a(12067023);
            } else if (bool1) {
              d.a(6290199);
            } else if (bool2 && paramBoolean) {
              d.a(16753920);
            } else if (bool2) {
              d.a(16776960);
            } else {
              d.a(2371791);
            } 
          } 
          this.v[paramInt1][b].a(str, this.b.a(paramInt1)[b].n() + this.b.a(paramInt1)[b].p() / 2, this.b.a(paramInt1)[b].o());
          this.v[paramInt1][b].a(this.b.a(paramInt1)[b]);
          this.v[paramInt1][b].a(d);
          if (paramInt1 == 1 && this.h.a(1, 0).b() && paramInt2 < 0 && this.h.a(1, 0).c() <= 50)
            a(this.D[0][cv.a((this.D[0]).length)], 50); 
          return;
        } 
      } 
    } 
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ne ne = null;
    int i;
    for (i = this.m.d() - 1; i >= 0; i--) {
      ne ne1;
      if (!(ne1 = (ne)this.m.b(i)).a()) {
        ne = ne1;
        break;
      } 
    } 
    if (ne == null) {
      ne = new ne(this.j);
      this.m.a(ne);
    } 
    i = (paramInt3 + paramInt5 / 2 - 2) * 28 - ((paramInt5 % 2 == 0) ? 14 : 4) + this.a.n();
    int j = (paramInt2 + paramInt4 / 2 - 2) * 28 - ((paramInt4 % 2 == 0) ? 14 : 5) + this.a.o();
    paramInt2 = paramInt1 - 1;
    ne.a(i, j, paramInt2, "x" + paramInt1);
  }
  
  private void c(int paramInt1, int paramInt2, int paramInt3) {
    a(paramInt1, paramInt2, paramInt3, false);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    this.b.a(paramInt1, paramInt2, paramBoolean);
    this.b.c(paramInt3);
  }
  
  private void a(mw parammw, int paramInt1, int paramInt2) {
    int i = parammw.c;
    int j = parammw.c + parammw.d;
    while (i < j) {
      nb nb = null;
      nd nd = this.a.a(parammw.b - 2, i - 2);
      for (int m = this.n.d() - 1; m >= 0; m--) {
        nb nb1;
        if (!(nb1 = (nb)this.n.b(m)).m()) {
          nb = nb1;
          break;
        } 
      } 
      if (nb == null) {
        nb = new nb(this.k);
        this.n.a(nb);
      } 
      nb.a(nd.n(), nd.o(), paramInt1, paramInt2, parammw.a.d * nb.q());
      i++;
    } 
  }
  
  private void b(mw parammw, int paramInt1, int paramInt2) {
    int i = parammw.e;
    int j = parammw.e + parammw.g;
    while (i < j) {
      nb nb = null;
      nd nd = this.a.a(i - 2, parammw.f - 2);
      for (int m = this.n.d() - 1; m >= 0; m--) {
        nb nb1;
        if (!(nb1 = (nb)this.n.b(m)).m()) {
          nb = nb1;
          break;
        } 
      } 
      if (nb == null) {
        nb = new nb(this.k);
        this.n.a(nb);
      } 
      nb.a(nd.n(), nd.o(), paramInt1, paramInt2, parammw.a.d * nb.q());
      i++;
    } 
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    a a1 = this.l[paramInt1];
    ip ip = null;
    for (byte b = 0; b < a1.d(); b++) {
      ip ip1;
      if ((ip1 = (ip)a1.b(b)).b == paramBoolean1 && ip1.a == paramInt2) {
        ip = ip1;
        break;
      } 
    } 
    if (ip == null)
      a1.a(new ip(paramInt2, paramBoolean1, 8)); 
    if (paramBoolean2)
      c(paramInt1); 
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    a a1 = this.l[paramInt1];
    for (byte b = 0; b < a1.d(); b++) {
      ip ip;
      if ((ip = (ip)a1.b(b)).b == paramBoolean && ip.a == paramInt2) {
        a1.a(b);
        return;
      } 
    } 
  }
  
  private void c(int paramInt) {
    int i = (this.h.a(paramInt, 0).a()).g / 2;
    if (this.C[paramInt] == null) {
      int[] arrayOfInt;
      this.C[paramInt] = new in(i);
      if (paramInt == 0) {
        arrayOfInt = new int[] { this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q() };
      } else {
        arrayOfInt = new int[] { this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q() };
      } 
      this.C[paramInt].c(arrayOfInt[0] + arrayOfInt[2] / 2, arrayOfInt[1] + arrayOfInt[3]);
    } 
    this.C[paramInt].r();
  }
  
  private void d(int paramInt) {
    int[] arrayOfInt;
    if (this.h.a(paramInt, 0).b())
      return; 
    this.h.d = false;
    if (this.B[paramInt] == null)
      this.B[paramInt] = new io(paramInt, this); 
    if (paramInt == 0) {
      arrayOfInt = new int[] { this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q() };
    } else {
      arrayOfInt = new int[] { this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q() };
    } 
    int i = (this.h.a(paramInt, 0).a()).g / 2;
    this.B[paramInt].a(i, (ni)this.b.a[paramInt], arrayOfInt[0] + arrayOfInt[2] / 2, arrayOfInt[1] + arrayOfInt[3] / 2);
    c(paramInt);
  }
  
  public final void b(int paramInt) {
    if (this.h.a(paramInt, 0).b())
      return; 
    if (this.B[paramInt] != null)
      this.B[paramInt].a(); 
    this.B[paramInt] = null;
  }
  
  public final int a(lv paramlv, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, int paramInt) {
    int i;
    int[] arrayOfInt1;
    int j;
    jg jg;
    int n;
    nd nd1;
    int m;
    int i5;
    jl jl;
    int[] arrayOfInt2;
    byte b1;
    nd nd2;
    byte b2;
    int[] arrayOfInt3;
    lv lv1;
    int i1 = paramInt + 1 & 0x1;
    int i2 = 10;
    int i3 = 0;
    int i4 = -180;
    if (paramInt == 0)
      i4 = 180; 
    int i6 = this.a.a(0, 0).p() >> 1;
    int i7 = this.a.a(0, 0).q() >> 1;
    if (paramInt == 0) {
      arrayOfInt2 = new int[] { this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q() };
      int[] arrayOfInt = { this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q() };
    } else {
      arrayOfInt2 = new int[] { this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q() };
      int[] arrayOfInt = { this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q() };
    } 
    switch (paramlv.a) {
      case 1000:
        paramInt = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i5 = arrayOfInt2[1] + arrayOfInt2[3] / 2;
        i3 = a(0, (lv1 = paramlv).a, paramInt - i4, i5 - 180, paramInt, i5, 10);
        a(i1, 32, 22, false);
        i2 = 10 + cv.a(7) + 5;
        for (b2 = 0; b2 < paramArrayOfbyte4.length; b2++) {
          paramInt = (nd2 = this.a.a(paramArrayOfbyte3[b2] - 2, paramArrayOfbyte4[b2] - 2)).n() + i6;
          i5 = nd2.o() + i7;
          i = 10 + cv.a(15);
          i3 = a(i3, (lv1 = paramlv).a, paramInt - i4, i5 - 180, paramInt, i5, i);
          if (i > i2)
            i2 = i; 
        } 
        break;
      case 1001:
        if (i != null) {
          for (b2 = 0; b2 < i.length; b2++) {
            nd2 = this.a.a(i[b2] - 2, paramArrayOfbyte2[b2] - 2);
            a(i[b2], paramArrayOfbyte2[b2], nj.a(10), i2 + 5);
            paramInt = nd2.n();
            i5 = nd2.o();
            i3 = a(i3, (lv1 = paramlv).a, paramInt, i5, paramInt, i5, i2);
            i2 += 4;
          } 
          i2 -= 4;
        } 
        break;
      case 1002:
        a(paramInt, 1, true, true);
        break;
      case 1003:
        d(paramInt);
        i2 += 30;
        break;
      case 1004:
        i4 = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i3 = arrayOfInt2[1] + arrayOfInt2[3];
        a(0, (lv1 = paramlv).a, i4, i3, i4, i3, 0);
        c(i1, 26, 16);
        break;
      case 1005:
        paramInt = nd2[0] + nd2[2] / 2;
        i5 = nd2[1] + nd2[3] / 2;
        i4 = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i3 = arrayOfInt2[1] + arrayOfInt2[3] / 2;
        a(0, (lv1 = paramlv).a, paramInt, i5, i4, i3, 4);
        c(i1, 20, 10);
        break;
      case 1006:
        paramInt = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i5 = arrayOfInt2[1] + arrayOfInt2[3];
        i3 = a(0, (lv1 = paramlv).a, paramInt - i4, i5 - 180, paramInt, i5, 10);
        c(i1, 36, 26);
        for (b2 = 0; b2 < paramArrayOfbyte4.length; b2++) {
          i = cv.a(7) + 4;
          paramInt = (nd2 = this.a.a(paramArrayOfbyte3[b2] + 1 - 2, paramArrayOfbyte4[b2] + 1 - 2)).n();
          i5 = nd2.o();
          i3 = a(i3, (lv1 = paramlv).a, paramInt - i4, i5 - 180, paramInt, i5, i);
          if (i > i2)
            i2 = i; 
        } 
        break;
      case 1007:
        paramInt = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i5 = arrayOfInt2[1] + arrayOfInt2[3];
        i3 = a(0, (lv1 = paramlv).a, paramInt, i5, paramInt, i5, 10);
        c(i1, 30, 11);
        for (b2 = 0; b2 < paramArrayOfbyte4.length; b2++) {
          i = cv.a(7) + 10;
          paramInt = (nd2 = this.a.a(paramArrayOfbyte3[b2] + 4 - 1 - 2, paramArrayOfbyte4[b2] + 2 - 1 - 2)).n() + i6;
          i5 = nd2.o() + i7;
          i3 = a(i3, (lv1 = paramlv).a, paramInt, i5, paramInt, i5, i);
          if (i > i2)
            i2 = i; 
        } 
        break;
      case 1008:
        c(i1, 10, 4);
        paramInt = (nd2 = this.a.a(7, paramArrayOfbyte4[0] + 1 - 2)).n() + i6;
        i5 = nd2.o() + i7;
        a(0, (lv1 = paramlv).a, paramInt, i5, paramInt, 0, 10);
        break;
      case 2000:
        arrayOfInt3 = new int[i.length + 1];
        j = (arrayOfInt1 = new int[i.length + 1]).length - 1;
        for (paramInt = 0; paramInt < j; paramInt++) {
          nd2 = this.a.a(i[paramInt] - 2, paramArrayOfbyte2[paramInt] - 2);
          arrayOfInt3[paramInt] = nd2.n();
          arrayOfInt1[paramInt] = nd2.o();
        } 
        i2 = 10 + arrayOfInt1.length * 5 + 5;
        c(i1, i2, i2 - 6);
        paramInt = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i5 = arrayOfInt2[1] + arrayOfInt2[3] / 2;
        arrayOfInt3[arrayOfInt3.length - 1] = paramInt;
        arrayOfInt1[arrayOfInt3.length - 1] = i5;
        i3 = a(0, (lv1 = paramlv).a, paramInt, i5, paramInt, i5, i2);
        (jg = (jg)this.o.b(i3)).a(arrayOfInt3, arrayOfInt1);
        break;
      case 2001:
        a(jg, 0, true, true);
        break;
      case 2002:
        a(jg, 2, true, true);
        break;
      case 2003:
        n = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i5 = arrayOfInt2[1] + arrayOfInt2[3] / 2;
        a(0, (lv1 = paramlv).a, n - i4, i5 - 180, n, i5, 10);
        c(i1, 36, 26);
        i2 = 14;
        break;
      case 2004:
        i5 = nd2[1] + nd2[3] / 2 + 6;
        i4 = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i3 = arrayOfInt2[1] + arrayOfInt2[3] / 2 + 6;
        if (n == 0) {
          i4 += 60;
          n = nd2[0] + nd2[2];
        } else {
          nd1 = nd2[0];
          i4 -= 60;
        } 
        a(0, (lv1 = paramlv).a, nd1, i5, i4, i3, 10);
        c(i1, 20, 10);
        i2 = 10;
        if (this.h.a(i1, 0).i())
          a(i1, 1, false, false); 
        break;
      case 2005:
        d(nd1);
        i2 += 30;
        break;
      case 2006:
        i5 = nd2[1] + nd2[3] / 2 + 4;
        i4 = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i = (v.t - mv.a()) / 2;
        if (nd1 == null) {
          i -= 56;
          i3 = a(0, (lv1 = paramlv).a, i - cv.a(150), i5, i4, i5, 6);
          c(i1, 16, 10);
          i4 = i + mv.a() + 100;
          for (i6 = 0; i6 < arrayOfInt1.length; i6++) {
            nd2 = this.a.a(arrayOfInt1[i6] - 2, 0);
            i3 = a(i3, (lv1 = paramlv).a, i - (((i6 & 0x1) == 1) ? 40 : 0), nd2.o(), i4, nd2.o(), 6);
          } 
          i5 -= 40;
          for (i6 = 0; i6 < 3; i6++) {
            i3 = a(i3, (lv1 = paramlv).a, i - cv.a(150), i5, i4, i5, 6);
            i5 += 20;
          } 
        } else {
          i3 = a(0, (lv1 = paramlv).a, i + mv.a() + cv.a(150), i5, i4, i5, 6);
          c(i1, 16, 10);
          i4 = i - 100;
          i += mv.a();
          for (i6 = 0; i6 < arrayOfInt1.length; i6++) {
            nd2 = this.a.a(arrayOfInt1[i6] - 2, 0);
            i3 = a(i3, (lv1 = paramlv).a, i + (((i6 & 0x1) == 1) ? 40 : 0), nd2.o(), i4, nd2.o(), 6);
          } 
          i5 -= 40;
          for (i6 = 0; i6 < 3; i6++) {
            i3 = a(i3, (lv1 = paramlv).a, i + cv.a(150), i5, i4, i5, 6);
            i5 += 20;
          } 
        } 
        i2 = 5;
        break;
      case 2007:
        for (i6 = 0; i6 < j.length; i6++) {
          int i8 = (nd2 = this.a.a(arrayOfInt1[i6] + 1 - 2, j[i6] + 1 - 2)).n();
          i5 = nd2.o() - i7;
          i = 10 + cv.a(10) + 5;
          i3 = a(i3, (lv1 = paramlv).a, i8, i5, i8, 0, i + (i6 << 1));
          if (i > i2)
            i2 = i; 
        } 
        m = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i5 = arrayOfInt2[1] + arrayOfInt2[3] - 10;
        a(i3, (lv1 = paramlv).a, m, i5, m, 0, i2 - 15);
        c(i1, i2, i2 - 6);
        break;
      case 2008:
        i4 = arrayOfInt2[0] + arrayOfInt2[2] / 2;
        i3 = arrayOfInt2[1] + arrayOfInt2[3] / 2;
        i3 = a(0, (lv1 = paramlv).a, 0, 0, i4, i3, 0);
        (jl = (jl)this.o.b(i3)).s = i.length;
        for (b1 = 0; b1 < i.length; b1++) {
          nd2 = this.a.a(i[b1] - 2, paramArrayOfbyte2[b1] - 2);
          jl.t[b1].c(nd2.n(), nd2.o());
        } 
        a(i1, 32, 22, false);
        i2 = 0;
        break;
      case 4000:
        m = b1[0] + b1[2] / 2;
        i5 = b1[1] + b1[3] / 2;
        i3 = a(0, (lv1 = paramlv).a, m - i4, i5 - 180, m, i5, 10);
        a(i1, 32, 22, false);
        i2 = 10 + cv.a(7) + 5;
        for (b1 = 0; b1 < j.length; b1++) {
          m = (nd2 = this.a.a(arrayOfInt1[b1] - 2, j[b1] - 2)).n() + jl;
          i5 = nd2.o() + i7;
          i = 10 + cv.a(15);
          i3 = a(i3, (lv1 = paramlv).a, m - i4, i5 - 180, m, i5, i);
          if (i > i2)
            i2 = i; 
        } 
        break;
      case 4001:
        m = nd2[0] + nd2[2] / 2;
        i5 = nd2[1] + nd2[3] - 10;
        a(0, (lv1 = paramlv).a, m, i5, m, i5, 10);
        this.b.c(10);
        i2 = 14;
        break;
      case 4002:
        m = nd2[0] + nd2[2] / 2;
        i5 = nd2[1] + nd2[3] / 2 + 6;
        i4 = b1[0] + b1[2] / 2;
        a(0, (lv1 = paramlv).a, m, i5, i4, i5, 10);
        a(i1, 1, false, false);
        i2 = 15;
        break;
      case 4003:
        i4 = b1[0] + b1[2] / 2;
        i3 = b1[1] + b1[3];
        a(0, (lv1 = paramlv).a, i4, i3, i4, i3, 10);
        this.b.a(i1, 10);
        c(i1, 15, 16);
        i2 = 13;
        break;
      case 4004:
        d(m);
        i2 += 30;
        break;
      case 4005:
        m = nd2[0] + nd2[2] / 2;
        i5 = nd2[1] + nd2[3] / 2;
        i4 = b1[0] + b1[2] / 2;
        i3 = b1[1] + b1[3] / 2;
        a(0, (lv1 = paramlv).a, m, i5, i4, i3, 4);
        c(i1, 26, 16);
        break;
      case 4006:
        i4 = b1[0] + b1[2] / 2;
        i3 = b1[1] + b1[3] / 2;
        i3 = a(0, (lv1 = paramlv).a, i4, i3 - 180, i4, i3, 0);
        c(i1, 20, 10);
        for (b1 = 0; b1 < j.length; b1++) {
          i = cv.a(15) + 10;
          m = (nd2 = this.a.a(arrayOfInt1[b1] + 1 - 2, j[b1] + 1 - 2)).n();
          i5 = nd2.o();
          i3 = a(i3, (lv1 = paramlv).a, m, i5 - 180, m, i5, i);
          if (i > i2)
            i2 = i; 
        } 
        break;
      case 4007:
        for (b1 = 0; b1 < j.length; b1++) {
          m = (nd2 = this.a.a(arrayOfInt1[b1] + 3 - 1 - 2, j[b1] + 1 - 2)).n();
          i5 = nd2.o() + i7;
          i = 10 + cv.a(15);
          i3 = a(i3, (lv1 = paramlv).a, m, i5, m, 0, i);
          if (i > i2)
            i2 = i; 
        } 
        c(i1, i2, i2 - 6);
        break;
      case 4008:
        m = b1[0] + b1[2] / 2;
        i5 = b1[1] + b1[3] / 2;
        i3 = a(0, (lv1 = paramlv).a, m - i4, i5 - 180, m, i5, 10);
        a(i1, 32, 22, false);
        i2 = 10 + cv.a(7) + 5;
        for (b1 = 0; b1 < j.length; b1++) {
          m = (nd2 = this.a.a(arrayOfInt1[b1] - 2, j[b1] - 2)).n() + jl;
          i5 = nd2.o() + i7;
          i = 10 + cv.a(20);
          i3 = a(i3, (lv1 = paramlv).a, m - i4, i5 - 180, m, i5, i);
          if (i > i2)
            i2 = i; 
        } 
        break;
    } 
    return i2 - 3;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: istore #9
    //   5: istore #8
    //   7: astore_1
    //   8: iload #8
    //   10: ifge -> 17
    //   13: iconst_m1
    //   14: goto -> 76
    //   17: iload #8
    //   19: istore #8
    //   21: goto -> 63
    //   24: aload_1
    //   25: getfield o : La;
    //   28: iload #8
    //   30: invokevirtual b : (I)Ljava/lang/Object;
    //   33: checkcast im
    //   36: dup
    //   37: astore #10
    //   39: invokevirtual m : ()Z
    //   42: ifne -> 60
    //   45: aload #10
    //   47: invokevirtual r : ()I
    //   50: iload #9
    //   52: if_icmpne -> 60
    //   55: iload #8
    //   57: goto -> 76
    //   60: iinc #8, 1
    //   63: iload #8
    //   65: aload_1
    //   66: getfield o : La;
    //   69: invokevirtual d : ()I
    //   72: if_icmplt -> 24
    //   75: iconst_m1
    //   76: dup
    //   77: istore_1
    //   78: ifle -> 97
    //   81: aload_0
    //   82: getfield o : La;
    //   85: iload_1
    //   86: invokevirtual b : (I)Ljava/lang/Object;
    //   89: checkcast im
    //   92: astore #8
    //   94: goto -> 555
    //   97: iload_2
    //   98: lookupswitch default -> 528, 1000 -> 276, 1001 -> 288, 1004 -> 300, 1005 -> 312, 1006 -> 324, 1007 -> 336, 1008 -> 348, 2000 -> 360, 2003 -> 372, 2004 -> 384, 2006 -> 396, 2007 -> 408, 2008 -> 420, 4000 -> 432, 4001 -> 444, 4002 -> 456, 4003 -> 468, 4005 -> 480, 4006 -> 492, 4007 -> 504, 4008 -> 516
    //   276: new is
    //   279: dup
    //   280: invokespecial <init> : ()V
    //   283: astore #8
    //   285: goto -> 530
    //   288: new it
    //   291: dup
    //   292: invokespecial <init> : ()V
    //   295: astore #8
    //   297: goto -> 530
    //   300: new iu
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: astore #8
    //   309: goto -> 530
    //   312: new iv
    //   315: dup
    //   316: invokespecial <init> : ()V
    //   319: astore #8
    //   321: goto -> 530
    //   324: new iw
    //   327: dup
    //   328: invokespecial <init> : ()V
    //   331: astore #8
    //   333: goto -> 530
    //   336: new ix
    //   339: dup
    //   340: invokespecial <init> : ()V
    //   343: astore #8
    //   345: goto -> 530
    //   348: new iy
    //   351: dup
    //   352: invokespecial <init> : ()V
    //   355: astore #8
    //   357: goto -> 530
    //   360: new jg
    //   363: dup
    //   364: invokespecial <init> : ()V
    //   367: astore #8
    //   369: goto -> 530
    //   372: new jh
    //   375: dup
    //   376: invokespecial <init> : ()V
    //   379: astore #8
    //   381: goto -> 530
    //   384: new ji
    //   387: dup
    //   388: invokespecial <init> : ()V
    //   391: astore #8
    //   393: goto -> 530
    //   396: new jj
    //   399: dup
    //   400: invokespecial <init> : ()V
    //   403: astore #8
    //   405: goto -> 530
    //   408: new jk
    //   411: dup
    //   412: invokespecial <init> : ()V
    //   415: astore #8
    //   417: goto -> 530
    //   420: new jl
    //   423: dup
    //   424: invokespecial <init> : ()V
    //   427: astore #8
    //   429: goto -> 530
    //   432: new iz
    //   435: dup
    //   436: invokespecial <init> : ()V
    //   439: astore #8
    //   441: goto -> 530
    //   444: new ja
    //   447: dup
    //   448: invokespecial <init> : ()V
    //   451: astore #8
    //   453: goto -> 530
    //   456: new jb
    //   459: dup
    //   460: invokespecial <init> : ()V
    //   463: astore #8
    //   465: goto -> 530
    //   468: new jc
    //   471: dup
    //   472: invokespecial <init> : ()V
    //   475: astore #8
    //   477: goto -> 530
    //   480: new jd
    //   483: dup
    //   484: invokespecial <init> : ()V
    //   487: astore #8
    //   489: goto -> 530
    //   492: new je
    //   495: dup
    //   496: invokespecial <init> : ()V
    //   499: astore #8
    //   501: goto -> 530
    //   504: new jf
    //   507: dup
    //   508: invokespecial <init> : ()V
    //   511: astore #8
    //   513: goto -> 530
    //   516: new iz
    //   519: dup
    //   520: invokespecial <init> : ()V
    //   523: astore #8
    //   525: goto -> 530
    //   528: iconst_m1
    //   529: ireturn
    //   530: aload #8
    //   532: iload_2
    //   533: invokevirtual l : (I)V
    //   536: aload_0
    //   537: getfield o : La;
    //   540: aload #8
    //   542: invokevirtual a : (Ljava/lang/Object;)V
    //   545: aload_0
    //   546: getfield o : La;
    //   549: invokevirtual d : ()I
    //   552: iconst_1
    //   553: isub
    //   554: istore_1
    //   555: aload #8
    //   557: iload_3
    //   558: iload #4
    //   560: iload #5
    //   562: iload #6
    //   564: iload #7
    //   566: invokevirtual a : (IIIII)V
    //   569: iload_1
    //   570: ireturn
  }
  
  public final void a(boolean paramBoolean) {
    this.b.a(paramBoolean);
  }
  
  public final void a(bf parambf) {
    if (this.w != null) {
      this.w.b(parambf);
      return;
    } 
    a.s().a("Kiểu quyết đấu: Không chơi Tuyệt Chiêu");
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt3 = 112 + this.a.n() - 14;
    paramInt4 = 112 + this.a.o() - 14;
    this.t.a("Còn " + paramInt2 + " lượt", paramInt3, paramInt4);
    if (paramInt1 == 0) {
      this.t.a(bx.c);
      return;
    } 
    this.t.a(a.h);
  }
  
  public final void j() {
    mh mh1;
    k k1 = (mh1 = this.a).a;
    this.u.a("Hết nước đi!", k1.a + k1.c / 2, k1.b + k1.d / 2);
  }
  
  public final void c(String paramString) {
    mh mh1;
    k k1 = (mh1 = this.a).a;
    this.c.a(paramString, k1.a + k1.c / 2, k1.b + k1.d / 2);
  }
  
  public final void k() {
    this.z.a("Vui lòng đừng gửi quá nhanh!", 0);
  }
  
  public final void l() {
    this.o.a();
  }
  
  public final void b(boolean paramBoolean) {
    mt mt1;
    (mt1 = this).n.a();
    (mt1 = this).m.a();
    (mt1 = this).p.a();
    if (paramBoolean) {
      mt mt2;
      (mt2 = this).o.a();
    } 
    System.gc();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */