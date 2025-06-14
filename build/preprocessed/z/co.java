import javax.microedition.media.Control;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.TempoControl;
import javax.microedition.media.control.VolumeControl;

public final class co implements PlayerListener, r {
  private static co a;
  
  private Player b;
  
  private String c = "";
  
  private VolumeControl d;
  
  private TempoControl e;
  
  private boolean f;
  
  private int g;
  
  public static co b() {
    if (a == null)
      a = new co(); 
    return a;
  }
  
  public final void a(String paramString, int paramInt) {
    try {
      b(paramString, paramInt);
      return;
    } catch (Throwable throwable) {
      ct.a("Create Back ground 1: " + throwable);
      cq.a().b();
      cq.a().c();
      d();
      try {
        b(paramString, paramInt);
        return;
      } catch (Throwable throwable1) {
        d();
        ct.a("Back ground 2: " + throwable1);
        return;
      } 
    } 
  }
  
  private void b(String paramString, int paramInt) {
    if (!v.N)
      return; 
    d();
    this.b = Manager.createPlayer("".getClass().getResourceAsStream("/audio/" + paramString + ".mid"), "audio/midi");
    this.g = paramInt;
    this.b.setLoopCount(paramInt);
    this.b.realize();
    this.b.prefetch();
    this.b.addPlayerListener(this);
    Control control;
    if ((control = this.b.getControl("VolumeControl")) != null) {
      this.d = (VolumeControl)control;
      this.d.setLevel(v.Q);
      this.d.setMute(!v.N);
    } 
    if ((control = this.b.getControl("TempoControl")) != null) {
      this.e = (TempoControl)control;
      v.R = this.e.getTempo();
    } 
    this.c = paramString;
    this.f = false;
  }
  
  public final void c() {
    if (this.b != null)
      try {
        this.b.stop();
        return;
      } catch (Throwable throwable) {
        d();
        ct.a("[STOP BK Music]: " + throwable);
      }  
  }
  
  public final void d() {
    if (this.b != null)
      try {
        this.b.stop();
        this.b.deallocate();
      } catch (Throwable throwable) {
        ct.a("[Destroy BK Music1]: " + throwable);
        try {
          this.b.deallocate();
        } catch (Throwable throwable1) {
          ct.a("[Destroy BK Music2]: " + throwable1);
        } 
        return;
      } finally {
        this.b.close();
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = false;
      }  
  }
  
  public final void e() {
    if (!v.N)
      return; 
    s.a().a(this);
  }
  
  public final void a() {
    try {
      if (this.b != null) {
        this.b.stop();
        if (v.ah)
          cq.a().d(); 
        if (this.d != null) {
          this.d.setMute(!v.N);
          this.d.setLevel(v.Q);
        } 
        this.b.start();
        return;
      } 
    } catch (Throwable throwable) {
      ct.a("[Player BK Music2]: " + throwable);
      d();
      a(this.c, this.g);
      try {
        if (this.b != null) {
          this.b.start();
          return;
        } 
      } catch (Throwable throwable1) {
        ct.a("[Player BK Music3]: " + throwable1);
        d();
      } 
    } 
  }
  
  public final void a(int paramInt) {
    if (this.e != null)
      try {
        this.e.setTempo(paramInt);
        return;
      } catch (Throwable throwable) {} 
  }
  
  public final boolean f() {
    return this.f;
  }
  
  public final void g() {
    if (!v.N)
      return; 
    if (this.d != null) {
      this.d.setLevel(v.Q);
      this.d.setMute(!v.N);
    } 
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (!paramString.equals("endOfMedia")) {
      if (paramString.equals("started")) {
        this.f = true;
        return;
      } 
      if (paramString.equals("stopped"))
        this.f = false; 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\co.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */