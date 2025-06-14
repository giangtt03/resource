import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ot extends fb implements bf, bg, bn, bq {
  private static final String[] q = new String[] { "rss://faq/sq", "rss://ola/0/2011/12/napken", "rss://gdken", "rss://session" };
  
  private static final String[] r = new String[] { "Thông tin", "Hướng dẫn nạp KEN", "Lịch sử giao dịch KEN", "Các phiên đăng nhập hiện tại" };
  
  private aw s;
  
  private ay t;
  
  private int u = 0;
  
  private Object[] v;
  
  private Object[] w;
  
  private Object[] x;
  
  private final a y;
  
  private int z;
  
  private String A;
  
  public boolean p = false;
  
  private fu B;
  
  private Object C;
  
  public ot(int paramInt1, int paramInt2, String paramString) {
    super(109, 7, paramString, false);
    a(0, 0, v.t, v.u);
    a(new ba());
    a(new gb(-1, 0));
    c(a.n);
    b(new gb(-2, 1));
    a(this);
    this.s = new aw();
    this.s.a(this);
    this.s.a(this);
    this.s.f(true);
    this.t = new ay(0);
    this.t.a(0, 0, v.t, v.u - ba.a);
    this.t.b(this.s);
    this.y = new a();
    this.z = 0;
  }
  
  private void j(int paramInt) {
    this.u = paramInt;
    c(true);
  }
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (paramBoolean)
      this.t.c(true); 
  }
  
  public final boolean f(int paramInt) {
    if (paramInt == 135) {
      F();
      return true;
    } 
    if (paramInt == 142) {
      E();
      return true;
    } 
    if (paramInt == 148) {
      D();
      return true;
    } 
    return this.t.f(paramInt);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    return this.t.c(paramInt1, paramInt2);
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    return this.t.e(paramInt1, paramInt2);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    return this.t.f(paramInt1, paramInt2);
  }
  
  public final void n() {
    this.t.n();
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.t.k()) {
      Graphics graphics;
      (graphics = paramGraphics).setColor(v.am);
      graphics.fillRect(0, 0, v.t, v.u - ba.a);
      graphics.drawImage(pc.d, v.t, v.u - ba.a, 40);
      this.t.a(paramGraphics, c(), d());
    } 
  }
  
  public final void u() {
    a(".");
  }
  
  public final void x() {
    this.p = false;
    c(true);
  }
  
  public final aq a(aw paramaw, int paramInt) {
    Object object;
    return (aq)((object = paramaw.i(paramInt) instanceof dn) ? new fs((dn)object, ((paramInt - 1 & 0x1) == 1), this.s.e()) : new et((dq)object, this.s.e()));
  }
  
  private void v() {
    if (this.y.d() <= 0 || this.z < 0 || this.z >= this.y.d())
      return; 
    String str;
    if ((str = (String)this.y.b(this.z)).charAt(0) == '\032' && Integer.parseInt((new StringBuffer(String.valueOf(str.charAt(1)))).toString()) == this.u)
      this.y.a(B(), this.z); 
  }
  
  private void b(String paramString) {
    int i;
    c(true);
    if (paramString.charAt(0) == '\032') {
      int j = Integer.parseInt((new StringBuffer(String.valueOf(paramString.charAt(1)))).toString());
      int k = paramString.indexOf('\032', 1) + 1;
      int m = paramString.indexOf('\032', k);
      this.A = paramString.substring(k, m);
      k = m + 1;
      m = paramString.indexOf('\032', k);
      k = Integer.parseInt(paramString.substring(k, m));
      i = Integer.parseInt(paramString.substring(m + 1));
      if (j == 1 && this.v != null) {
        C();
        this.s.k(k);
        this.t.k(i);
        return;
      } 
      if (j == 2 && this.w != null) {
        z();
        this.s.k(k);
        this.t.k(i);
        return;
      } 
      if (j == 3 && this.x != null) {
        A();
        this.s.k(k);
        this.t.k(i);
        return;
      } 
      this.y.a();
      this.z = 0;
      this.A = null;
      if (this.w != null) {
        z();
        return;
      } 
      a(null);
      return;
    } 
    a(i);
  }
  
  public final void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    v();
    try {
      this.w = new Object[paramArrayOfString1.length + 2];
      this.w[0] = new dn("Các danh mục", 0, this.s.e());
      byte b = 1;
      int i = this.w.length - 1;
      while (b < i) {
        int j = b - 1;
        String str = (b < 10) ? ("  " + b) : String.valueOf(b);
        this.w[b] = new dn(String.valueOf(str) + ". " + paramArrayOfString1[j], paramArrayOfString2[j], this.s.e() - 2);
        b++;
      } 
      this.w[this.w.length - 1] = a.m.K();
      z();
      this.A = paramString;
      c(B());
    } catch (OutOfMemoryError outOfMemoryError) {
      w();
    } catch (Throwable throwable2) {
      Throwable throwable1;
      ct.b((throwable1 = null).toString());
    } 
    t();
    a.s().v();
  }
  
  private void w() {
    al al;
    (al = ag.b().a("Chú ý", "Máy bạn không đủ bộ nhớ để xem trang báo này!", "Đóng", 5, 1)).a(this);
    ag.b().a(al, false);
  }
  
  private void z() {
    this.s.q();
    this.s.h(0);
    this.s.a(this.w);
    if (this.s.a() > 1) {
      this.s.k(1);
    } else {
      this.s.k(0);
    } 
    j(2);
  }
  
  public final void b(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    v();
    try {
      this.x = new Object[paramArrayOfString1.length + 2];
      this.x[0] = new dn("Các tin mới", 0, this.s.e());
      byte b = 1;
      int i = this.x.length - 1;
      while (b < i) {
        int j = b - 1;
        String str = (b < 10) ? ("  " + b) : String.valueOf(b);
        this.x[b] = new dn(String.valueOf(str) + ". " + paramArrayOfString1[j], paramArrayOfString2[j], this.s.e() - 2);
        b++;
      } 
      this.x[this.x.length - 1] = a.m.K();
      A();
      this.A = paramString;
      c(B());
    } catch (OutOfMemoryError outOfMemoryError) {
      w();
    } catch (Throwable throwable2) {
      Throwable throwable1;
      ct.b((throwable1 = null).toString());
    } 
    t();
    a.s().v();
  }
  
  private void A() {
    this.s.q();
    this.s.h(0);
    this.s.a(this.x);
    if (this.s.a() > 1) {
      this.s.k(1);
    } else {
      this.s.k(0);
    } 
    j(3);
  }
  
  public static void a() {
    ct.a("Receive pulishers list");
  }
  
  private String B() {
    int i = this.s.s();
    String str = (new StringBuffer(String.valueOf(i))).toString();
    return "\032" + this.u + '\032' + this.A + '\032' + str + '\032' + (this.t.r()).b;
  }
  
  private void C() {
    this.s.q();
    this.s.h(0);
    this.s.a(this.v);
    if (this.s.a() > 1) {
      this.s.k(1);
    } else {
      this.s.k(0);
    } 
    j(1);
  }
  
  public final void a(String paramString, ef[] paramArrayOfef) {
    v();
    try {
      Object[] arrayOfObject;
      (arrayOfObject = new Object[paramArrayOfef.length + 1])[0] = new dn(paramArrayOfef[0].c(), 0, this.s.e());
      byte b1 = 1;
      byte b2 = 1;
      int i = arrayOfObject.length - 1;
      while (b2 < i) {
        byte b = b2;
        if (!i.b(paramArrayOfef[b].c())) {
          arrayOfObject[b1] = new dn(paramArrayOfef[b].c(), 2, this.s.e() - 2);
          b1++;
        } 
        b2++;
      } 
      arrayOfObject[b1] = a.m.K();
      if (++b1 < arrayOfObject.length) {
        Object[] arrayOfObject1 = new Object[b1];
        System.arraycopy(arrayOfObject, 0, arrayOfObject1, 0, b1);
        arrayOfObject = arrayOfObject1;
      } 
      arrayOfObject = arrayOfObject;
      ot ot1;
      (ot1 = this).s.q();
      ot1.s.h(10);
      ot1.s.a(arrayOfObject);
      if (ot1.s.a() > 1) {
        ot1.s.k(1);
      } else {
        ot1.s.k(0);
      } 
      ot1.j(4);
      this.A = paramString;
      c(paramString);
    } catch (OutOfMemoryError outOfMemoryError) {
      w();
    } catch (Throwable throwable2) {
      Throwable throwable1;
      ct.b((throwable1 = null).toString());
    } 
    t();
    a.s().v();
  }
  
  private void c(String paramString) {
    if (this.z < this.y.d() - 1 || this.y.d() > 5) {
      while (this.y.d() - 1 > this.z)
        this.y.a(this.y.d() - 1); 
      while (this.y.d() > 5)
        this.y.a(0); 
    } 
    if (this.z >= this.y.d())
      this.z = this.y.d() - 1; 
    if (this.z < 0)
      this.z = 0; 
    if (paramString != null) {
      String str;
      if (this.y.d() > 0 && (str = (String)this.y.b(this.z)).equals(paramString))
        return; 
      this.y.a(paramString);
    } 
    this.z = this.y.d() - 1;
  }
  
  public final void b(aq paramaq, int paramInt) {
    int i;
    if (paramInt <= 0)
      return; 
    Object object;
    if (object = this.s.i(paramInt) instanceof dq) {
      dq dq = (dq)object;
      ((ot)(object = this)).C = dq;
      br[] arrayOfBr = oi.a(dq.c);
      bs bs;
      (bs = new bs()).a(new gb(0, 2));
      bs.b(new gb(1, 3));
      bs.a(arrayOfBr);
      int j = ((ot)object).s.s();
      aq aq1 = ((ot)object).s.o(j);
      k k = ((ot)object).t.r();
      i = (v.t - bs.e()) / 2;
      if ((j = ((ot)object).t.d() + aq1.d() - k.b) + bs.f() > v.u - ba.a) {
        j = v.u - ba.a - bs.f();
      } else if (j < 0) {
        j = 0;
      } 
      bs.a_(v.t + bs.e(), j);
      bs.d(i, j);
      bs.a((bg)object);
      bs.a(new gb(0, 2));
      bs.b(new gb(1, 3));
      bs.c(a.n);
      bs.a_(1);
      object.a(bs);
      return;
    } 
    object = object;
    if (this.u != 4) {
      if (i > 0) {
        a(((dn)object).a);
        return;
      } 
    } else {
      Object object1 = object;
      ((ot)(object = this)).C = object1;
      Object object2 = { "Chép nội dung" };
      int[] arrayOfInt = { 10901 };
      if (((dn)object1).d >= 0) {
        String str;
        n n1 = ((dn)object1).c.a(((dn)object1).d);
        String[] arrayOfString = null;
        int[] arrayOfInt1 = null;
        switch (n1.c()) {
          case 5:
            arrayOfString = new String[] { "Xem Bang" };
            arrayOfInt1 = new int[] { 10902 };
            break;
          case 4:
            if (!i.b((String)(object1 = ((dn)object1).c.b(n1.b(), ((dn)object1).d)))) {
              if (object1.charAt(0) == '@')
                object1 = object1.substring(1); 
              if (!object1.equals(go.e)) {
                arrayOfString = new String[] { "Chat!", "Xem ME" };
                arrayOfInt1 = new int[] { 10903, 10913 };
                break;
              } 
              arrayOfString = new String[] { "Xem ME" };
              arrayOfInt1 = new int[] { 10913 };
              break;
            } 
            return;
          case 3:
            arrayOfString = new String[] { "Xem tin", "Chép link" };
            arrayOfInt1 = new int[] { 10905, 10904 };
            break;
          case 1:
            if ((str = lo.a(((lo)n1).i)) != null) {
              arrayOfString = new String[] { str, "Gửi tiếp" };
              arrayOfInt1 = new int[] { 10914, 10906 };
            } 
            break;
        } 
        if (arrayOfString != null && arrayOfString.length > 0) {
          object1 = new String[1 + arrayOfString.length];
          int[] arrayOfInt2 = new int[1 + arrayOfInt1.length];
          System.arraycopy(arrayOfString, 0, object1, 0, arrayOfString.length);
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
          for (int i1 = arrayOfString.length; i1 < object1.length; i1++) {
            object1[i1] = object2[i1 - arrayOfString.length];
            arrayOfInt2[i1] = arrayOfInt[i1 - arrayOfInt1.length];
          } 
          object2 = object1;
          arrayOfInt = arrayOfInt2;
        } 
      } 
      br[] arrayOfBr = new br[object2.length];
      for (byte b = 0; b < arrayOfBr.length; b++)
        arrayOfBr[b] = new br((String)object2[b], arrayOfInt[b]); 
      bs bs;
      (bs = new bs()).a(new gb(0, 2));
      bs.b(new gb(1, 3));
      bs.a(arrayOfBr);
      int m = ((ot)object).s.s();
      object1 = ((ot)object).s.o(m);
      k k = ((ot)object).t.r();
      int n = (v.t - bs.e()) / 2;
      int j;
      if ((j = ((ot)object).t.d() + object1.d() - k.b) + bs.f() > v.u - ba.a) {
        j = v.u - ba.a - bs.f();
      } else if (j < 0) {
        j = 0;
      } 
      bs.a_(v.t + bs.e(), j);
      bs.d(n, j);
      bs.a((bg)object);
      bs.a(new gb(0, 2));
      bs.b(new gb(1, 3));
      bs.c(a.n);
      bs.a_(1);
      object.a(bs);
    } 
  }
  
  public final void a(String paramString) {
    byte b;
    if (paramString == null || paramString.equals(".")) {
      this.v = new Object[5];
      this.v[0] = new dn("Các trang báo", 0, this.s.e());
      b = 1;
      int i = this.v.length - 1;
      while (b < i) {
        int j = b - 1;
        String str = (b < 10) ? ("  " + b) : String.valueOf(b);
        this.v[b] = new dn(String.valueOf(str) + ". " + r[j], q[j], this.s.e() - 2);
        b++;
      } 
      if (a.m != null)
        this.v[this.v.length - 1] = a.m.K(); 
      this.A = ".";
      j(1);
      C();
      return;
    } 
    a.s().a(null, null, 375);
    du.a().a(b, (short)this.i);
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
  
  public final void d(int paramInt1, int paramInt2) {
    ot ot1;
    he he;
    ff ff;
    String str;
    hp hp1;
    bs bs;
    int i;
    hp hp2;
    String[] arrayOfString;
    oi oi;
    int[] arrayOfInt;
    br[] arrayOfBr;
    int j;
    int k;
    switch (paramInt2) {
      case -1:
        ot1 = this;
        (bs = new bs()).a(new gb(0, 2));
        bs.b(new gb(1, 3));
        if (ot1.y.d() > 0) {
          if (ot1.z < ot1.y.d() - 1) {
            if (ot1.z > 0) {
              arrayOfString = new String[] { "Trang trước", "Trang kế", "Trang chủ", "Đóng" };
              arrayOfInt = new int[] { 10907, 10909, 10908, 10900 };
            } else {
              arrayOfString = new String[] { "Trang kế", "Trang chủ", "Đóng" };
              arrayOfInt = new int[] { 10909, 10908, 10900 };
            } 
          } else if (ot1.z > 0) {
            arrayOfString = new String[] { "Trang trước", "Trang chủ", "Đóng" };
            arrayOfInt = new int[] { 10907, 10908, 10900 };
          } else {
            arrayOfString = new String[] { "Trang chủ", "Đóng" };
            arrayOfInt = new int[] { 10908, 10900 };
          } 
        } else {
          arrayOfString = new String[] { "Trang chủ", "Đóng" };
          arrayOfInt = new int[] { 10908, 10900 };
        } 
        arrayOfBr = new br[arrayOfString.length];
        j = 0;
        k = arrayOfString.length;
        while (j < k) {
          arrayOfBr[j] = new br(arrayOfString[j], arrayOfInt[j]);
          j++;
        } 
        if (a.m != null) {
          arrayOfBr = a.m.a(arrayOfBr, arrayOfBr.length - 1);
          arrayOfBr = oi.b(arrayOfBr, arrayOfBr.length - 1);
        } 
        if (ot1.u == 4) {
          br[] arrayOfBr1 = new br[arrayOfBr.length + 1];
          System.arraycopy(arrayOfBr, 0, arrayOfBr1, 0, arrayOfBr.length - 1);
          arrayOfBr1[arrayOfBr1.length - 1] = arrayOfBr[arrayOfBr.length - 1];
          arrayOfBr1[arrayOfBr1.length - 2] = new br("Thao tác", 10911);
          br[] arrayOfBr2 = { new br("Gửi Me", 10912), new br("Chép link", 10904) };
          arrayOfBr1[arrayOfBr1.length - 2].a(arrayOfBr2);
          arrayOfBr = arrayOfBr1;
        } 
        bs.a(arrayOfBr);
        j = (bs.e() > bs.f()) ? bs.e() : bs.f();
        bs.a_(-j, v.u);
        bs.d(0, v.u - ba.a - bs.f());
        bs.a(ot1);
        ot1.a(bs);
        return;
      case 1:
        t();
        return;
      case 0:
        this.l.f(95);
        return;
      case 4:
        ff = (ff)(he = (he)a.s().d(-989858)).e(1);
        str = String.valueOf(ff.r()) + " " + d(this.A);
        i = this.B.r() + 1;
        a.s().a(false);
        (oi = a.m).p.a(str, 0L, i);
        return;
      case 3:
        a.s().a(-989858, false);
        return;
      case 5:
        a.s().a(false);
        if (this.z >= 0 && this.z < this.y.d()) {
          b((String)this.y.b(this.z));
          return;
        } 
        a(null);
        return;
      case -7:
        (hp1 = new hp((byte)2)).a(this);
        ag.b().a(hp1, false);
        return;
      case -8882:
        ag.b().e(999999223);
        return;
      case -8881:
        hp1 = (hp)a.s().d(999999223);
        if (this.B != null && hp1 != null && oy.f != null) {
          i = hp1.v();
          this.B.a(oy.f);
          this.B.h(i);
          this.B.b(oy.a[i], oy.b[i], oy.c[i], oy.d[i]);
          hp1.e(i);
          ag.b().e(999999223);
          return;
        } 
        return;
      case -8883:
        if ((hp2 = (hp)a.s().d(999999223)) != null) {
          hp2.u();
          this.B.a((Image)null);
        } 
        ag.b().e(999999223);
        return;
    } 
    ((fc)this.b).a();
  }
  
  private static String d(String paramString) {
    return "rss://" + paramString;
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    ot ot1;
    he he1;
    he he2;
    ff ff;
    if (paramObject == null)
      return; 
    br br = (br)paramObject;
    int i;
    if ((i = this.l.b()) == 1) {
      if (this.C instanceof dn) {
        lo lo;
        String str1;
        oi oi;
        String str2;
        String str4;
        dn dn;
        String str3 = (dn = (dn)this.C).c.b(dn.c.a(dn.d).b(), dn.d);
        switch (paramInt2) {
          case 10901:
            ff.i = str4 = dn.c.i();
            break;
          case 10914:
            if (br.b().equals("Xem Ảnh")) {
              if (a.m != null) {
                lo = (lo)dn.c.a(dn.d);
                (oi = a.m).q.a(lo.i.a());
              } 
              break;
            } 
            if (br.b().equals("Xem video") || br.b().equals("Nghe audio"))
              a.s().C(); 
            break;
          case 10906:
            lo = (lo)((dn)lo).c.a(((dn)lo).d);
            a.d("Nhập nick muốn gửi", lo.i.a());
            break;
          case 10905:
            str1 = ((dn)lo).c.b(((dn)lo).c.a(((dn)lo).d).b(), ((dn)lo).d);
            if (a.m != null) {
              str4 = str1;
              str1 = null;
              (oi = a.m).a(str1, str4, true);
            } 
            break;
          case 10904:
            ff.i = str1 = ((dn)str1).c.b(((dn)str1).c.a(((dn)str1).d).b(), ((dn)str1).d);
            break;
          case 10913:
            if (!i.b((String)oi)) {
              if (oi.charAt(0) == '@')
                str2 = oi.substring(1); 
              if (a.m != null)
                a.m.a(str2, 0L); 
            } 
            break;
          case 10903:
            if (!i.b(str2)) {
              if (str2.charAt(0) == '@')
                str2 = str2.substring(1); 
              if (a.m != null)
                a.m.c(str2); 
            } 
            break;
          case 10902:
            str1 = ((dn)str1).c.b(((dn)str1).c.a(((dn)str1).d).b(), ((dn)str1).d);
            if (a.m != null)
              a.m.a(str1, 0L); 
            break;
          default:
            if (br.b().equals("Xem Ảnh")) {
              if (a.m != null) {
                lo lo1 = (lo)((dn)str1).c.a(((dn)str1).d);
                oi oi1;
                (oi1 = a.m).q.a(lo1.i.a());
              } 
              break;
            } 
            a.s().C();
            break;
        } 
      } else if (a.m != null) {
        a.m.b(br.b(), ((dq)this.C).c);
      } 
      t();
    } 
    switch (paramInt2) {
      case 10908:
        D();
        break;
      case 10907:
        E();
        break;
      case 10909:
        F();
        break;
      case 10912:
        i = d(this.A).length() + 1;
        ot1 = this;
        (he1 = a.a("Bạn nghĩ gì nào?", null, "Xong", 4, "Hủy", 3, -7, ot1)).b(-989858);
        ot1.B = (fu)he1.e(4);
        (ff = (ff)(he2 = he1).e(1)).h(300 - i);
        ag.b().a(he2, false);
        break;
      case 10904:
        ff.i = d(this.A);
        break;
      case 10900:
        this.p = true;
        if (this.b != null)
          ((fc)this.b).d(this); 
        break;
      case 11399:
        if (a.m != null)
          a.m.b(ot1.b()); 
        break;
      default:
        if (a.m != null)
          a.m.j(he1); 
        break;
    } 
    t();
  }
  
  private void D() {
    if (this.v != null) {
      v();
      C();
      this.A = null;
      c(B());
      return;
    } 
    a(null);
  }
  
  private void E() {
    if (this.z > 0) {
      v();
      this.z--;
      b((String)this.y.b(this.z));
    } 
  }
  
  private void F() {
    if (this.z < this.y.d() - 1) {
      v();
      this.z++;
      b((String)this.y.b(this.z));
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ot.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */