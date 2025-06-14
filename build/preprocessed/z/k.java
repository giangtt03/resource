public final class k {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public k() {}
  
  public k(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    return (paramInt1 > this.a && paramInt1 < this.a + this.c && paramInt2 > this.b && paramInt2 < this.b + this.d);
  }
  
  public final boolean a(k paramk) {
    return b(paramk.a, paramk.b, paramk.c, paramk.d);
  }
  
  public final boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.c;
    int j = this.d;
    paramInt3 = paramInt3;
    paramInt4 = paramInt4;
    if (paramInt3 <= 0 || paramInt4 <= 0 || i <= 0 || j <= 0)
      return false; 
    int m = this.a;
    int n = this.b;
    paramInt1 = paramInt1;
    paramInt2 = paramInt2;
    paramInt3 += paramInt1;
    paramInt4 += paramInt2;
    i += m;
    j += n;
    return ((paramInt3 < paramInt1 || paramInt3 > m) && (paramInt4 < paramInt2 || paramInt4 > n) && (i < m || i > paramInt1) && (j < n || j > paramInt2));
  }
  
  public final boolean b(int paramInt1, int paramInt2) {
    int i = this.c;
    int j = this.d;
    if ((i | j) < 0)
      return false; 
    int m = this.a;
    int n = this.b;
    if (paramInt1 < m || paramInt2 < n)
      return false; 
    i += m;
    j += n;
    return ((i < m || i > paramInt1) && (j < n || j > paramInt2));
  }
  
  public final String toString() {
    String str;
    return str = "[X]: " + this.a + " [Y]: " + this.b + " [W]: " + this.c + " [H]: " + this.d;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */