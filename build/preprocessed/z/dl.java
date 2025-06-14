public final class dl {
  public ls a;
  
  public String b;
  
  public String c;
  
  public lo d;
  
  public long e;
  
  public int f;
  
  public int g;
  
  public int h = -1;
  
  public int i = 0;
  
  public int j = 0;
  
  public int k = 0;
  
  public boolean l = false;
  
  public int[] m;
  
  public boolean n = false;
  
  public boolean o = false;
  
  public ls p = null;
  
  public dl(ef paramef, int paramInt) {
    this.e = paramef.e();
    this.f = paramef.h();
    this.c = paramef.b();
    this.g = paramef.f() - 1;
    this.i = paramef.j();
    this.j = paramef.k();
    this.k = paramef.i();
    this.l = (paramef.m() == 1);
    if (!oy.g)
      this.g = -1; 
    int i = 0;
    if (this.g >= 0 && this.g < 20) {
      i = oy.c[this.g] + 2;
    } else {
      this.g = -1;
    } 
    if (paramef.g() != null)
      this.d = new lo("#\033" + paramef.g() + "#", 1, -1, 0, 0, 16); 
    this.a = new ls(paramef.c(), i, 0, paramInt - i, bx.d.a(), 2);
    if (pc.a(this.f))
      i -= 20; 
    q q = new q("@" + go.e, 4, -1, 3 - i, -21, bx.c.a(this.c), bx.c);
    this.a.d().b(q, 0);
    if (this.c.equals(go.e)) {
      this.m = new int[0];
    } else {
      int[] arrayOfInt = g.a(this.a.d(), 4);
      this.m = new int[arrayOfInt.length - 1];
      System.arraycopy(arrayOfInt, 1, this.m, 0, this.m.length);
    } 
    String[] arrayOfString;
    if (!i.b(paramef.l()) && (arrayOfString = i.a(paramef.l(), ";", -1, true)) != null && arrayOfString.length > 0) {
      String str = String.valueOf(this.j) + " người thích: ";
      boolean bool = false;
      if (arrayOfString[0].equals(go.e)) {
        str = String.valueOf(str) + "Bạn ";
        bool = true;
      } else {
        str = String.valueOf(str) + "@" + arrayOfString[0];
      } 
      byte b = 1;
      int j = arrayOfString.length;
      while (b < j) {
        if (b == 1 && bool) {
          str = String.valueOf(str) + "và @" + arrayOfString[b];
        } else {
          str = String.valueOf(str) + ", @" + arrayOfString[b];
        } 
        b++;
      } 
      if (arrayOfString.length < this.j)
        str = String.valueOf(str) + ",..."; 
      this.p = new ls(str, 0, 0, paramInt - 4, bx.d.a(), 2);
    } 
    q.a("");
    this.h = 0;
    this.a.a(true);
  }
  
  public final ls a() {
    return a(this.h);
  }
  
  public final ls a(int paramInt) {
    return (paramInt >= 1000) ? this.p : this.a;
  }
  
  public static int b(int paramInt) {
    return (paramInt >= 1000) ? (paramInt - 1000) : paramInt;
  }
  
  public final void a(long paramLong) {
    l2 /= 365L;
    long l1;
    long l2;
    this.b = ((l2 = (l2 = Math.abs(l2 = l1 = paramLong)) / 1000L) == 0L) ? "vừa tức thì" : ((l2 < 60L) ? (String.valueOf(l2) + " giây trước") : (((l2 /= 60L) < 60L) ? (String.valueOf(l2) + " phút trước") : (((l2 /= 60L) < 24L) ? (String.valueOf(l2) + " giờ trước") : (((l2 /= 24L) < 30L) ? (String.valueOf(l2) + " ngày trước") : ((l2 < 365L) ? (String.valueOf(l2 / 30L) + " tháng trước") : (String.valueOf(l2) + " năm trước"))))));
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */