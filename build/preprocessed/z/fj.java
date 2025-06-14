import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fj extends aq {
  private String k;
  
  private String l;
  
  private Image m;
  
  public boolean i;
  
  public int j;
  
  private int n;
  
  private int o;
  
  private String p;
  
  private Image q = f.d("/staricon");
  
  private Image r = f.d("/shoppingcarticon");
  
  private int s = -1;
  
  private int t = 0;
  
  private boolean u;
  
  private int v = -1;
  
  private d w;
  
  private d x;
  
  private long y;
  
  public fj(String paramString1, int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, boolean paramBoolean, Image paramImage, String paramString2, long paramLong2) {
    this(paramString1, paramInt1, paramLong1, -1, false, null, -1, -1, bx.d, paramString2, paramLong2);
    this.t = paramInt3;
    this.p = paramString2;
    this.u = true;
    this.y = paramLong2 + System.currentTimeMillis();
    paramInt1 = paramInt2;
    fj fj1;
    (fj1 = this).v = paramInt1;
  }
  
  public fj(String paramString, int paramInt, long paramLong, Image paramImage) {
    this.k = paramString;
    this.l = i.a(paramLong);
    this.m = paramImage;
    this.j = paramInt;
    this.x = bx.d;
    e(40);
    d(v.t);
  }
  
  public fj(String paramString1, int paramInt1, long paramLong1, int paramInt2, boolean paramBoolean, Image paramImage, int paramInt3, int paramInt4, d paramd, String paramString2, long paramLong2) {
    this.k = paramString1;
    this.l = i.a(paramLong1);
    this.m = paramImage;
    this.i = paramBoolean;
    this.j = paramInt1;
    this.n = paramInt2;
    this.s = paramInt3;
    this.o = paramInt4;
    this.w = paramd;
    this.p = paramString2;
    this.y = paramLong2 + System.currentTimeMillis();
    this.x = ll.a(paramInt2);
    if (paramString2 == null) {
      e(40);
    } else {
      e(55);
    } 
    d(v.t);
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt2 += d();
    paramInt1 += c() + 2;
    if (this.i) {
      if (this.g) {
        pc.a(paramGraphics, paramInt1 - 2, paramInt2, e(), f(), true, 7470469);
      } else {
        paramGraphics.setColor(7470469);
        paramGraphics.fillRect(paramInt1, paramInt2, e(), f());
      } 
    } else if (this.g) {
      pc.e(paramGraphics, paramInt1 - 2, paramInt2, e(), f());
    } 
    paramInt2 += 3;
    byte b = 0;
    if (this.s > 0) {
      pc.b(paramGraphics, paramInt1 + 35, paramInt2 + 1, this.s);
      b = 15;
    } 
    if (this.x != null)
      if (this.o > 0) {
        this.x.a(paramGraphics, String.valueOf(this.k) + " +" + this.o, paramInt1 + 35 + b, paramInt2 + 5, 0);
      } else {
        this.x.a(paramGraphics, this.k, paramInt1 + 35 + b, paramInt2 + 5, 0);
      }  
    String str = "Giá: " + this.l + " Ken";
    a.h.a(paramGraphics, str, paramInt1 + 35, paramInt2 + 20, 0);
    if (this.y - System.currentTimeMillis() > 0L) {
      long l1 = Math.max(this.y - System.currentTimeMillis(), 0L);
      int i = v.t - bx.c.a(i.b(l1, "hh:mm:ss")) - 5;
      int j;
      int k;
      long l2;
      a.h.a(paramGraphics, String.valueOf(((k = Math.max((int)((l2 = l1) / 3600000L), 0)) < 10) ? ("0" + k) : String.valueOf(k)) + ":" + (((k = Math.max((k = (int)Math.max((l2 = l1) % 3600000L, 0L)) / 60000, 0)) < 10) ? ("0" + k) : String.valueOf(k)) + ":" + (((j = Math.max((k = Math.max((k = (int)Math.max((l2 = l1) % 3600000L, 0L)) % 60000, 0)) / 1000, 0)) < 10) ? ("0" + j) : String.valueOf(j)), i, paramInt2 + 20, 0);
    } 
    if (this.p != null)
      a.g.a(paramGraphics, "@" + this.p, paramInt1 + 35, paramInt2 + 35, 0); 
    if (this.m != null || this.u) {
      byte b1 = (this.m != null) ? this.m.getWidth() : 32;
      byte b2 = (this.m != null) ? this.m.getHeight() : 32;
      if (this.u) {
        if (this.p != null) {
          pc.g(paramGraphics, this.v, paramInt1, paramInt2 + 10, 0);
        } else {
          pc.g(paramGraphics, this.v, paramInt1, paramInt2 + 1, 0);
        } 
      } else {
        if (this.p != null) {
          paramGraphics.drawImage(this.m, paramInt1, paramInt2 + 10, 0);
        } else {
          paramGraphics.drawImage(this.m, paramInt1, paramInt2 + 1, 0);
        } 
        if (this.o > 0 && this.w != null)
          if (this.p == null) {
            this.w.a(paramGraphics, "+" + this.o, paramInt1 + b1 - bx.d.a("+" + this.o) - 4, paramInt2 + 32 - bx.d.a(), 0);
          } else {
            this.w.a(paramGraphics, "+" + this.o, paramInt1 + b1 - bx.d.a("+" + this.o) - 4, paramInt2 + 9 + 32 - bx.d.a(), 0);
          }  
      } 
      if (this.t > 0)
        if (this.p == null) {
          bx.c.a(paramGraphics, (new StringBuffer(String.valueOf(this.t))).toString(), paramInt1 + b1 - 1, paramInt2 + b2 - 15, 2);
        } else {
          bx.c.a(paramGraphics, (new StringBuffer(String.valueOf(this.t))).toString(), paramInt1 + b1 - 1, paramInt2 + b2 - 4, 2);
        }  
      if (this.i)
        paramGraphics.drawImage(this.r, paramInt1 + b1 - this.r.getWidth() - 1, paramInt2 + 1 + b2 - this.r.getHeight() - 1, 0); 
      if (this.n > 0) {
        int i = paramInt1 + 35 + a.g.a(str) + 5;
        paramInt1 = paramInt2 + 20;
        paramGraphics.drawImage(this.q, i, paramInt1, 0);
      } 
    } 
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */