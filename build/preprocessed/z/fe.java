import com.mg.sq.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Graphics;

public final class fe extends aq {
  private a i;
  
  private int j = 0;
  
  private String k;
  
  private int l;
  
  private k m;
  
  public fe(String paramString) {
    this.k = paramString;
    this.d = new k(0, 0, v.t - 20, v.u);
    this.m = new k(0, 0, this.d.c, 9 + bx.d.a());
    this.i = new a();
    this.l = this.m.d + 5;
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    this.c = true;
  }
  
  public final void a(fl paramfl) {
    paramfl.a(this);
    paramfl.a(0, this.l, this.d.c, bx.d.a());
    this.l += paramfl.f() + 5;
    this.d.d = this.l + 5;
    e(this.d.d);
    this.i.a(paramfl);
    if (this.i.d() == 1) {
      this.j = 0;
      paramfl.d(true);
    } 
    if (paramfl.m())
      this.j = this.i.d() - 1; 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    super.b(paramInt1, paramInt2);
    this.m = new k(0, 0, this.d.c, 9 + bx.d.a());
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.m = new k(this.d.a, this.d.b, this.d.c, 9 + bx.d.a());
    this.k = a.a(this.k, this.d.c - 4);
  }
  
  public final boolean f(int paramInt) {
    if (this.i.d() <= 0)
      return false; 
    int i = this.j;
    boolean bool = false;
    switch (paramInt) {
      case 98:
        if (this.j < this.i.d() - 1) {
          this.j++;
          bool = true;
        } 
        break;
      case 99:
        if (this.j > 0) {
          this.j--;
          bool = true;
        } 
        break;
      case 95:
        ((fl)this.i.b(this.j)).f(paramInt);
        break;
    } 
    if (i != this.j) {
      ((fl)this.i.b(i)).d(false);
      ((fl)this.i.b(this.j)).d(true);
      this.c = true;
      this.b.c(true);
    } 
    return bool;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    paramInt1 -= c() + 5 + 4;
    paramInt2 -= d();
    byte b = 0;
    int i = this.i.d();
    while (b < i) {
      fl fl;
      if ((fl = (fl)this.i.b(b)).c(paramInt1, paramInt2)) {
        this.j = b;
      } else {
        fl.d(false);
      } 
      b++;
    } 
    return true;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    if (m()) {
      pc.a(paramGraphics, c() + paramInt1, d() + paramInt2, e(), f(), 7070703, -1);
      paramGraphics.setColor(7267055);
      paramGraphics.fillRect(c() + paramInt1, d() + paramInt2, this.m.c, this.m.d);
    } 
    int i = paramInt2 + d() + 4;
    int j = c() + paramInt1 + 4;
    bx.d.c(true);
    bx.d.a(paramGraphics, this.k, j, i, 0);
    bx.d.c(false);
    i = paramInt2 + this.d.b;
    j += 5;
    byte b = 0;
    int m = this.i.d();
    while (b < m) {
      fl fl1 = (fl)this.i.b(b);
      int i1 = i;
      int n = c() + paramInt1;
      Graphics graphics = paramGraphics;
      fl fl2;
      if (b == this.j && m() && (fl2 = fl1).m()) {
        graphics.setColor(7267055);
        graphics.fillRect(fl2.c() + n, fl2.d() + i1 - 1, fl2.e(), bx.d.a() + 2);
      } 
      fl1.a(paramGraphics, j, i);
      b++;
    } 
    this.c = false;
  }
  
  public final byte[] a() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    byte[] arrayOfByte = null;
    try {
      for (byte b = 0; b < this.i.d(); b++) {
        fl fl = (fl)this.i.b(b);
        dataOutputStream.writeUTF(fl.a());
      } 
      dataOutputStream.flush();
      arrayOfByte = byteArrayOutputStream.toByteArray();
      dataOutputStream.close();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    return arrayOfByte;
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    for (byte b = 0; b < this.i.d(); b++) {
      fl fl;
      (fl = (fl)this.i.b(b)).a(dataInputStream.readUTF());
    } 
    dataInputStream.close();
    byteArrayInputStream.close();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fe.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */