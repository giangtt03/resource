public final class mn extends mk {
  public mn(mq parammq, int paramInt) {
    super(parammq, paramInt);
  }
  
  public final void a(int paramInt) {
    switch (paramInt) {
      case 99:
        this.a.g();
        return;
      case 98:
        this.a.h();
        return;
      case 97:
        this.a.i();
        return;
      case 96:
        this.a.j();
        return;
      case 95:
        this.a.l();
        break;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    k k;
    if ((k = this.a.k()).b(paramInt1, paramInt2)) {
      paramInt1 = (paramInt1 - k.a) / 28 + 2;
      paramInt2 = (paramInt2 - k.b) / 28 + 2;
      int i = this.a.n();
      int j = this.a.o();
      if (paramInt2 == i && paramInt1 == j) {
        this.a.l();
        return;
      } 
      if (this.a.m()) {
        paramInt2 -= i;
        paramInt1 -= j;
        if (paramInt2 == 1) {
          this.a.h();
          return;
        } 
        if (paramInt2 == -1) {
          this.a.g();
          return;
        } 
        if (paramInt1 == 1) {
          this.a.j();
          return;
        } 
        if (paramInt1 == -1) {
          this.a.i();
          return;
        } 
      } else {
        this.a.g(paramInt2, paramInt1);
      } 
    } 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    k k;
    if ((k = this.a.k()).b(paramInt1, paramInt2)) {
      paramInt1 = (paramInt1 - k.a) / 28 + 2;
      paramInt2 = (paramInt2 - k.b) / 28 + 2;
      int i = this.a.n();
      int j = this.a.o();
      if (paramInt2 != i || paramInt1 != j) {
        boolean bool;
        if (!(bool = this.a.m()))
          this.a.l(); 
        paramInt2 -= i;
        paramInt1 -= j;
        if (Math.abs(paramInt2) > Math.abs(paramInt1)) {
          if (paramInt2 > 0) {
            this.a.h();
            return;
          } 
          if (paramInt2 < 0) {
            this.a.g();
            return;
          } 
        } else {
          if (paramInt1 > 0) {
            this.a.j();
            return;
          } 
          if (paramInt1 < 0) {
            this.a.i();
            return;
          } 
          if (!bool)
            this.a.l(); 
        } 
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */