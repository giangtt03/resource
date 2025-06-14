public final class mo extends mq {
  private int z;
  
  private int A;
  
  private int B;
  
  private int C;
  
  private int D;
  
  public mo(ms paramms, mt parammt, oq paramoq) {
    super(paramms, parammt, paramoq);
    this.o = 0;
    ct.a("[playingController]=======================Fighting========================");
  }
  
  public final void b(int paramInt) {
    if (this.t) {
      if (paramInt >= 148 && paramInt <= 157) {
        this.t = false;
        e(paramInt - 148);
        return;
      } 
    } else if ((v.a() && paramInt == 142) || (!v.a() && paramInt == 135)) {
      this.t = true;
    } 
    mt mt;
    if ((mt = this.b).d.i()) {
      if (paramInt == 99) {
        this.b.b();
        return;
      } 
      if (paramInt == 95) {
        this.b.a(this.b.d.r());
        this.b.d.c("");
        this.b.b();
        return;
      } 
      this.b.d.f(paramInt);
      return;
    } 
    if ((v.ai && (paramInt < 93 || paramInt > 99)) || (paramInt >= 148 && paramInt <= 157)) {
      this.b.a();
      this.b.d.f(paramInt);
      return;
    } 
    if (oq.o == 1) {
      if (this.h == 0 && !this.u) {
        this.c[this.h].a(paramInt);
        return;
      } 
    } else if (this.d == 8 && this.h == 0 && !this.u) {
      this.c[this.h].a(paramInt);
    } 
  }
  
  public final void c(int paramInt) {
    if (this.t && ((v.a() && paramInt == 142) || (!v.a() && paramInt == 135)))
      this.t = false; 
    mt mt;
    if ((mt = this.b).d.i())
      this.b.d.g(paramInt); 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if (this.b.d.h().b(paramInt1, paramInt2)) {
      mt mt1;
      if ((mt1 = this.b).d.i()) {
        this.b.d.g(false);
        return;
      } 
      this.b.a();
      return;
    } 
    mt mt;
    if ((mt = this.b).d.i()) {
      if (!this.b.d.h().b(paramInt1, paramInt2))
        this.b.b(); 
      return;
    } 
    if (oq.o == 1) {
      if (this.h == 0 && !this.u) {
        this.c[this.h].a(paramInt1, paramInt2);
        return;
      } 
    } else if (this.d == 8 && this.h == 0 && !this.u) {
      this.c[this.h].a(paramInt1, paramInt2);
    } 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    if (this.d == 8 && this.h == 0 && !this.u)
      this.c[this.h].b(paramInt1, paramInt2); 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    if (this.d == 8 && this.h == 0);
  }
  
  protected final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ct.a("[playingcontroller ]  actionOpponentSwapChess");
    if (this.k) {
      this.b.a(paramInt1, this.i, this.j, paramInt2, paramInt3);
      this.z = 20;
      this.A = paramInt2;
      this.B = paramInt4;
      this.C = paramInt3;
      this.D = paramInt5;
      this.r = paramInt1;
      return;
    } 
    super.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public final void a(boolean paramBoolean) {
    ct.a(String.valueOf(go.k.b) + "    receiveTurn = " + paramBoolean);
    if (!paramBoolean && this.k)
      this.b.a(1, this.i, this.j); 
    super.a(paramBoolean);
    if (oq.o != 1 && !paramBoolean && this.k)
      ks.a().d(this.m); 
  }
  
  protected final void e(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: ifne -> 130
    //   4: aload_0
    //   5: getfield b : Lmt;
    //   8: getfield g : Lhl;
    //   11: invokevirtual w : ()[Llm;
    //   14: astore_3
    //   15: new a
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: astore #4
    //   24: iconst_0
    //   25: istore #5
    //   27: goto -> 76
    //   30: aload_3
    //   31: iload #5
    //   33: aaload
    //   34: getfield a : I
    //   37: iload_2
    //   38: if_icmpne -> 64
    //   41: aload_3
    //   42: iload #5
    //   44: aaload
    //   45: dup
    //   46: getfield g : I
    //   49: iconst_1
    //   50: isub
    //   51: putfield g : I
    //   54: aload_3
    //   55: iload #5
    //   57: aaload
    //   58: getfield g : I
    //   61: ifle -> 73
    //   64: aload #4
    //   66: aload_3
    //   67: iload #5
    //   69: aaload
    //   70: invokevirtual a : (Ljava/lang/Object;)V
    //   73: iinc #5, 1
    //   76: iload #5
    //   78: aload_3
    //   79: arraylength
    //   80: if_icmplt -> 30
    //   83: aload #4
    //   85: invokevirtual d : ()I
    //   88: anewarray lm
    //   91: astore_3
    //   92: iconst_0
    //   93: istore #5
    //   95: goto -> 115
    //   98: aload_3
    //   99: iload #5
    //   101: aload #4
    //   103: iload #5
    //   105: invokevirtual b : (I)Ljava/lang/Object;
    //   108: checkcast lm
    //   111: aastore
    //   112: iinc #5, 1
    //   115: iload #5
    //   117: aload_3
    //   118: arraylength
    //   119: if_icmplt -> 98
    //   122: aload_0
    //   123: getfield b : Lmt;
    //   126: aload_3
    //   127: invokevirtual a : ([Llm;)V
    //   130: aload_0
    //   131: iload_1
    //   132: iload_2
    //   133: invokespecial e : (II)V
    //   136: return
  }
  
  protected final void f(int paramInt1, int paramInt2) {
    if (this.d != 8 || this.h != 1)
      return; 
    super.f(paramInt1, paramInt2);
  }
  
  public final void b() {
    if (this.z > 0) {
      this.z--;
      if (this.z == 0)
        super.a(this.r, this.A, this.C, this.B, this.D); 
      return;
    } 
    super.b();
  }
  
  protected final void c() {
    switch (this.g) {
      case 2:
        oa.d = false;
        break;
      default:
        oa.d = true;
        break;
    } 
    p();
  }
  
  protected final void d() {
    if (this.h == 0) {
      mt mt;
      if ((mt = this.b).e.d() && oq.o == 0) {
        d(15);
        return;
      } 
      if (this.b.e.e()) {
        ms ms = this.a;
        mo mo1 = this;
        a a = new a();
        byte b = 2;
      } 
    } 
  }
  
  protected final void e() {
    if (!this.f) {
      ks.a().s();
      d(15);
      this.b.c("Đang đợi đối thủ!");
      return;
    } 
    d(7);
  }
  
  public final boolean f() {
    return (this.h == 0 && this.d == 8);
  }
  
  protected final boolean b(nq paramnq) {
    if (this.o != -1) {
      if (this.m == paramnq.b && this.o != paramnq.c) {
        if (oq.o != 1) {
          this.o = -1;
          this.l.c();
          ks.a().t();
          return true;
        } 
        if (this.o == 5) {
          this.b.b.b(0);
        } else if (this.o == 3) {
          d(2);
        } 
        this.o = -1;
        return false;
      } 
      if (this.m != paramnq.b) {
        this.l.c();
        ks.a().t();
        this.o = -1;
      } 
    } else if (this.n > this.m + 1) {
      this.l.c();
      ks.a().t();
      return true;
    } 
    return false;
  }
  
  public final boolean g() {
    return a(this.i, this.j, this.i - 1, this.j);
  }
  
  public final boolean h() {
    return a(this.i, this.j, this.i + 1, this.j);
  }
  
  public final boolean i() {
    return a(this.i, this.j, this.i, this.j - 1);
  }
  
  public final boolean j() {
    return a(this.i, this.j, this.i, this.j + 1);
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.s) {
      this.s = false;
      this.b.b(false);
    } 
    int j = paramInt4;
    int i = paramInt3;
    boolean bool;
    if (!(((bool = this.a.c()) && (i < 2 || i >= 10 || j < 2 || j >= 10)) ? 0 : 1))
      return false; 
    if (this.a.b()) {
      ms ms;
      this.p = oz.a((ms = this.a).l);
      boolean bool1 = a(paramInt1, paramInt2, paramInt3, paramInt4, false);
      this.o = 3;
      if (bool1) {
        ks.a().a(paramInt1, paramInt2, paramInt3, paramInt4, this.m);
        this.m++;
        int n = paramInt4;
        int m = paramInt3;
        j = paramInt2;
        i = paramInt1;
        mt mt;
        nd nd1 = (mt = this.b).a.a(i - 2, j - 2);
        nd nd2 = mt.a.a(m - 2, n - 2);
        m = nd1.n() - (nd1.n() - nd2.n() >> 1) - (mt.f.p() >> 1);
        int k = nd1.o() - (nd1.o() - nd2.b() >> 1) - (mt.f.q() >> 1);
        mt.f.c(m, k);
        mt.f.b(true);
      } else {
        a(a(this.a.a(0, 0).j(), paramInt1, paramInt2, paramInt3, paramInt4, this.m));
        this.q = true;
      } 
      if (oq.o == 1) {
        this.a.b(false);
        this.b.a(0, paramInt3, paramInt4, paramInt1, paramInt2);
        this.i = paramInt3;
        this.j = paramInt4;
      } 
      return bool1;
    } 
    if (paramInt3 < 2) {
      paramInt3 = 9;
    } else if (paramInt3 >= 10) {
      paramInt3 = 2;
    } 
    if (paramInt4 < 2) {
      paramInt4 = 9;
    } else if (paramInt4 >= 10) {
      paramInt4 = 2;
    } 
    h(paramInt3, paramInt4);
    this.b.a(0, this.i, this.j, paramInt3, paramInt4);
    this.i = paramInt3;
    this.j = paramInt4;
    return true;
  }
  
  public final void a(nq paramnq) {
    while (this.o != -1) {
      if (this.m == paramnq.b) {
        if (this.w != null) {
          this.l.a(paramnq);
          this.n = paramnq.b;
          this.o = -1;
          paramnq = this.w;
          this.w = null;
          this = this;
          continue;
        } 
        if (this.o != paramnq.c) {
          if (this.o == 5) {
            this.b.b.b(0);
            break;
          } 
          if (this.o == 3)
            d(2); 
        } 
        break;
      } 
      if (this.m + 1 == paramnq.b) {
        this.w = paramnq;
        return;
      } 
      this.l.c();
      ks.a().t();
      this.o = -1;
    } 
    this.l.a(paramnq);
    if (paramnq.b >= 0)
      this.n = paramnq.b; 
    this.o = -1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */