import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class gk extends ey {
  private String i;
  
  private bh j = null;
  
  private byte k;
  
  private int[] l = new int[] { 8076544, 12410368, 14052096, 16746248, 16746248, 12935680, 12935680, 10243584 };
  
  private int[] m = new int[] { 8947848, 15658734, 16777215, 16777215, 14408667, 14408667, 212708781, 212708781, 10263708 };
  
  private int[] n = new int[] { 
      4013373, 6184542, 7039851, 8618883, 8618883, 6447714, 6447714, 5131854, 5131854, 4605510, 
      4605510 };
  
  public gk(String paramString) {
    this.i = paramString;
    this.d = new k(0, 0, this.d.c, 9 + bx.d.a());
  }
  
  public final void a(byte paramByte) {
    this.k = 1;
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    this.c = true;
  }
  
  public final void b(int paramInt1, int paramInt2) {
    super.b(paramInt1, paramInt2);
    this.d = new k(c(), d(), this.d.c, 9 + bx.d.a());
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.d = new k(paramInt1, paramInt2, paramInt3, 9 + bx.d.a());
    this.i = a.a(this.i, this.d.c - 30);
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    this.j.a(this, paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    if (m()) {
      pc.a(paramGraphics, c() + paramInt1, d() + paramInt2, e(), f(), 7070703, -1);
      paramGraphics.setColor(7267055);
      paramGraphics.fillRect(c() + paramInt1, d() + paramInt2, this.d.c, this.d.d);
    } 
    paramInt1 += c();
    int i = (paramInt2 += d()) + 4;
    int j = paramInt1 + 4;
    bx.d.c(true);
    bx.d.a(paramGraphics, this.i, j, i, 0);
    bx.d.c(false);
    paramInt1 += e() - 30;
    paramInt2 += 3;
    i = f() - 6;
    i = paramInt2 + (i - bx.d.b()) / 2;
    k k1 = new k(0, 0, 30, f() - 6);
    k k2 = new k(0, 0, 32, f() - 4);
    switch (this.k) {
      case 0:
        if (a()) {
          pc.a(paramGraphics, k2, 32, new int[] { 2960685 }, paramInt1 - 1, paramInt2 - 1);
          pc.a(paramGraphics, k1, 30, this.l, paramInt1, paramInt2);
          bx.d.a(paramGraphics, "O", paramInt1 + 7, i, 1);
          k1 = new k(0, 0, 15, k1.d);
          pc.a(paramGraphics, k1, 15, this.n, paramInt1 + 15, paramInt2);
          break;
        } 
        pc.a(paramGraphics, k2, 32, new int[] { 2960685 }, paramInt1 - 1, paramInt2 - 1);
        pc.a(paramGraphics, k1, 30, this.m, paramInt1, paramInt2);
        bx.d.a(paramGraphics, "I", paramInt1 + 22, i, 1);
        k1 = new k(0, 0, 15, k1.d);
        pc.a(paramGraphics, k1, 15, this.n, paramInt1, paramInt2);
        break;
      default:
        if (a()) {
          a.g.a(paramGraphics, "Mở", paramInt1 + 7, i, 1);
          break;
        } 
        a.g.a(paramGraphics, "Tắt", paramInt1 + 7, i, 1);
        break;
    } 
    this.c = false;
  }
  
  public final void a(bh parambh) {
    this.j = parambh;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */