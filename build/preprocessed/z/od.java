import com.mg.sq.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public final class od extends nz implements bf, bh, bi {
  private boolean b;
  
  private int c;
  
  private gk d;
  
  private gm k;
  
  private String[][] l = new String[][] { { "Nút 0:", "He he" }, { "Nút 1:", "Hi hi" }, { "Nút 2:", "Chết nè!" }, { "Nút 3:", "Yếu mà ra gió!" }, { "Nút 4:", "Tưởng bở hả!" }, { "Nút 5:", "Tiếp chiêu nè!" }, { "Nút 6:", "Ăn đòn nè!" }, { "Nút 7:", "Xem đây!" }, { "Nút 8:", "Tha mạng!! hix hix" }, { "Nút 9:", "Không chưởng nha!" } };
  
  public od(int paramInt) {
    super((byte)0);
    try {
      this.c = paramInt;
      a(this);
      a(new ba());
      bd bd = new bd("Lưu", 1);
      od od3;
      (od3 = this).a(bd, true);
      bd = new bd("Hủy", 0);
      (od3 = this).b(bd, true);
      this.g -= ba.a;
      j(true);
      int j = i();
      gh gh2;
      (gh2 = new gh("Game")).a_(-1919);
      gh2.d(j);
      gh2.d(5, 5);
      a(gh2);
      if (go.k != null) {
        gk gk3;
        (gk3 = new gk("Chặn khiêu chiến")).a((byte)1);
        gk3.a_(122);
        gk3.a(0, 0, j, 20);
        gk3.a(this);
        gk3.e(go.k.aa);
        a(gk3);
        (gk3 = new gk("Chặn giao dịch")).a((byte)1);
        gk3.a_(139);
        gk3.a(0, 0, j, 20);
        gk3.a(this);
        gk3.e(go.k.aa);
        a(gk3);
      } 
      gk gk2;
      (gk2 = new gk("Tự động đăng nhập Ola")).a((byte)1);
      gk2.a_(138);
      gk2.a(0, 0, j, 20);
      gk2.a(this);
      gk2.e(gr.k);
      a(gk2);
      (gk2 = new gk("Hiệu ứng đồ họa")).a((byte)1);
      gk2.a_(137);
      gk2.a(0, 0, j, 20);
      gk2.a(this);
      gk2.e(!gr.r);
      a(gk2);
      (gk2 = new gk("Hiệu ứng âm thanh")).a((byte)1);
      gk2.a_(123);
      gk2.a(0, 0, j, 20);
      gk2.a(this);
      gk2.e(v.O);
      a(gk2);
      this.d = new gk("Nhạc nền");
      this.d.a((byte)1);
      this.d.a_(124);
      this.d.a(0, 0, j, 20);
      a(this.d);
      this.k = new gm("Âm lượng");
      this.k.a_(125);
      this.k.d(j);
      this.k.h(v.Q);
      this.k.a(this);
      this.d.a(this);
      a(this.k);
      if (!v.N) {
        this.d.e(false);
        v.Q = 0;
      } 
      (gk2 = new gk("Báo rung")).a((byte)1);
      gk2.a_(126);
      gk2.a(0, 0, j, 20);
      gk2.a(this);
      gk2.e(v.P);
      a(gk2);
      fe fe;
      (fe = new fe("Câu trả lời tự động ")).a_(136);
      fe.a(0, 0, j, 20);
      for (byte b1 = 0; b1 < this.l.length; b1++) {
        fl fl = new fl(this.l[b1][0], this.l[b1][1]);
        fe.a(fl);
      } 
      a(fe);
      gh gh1;
      (gh1 = new gh("Ola")).a_(-1919);
      gh1.d(j);
      gh1.d(12, 5);
      a(gh1);
      gk gk1;
      (gk1 = new gk("Hỗ trợ gõ tiếng Việt có dấu")).a((byte)1);
      gk1.a_(127);
      gk1.a(0, 0, j, 20);
      gk1.a(this);
      gk1.e(v.a);
      a(gk1);
      (gk1 = new gk("Đăng nhập ẩn")).a((byte)1);
      gk1.a_(132);
      gk1.a(0, 0, j, 20);
      gk1.a(this);
      gk1.e(!gr.d);
      a(gk1);
      (gk1 = new gk("Hiện danh sách nick ẩn")).a((byte)1);
      gk1.a_(133);
      gk1.a(0, 0, j, 20);
      gk1.a(this);
      gk1.e(gr.c);
      a(gk1);
      (gk1 = new gk("Lưu thông điệp")).a((byte)1);
      gk1.a_(128);
      gk1.a(0, 0, j, 20);
      gk1.a(this);
      gk1.e(gr.g);
      a(gk1);
      (gk1 = new gk("Lưu danh sách nick")).a((byte)1);
      gk1.a_(129);
      gk1.a(0, 0, j, 20);
      gk1.a(this);
      gk1.e(gr.h);
      a(gk1);
      (gk1 = new gk("Lưu danh sách chat")).a((byte)1);
      gk1.a_(131);
      gk1.a(0, 0, j, 20);
      gk1.a(this);
      gk1.e(gr.i);
      a(gk1);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    g(1);
    od od1 = this;
    u u = cs.a;
    byte b = 0;
    od od2;
    int i = ((od2 = od1).a.s()).length;
    while (b < i) {
      int j;
      if ((j = od1.f(b).b()) > 0 && u.c(j)) {
        byte[] arrayOfByte = u.a(j);
        if (od1.f(b) instanceof gm) {
          gf gf;
          (gf = (gf)od1.f(b)).h(arrayOfByte[0]);
        } else if (od1.f(b) instanceof fe) {
          fe fe = (fe)od1.f(b);
          try {
            fe.a(arrayOfByte);
          } catch (IOException iOException) {
            (arrayOfByte = null).printStackTrace();
          } 
        } else if (od1.f(b) instanceof gk) {
          gk gk1;
          (gk1 = (gk)od1.f(b)).e((arrayOfByte[0] == 0));
        } 
      } 
      b++;
    } 
    this.b = v.N;
  }
  
  public static void d() {
    u u = cs.a;
    for (byte b = 0; b < 17; b++) {
      int i = b + 123;
      if (u.c(i)) {
        byte[] arrayOfByte = u.a(i);
        h(i, arrayOfByte[0]);
      } 
    } 
    if (u.c(140))
      gr.m = false; 
    u.c(141);
    if (u.c(142))
      gr.n = false; 
    if (u.c(143))
      gr.o = false; 
    if (u.c(144))
      gr.p = false; 
    if (u.c(145))
      gr.q = false; 
  }
  
  private static void h(int paramInt1, int paramInt2) {
    switch (paramInt1) {
      case 123:
        v.O = !(paramInt2 == 1);
        return;
      case 137:
        gr.r = !(paramInt2 == 0);
        return;
      case 124:
        v.N = !(paramInt2 == 1);
        return;
      case 126:
        v.P = !(paramInt2 == 1);
        return;
      case 138:
        gr.k = !(paramInt2 == 1);
        return;
      case 139:
        gr.l = !(paramInt2 == 1);
        return;
      case 127:
        if ((v.a = !(paramInt2 == 1)) && v.ai) {
          v.b = true;
          return;
        } 
        break;
      case 129:
        gr.h = !(paramInt2 == 1);
        return;
      case 128:
        gr.g = !(paramInt2 == 1);
        return;
      case 130:
        return;
      case 131:
        gr.i = !(paramInt2 == 1);
        return;
      case 125:
        v.Q = paramInt2;
        return;
      case 132:
        gr.d = !(paramInt2 == 0);
        if (a.m != null && a.o) {
          a.m.I();
          return;
        } 
        break;
      case 133:
        gr.c = !(paramInt2 == 1);
        if (a.m != null && a.o)
          a.m.J(); 
        break;
    } 
  }
  
  public static String[] e() {
    DataInputStream dataInputStream;
    String[][] arrayOfString = { { "Nút 0:", "He he" }, { "Nút 1:", "Hi hi" }, { "Nút 2:", "Chết nè!" }, { "Nút 3:", "Yếu mà ra gió!" }, { "Nút 4:", "Tưởng bở hả!" }, { "Nút 5:", "Tiếp chiêu nè!" }, { "Nút 6:", "Ăn đòn nè!" }, { "Nút 7:", "Xem đây!" }, { "Nút 8:", "Tha mạng!! hix hix" }, { "Nút 9:", "Không chưởng nha!" } };
    String[] arrayOfString1 = null;
    if (cs.a.c(136)) {
      byte[] arrayOfByte = cs.a.a(136);
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      dataInputStream = new DataInputStream(byteArrayInputStream);
      String[] arrayOfString2 = new String[10];
      try {
        for (byte b = 0; b < 10; b++)
          arrayOfString2[b] = dataInputStream.readUTF(); 
        arrayOfString1 = arrayOfString2;
        dataInputStream.close();
        byteArrayInputStream.close();
      } catch (IOException iOException2) {
        IOException iOException1;
        (iOException1 = null).printStackTrace();
      } 
    } else {
      arrayOfString1 = new String[10];
      for (byte b = 0; b < 10; b++)
        arrayOfString1[b] = (String)dataInputStream[b][1]; 
    } 
    return arrayOfString1;
  }
  
  public static final void f() {
    (new byte[1])[0] = 1;
    u u;
    (u = cs.a).b(132, gr.d ? new byte[1] : new byte[1]);
  }
  
  public static void h(int paramInt) {
    u u;
    (u = cs.a).b(paramInt, new byte[] { 1 });
  }
  
  public final void d(int paramInt1, int paramInt2) {
    od od1;
    u u;
    od od2;
    byte b;
    switch (paramInt2) {
      case 0:
        ag.b().f(this.c);
        return;
      case 1:
        od1 = this;
        u = cs.a;
        for (b = 0; b < ((od2 = od1).a.s()).length; b++) {
          aq aq;
          int i = (aq = od1.f(b)).b();
          byte b1 = 0;
          if (aq instanceof gf) {
            b1 = (byte)(aq = aq).a();
            u.a(i, new byte[] { b1 });
          } else if (aq instanceof fe) {
            aq = aq;
            u.a(i, aq.a());
          } else if (aq instanceof gk) {
            boolean bool;
            b1 = (bool = (aq = aq).a()) ? 0 : 1;
            switch (i) {
              case 124:
                if (bool != od1.b) {
                  od1.b = bool;
                  v.N = bool;
                  if (bool) {
                    a.a(a.s().d());
                    v.Q = od1.k.a();
                    co.b().g();
                  } else {
                    co.b().d();
                  } 
                } 
                u.a(i, new byte[] { b1 });
                break;
              case 122:
                if (go.k != null && bool != go.k.aa) {
                  ks.a().c(bool);
                  a.s().a(null, null);
                } 
                u.a(i, new byte[] { b1 });
                break;
              default:
                u.a(i, new byte[] { b1 });
                break;
            } 
          } else {
            continue;
          } 
          h(i, b1);
          continue;
        } 
        u.a();
        ag.b().f(this.c);
        break;
    } 
  }
  
  public final void a(aq paramaq, boolean paramBoolean) {
    if (paramaq.equals(this.d)) {
      if (paramBoolean) {
        this.k.h(50);
        return;
      } 
      this.k.h(0);
    } 
  }
  
  public final void a(aq paramaq, int paramInt) {
    if (paramaq.equals(this.k)) {
      boolean bool;
      if ((bool = (paramInt > 0) ? true : false) != this.d.a())
        this.d.e(bool); 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\od.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */