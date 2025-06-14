import com.mg.sq.a;

public final class ls extends o {
  public ls() {}
  
  public ls(d paramd, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super(paramd, paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public ls(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super(bx.d, paramString, paramInt1, 0, paramInt3, paramInt4, paramInt5);
  }
  
  protected final void a(String paramString, int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4) {
    paramInt1 = (int)(paramLong >>> 32L);
    int i = (int)paramLong;
    if (paramInt1 + 16 > paramInt4) {
      i += paramInt3;
      paramInt1 = 0;
    } 
    this.a.a(new lo(paramString, 1, paramInt2, paramInt1, i, 16));
  }
  
  protected final n a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    n n;
    switch ((n = super.a(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5)).c()) {
      case 3:
      case 4:
      case 5:
        ((q)n).a(a.g);
        break;
    } 
    return n;
  }
  
  public final int f(int paramInt) {
    int i = paramInt;
    a a = this.a;
    for (byte b = 0; b < a.d(); b++) {
      n n;
      if ((n = (n)a.b(b)).c() == i)
        return b; 
    } 
    return -1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ls.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */