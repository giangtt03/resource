public final class cq implements Runnable {
  private static cq a;
  
  private Object b = new Object();
  
  private cp c = null;
  
  private a d = new a();
  
  public static cq a() {
    if (a == null)
      a = new cq(); 
    return a;
  }
  
  protected cq() {
    (new Thread(this)).start();
  }
  
  public final void b() {
    for (int i = this.d.d() - 1; i >= 0; i--) {
      cp cp1;
      (cp1 = (cp)this.d.b(i)).a();
    } 
    this.d.a();
    this.c = null;
  }
  
  public final void c() {
    this.d.a();
    this.c = null;
  }
  
  public final void d() {
    for (int i = this.d.d() - 1; i >= 0; i--) {
      cp cp1;
      if ((cp1 = (cp)this.d.b(i)) != null && cp1.d())
        cp1.c(); 
    } 
    this.c = null;
  }
  
  public final void e() {
    synchronized (this.b) {
      return;
    } 
  }
  
  public final void run() {
    while (true) {
      synchronized (this.b) {
        try {
          this.b.wait();
        } catch (InterruptedException interruptedException2) {
          InterruptedException interruptedException1;
          (interruptedException1 = null).printStackTrace();
        } 
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */