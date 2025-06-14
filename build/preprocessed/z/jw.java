public final class jw extends jv {
  public final void a(int paramInt, kl paramkl) {}
  
  public final void a(int paramInt) {}
  
  public final void a(at paramat, kh paramkh) {
    int i;
    int j;
    int k;
    int m;
    kf kf = (kf)paramkh.a(1);
    ju ju;
    (ju = (ju)paramat).i();
    switch (ju.h()) {
      case 1:
        ju.g(ju.o() - ju.t);
        ju.f(ju.n() + ju.u * ju.w);
        ju.t--;
        if (ju.t == 0)
          ju.a((byte)2); 
        a(ju, paramkh, kf);
        break;
      case 2:
        ju.g(ju.o() + ju.t);
        ju.f(ju.n() + ju.u * ju.w);
        ju.t++;
        if (ju.t > ju.s)
          ju.t = ju.s; 
        i = (ju.n() + ju.p() / 2) / 32;
        j = (ju.o() + ju.q()) / 32;
        k = ju.n() / 32;
        m = (ju.n() + ju.p()) / 32;
        if (kh.l(kf.b(j, m))) {
          i = 32 - (ju.n() + ju.p()) % 32;
          ju.c(ju.n(), (j << 5) - ju.q() + i);
          break;
        } 
        if (kh.d(kf.b(j, k))) {
          ju.c(ju.n(), (j << 5) - ju.q() + ju.n() % 32);
          break;
        } 
        if (kh.c(kf.b(j, i))) {
          ju.a((byte)0);
          ju.g((j << 5) - ju.q());
        } 
        break;
    } 
    a(ju, paramkh, kf);
  }
  
  private static void a(ju paramju, kh paramkh, kf paramkf) {
    if (paramju.n() < 0) {
      paramju.f(0);
    } else if (paramju.n() + paramju.p() > paramkh.p()) {
      paramju.f(paramkh.p() - paramju.p());
    } 
    if (paramju.w == -1) {
      int i = paramju.n() / 32;
      int j = (paramju.o() + paramju.q() / 2) / 32;
      if (paramkh.n(paramkf.b(j, i))) {
        paramju.f(i + 1 << 5);
        paramju.w = 0;
        return;
      } 
    } else if (paramju.w == 1) {
      int i = (paramju.n() + paramju.p()) / 32;
      int j = (paramju.o() + paramju.q() / 2) / 32;
      if (paramkh.n(paramkf.b(j, i))) {
        paramju.f(i - 1 << 5);
        paramju.w = 0;
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */