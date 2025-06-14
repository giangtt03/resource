import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fw extends fv implements bf {
  private ll a;
  
  private byte b;
  
  private lm c;
  
  private d d;
  
  private String[] e;
  
  private boolean f;
  
  private k g;
  
  private boolean h;
  
  private String i;
  
  private String j;
  
  private fu k;
  
  private String s;
  
  private String[] t = null;
  
  private String[] u = new String[] { "Đồ giành cho NAM", "Đồ giành cho NỮ", "Giành cho cả NAM & NỮ" };
  
  public fw(Object paramObject) {
    if (paramObject instanceof lm) {
      this.c = (lm)paramObject;
      this.j = this.c.b;
      this.d = bx.d;
      a();
      return;
    } 
    if (paramObject instanceof ll) {
      this.a = (ll)paramObject;
      this.j = this.a.d;
      this.b = (byte)this.a.j;
      if (v.t >= v.u && v.t == 320)
        this.f = true; 
      byte b = 0;
      if (this.a.i > go.k.G) {
        this.i = "Chưa đủ cấp độ yêu cầu";
      } else {
        b++;
      } 
      if (this.a.h == 2 || this.a.h == go.k.f) {
        b++;
      } else {
        this.i = this.u[(this.a.h == 9) ? 2 : this.a.h];
      } 
      this.h = (b == 2);
      this.d = ll.a(this.a.m);
      this.e = a.a(this.a);
      if (this.a.q > 0) {
        b = (this.a.p * 100 / this.a.q < 30) ? 1 : 0;
        this.s = "Độ bền: " + this.a.p + "/" + this.a.q + ((this.a.p == 0) ? " (Đã hư hoàn toàn)" : ((b != 0) ? " (Đã hư hỏng nặng)" : ""));
      } 
      a();
      return;
    } 
    throw new IllegalArgumentException("Object must be instance GameItem or Equipment");
  }
  
  private void a() {
    if (v.z) {
      this.k = new fu(gb.f, 0);
      byte[] arrayOfByte = gb.e[3];
      this.k.b(arrayOfByte[0], arrayOfByte[1], arrayOfByte[2], arrayOfByte[3]);
      this.k.b(arrayOfByte[2], arrayOfByte[3]);
      this.k.a(this);
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.c != null) {
      this.e = bx.a(this.c.d, this.o - 10, bx.d);
      i((this.d.a() << 1) + this.e.length * (bx.d.a() + 1) + 10);
    } else {
      if (this.e != null)
        i((this.f ? ((this.e.length + 1) / 2) : this.e.length) * bx.d.a() + (this.h ? 55 : 70) + 15); 
      if (this.a.g != null && !this.a.g.equals("")) {
        this.t = bx.a(this.a.g, this.o - 20);
        this.p += this.t.length * (bx.c.a() + 1);
      } 
    } 
    this.g = new k(5, 5, this.o - 10, this.p - 10);
    if (this.k != null)
      this.k.a(this.o - this.k.e() - 2, 2, this.k.e(), this.k.f()); 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    paramInt1 += this.m;
    paramInt2 += this.n;
    pc.b(paramGraphics, paramInt1, paramInt2, p(), q(), v.aj, true);
    if (this.a != null) {
      d d1;
      if (this.a.f > 0)
        pc.b(paramGraphics, paramInt1 + 5, paramInt2 + 5 - pc.h.getHeight() - bx.d.b(), this.a.f); 
      if (this.b <= 0) {
        this.d.a(paramGraphics, this.j, paramInt1 + 5 + 15, paramInt2 + 5, 0);
      } else {
        this.d.a(paramGraphics, String.valueOf(this.j) + " +" + this.b, paramInt1 + 5 + 15, paramInt2 + 5, 0);
      } 
      int i = 5 + bx.d.a() + 1;
      if (this.a.i > go.k.G) {
        d1 = a.h;
      } else {
        d1 = bx.c;
      } 
      d1.a(paramGraphics, "Yêu cầu cấp: " + this.a.i, paramInt1 + 3, paramInt2 + i, 0);
      i += bx.c.a() + 1;
      if (this.a.p < 10) {
        d1 = a.h;
      } else {
        d1 = bx.c;
      } 
      if (this.s != null) {
        d1.a(paramGraphics, this.s, paramInt1 + 3, paramInt2 + i, 0);
        i += bx.c.a() + 1;
      } 
      if (this.e != null) {
        int j = this.e.length;
        d1 = a.g;
        if (this.f) {
          j = (this.e.length + 1) / 2;
          int m = i;
          int n = this.g.c / 2;
          for (byte b = 0; b < this.e.length; b++) {
            d1.a(paramGraphics, this.e[b], paramInt1 + 3 + b % 2 * n, paramInt2 + m, 0);
            m += (b % 2 == 0) ? 0 : bx.c.a();
          } 
        } else {
          bx.a(paramGraphics, d1, this.e, paramInt1 + 3, paramInt2 + i, this.g.c, this.g.d, 0);
        } 
        i += j * d1.a() + 1;
      } 
      if (this.t != null)
        for (byte b = 0; b < this.t.length; b++) {
          bx.c.a(paramGraphics, this.t[b], paramInt1 + 3, paramInt2 + i, 0);
          i += d1.a() + 1;
        }  
      if (!this.h) {
        a.h.a(paramGraphics, this.i, paramInt1 + 3, paramInt2 + i, 0);
        i += a.h.a() + 1;
      } 
      if (this.s != null) {
        String str = !this.a.c() ? "Không thể sửa chữa" : ("Cần " + this.a.k + " búa để sửa chữa");
        a.h.a(paramGraphics, str, paramInt1 + 3, paramInt2 + i, 0);
        i += i + a.h.a() + 1;
      } 
      if (!this.a.a())
        a.h.a(paramGraphics, "Không thể giao dịch", paramInt1 + 3, paramInt2 + i, 0); 
    } else {
      this.d.c(true);
      this.d.a(paramGraphics, this.j, paramInt1 + 5, paramInt2 + 5, 0);
      this.d.c(false);
      int i = 5 + this.d.a() + 1;
      bx.a(paramGraphics, bx.c, this.e, paramInt1 + 3, paramInt2 + i, this.g.c, this.g.d, 0);
      i += this.e.length * bx.c.a() + 1;
      if (!this.c.a())
        a.h.a(paramGraphics, "Không thể giao dịch", paramInt1 + 3, paramInt2 + i, 0); 
      switch (this.c.e) {
        case 0:
          a.h.a(paramGraphics, "Chỉ sử dụng trong trận đấu", paramInt1 + 3, paramInt2 + i, 0);
          break;
      } 
    } 
    if (this.k != null)
      this.k.a(paramGraphics, paramInt1, paramInt2); 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.r = false;
  }
  
  public final void g(int paramInt1, int paramInt2) {
    if (this.k != null && this.k.h().a(paramInt1 - n(), paramInt2 - o())) {
      paramInt1 = this.k.a();
      paramInt1 = -1;
      fw fw1;
      (fw1 = this).r = false;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */