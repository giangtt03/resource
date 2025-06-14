public final class kj extends jv {
  public final void a(ki paramki, kl paramkl, byte[][] paramArrayOfbyte, kh paramkh, boolean paramBoolean) {
    if (paramki != null) {
      int i;
      int j;
      kl kl1;
      ki ki1;
      k k1;
      int k;
      ki ki2;
      paramki.i();
      switch (paramki.a()) {
        case 0:
          k1 = (ki2 = paramki).e;
          if (paramkl != null && paramBoolean && paramki.m() && (paramkl.j == 1 || paramkl.j == 0) && (kl1 = paramkl).t.a(k1) && paramkl.m()) {
            j = (paramki.e.a > paramkl.t.a) ? 2 : 3;
            paramki.a(1, j);
            paramkl.b((j == 2) ? 8 : 4);
            return;
          } 
          paramki.b(paramki.d * ki.a[paramki.c], paramki.d * ki.b[paramki.c]);
          k = j;
          i = ((ki1 = paramki).o() + ki1.q() - 5) / 32;
          j = (ki1.n() + (((ki2 = ki1).c == 2) ? 0 : ki1.e.c)) / 32;
          if (k[i][j] != 0)
            ki1.a(0, ((ki2 = ki1).c == 2) ? 3 : 2); 
          break;
      } 
      if (paramkh.a(paramki))
        paramki.a(0, ((ki2 = paramki).c == 2) ? 3 : (((ki2 = paramki).c == 3) ? 2 : (((ki2 = paramki).c == 0) ? 1 : 0))); 
    } 
  }
  
  public final void a(int paramInt, kl paramkl) {}
  
  public final void a(int paramInt) {}
  
  public final void a(at paramat, kh paramkh) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */