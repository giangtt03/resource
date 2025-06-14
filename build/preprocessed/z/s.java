public final class s implements Runnable {
  private static s a;
  
  private static Object b;
  
  private boolean c = true;
  
  private r[] d;
  
  private s() {
    b = new Object();
    this.c = false;
  }
  
  public final void a(int paramInt) {
    this.d = new r[6];
    this.c = false;
    (new Thread(this)).start();
  }
  
  public final void a(r paramr) {
    if (this.d == null)
      return; 
    for (byte b = 0; b < this.d.length; b++) {
      if (this.d[b] == null) {
        this.d[b] = paramr;
        try {
          synchronized (b) {
            b.notify();
            return;
          } 
        } catch (Exception exception) {
          try {
            synchronized (b) {
              b.notify();
              return;
            } 
          } catch (Exception exception1) {
            return;
          } 
        } 
      } 
    } 
  }
  
  public final void run() {
    // Byte code:
    //   0: goto -> 76
    //   3: iconst_0
    //   4: istore_1
    //   5: iconst_0
    //   6: istore_2
    //   7: goto -> 42
    //   10: aload_0
    //   11: getfield d : [Lr;
    //   14: iload_2
    //   15: aaload
    //   16: ifnull -> 39
    //   19: aload_0
    //   20: getfield d : [Lr;
    //   23: iload_2
    //   24: aaload
    //   25: invokeinterface a : ()V
    //   30: aload_0
    //   31: getfield d : [Lr;
    //   34: iload_2
    //   35: aconst_null
    //   36: aastore
    //   37: iconst_1
    //   38: istore_1
    //   39: iinc #2, 1
    //   42: iload_2
    //   43: aload_0
    //   44: getfield d : [Lr;
    //   47: arraylength
    //   48: if_icmplt -> 10
    //   51: iload_1
    //   52: ifne -> 3
    //   55: getstatic s.b : Ljava/lang/Object;
    //   58: dup
    //   59: astore_2
    //   60: monitorenter
    //   61: getstatic s.b : Ljava/lang/Object;
    //   64: invokevirtual wait : ()V
    //   67: aload_2
    //   68: monitorexit
    //   69: goto -> 76
    //   72: aload_2
    //   73: monitorexit
    //   74: athrow
    //   75: pop
    //   76: aload_0
    //   77: getfield c : Z
    //   80: ifeq -> 3
    //   83: return
    // Exception table:
    //   from	to	target	type
    //   55	75	75	java/lang/Exception
    //   61	69	72	finally
    //   72	74	72	finally
  }
  
  public static s a() {
    if (a == null)
      a = new s(); 
    return a;
  }
  
  public final void b() {
    this.c = true;
    synchronized (b) {
      b.notify();
      return;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\s.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */