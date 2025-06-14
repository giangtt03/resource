import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.DateField;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;

public final class oi extends fb implements bf, bg, bn, bq, dv, CommandListener, r {
  private oj u;
  
  private ot v;
  
  on p;
  
  oo q;
  
  private ok w;
  
  private a x;
  
  private a y;
  
  private boolean[] z;
  
  private ay A;
  
  private aw B;
  
  private int C = 0;
  
  public static long r;
  
  private boolean D;
  
  public String[] s;
  
  public String[] t;
  
  private eb[] E;
  
  private long F;
  
  private br G;
  
  private eu H = null;
  
  private eb I = null;
  
  private la J = null;
  
  private boolean K = false;
  
  private String L = "";
  
  private long M;
  
  private int N;
  
  public static void v() {
    j(false);
  }
  
  private static void j(boolean paramBoolean) {
    if (v.ah || paramBoolean) {
      p.i();
      pc.c();
      ly.g();
      fo.q();
      oy.b();
      pe.a((pe)null);
    } 
    System.gc();
  }
  
  public static void w() {
    p.h();
    pc.a();
    pc.b();
    ly.f();
    fo.a();
    try {
      oy.a();
      pe pe;
      if (!(((pe = pe.a()).a != null) ? 1 : 0)) {
        byte[] arrayOfByte = pd.q();
        pe = pe.a();
        if (arrayOfByte != null) {
          try {
            pe.a(ep.a(arrayOfByte));
          } catch (Throwable throwable) {
            return;
          } 
        } else {
          return;
        } 
      } 
    } catch (Throwable throwable2) {
      Throwable throwable1;
      (throwable1 = null).printStackTrace();
      oy.b();
      pe.a((pe)null);
    } 
  }
  
  public oi() {
    super(104, 1, "Bằng Hữu", false);
    a(0, 0, v.t, v.u);
    this.x = new a();
    this.A = new ay(0);
    this.A.a(c(), d(), e(), f() - 20);
    this.B = new aw();
    this.B.a(this);
    this.B.a((bq)this);
    this.B.e(true);
    this.A.b(this.B);
    if (!v.z)
      this.A.h(1); 
    a(new ba());
    this.u = new oj(105, 2, "Danh Sách Đàm Đạo");
    this.v = new ot(109, 7, "Báo online");
    this.p = new on(107, 5, "Ola Me");
    this.q = new oo(108, 6, "Xem Ảnh");
    this.w = new ok();
    a(new gb(-1, 0));
    b(new gb(-2, 1));
    c(new ge());
    a(this);
    a.o = false;
  }
  
  public final on z() {
    return this.p;
  }
  
  public final oj A() {
    return this.u;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    String str;
    if (i.a(paramCommand.getLabel(), "Xong")) {
      str = "";
      ec[] arrayOfEc;
      if ((arrayOfEc = this.I.f()) != null)
        for (byte b = 0; b < arrayOfEc.length; b++) {
          eq eq = (eq)a(arrayOfEc[b]);
          str = String.valueOf(str) + " " + eq.a();
        }  
      ci.a(str = String.valueOf(this.I.g()) + str, this.I.d(), (be)null);
      MGMIDlet.d().a((Displayable)ag.a(), true);
    } else if (i.a(str.getLabel(), "Hủy")) {
      MGMIDlet.d().a((Displayable)ag.a(), true);
    } 
    ((Form)paramDisplayable).deleteAll();
  }
  
  public final boolean b(String paramString) {
    return b(paramString, this.E);
  }
  
  public final boolean b(String paramString, eb[] paramArrayOfeb) {
    if (paramArrayOfeb == null)
      return false; 
    for (byte b = 0; b < paramArrayOfeb.length; b++) {
      eb eb1;
      if ((eb1 = paramArrayOfeb[b]).e().equals(paramString)) {
        this.I = eb1;
        if (!i.b(paramString = "FREE") && !(paramString = paramString.toUpperCase()).equals("FREE") && !paramString.equals("MIỄN PHÍ")) {
          al al;
          (al = ag.b().a("Chú ý", "Bạn sẽ tốn " + paramString, "Có", -1006, "Không", 6, 1)).a(this);
          ag.b().a(al, false);
          return true;
        } 
        a(eb1);
        return true;
      } 
    } 
    return false;
  }
  
  public final void a(eb parameb) {
    String str;
    if ((str = parameb.a()).equals("wap")) {
      a((String)null, parameb.b(), false);
      return;
    } 
    if (str.equals("app"))
      try {
        long l = Long.parseLong(parameb.b());
        du.a().b(l);
        return;
      } catch (Exception exception) {
        return;
      }  
    if (str.equals("rss")) {
      a((String)null, "rss://" + parameb.b(), false);
      return;
    } 
    if (str.equals("call")) {
      MGMIDlet.d();
      MGMIDlet.b(parameb.c());
      return;
    } 
    if (str.equals("msg") || str.equals("sms")) {
      Form form = new Form(parameb.e());
      ec[] arrayOfEc;
      if ((arrayOfEc = parameb.f()) != null)
        for (byte b = 0; b < arrayOfEc.length; b++)
          form.append(a(arrayOfEc[b]));  
      form.addCommand(new Command("Xong", 4, 1));
      form.addCommand(new Command("Hủy", 3, 1));
      form.setCommandListener(this);
      MGMIDlet.d().a((Displayable)form, true);
    } 
  }
  
  private void a(dt[] paramArrayOfdt, boolean paramBoolean) {
    int i;
    for (i = 0; i < paramArrayOfdt.length; i++) {
      for (byte b = 0; b < this.x.d(); b++) {
        dt dt1;
        if ((dt1 = k(b)).b().equals(paramArrayOfdt[i].b())) {
          this.x.a(b);
          break;
        } 
      } 
    } 
    for (i = 0; i < paramArrayOfdt.length; i++) {
      if (paramArrayOfdt[i].c() == null)
        paramArrayOfdt[i].a(new ds[0]); 
      if (paramBoolean) {
        this.x.b(paramArrayOfdt[i], 0);
      } else {
        this.x.a(paramArrayOfdt[i]);
      } 
    } 
    oi oi1;
    boolean[] arrayOfBoolean = new boolean[(oi1 = this).x.d()];
    for (i = 0; i < arrayOfBoolean.length; i++)
      arrayOfBoolean[i] = true; 
    if (oi1.z != null) {
      i = (arrayOfBoolean.length > oi1.z.length) ? oi1.z.length : arrayOfBoolean.length;
      for (byte b = 0; b < i; b++)
        arrayOfBoolean[b] = oi1.z[b]; 
    } 
    oi1.z = arrayOfBoolean;
    oi1.M();
    oi1.N();
  }
  
  private void M() {
    if (gr.c) {
      this.y = this.x;
      return;
    } 
    this.y = new a();
    for (byte b = 0; b < this.x.d(); b++) {
      dt dt1;
      ds[] arrayOfDs1 = (dt1 = k(b)).c();
      dt dt2;
      (dt2 = new dt(dt1.b())).a(dt1.a());
      byte b1 = 0;
      for (byte b2 = 0; b2 < arrayOfDs1.length; b2++) {
        if (arrayOfDs1[b2].e() == 2)
          b1++; 
      } 
      ds[] arrayOfDs2 = new ds[b1];
      b1 = 0;
      for (byte b3 = 0; b3 < arrayOfDs1.length; b3++) {
        if (arrayOfDs1[b3].e() == 2)
          arrayOfDs2[b1++] = arrayOfDs1[b3]; 
      } 
      dt2.a(arrayOfDs2);
      this.y.a(dt2);
    } 
  }
  
  private void N() {
    a a1 = new a(this.y.d());
    for (byte b = 0; b < this.y.d(); b++) {
      dt dt = (dt)this.y.b(b);
      a1.a(dt);
      if (this.z[b]) {
        ds[] arrayOfDs = dt.c();
        for (byte b1 = 0; b1 < arrayOfDs.length; b1++)
          a1.a(arrayOfDs[b1]); 
      } 
    } 
    synchronized (this.B) {
      this.B.q();
      for (byte b1 = 0; b1 < a1.d(); b1++)
        this.B.a(a1.b(b1)); 
      return;
    } 
  }
  
  public final dt[] B() {
    dt[] arrayOfDt = new dt[this.x.d()];
    for (byte b = 0; b < arrayOfDt.length; b++)
      arrayOfDt[b] = k(b); 
    return arrayOfDt;
  }
  
  private dt k(int paramInt) {
    return (dt)this.x.b(paramInt);
  }
  
  public final void x() {
    this.A.c(true);
  }
  
  public final void y() {}
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (paramBoolean)
      this.A.c(true); 
  }
  
  public final boolean f(int paramInt) {
    al al;
    if (paramInt == 97 || paramInt == 96)
      return false; 
    if (paramInt == 142) {
      Object object = this.B.t();
      String str = null;
      if (object instanceof ds)
        str = ((ds)object).f(); 
      if (!i.b(str)) {
        (al = ag.b().a((String)null, str, "Đóng", 2, 1)).a(ag.b());
        ag.b().a(al, false);
        return true;
      } 
    } 
    return this.A.f(al);
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    return this.A.e(paramInt1, paramInt2);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    return this.A.c(paramInt1, paramInt2);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    return this.A.f(paramInt1, paramInt2);
  }
  
  public final void n() {
    if (this.C > 0) {
      this.C--;
      c(true);
    } 
    this.A.n();
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    boolean bool;
    if (bool = this.A.k()) {
      c(true);
      paramGraphics.setColor(v.am);
      paramGraphics.fillRect(c(), d(), e(), f() - 20);
      paramGraphics.drawImage(pc.d, c() + e(), d() + f() - ba.a, 40);
    } 
    this.A.a(paramGraphics, c(), d());
  }
  
  public final aq a(aw paramaw, int paramInt) {
    Object object;
    if (object = paramaw.i(paramInt) instanceof ds) {
      ds ds = (ds)object;
      return new eu(ds, this.B.e());
    } 
    for (byte b = 0; b < this.y.d(); b++) {
      dt dt1 = (dt)this.y.b(b);
      paramInt--;
      if (this.z[b])
        paramInt -= (dt1.c()).length; 
      if (paramInt < 0) {
        paramInt = b;
        break;
      } 
    } 
    dt dt = (dt)object;
    return new ev(dt, this.z[paramInt], this.B.e());
  }
  
  public final void a(aq paramaq) {
    super.a(paramaq);
    if (paramaq != null) {
      if (this.u.a()) {
        O();
        this.u.A();
      } 
      fc fc;
      if (((op)(paramaq = this.u.v())).p != null && (paramaq = this).b != null && !(fc = (fc)paramaq.l()).b(((oi)paramaq).u.v()))
        fc.c(((oi)paramaq).u.v()); 
    } 
  }
  
  private void O() {
    if (this.b == null)
      return; 
    fc fc;
    if (!(fc = (fc)l()).b(this.u))
      fc.c(this.u); 
  }
  
  private void a(ds paramds, boolean paramBoolean1, boolean paramBoolean2) {
    O();
    this.u.a(paramds, paramBoolean1, paramBoolean2);
  }
  
  private ds a(String paramString, boolean paramBoolean) {
    if (paramString == null)
      return null; 
    paramString = paramString.toLowerCase();
    ds ds;
    if ((ds = d(paramString)) != null) {
      a(ds, false, paramBoolean);
    } else {
      ds = e(paramString);
      a(ds, true, paramBoolean);
    } 
    return ds;
  }
  
  public final ds c(String paramString) {
    return a(paramString, true);
  }
  
  public final void a(String paramString, long paramLong) {
    f(true);
    this.p.a(paramString, 0L);
  }
  
  private ds d(String paramString) {
    for (byte b = 0; b < this.x.d(); b++) {
      dt dt;
      ds[] arrayOfDs;
      if ((arrayOfDs = (dt = k(b)).c()) != null)
        for (byte b1 = 0; b1 < arrayOfDs.length; b1++) {
          if (arrayOfDs[b1].a().equals(paramString))
            return arrayOfDs[b1]; 
        }  
    } 
    return null;
  }
  
  public final void b(aq paramaq, int paramInt) {
    ds ds;
    Object object;
    if (object = this.B.i(paramInt) instanceof ds) {
      String[] arrayOfString;
      int[] arrayOfInt1;
      int[] arrayOfInt2;
      eu eu1 = (eu)this.B.o(paramInt);
      oi oi1;
      (oi1 = this).H = eu1;
      bs bs = new bs();
      if (eu1.i.a().length() < 3) {
        arrayOfString = new String[] { "Chat!" };
        arrayOfInt1 = new int[] { 10400 };
      } else {
        arrayOfString = new String[] { "Chat!", "Xem ME" };
        arrayOfInt1 = new int[] { 10400, 10401 };
      } 
      int n = eu1.j.f(3);
      int i1 = eu1.j.f(1);
      String str1 = null;
      String str2;
      if (i1 >= 0 && (str2 = lo.a(((lo)eu1.j.a(i1)).i)) != null)
        str1 = str2; 
      if (n >= 0 && i1 >= 0 && !i.b(str1)) {
        String[] arrayOfString1 = new String[arrayOfString.length + 2];
        arrayOfInt2 = new int[arrayOfInt1.length + 2];
        System.arraycopy(arrayOfString, 0, arrayOfString1, 0, arrayOfString.length);
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
        arrayOfString1[arrayOfString1.length - 2] = "Xem tin";
        arrayOfInt2[arrayOfInt2.length - 2] = 10420;
        arrayOfString1[arrayOfString1.length - 1] = str1;
        arrayOfInt2[arrayOfInt2.length - 1] = 10421;
        arrayOfString = arrayOfString1;
        arrayOfInt1 = arrayOfInt2;
      } else {
        if (arrayOfInt2 >= null) {
          String[] arrayOfString1 = new String[arrayOfString.length + 1];
          arrayOfInt2 = new int[arrayOfInt1.length + 1];
          System.arraycopy(arrayOfString, 0, arrayOfString1, 0, arrayOfString.length);
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
          arrayOfString1[arrayOfString1.length - 1] = "Xem tin";
          arrayOfInt2[arrayOfInt2.length - 1] = 10420;
          arrayOfString = arrayOfString1;
          arrayOfInt1 = arrayOfInt2;
        } 
        if (i1 >= 0 && !i.b(str1)) {
          String[] arrayOfString1 = new String[arrayOfString.length + 1];
          arrayOfInt2 = new int[arrayOfInt1.length + 1];
          System.arraycopy(arrayOfString, 0, arrayOfString1, 0, arrayOfString.length);
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
          arrayOfString1[arrayOfString1.length - 1] = str1;
          arrayOfInt2[arrayOfInt2.length - 1] = 10421;
          arrayOfString = arrayOfString1;
          arrayOfInt1 = arrayOfInt2;
        } 
      } 
      boolean bool;
      if ((bool = (eu1.i.g() != null && eu1.i.g().equals("patriot")) ? true : false) && !eu1.i.a().equals(go.e) && oi1.l() instanceof fc && ((fc)oi1.l()).i(100)) {
        ol ol;
        if ((ol = (ol)((fc)oi1.l()).h(100)) != null && ol.p != null && ol.p.b() == 2) {
          String[] arrayOfString1 = new String[arrayOfString.length + 1];
          int[] arrayOfInt = new int[arrayOfInt1.length + 1];
          System.arraycopy(arrayOfString, 1, arrayOfString1, 2, arrayOfString.length - 1);
          System.arraycopy(arrayOfInt1, 1, arrayOfInt, 2, arrayOfInt1.length - 1);
          arrayOfString1[0] = arrayOfString[0];
          arrayOfInt[0] = arrayOfInt1[0];
          arrayOfString1[1] = "Xem thông tin";
          arrayOfInt[1] = 10424;
          arrayOfString = arrayOfString1;
          arrayOfInt1 = arrayOfInt;
        } else {
          String[] arrayOfString1 = new String[arrayOfString.length + 3];
          int[] arrayOfInt = new int[arrayOfInt1.length + 3];
          System.arraycopy(arrayOfString, 1, arrayOfString1, 4, arrayOfString.length - 1);
          System.arraycopy(arrayOfInt1, 1, arrayOfInt, 4, arrayOfInt1.length - 1);
          arrayOfString1[0] = arrayOfString[0];
          arrayOfInt[0] = arrayOfInt1[0];
          arrayOfString1[1] = "Khiêu Chiến";
          arrayOfInt[1] = 10422;
          arrayOfString1[2] = "Giao dịch";
          arrayOfInt[2] = 10423;
          arrayOfString1[3] = "Xem thông tin";
          arrayOfInt[3] = 10424;
          arrayOfString = arrayOfString1;
          arrayOfInt1 = arrayOfInt;
        } 
      } 
      br[] arrayOfBr = new br[arrayOfString.length];
      int j;
      for (j = 0; j < arrayOfString.length; j++)
        arrayOfBr[j] = new br(arrayOfString[j], arrayOfInt1[j]); 
      bs.a(arrayOfBr);
      j = oi1.B.s();
      aq aq1 = oi1.B.o(j);
      k k = oi1.A.r();
      int m = (v.t - bs.e()) / 2;
      int i;
      if ((i = oi1.A.d() + aq1.d() - k.b) + bs.f() > v.u - ba.a)
        i = v.u - ba.a - bs.f(); 
      bs.a_(v.t + bs.e(), i);
      bs.d(m, i);
      bs.a(oi1);
      bs.a(new gb(1, 2));
      bs.b(new gb(2, 3));
      bs.c(new ge());
      bs.a_(1);
      oi1.a(bs);
      if (!((arrayOfString.length < 2) ? 0 : 1)) {
        boolean bool1 = false;
        ds = (ds)object;
        (object = this).a(ds, false, true);
        return;
      } 
    } else {
      for (byte b = 0; b < this.y.d(); b++) {
        if (object.equals(this.y.b(b)) && b <= this.z.length) {
          this.z[b] = !this.z[b];
          N();
          this.B.k(ds);
          P();
          return;
        } 
      } 
    } 
  }
  
  private void P() {
    int i = (this.A.r()).b;
    int j;
    if ((j = this.B.s()) * 22 - i >= this.B.f() - 40 - 22)
      i = j * 22 - this.B.f() - 40 - 22; 
    this.A.k(i);
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
  
  public final void a(int paramInt) {
    ks.h += paramInt;
  }
  
  public final void b(int paramInt) {
    ks.h += paramInt;
  }
  
  public final void a(dt[] paramArrayOfdt) {
    if (paramArrayOfdt != null) {
      dt[] arrayOfDt = paramArrayOfdt;
      for (byte b = 0; b < arrayOfDt.length; b++) {
        ds[] arrayOfDs;
        if (arrayOfDt[b].a() == 1 && (arrayOfDs = arrayOfDt[b].c()) != null)
          for (byte b1 = 0; b1 < arrayOfDs.length; b1++)
            arrayOfDs[b1].b((short)0);  
      } 
      a(paramArrayOfdt, true);
    } 
  }
  
  public final void a(dt[] paramArrayOfdt, int paramInt) {
    if (paramArrayOfdt == null)
      return; 
    oi oi2;
    if ((oi2 = this).x != null)
      for (int i = oi2.x.d() - 1; i >= 0; i--) {
        dt dt1;
        if ((dt1 = (dt)oi2.x.b(i)).a() != 1)
          oi2.x.a(i); 
      }  
    if (gr.h) {
      pd.a(paramArrayOfdt, paramInt);
      go.d = paramInt;
    } 
    dt[] arrayOfDt = paramArrayOfdt;
    oi oi1;
    (oi1 = this).a(arrayOfDt, false);
    String[] arrayOfString;
    if ((arrayOfString = pd.t()) != null)
      for (byte b = 0; b < arrayOfString.length; b++)
        a(arrayOfString[b], false);  
  }
  
  public final void C() {
    if (!this.v.p)
      i(false); 
    if (!this.p.q)
      f(false); 
    if (!this.w.s)
      k(false); 
    oi oi1;
    if (!(oi1 = this).K && oi1.b != null) {
      oi1.K = true;
      du.a().j();
    } 
  }
  
  public static br[] a(eb[] paramArrayOfeb) {
    br[] arrayOfBr = new br[paramArrayOfeb.length];
    for (byte b = 0; b < arrayOfBr.length; b++) {
      arrayOfBr[b] = new br(paramArrayOfeb[b].e(), 11399);
      arrayOfBr[b].a(paramArrayOfeb[b]);
    } 
    return arrayOfBr;
  }
  
  public final br[] a(br[] paramArrayOfbr, int paramInt) {
    if (paramArrayOfbr == null || this.G == null)
      return paramArrayOfbr; 
    br[] arrayOfBr = new br[paramArrayOfbr.length + 1];
    System.arraycopy(paramArrayOfbr, 0, arrayOfBr, 0, paramInt);
    arrayOfBr[paramInt] = this.G;
    System.arraycopy(paramArrayOfbr, paramInt, arrayOfBr, paramInt + 1, paramArrayOfbr.length - paramInt);
    return arrayOfBr;
  }
  
  public final boolean j(int paramInt) {
    if (paramInt == 99031) {
      g(true);
      return true;
    } 
    if (paramInt == 99009) {
      h(true);
      return true;
    } 
    if (paramInt == 99017) {
      E();
      return true;
    } 
    if (paramInt == 99012) {
      MGMIDlet.d();
      MGMIDlet.b("1900588883");
      return true;
    } 
    if (paramInt == 99011) {
      a.F();
      return true;
    } 
    if (paramInt == 99008) {
      F();
      return true;
    } 
    if (paramInt == 99007) {
      a.D();
      return true;
    } 
    return false;
  }
  
  public static br[] b(br[] paramArrayOfbr, int paramInt) {
    br[] arrayOfBr = new br[paramArrayOfbr.length + 1];
    br br1 = new br("Giới thiệu", 99007);
    if (!a.o) {
      System.arraycopy(paramArrayOfbr, 0, arrayOfBr, 0, paramInt);
      arrayOfBr[paramInt] = br1;
      System.arraycopy(paramArrayOfbr, paramInt, arrayOfBr, paramInt + 1, paramArrayOfbr.length - paramInt);
      return arrayOfBr;
    } 
    br br2;
    (br2 = new br("Hỗ trợ", 99001)).a(new br[] { br1, new br("Hướng dẫn", 99008), new br("Thông Tin #12", 99031), new br("Thảo luận #SQ", 99009), new br("Rao vặt #sqgd", 99017), new br("Hỗ trợ", 99012), new br("Cài đặt", 99011) });
    System.arraycopy(paramArrayOfbr, 0, arrayOfBr, 0, paramInt);
    arrayOfBr[paramInt] = br2;
    System.arraycopy(paramArrayOfbr, paramInt, arrayOfBr, paramInt + 1, paramArrayOfbr.length - paramInt);
    return arrayOfBr;
  }
  
  public final void a(String paramString1, String paramString2) {
    di di;
    if ((di = this.u.a(paramString1, paramString2, 0)) == null) {
      String str = paramString1;
      ds ds;
      oi oi1;
      (ds = (oi1 = this).a(str, true)).d("patriot");
      this.u.a(paramString1, paramString2, 0);
    } 
    du.a().a(paramString1, paramString2, (String)null);
  }
  
  public final void a(ef paramef, short paramShort) {
    boolean bool = false;
    an an;
    if ((an = ag.b().d()) != null && an.h() == 1) {
      an an1;
      ol ol;
      if (((((oa)(an1 = an = an)).k != null) ? (((ol = ((oa)an1).k).p != null && ol.p.b() == 2) ? ((oq)ol.p).s() : "") : "").equals(paramef.b())) {
        String str2 = paramef.c();
        String str1 = str2;
        ol ol1;
        if (((oa)(an1 = an)).k != null && (ol1 = ((oa)an1).k).p != null && ol1.p.b() == 2)
          ((oq)ol1.p).a(str1); 
        bool = true;
      } 
    } else if (System.currentTimeMillis() - this.F >= 15000L && paramef.c().equals(gs.f)) {
      this.F = System.currentTimeMillis();
      ag.a().a(50);
      ag.a().b(100);
    } 
    O();
    di di;
    if ((di = this.u.b(paramef.b(), paramef.c(), paramef.f())) == null) {
      boolean bool1;
      ds ds;
      if ((ds = d(paramef.b())) == null) {
        ds = e(paramef.b());
        bool1 = true;
      } else {
        bool1 = false;
      } 
      di = this.u.a(ds, paramef.c(), paramef.f(), bool1);
    } 
    if (!bool && paramShort != 2 && di != null) {
      di.a = true;
      if (this.b != null) {
        fc fc = (fc)l();
        if ((this.u.v()).p != null && (this.u.v()).p.equals(di) && fc.q().equals(this.u.v())) {
          di.a = false;
          return;
        } 
      } 
      if (di.a)
        this.u.A(); 
    } 
  }
  
  public final void D() {
    if (this.b == null)
      return; 
    fc fc;
    (fc = (fc)l()).d(this.q);
  }
  
  private void k(boolean paramBoolean) {
    if (this.b == null)
      return; 
    fc fc;
    if (!(fc = (fc)l()).b(this.w))
      fc.c(this.w); 
    if (paramBoolean)
      fc.a(this.w); 
  }
  
  public final void e(boolean paramBoolean) {
    if (this.b == null)
      return; 
    fc fc;
    if (!(fc = (fc)l()).b(this.q))
      fc.c(this.q); 
    fc.a(this.q);
  }
  
  public final void f(boolean paramBoolean) {
    if (this.b == null)
      return; 
    fc fc;
    if (!(fc = (fc)l()).b(this.p))
      fc.c(this.p); 
    if (paramBoolean)
      fc.a(this.p); 
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean) {
    int i;
    if ((i = paramString2.toLowerCase().indexOf("rss://")) == 0) {
      this.v.a(paramString2.substring(6));
      return;
    } 
    if (paramBoolean) {
      a.s().a("Đang kiểm tra đường dẫn...", null);
      du.a().c(paramString2, paramString1);
      return;
    } 
    try {
      MGMIDlet.d().platformRequest(paramString2);
      return;
    } catch (ConnectionNotFoundException connectionNotFoundException) {
      (paramString1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void b(String paramString1, String paramString2) {
    a(paramString1, paramString2, true);
  }
  
  public final void E() {
    this.p.a("#sqgd", 0L);
    f(true);
  }
  
  public final void g(boolean paramBoolean) {
    this.p.a("#12", 0L);
    f(paramBoolean);
  }
  
  public final void h(boolean paramBoolean) {
    this.p.a("#sq", 0L);
    f(true);
  }
  
  public final void F() {
    String str2 = "rss://faq/sq";
    String str1 = null;
    oi oi1;
    (oi1 = this).a(str1, str2, true);
    i(true);
  }
  
  public final void i(boolean paramBoolean) {
    if (this.b == null)
      return; 
    fc fc;
    if (!(fc = (fc)l()).b(this.v))
      fc.c(this.v); 
    if (paramBoolean)
      fc.a(this.v); 
  }
  
  private static ds e(String paramString) {
    if (paramString == null)
      return null; 
    paramString = paramString.toLowerCase();
    ds ds;
    (ds = new ds()).a(paramString);
    ds.b(paramString);
    ds.a((short)-13);
    return ds;
  }
  
  public final void a(ds[] paramArrayOfds) {
    if (this.u.a())
      O(); 
    int i;
    for (i = 0; i < paramArrayOfds.length; i++) {
      for (byte b = 0; b < this.x.d(); b++) {
        ds[] arrayOfDs;
        if ((arrayOfDs = k(b).c()) != null) {
          boolean bool = false;
          for (byte b1 = 0; b1 < arrayOfDs.length; b1++) {
            if (arrayOfDs[b1].a().equals(paramArrayOfds[i].a())) {
              if (paramArrayOfds[i].e() == 2) {
                arrayOfDs[b1].c(paramArrayOfds[i].f());
                arrayOfDs[b1].a(paramArrayOfds[i].c());
                arrayOfDs[b1].b(paramArrayOfds[i].d());
              } 
              ef ef = null;
              if (paramArrayOfds[i].e() != arrayOfDs[b1].e() && this.u.a(arrayOfDs[b1].a()) >= 0) {
                (ef = new ef()).a(System.currentTimeMillis());
                ef.a(arrayOfDs[b1].a());
                String str = arrayOfDs[b1].a();
                if (!i.b(arrayOfDs[b1].b()))
                  str = arrayOfDs[b1].b(); 
                if (paramArrayOfds[i].e() == 2) {
                  ef.b("[" + str + " đã đăng nhập trở lại]");
                } else {
                  ef.b("[" + str + " đã đăng xuất]");
                } 
              } 
              arrayOfDs[b1].d(paramArrayOfds[i].g());
              arrayOfDs[b1].c(paramArrayOfds[i].e());
              this.u.a(arrayOfDs[b1]);
              if (ef != null)
                a(ef, (short)2); 
              bool = true;
              break;
            } 
          } 
          if (bool) {
            k(b).d();
            break;
          } 
        } 
      } 
    } 
    i = this.B.s();
    M();
    N();
    this.C = 1;
    if (i >= this.B.a())
      i = this.B.a() - 1; 
    this.B.k(i);
    P();
  }
  
  public final void a(ef[] paramArrayOfef, short paramShort) {
    if (paramArrayOfef != null) {
      O();
      if (this.b != null) {
        fc fc;
        (fc = (fc)l()).e(this.u);
      } 
      for (byte b = 0; b < paramArrayOfef.length; b++) {
        String str = (paramArrayOfef[b].c() == null) ? "" : paramArrayOfef[b].c();
        paramArrayOfef[b].b("(" + i.b(paramArrayOfef[b].d()) + "): " + str);
        a(paramArrayOfef[b], paramShort);
      } 
    } 
  }
  
  public final void G() {
    if (a.o && gr.i)
      pd.b(this.u.w()); 
    a.o = false;
    du.a().a((dv)null);
    aq aq;
    if ((aq = l()) != null) {
      (aq = aq).d(this);
      aq.d(this.u);
      aq.d(this.v);
      aq.d(this.p);
      aq.d(this.q);
      aq.d(this.w);
      aq.d(this.u.v());
    } 
    this.u = null;
    this.v = null;
    this.p = null;
    this.q = null;
    this.w = null;
    this.u = null;
    du.a().c();
    j(true);
    a.m = null;
    System.gc();
    ct.b("Logged out OLA");
  }
  
  public final void a(ds[] paramArrayOfds, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: astore #7
    //   4: astore #6
    //   6: iconst_0
    //   7: istore_3
    //   8: goto -> 39
    //   11: aload #6
    //   13: iload_3
    //   14: invokespecial k : (I)Ldt;
    //   17: dup
    //   18: astore #4
    //   20: invokevirtual b : ()Ljava/lang/String;
    //   23: aload #7
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 36
    //   31: aload #4
    //   33: goto -> 52
    //   36: iinc #3, 1
    //   39: iload_3
    //   40: aload #6
    //   42: getfield x : La;
    //   45: invokevirtual d : ()I
    //   48: if_icmplt -> 11
    //   51: aconst_null
    //   52: astore_3
    //   53: iconst_0
    //   54: istore #4
    //   56: goto -> 135
    //   59: aload_1
    //   60: iload #4
    //   62: aaload
    //   63: astore #5
    //   65: aload_3
    //   66: ifnonnull -> 116
    //   69: new dt
    //   72: dup
    //   73: aload_2
    //   74: invokespecial <init> : (Ljava/lang/String;)V
    //   77: astore_3
    //   78: aload_0
    //   79: aload_3
    //   80: astore #7
    //   82: dup
    //   83: astore #6
    //   85: iconst_1
    //   86: anewarray dt
    //   89: dup
    //   90: iconst_0
    //   91: aload #7
    //   93: aastore
    //   94: astore #7
    //   96: dup
    //   97: astore #6
    //   99: aload #7
    //   101: iconst_0
    //   102: invokespecial a : ([Ldt;Z)V
    //   105: aload_0
    //   106: aload #5
    //   108: aload_2
    //   109: aload_3
    //   110: invokespecial a : (Lds;Ljava/lang/String;Ldt;)V
    //   113: goto -> 132
    //   116: aload_0
    //   117: aload #5
    //   119: aload_2
    //   120: aload_3
    //   121: invokespecial a : (Lds;Ljava/lang/String;Ldt;)V
    //   124: aload_0
    //   125: invokespecial M : ()V
    //   128: aload_0
    //   129: invokespecial N : ()V
    //   132: iinc #4, 1
    //   135: iload #4
    //   137: aload_1
    //   138: arraylength
    //   139: if_icmplt -> 59
    //   142: return
  }
  
  private void a(ds paramds, String paramString, dt paramdt) {
    paramds.b((short)0);
    for (byte b = 0; b < this.x.d(); b++) {
      dt dt1;
      if ((dt1 = k(b)).b().compareTo(paramString) == 0) {
        ds[] arrayOfDs;
        if (dt1.c() != null) {
          arrayOfDs = new ds[(dt1.c()).length + 1];
          for (b = 0; b < (dt1.c()).length; b++)
            arrayOfDs[b] = dt1.c()[b]; 
          arrayOfDs[b] = paramds;
        } else {
          (arrayOfDs = new ds[1])[0] = paramds;
        } 
        paramdt.a(arrayOfDs);
        return;
      } 
    } 
  }
  
  public static void c(String paramString1, String paramString2) {
    du.a().a(paramString1, paramString2);
  }
  
  public final void H() {
    if (a.o)
      return; 
    if (!this.D && System.currentTimeMillis() - r > 120000L) {
      this.D = true;
      a(1, (String)null, (short)0);
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    oi oi3;
    al al;
    u u;
    oi oi2;
    String str2;
    oi oi1;
    String str1;
    ds ds;
    he he;
    boolean bool1;
    boolean bool2;
    ff ff;
    if (paramObject == null)
      return; 
    br br1 = (br)paramObject;
    t();
    switch (paramInt2) {
      case 10400:
        bool2 = false;
        ds = this.H.i;
        (oi3 = this).a(ds, false, true);
        return;
      case 10401:
        this.p.a(this.H.i.a(), 0L);
        f(true);
        return;
      case 10408:
        du.a().b((short)2412);
        a.s().a(null, null);
        return;
      case 10409:
        (al = ag.b().a("Chú ý", "Bạn muốn thoát hệ thống chat", "Có", 5, "Không", 6, 1)).a(this);
        ag.b().a(al, false);
        return;
      case 10410:
        f(true);
        return;
      case 10411:
        i(true);
        if (this.b != null) {
          ((fc)this.b).a(this.v);
          return;
        } 
        return;
      case 10412:
        e(true);
        return;
      case 10413:
        k(true);
        return;
      case 10414:
        gr.d = false;
        I();
        return;
      case 10415:
        gr.d = true;
        I();
        return;
      case 10416:
      case 10417:
        gr.c = !gr.c;
        J();
        (new byte[1])[0] = 1;
        (u = cs.a).b(133, gr.c ? new byte[1] : new byte[1]);
        return;
      case 10418:
        oi2 = this;
        if ((ff = (ff)(he = a.a("Nhập thông điệp mới", null, "Đổi", 3, "Hủy", 4)).e(1)) != null)
          ff.e(true); 
        he.a(oi2);
        he.b(-9999991);
        ag.b().a(he);
        return;
      case 10419:
        oi2 = this;
        (he = a.a("Nhập nick muốn chat", null, "Xong", 7, "Hủy", 8)).a(oi2);
        he.b(-9999992);
        ag.b().a(he, false);
        return;
      case 0:
        a.s().C();
        return;
      case 10420:
        if ((str2 = this.H.j.h()) != null) {
          String str4 = str2;
          String str3 = this.H.i.a();
          (oi1 = this).a(str3, str4, true);
          return;
        } 
        return;
      case 10421:
        if (oi1.b().equals("Xem Ảnh")) {
          if ((str1 = this.H.j.g()) != null) {
            bool1 = true;
            this.q.a(((str1 = (str1 = str1).trim()) == null || str1.length() <= 2) ? str1 : str1.substring(2, str1.length() - 1));
            return;
          } 
        } else {
          a.s().C();
          return;
        } 
        return;
      case 10422:
        a.d(this.H.i.a());
        return;
      case 10423:
        a.p(this.H.i.a());
        return;
      case 10424:
        a.s().b(this.H.i.a(), this.i);
        return;
      case 11399:
        b(str1.b());
        break;
    } 
    if (!a.s().m(bool1))
      j(bool1); 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    oi oi1;
    String str;
    bs bs;
    br br1;
    br[] arrayOfBr;
    br br2;
    br br3;
    br br4;
    br br5;
    br br6;
    br br7;
    switch (paramInt2) {
      case -1007:
        pd.e(go.c);
        ag.b().a(false);
        a.s().a(null, null);
        k(true);
        du.a().n();
        if (this.M < 1L)
          return; 
        du.a().b(this.M);
        return;
      case -1006:
        ag.b().a(false);
        a(this.I);
        return;
      case -1002:
        a.s().a(false);
        du.a().c((String)null, (short)this.q.i);
        return;
      case -1003:
        a.s().a(false);
        return;
      case -1004:
        a.s().a(false);
        du.a().k();
        return;
      case -1005:
        a.s().a(false);
        du.a().l();
        return;
      case -1:
        oi1 = this;
        (bs = new bs()).a(new gb(1, 2));
        bs.b(new gb(2, 3));
        br1 = null;
        if (a.m != null && a.o)
          (br1 = new br("Nạp KEN", 99003)).a(new br[] { new br("Nhắn tin", 99004), new br("Thẻ cào ĐT", 99005), new br("DS điện thoại", 99006) }); 
        br2 = new br("Thao tác", 10407);
        br3 = new br("Tính năng", 10406);
        br4 = new br("Đóng", 10409);
        br5 = new br("Mua vip", 10408);
        if (a.o) {
          arrayOfBr = b(arrayOfBr = new br[] { br3, br2, br1, br5, br4 }, 3);
        } else {
          arrayOfBr = b(arrayOfBr = new br[] { br3, br2, br4 }, 2);
        } 
        br3.a(new br[] { new br("Ola Me", 10410), new br("Báo online", 10411), new br("Media", 10412), new br("Kho Game", 10413) });
        if (gr.d) {
          br3 = new br("Ẩn Nick", 10414);
        } else {
          br3 = new br("Hiện Nick", 10415);
        } 
        if (gr.c) {
          br4 = new br("Chỉ hiện Online", 10416);
        } else {
          br4 = new br("Hiện Offline", 10417);
        } 
        br5 = new br("Đổi thông điệp", 10418);
        br6 = new br("Chat với", 10419);
        br7 = new br("Khoe Nhân Vật", 0);
        br2.a(new br[] { br3, br4, br5, br6, br7 });
        arrayOfBr = oi1.a(arrayOfBr, 2);
        bs.a(arrayOfBr);
        bs.a(oi1);
        bs.a_(-bs.e(), oi1.f());
        bs.d(0, oi1.f() - ba.a - bs.f());
        oi1.a(bs);
        return;
      case -2:
        if (this.b != null) {
          ((fc)this.b).a();
          return;
        } 
        break;
      case -1001:
        ag.b().a(-10001988, false);
        return;
      case -1000:
        G();
        a.s().l();
        return;
      case 1:
        this.l.f(95);
        return;
      case 2:
        t();
        return;
      case 3:
        str = a.k(-9999991);
        gr.d = true;
        f((str == null) ? "" : str);
        ag.b().a(-9999991, false);
        return;
      case 4:
        ag.b().a(-9999991, false);
        return;
      case 5:
        ag.b().a(false);
        G();
        return;
      case 6:
        ag.b().a(false);
        return;
      case 7:
        if (!i.b(str = a.k(-9999992))) {
          String str1 = str;
          oi oi2;
          (oi2 = this).a(str1, true);
        } 
        ag.b().a(-9999992, false);
        return;
      case 8:
        ag.b().a(-9999992, false);
        return;
      case 0:
        du.a().m();
        ag.b().e(241231);
        break;
    } 
  }
  
  private static void f(String paramString) {
    if (paramString == null) {
      paramString = pd.p();
    } else if (gr.g) {
      pd.a(paramString);
    } 
    if (paramString == null) {
      paramString = "Đang chơi game 12 Sứ Quân Online! http://sq.ola.vn";
    } else if (paramString.length() <= 0) {
      du.a().a((short)2);
      return;
    } 
    du.a().c(paramString);
  }
  
  public final void I() {
    if (gr.d) {
      od.f();
      f((String)null);
      return;
    } 
    od.f();
    du.a().a((short)1);
  }
  
  public final void J() {
    M();
    N();
    this.C = 1;
  }
  
  public final void a(String paramString) {
    a.s().v();
    try {
      MGMIDlet.d().platformRequest(paramString);
      return;
    } catch (ConnectionNotFoundException connectionNotFoundException) {
      (paramString = null).printStackTrace();
      return;
    } 
  }
  
  public final void a(int paramInt, dq[] paramArrayOfdq) {
    this.J = new la(paramInt, paramArrayOfdq);
  }
  
  public final dq K() {
    return (this.J == null) ? null : this.J.a();
  }
  
  public final void a(ea[] paramArrayOfea) {
    this.w.a(paramArrayOfea);
  }
  
  public final void a(String paramString1, String paramString2, ee[] paramArrayOfee, eb[] paramArrayOfeb) {
    if (this.b == null)
      return; 
    ag.b().a(new hk(paramString1, paramString2, paramArrayOfee, paramArrayOfeb), false);
    a.s().v();
  }
  
  public final void a(long paramLong, ea[] paramArrayOfea) {
    ea[] arrayOfEa = paramArrayOfea;
    long l = paramLong;
    ok ok1;
    if ((ok1 = this.w).q == null || arrayOfEa == null) {
      a.s().v();
      return;
    } 
    for (byte b = 0; b < ok1.q.length; b++) {
      if ((ok1.q[b]).k == l) {
        (ok1.q[b]).i = true;
        int i = 0;
        if (ok1.r[b] != null) {
          i = (ok1.r[b]).length;
          fa[] arrayOfFa = new fa[(ok1.r[b]).length + arrayOfEa.length];
          System.arraycopy(ok1.r[b], 0, arrayOfFa, 0, (ok1.r[b]).length);
          ok1.r[b] = arrayOfFa;
        } else {
          ok1.r[b] = new fa[arrayOfEa.length];
        } 
        for (byte b1 = 0; b1 < arrayOfEa.length; b1++)
          ok1.r[b][i + b1] = new fa(false, arrayOfEa[b1].c(), arrayOfEa[b1].a(), "Bấm vào để xem", 0, ok1.p.e()); 
      } 
    } 
    ok1.a();
    a.s().v();
  }
  
  public final void a(String paramString, long paramLong, int paramInt) {
    this.M = paramLong;
    this.L = paramString;
    this.N = paramInt;
    if (this.b != null)
      L(); 
  }
  
  public final void L() {
    if (go.c < this.N) {
      go.c = this.N;
      al al;
      (al = ag.b().a("Thông tin", "Vừa ra mắt: " + this.L, "Chơi thử", -1007, "Đóng", 6, 1)).a(this);
      ag.b().a(al, false);
    } 
  }
  
  public final void a(String[] paramArrayOfString) {
    a.s().v();
    if (paramArrayOfString == null)
      paramArrayOfString = new String[0]; 
    a.e(paramArrayOfString);
  }
  
  public final void a(int paramInt, String paramString, short paramShort) {
    paramString = i.b(paramString) ? " - Lỗi không xác định." : paramString;
    if (paramInt == 1 || paramInt == 7) {
      if (paramInt == 7)
        return; 
    } else {
      al al;
      a.s().v();
      if (this.b == null)
        return; 
      if (paramInt == 34 || paramInt == 27 || paramInt == 26 || paramInt == 35) {
        if (paramInt == 35 && paramShort == (short)this.q.i) {
          du.a().l();
          a.s().b().b(null);
        } 
        paramString = "Nội dung không tồn tại hoặc đã hết";
      } else if (paramInt == 8) {
        a.s().v();
      } else if (paramInt == 24) {
        paramString = "Không được thực hiện cùng 1 hành động quá nhanh!";
      } else if (paramInt == 38) {
        paramString = "Chức năng cần có VIP. Bạn có muốn mua VIP không?";
        a a1;
        (al = (a1 = a.s()).a("Chú ý", paramString, "Có", 12358, "Đóng", 12350, 1)).a((bf)a1);
        a1.a(al, false);
        return;
      } 
      a.s().a((String)al);
    } 
  }
  
  private static Item a(ec paramec) {
    es es;
    DateField dateField;
    ct.a("[BuddyListTab] createItem(...)  " + paramec.a + "  " + paramec.b);
    er er = null;
    switch (paramec.a) {
      case 4:
        er = new er(paramec.b, 2, paramec.d, null, paramec.e);
        break;
      case 6:
        er = new er(paramec.b, 4, paramec.d, null, paramec.e);
        break;
      case 5:
        er = new er(paramec.b, 1, paramec.d, null, paramec.e);
        break;
      case 3:
        es = new es(paramec.b, "", 20, 3);
        break;
      case 1:
        es = new es(paramec.b, "", 20, 0);
        break;
      case 2:
        es = new es(paramec.b, "", 20, 2);
        break;
      case 10:
        es = new es(paramec.b, paramec.c, 20, 131072);
        break;
      case 8:
        dateField = new DateField(paramec.b, 3);
        break;
      case 7:
        dateField = new DateField(paramec.b, 1);
        break;
      case 9:
        dateField = new DateField(paramec.b, 2);
        break;
    } 
    return (Item)dateField;
  }
  
  public final void a(String[] paramArrayOfString1, String[] paramArrayOfString2) {
    this.t = paramArrayOfString2;
    this.s = paramArrayOfString1;
  }
  
  public final void a(String paramString, short paramShort, ef[] paramArrayOfef) {
    f(false);
    this.p.a(paramString, paramShort, paramArrayOfef);
  }
  
  public final void a(String paramString1, String paramString2, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    a.s().v();
    a.a(paramString1, paramString2, paramArrayOfString1, paramArrayOfString2);
  }
  
  public final void a(ee paramee) {
    a.s().b().b(null);
    pd.a(paramee.h, paramee.a());
    this.q.a(paramee);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    a.s().b().b(new li(paramInt1, paramInt2));
  }
  
  public final void a(int paramInt, ep[] paramArrayOfep, byte[] paramArrayOfbyte) {
    if (go.b >= paramInt)
      return; 
    pd.b(paramArrayOfbyte);
    pd.f(paramInt);
    pe.a().a(paramArrayOfep);
    go.b = paramInt;
  }
  
  public final void c_() {
    al al;
    (al = ag.b().a("Chú ý", "File khác đang được tải. Bạn có muốn tải file khác không?", "Có", -1002, "Không", -1003, 1)).a(this);
    ag.b().a(al, false);
  }
  
  public final void d_() {
    al al;
    (al = ag.b().a("Chú ý", "File có kích thước lớn. Bạn có chắc muốn tải về không?", "Có", -1004, "Không", -1005, 1)).a(this);
    ag.b().a(al, false);
  }
  
  public final void e_() {
    a.s().b().b(null);
    al al;
    (al = ag.b().a("Thông tin", "Không đủ bộ nhớ để tải file", "Đóng", -1003, 1)).a(this);
    ag.b().a(al, false);
  }
  
  public final void a(short paramShort, long paramLong1, long paramLong2) {
    al al;
    (al = ag.b().a("", "Bạn vừa mua thành công VIP " + pe.a().c(paramShort) + ". Với giá: " + a.b(paramLong2) + ". Bạn còn " + i.a(paramLong1 / 86400000L, ".") + " ngày sử dụng", "Đóng", -1003, 1)).a(this);
    ag.b().a(al);
  }
  
  public final void a(String paramString, short paramShort, long paramLong) {
    al al;
    (al = ag.b().a("", "Bạn vừa nhận đươc VIP " + pe.a().c(paramShort) + " với " + paramLong + " ngày sử dụng từ " + paramString, "Đóng", -1003, 1)).a(this);
    ag.b().a(al);
  }
  
  public final void a(String paramString, eb[] paramArrayOfeb) {
    this.E = paramArrayOfeb;
    this.G = new br(paramString, 0);
    if (this.E != null)
      this.G.a(a(this.E)); 
  }
  
  public final void f_() {
    G();
    al al;
    (al = ag.b().a("Thông tin", "Hệ thống chat Ola của bạn đã bị đăng nhập bởi một người khác hoặc thiết bị khác!", "Đóng", 2, 1)).a(ag.b());
    ag.b().a(al, false);
  }
  
  public final void g_() {
    a.o = true;
    pd.b(go.e);
    dt[] arrayOfDt;
    if ((arrayOfDt = pd.u()) != null) {
      dt[] arrayOfDt1 = arrayOfDt;
      oi oi1;
      (oi1 = this).a(arrayOfDt1, false);
    } 
    String[] arrayOfString;
    if ((arrayOfString = pd.t()) != null)
      for (byte b = 0; b < arrayOfString.length; b++)
        a(arrayOfString[b], false);  
    du.a().i();
    du.a().a(go.d);
    du.a().s();
    du.a().q();
    du.a().r();
    du.a().b(go.b);
    if (gr.d) {
      String str;
      if ((str = pd.p()) == null)
        str = "Đang chơi game 12 Sứ Quân Online! http://sq.ola.vn"; 
      du.a().c(str);
    } 
    an an = ag.b().d();
    if (this.b != null) {
      C();
      return;
    } 
    if (an != null && an.h() == 1)
      ((oa)an).e(); 
  }
  
  public final void h_() {
    dz dz;
    (dz = new dz()).b = "vn";
    dz.e = v.t;
    dz.f = v.u;
    dz.g = 0;
    dz.c = "123456789";
    dz.d = "patriot";
    String str = System.getProperty("microedition.platform");
    dz.a = (str == null) ? " " : str;
    du.a().a(go.e, go.f, gr.d ? 2 : 1);
  }
  
  public final void i_() {
    du.a().l();
  }
  
  public final void a(String paramString, ee paramee) {
    ef ef;
    (ef = new ef()).b("#\033" + paramee.a() + "#");
    ef.a(paramString);
    ef.a(paramee.d);
    a(ef, (short)0);
  }
  
  public final void b(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    i(true);
    this.v.a(paramString, paramArrayOfString1, paramArrayOfString2);
  }
  
  public final void c(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    i(true);
    this.v.b(paramString, paramArrayOfString1, paramArrayOfString2);
  }
  
  public final void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    i(true);
    ot.a();
  }
  
  public final void a() {}
  
  public final void a(ef paramef, ef[] paramArrayOfef) {
    f(false);
    this.p.a(paramef, paramArrayOfef);
  }
  
  public final void a(String paramString, ef[] paramArrayOfef) {
    i(true);
    this.v.a(paramString, paramArrayOfef);
  }
  
  public final void a(int[] paramArrayOfint, long[] paramArrayOflong, short[] paramArrayOfshort) {
    al al;
    a.s().v();
    short[] arrayOfShort = paramArrayOfshort;
    long[] arrayOfLong = paramArrayOflong;
    int[] arrayOfInt = paramArrayOfint;
    String str = "Vui lòng chọn VIPICON và thời gian mà bạn muốn mua!";
    a a1 = a.s();
    if (arrayOfShort == null || arrayOfShort.length == 0) {
      al = a1.a("Chú ý", "Chưa có danh sách Vip Icon!", "Đóng", 12350, 1);
      a1.a(al, false);
      return;
    } 
    a1.a(new gv((String)al, go.e, arrayOfInt, arrayOfLong, arrayOfShort), false);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\oi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */