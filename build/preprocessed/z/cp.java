import javax.microedition.media.Control;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.TempoControl;
import javax.microedition.media.control.VolumeControl;

public final class cp implements PlayerListener {
  private Player a;
  
  private VolumeControl b;
  
  private String c = "";
  
  private boolean d;
  
  private long e;
  
  private int f;
  
  private int g = 5000;
  
  private TempoControl h;
  
  public cp() {}
  
  public cp(String paramString) {
    a(paramString);
  }
  
  private void a(String paramString) {
    this.d = false;
    if (this.a != null && paramString.equals(this.c)) {
      c();
      return;
    } 
    try {
      if (!v.O || !v.S)
        return; 
      a();
      this.a = Manager.createPlayer("".getClass().getResourceAsStream("/audio/" + paramString + ".amr"), "audio/amr");
      this.a.setLoopCount(1);
      this.a.realize();
      this.a.prefetch();
      this.a.addPlayerListener(this);
      Control control;
      if ((control = this.a.getControl("VolumeControl")) != null) {
        this.b = (VolumeControl)control;
        this.b.setLevel(v.Q);
        this.b.setMute(!v.N);
      } 
      if ((control = this.a.getControl("TempoControl")) != null) {
        this.h = (TempoControl)control;
        v.R = this.h.getTempo();
      } 
      this.c = paramString;
      cs.a(false);
      return;
    } catch (Throwable throwable) {
      cs.a(true);
      a();
      return;
    } 
  }
  
  public final void a() {
    if (this.a != null)
      try {
        this.a.stop();
        this.a.deallocate();
      } catch (Throwable throwable) {
        return;
      } finally {
        this.a.close();
        this.a = null;
        this.b = null;
        this.c = "";
      }  
  }
  
  public final void b() {
    if (!v.O || !v.S)
      return; 
    this.d = true;
    if (this.a == null && !this.c.equals(""))
      a(this.c); 
    try {
      if (v.ah)
        co.b().c(); 
      if (this.a == null) {
        a();
        return;
      } 
      this.a.setMediaTime(0L);
      if (this.b != null) {
        this.b.setMute(!v.O);
        this.b.setLevel(v.Q);
      } 
      this.a.start();
      this.e = System.currentTimeMillis();
      return;
    } catch (Throwable throwable) {
      a();
      cs.a(true);
      this.d = false;
      return;
    } 
  }
  
  public final void c() {
    if (this.a != null)
      try {
        this.d = false;
        this.a.stop();
        return;
      } catch (Throwable throwable) {
        a();
      }  
  }
  
  public final boolean d() {
    if (this.d)
      if (this.f > 3) {
        c();
      } else if (System.currentTimeMillis() - this.e > this.g) {
        this.f++;
        c();
      }  
    return this.d;
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (v.O) {
      if (paramString.equals("endOfMedia")) {
        if (v.ah)
          co.b().e(); 
        this.d = false;
        return;
      } 
      paramString.equals("started");
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */