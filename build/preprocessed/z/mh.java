import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mh extends at implements mr {
  private static byte[][] b = new byte[][] { { -1 }, new byte[1], { 
        1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 
        6, 6 }, new byte[1], new byte[1], new byte[1], new byte[1] };
  
  private Image[] c;
  
  private nd[][] d;
  
  k a;
  
  public static void a() {
    b = null;
  }
  
  public mh() {
    if (b == null)
      b = new byte[][] { { -1 }, new byte[1], { 
            1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 
            6, 6 }, new byte[1], new byte[1], new byte[1], new byte[1] }; 
    mh mh1;
    (mh1 = this).c = (mp.a()).c;
    this.d = new nd[8][8];
    this.a = new k();
    this.o = 224;
    this.p = 224;
    this.a.a(this.m, this.n, this.o, this.p);
    byte b1;
    for (b1 = 0; b1 < 8; b1++) {
      for (byte b = 0; b < 8; b++) {
        this.d[b1][b] = new nd(this.c);
        this.d[b1][b].j(3);
        this.d[b1][b].a(b);
        this.d[b1][b].i();
      } 
    } 
    b1 = 0;
    char c = 'Ϩ';
    for (byte b2 = 3; b2 >= 0; b2--) {
      byte b3 = 0;
      char c1 = c;
      for (byte b4 = 3; b4 >= 0; b4--) {
        this.d[b2][b4].d(c1, 1035);
        this.d[b1 + 4][b4].d(c1, 1035);
        this.d[b2][b3 + 4].d(c1, 1035);
        this.d[b1 + 4][b3 + 4].d(c1, 1035);
        c1 += '\002';
        b3++;
      } 
      b1++;
      c += '\002';
    } 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    super.c(paramInt1, paramInt2);
    this.a.a(this.m - 14, this.n - 14, this.o, this.p);
  }
  
  public final void a(int paramInt1, int paramInt2, nj paramnj, int paramInt3) {
    paramInt1 -= 2;
    paramInt2 -= 2;
    this.d[paramInt1][paramInt2].a(this.m + paramInt2 * 28, this.n + paramInt1 * 28, paramnj.g, paramnj.f, paramInt3);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, nj paramnj1, nj paramnj2) {
    paramInt1 -= 2;
    paramInt2 -= 2;
    paramInt3 -= 2;
    paramInt4 -= 2;
    int i = this.m + paramInt2 * 28;
    int j = this.n + paramInt1 * 28;
    int m = this.m + paramInt4 * 28;
    int n = this.n + paramInt3 * 28;
    this.d[paramInt1][paramInt2].a(m, n, i, j, paramnj2.g, paramnj2.f);
    this.d[paramInt3][paramInt4].a(i, j, m, n, paramnj1.g, paramnj1.f);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, nj paramnj, int paramInt5) {
    try {
      paramInt1 -= 2;
      paramInt2 -= 2;
      paramInt3 -= 2;
      paramInt4 -= 2;
      int i = this.m + paramInt2 * 28;
      int j = this.n + paramInt1 * 28;
      int m = this.m + paramInt4 * 28;
      int n = this.n + paramInt3 * 28;
      this.d[paramInt3][paramInt4].a(i, j, m, n, paramnj.g, paramnj.f, paramInt5);
      return;
    } catch (Exception exception) {
      ct.a("[boardview] setfall  " + paramInt1 + "   " + paramInt2 + "     " + paramInt3 + "    " + paramInt4 + paramnj + exception);
      return;
    } 
  }
  
  public final int a(mw parammw) {
    int i = parammw.b - 2;
    int j;
    int m = (j = parammw.c - 2) * 28 + this.m;
    int n = i * 28 + this.n;
    byte[][] arrayOfByte = b;
    int i1 = j;
    j += parammw.d;
    while (i1 < j) {
      this.d[i][i1].a(arrayOfByte);
      this.d[i][i1].c(m, n, parammw.a.g, parammw.j);
      m += 28;
      i1++;
    } 
    return 10 + parammw.j;
  }
  
  public final int b(mw parammw) {
    int i = parammw.e - 2;
    int j;
    int m = (j = parammw.f - 2) * 28 + this.m;
    int n = i * 28 + this.n;
    byte[][] arrayOfByte = b;
    int i1 = i;
    i += parammw.g;
    while (i1 < i) {
      this.d[i1][j].a(arrayOfByte);
      this.d[i1][j].c(m, n, parammw.a.g, parammw.j);
      n += 28;
      i1++;
    } 
    return 10 + parammw.j;
  }
  
  public final nd a(int paramInt1, int paramInt2) {
    return this.d[paramInt1][paramInt2];
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    for (paramInt1 = 0; paramInt1 < 8; paramInt1++) {
      for (paramInt2 = 0; paramInt2 < 8; paramInt2++)
        this.d[paramInt1][paramInt2].a(paramGraphics); 
    } 
  }
  
  public final void i() {
    for (byte b = 0; b < 8; b++) {
      for (byte b1 = 0; b1 < 8; b1++)
        this.d[b][b1].i(); 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */