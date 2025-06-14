import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Graphics;

public final class nv extends an implements bf {
  private String[] a;
  
  private ex b;
  
  public nv() {
    super(6);
    a(new ba());
    a(a.n);
    this.a = bx.a("\nBạn có chấp nhận các quy định của Ola tại http://term.ola.vn không?", v.t - 4, bx.d);
    int i = 15 + bx.d.a() * (this.a.length + 1) + 4 + 10;
    this.b = new ex("Đồng ý", 3);
    this.b.a((v.t - 80) / 2, i, 80, 20);
    this.b.d(true);
    bs bs;
    (bs = new bs(new br[] { new br("Đồng ý", 0), new br("Quy định", 1), new br("Thoát", 2) })).a(this);
    a(bs);
  }
  
  protected final void a(int paramInt) {
    if (paramInt == 95)
      d(this.e, 0); 
  }
  
  protected final void e(int paramInt1, int paramInt2) {
    if (this.b.h().b(paramInt1, paramInt2))
      d(this.e, 0); 
  }
  
  protected final void c() {}
  
  protected final void a(Graphics paramGraphics) {
    paramGraphics.setColor(v.am);
    paramGraphics.fillRect(0, 0, v.t, v.u - ba.a);
    paramGraphics.drawImage(pc.d, v.t, v.u - ba.a, 40);
    bx.d.c(true);
    bx.d.a(paramGraphics, "Quy định", v.t / 2, 15, 1);
    bx.d.c();
    int i = 15 + bx.d.a() + 4;
    for (byte b = 0; b < this.a.length; b++) {
      bx.d.a(paramGraphics, this.a[b], v.t / 2, i, 1);
      i += bx.d.a();
    } 
    this.b.a(paramGraphics, 0, 0);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    MGMIDlet mGMIDlet;
    switch (paramInt2) {
      case 0:
        pd.z();
        ag.b().f(5);
        break;
      case 2:
        (mGMIDlet = MGMIDlet.d()).notifyDestroyed();
        break;
      case 1:
        try {
          MGMIDlet.d().platformRequest("http://term.ola.vn");
        } catch (ConnectionNotFoundException connectionNotFoundException) {
          (mGMIDlet = null).printStackTrace();
        } 
        break;
    } 
    c(false);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */