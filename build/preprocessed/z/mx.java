import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mx extends at {
  private int d;
  
  private int[] e = new int[] { 81208, 85576, 23637 };
  
  private int[] f = new int[] { 5046585, 6095173, 7209297 };
  
  private int g;
  
  private int h;
  
  private int i;
  
  private Image j;
  
  private int k = 0;
  
  private boolean s;
  
  private int t;
  
  private nc[] u;
  
  private nc[] v;
  
  private int w;
  
  private int x;
  
  private int[] y;
  
  private int[] z;
  
  private byte A;
  
  private int[][] B;
  
  private Image[] C;
  
  private Image D;
  
  private Image E;
  
  private Image F;
  
  private lg[][] G;
  
  private nk[] H;
  
  private nk[] I;
  
  nk[] a;
  
  private String[] J;
  
  private k K;
  
  private ir[] L;
  
  ms b;
  
  private int[] M;
  
  private int[] N = new int[2];
  
  private int[] O = new int[2];
  
  private mi[] P;
  
  private mi[] Q;
  
  private mi[] R;
  
  private mi S;
  
  public np c;
  
  private int T;
  
  private boolean U;
  
  private int V;
  
  public mx(ms paramms, k paramk, byte paramByte, int paramInt1, int paramInt2) {
    this.b = paramms;
    this.G = paramms.a();
    this.K = paramk;
    this.y = new int[2];
    mx mx1 = this;
    try {
      mx1.a = new nk[2];
      mx1.J = new String[2];
      mx1.H = new nk[(mx1.G[0]).length];
      mx1.I = new nk[(mx1.G[1]).length];
      byte b1;
      for (b1 = 0; b1 < mx1.H.length; b1++)
        mx1.H[b1] = b(mx1.G[0][b1].a(), 0); 
      for (b1 = 0; b1 < mx1.I.length; b1++) {
        try {
          mx1.I[b1] = (mx1.G[1][b1].b() && (mx1.G[1][b1].a()).Y > 0) ? mx1.a(mx1.G[1][b1].a(), 1) : b(mx1.G[1][b1].a(), 1);
        } catch (Exception exception2) {
          Exception exception1;
          (exception1 = null).printStackTrace();
          System.err.println(mx1.G[1][b1]);
        } 
      } 
      mx1.a[0] = mx1.H[0];
      mx1.a[1] = mx1.I[0];
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    this.j = (mp.a()).f;
    this.A = paramByte;
    c(paramInt1, paramInt2);
    if (paramByte == 0) {
      c(false);
      this.B = new int[][] { 
          { 10, 233, this.C[0].getWidth(), this.C[0].getHeight() }, { 10, 240, this.D.getWidth(), this.D.getHeight() }, { 10, 247, this.E.getWidth(), this.E.getHeight() }, { 154, 233, this.C[0].getWidth(), this.C[0].getHeight() }, { 154, 240, this.D.getWidth(), this.D.getHeight() }, { 154, 247, this.E.getWidth(), this.E.getHeight() }, { 50, 316, this.H[0].p(), this.H[0].q() }, { 20, 316, this.H[0].p(), this.H[0].q() }, { 0, 316, this.H[0].p(), this.H[0].q() }, { 200, 316, this.I[0].p(), this.I[0].q() }, 
          { 230, 316, this.I[0].p(), this.I[0].q() }, { 240, 316, this.I[0].p(), this.I[0].q() } };
      if ((this.G[0]).length == 3) {
        this.B[6][1] = this.B[6][1] + 5;
        this.B[7][1] = this.B[7][1] - 5;
        this.B[8][1] = this.B[8][1] + 5;
      } else if ((this.G[0]).length == 2) {
        this.B[7][1] = this.B[7][1] + 5;
        this.B[8][1] = this.B[8][1] - 5;
      } 
      if ((this.G[1]).length == 3) {
        this.B[9][1] = this.B[9][1] + 5;
        this.B[10][1] = this.B[10][1] - 5;
        this.B[11][1] = this.B[11][1] + 5;
      } else if ((this.G[1]).length == 2) {
        this.B[10][1] = this.B[10][1] + 5;
        this.B[11][1] = this.B[11][1] - 5;
      } 
    } else {
      c(true);
      this.B = new int[][] { 
          { 38, 6, this.C[0].getWidth(), this.C[0].getHeight() }, { 31, 6, this.D.getWidth(), this.D.getHeight() }, { 24, 6, this.E.getWidth(), this.E.getHeight() }, { 277, 6, this.C[0].getWidth(), this.C[0].getHeight() }, { 284, 6, this.D.getWidth(), this.D.getHeight() }, { 291, 6, this.E.getWidth(), this.E.getHeight() }, { 75 - this.H[0].p() / 2, 236, this.H[0].p(), this.H[0].q() }, { 35 - this.H[0].p() / 2, 236, this.H[0].p(), this.H[0].q() }, { 15 - this.H[0].p() / 2, 236, this.H[0].p(), this.H[0].q() }, { 280, 236, this.I[0].p(), this.I[0].q() }, 
          { 310, 236, this.I[0].p(), this.I[0].q() }, { 330, 236, this.I[0].p(), this.I[0].q() } };
      if ((this.G[0]).length == 2) {
        this.B[7][1] = this.B[7][1] + 4;
        this.B[7][0] = this.B[7][0] + 10;
        this.B[8][1] = this.B[8][1] - 4;
      } else if ((this.G[0]).length == 3) {
        this.B[6][1] = this.B[6][1] + 4;
        this.B[7][1] = this.B[7][1] - 4;
        this.B[8][1] = this.B[8][1] + 4;
      } else {
        this.B[8][0] = this.B[8][0] + 5;
      } 
      if ((this.G[1]).length == 2) {
        this.B[10][1] = this.B[10][1] + 4;
        this.B[11][1] = this.B[11][1] - 4;
      } else if ((this.G[1]).length == 3) {
        this.B[9][1] = this.B[9][1] + 4;
        this.B[10][1] = this.B[10][1] - 4;
        this.B[11][1] = this.B[11][1] + 4;
      } 
    } 
    int j;
    for (j = 0; j < 2; j++)
      this.O[j] = ((this.G[j]).length == 1) ? 2 : (((this.G[j]).length == 2) ? 1 : 0); 
    for (j = 0; j < this.B.length; j++) {
      this.B[j][0] = this.B[j][0] + paramInt1;
      this.B[j][1] = this.B[j][1] + paramInt2;
    } 
    if (this.G[1][0].b() && paramByte == 0) {
      this.B[9][0] = this.B[9][0] + 4;
      if ((j = (j = (this.G[1][0].a()).Y) / 10 % 1000) == 18) {
        this.B[9][0] = this.B[9][0] + 35;
        this.B[10][0] = this.B[10][0] + 35;
        this.B[11][0] = this.B[11][0] + 35;
      } else if (j == 21 || j == 22) {
        this.B[9][0] = this.B[9][0] + 15;
        this.B[10][0] = this.B[10][0] + 15;
        this.B[11][0] = this.B[11][0] + 15;
        this.B[9][1] = this.B[9][1] + 5;
        this.B[10][1] = this.B[10][1] + 5;
        this.B[11][1] = this.B[11][1] + 5;
      } else if (j >= 63 && j <= 78) {
        this.B[9][1] = this.B[9][1] + 5;
        this.B[10][1] = this.B[10][1] + 5;
        this.B[11][1] = this.B[11][1] + 5;
      } else if (j == 25) {
        this.B[9][1] = this.B[9][1] + 1;
        this.B[10][1] = this.B[10][1] + 1;
        this.B[11][1] = this.B[11][1] + 1;
      } else if (j == 26) {
        this.B[9][1] = this.B[9][1] + 3;
        this.B[10][1] = this.B[10][1] + 3;
        this.B[11][1] = this.B[11][1] + 3;
      } else if (j == 27) {
        this.B[9][1] = this.B[9][1] + 5;
        this.B[10][1] = this.B[10][1] + 5;
        this.B[11][1] = this.B[11][1] + 5;
      } 
    } 
    String[] arrayOfString = new String[(this.G[0]).length];
    for (paramInt1 = 0; paramInt1 < arrayOfString.length; paramInt1++)
      arrayOfString[paramInt1] = this.G[0][paramInt1].j(); 
    a(arrayOfString, 0);
    arrayOfString = new String[(this.G[1]).length];
    for (paramInt1 = 0; paramInt1 < arrayOfString.length; paramInt1++)
      arrayOfString[paramInt1] = this.G[1][paramInt1].j(); 
    a(arrayOfString, 1);
    byte[][] arrayOfByte = { { 
          0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 
          5, 5, 5 } };
    this.u = new nc[25];
    int i = (mp.a()).b.getWidth() / 6;
    paramInt2 = (mp.a()).b.getHeight() / 9;
    int m = 1 * paramInt2;
    byte b;
    for (b = 0; b < this.u.length; b++) {
      this.u[b] = new nc((mp.a()).b, i, paramInt2, m);
      this.u[b].a(arrayOfByte);
      this.u[b].b(false);
    } 
    m = 2 * paramInt2;
    this.v = new nc[10];
    for (b = 0; b < this.v.length; b++) {
      this.v[b] = new nc((mp.a()).b, i, paramInt2, m);
      this.v[b].a(arrayOfByte);
      this.v[b].b(false);
    } 
    this.z = new int[2];
    this.y = new int[2];
    this.M = new int[2];
    this.L = new ir[2];
    if (paramByte == 0) {
      i = this.C[0].getWidth();
    } else {
      i = this.C[0].getHeight();
    } 
    this.P = new mi[2];
    for (b = 0; b < this.P.length; b++) {
      this.P[b] = new mi(i, this.G[b][0].l());
      this.P[b].a(0, this.G[b][0].m(), this.G[b][0].l(), this.G[b][0].d());
    } 
    if (paramByte == 0) {
      i = this.D.getWidth();
    } else {
      i = this.D.getHeight();
    } 
    this.Q = new mi[2];
    for (b = 0; b < this.Q.length; b++) {
      this.Q[b] = new mi(i, this.G[b][0].o());
      this.Q[b].a(0, this.G[b][0].n(), this.G[b][0].o(), 0);
    } 
    if (paramByte == 0) {
      i = this.E.getWidth();
    } else {
      i = this.E.getHeight();
    } 
    this.R = new mi[2];
    for (b = 0; b < this.R.length; b++) {
      this.R[b] = new mi(i, this.G[b][0].r());
      this.R[b].a(0, this.G[b][0].q(), this.G[b][0].r(), 0);
    } 
    if (oq.o == 1) {
      this.S = new mi(i, paramms.g);
      i = 1;
      mi mi1;
      (mi1 = this.S).b = i;
      this.c = new np();
      this.c.a();
    } 
  }
  
  private void a(String[] paramArrayOfString, int paramInt) {
    if (paramInt == 0) {
      for (byte b = 0; b < paramArrayOfString.length; b++) {
        for (byte b1 = 0; b1 < (this.G[paramInt]).length; b1++) {
          if (paramArrayOfString[b].equals(this.G[paramInt][b1].j())) {
            this.H[b1].c(this.B[6 + this.O[paramInt] + b][0], this.B[6 + this.O[paramInt] + b][1]);
            if (b == 0) {
              this.a[paramInt] = this.H[b1];
              this.J[paramInt] = paramArrayOfString[b];
              this.N[paramInt] = b1;
            } 
          } 
        } 
      } 
    } else {
      for (byte b = 0; b < paramArrayOfString.length; b++) {
        for (byte b1 = 0; b1 < (this.G[paramInt]).length; b1++) {
          if (paramArrayOfString[b].equals(this.G[paramInt][b1].j())) {
            this.I[b1].c(this.B[9 + this.O[paramInt] + b][0] - this.I[b1].p(), this.B[9 + this.O[paramInt] + b][1]);
            if (b == 0) {
              this.a[paramInt] = this.I[b1];
              this.J[paramInt] = paramArrayOfString[b];
              this.N[paramInt] = b1;
            } 
          } 
        } 
      } 
    } 
    this.a[0].a(this.a[1]);
    this.a[1].a(this.a[0]);
  }
  
  private static Image m(int paramInt) {
    return pa.a().a(paramInt, false);
  }
  
  private nk a(lh paramlh, int paramInt) {
    ng ng2;
    nn nn2;
    ng ng1;
    nn nn1;
    int i;
    Image image2 = m((i = paramlh.Y) + 5);
    Image image3 = m(i + 1);
    Image image4 = m(i + 4);
    Image image5 = m(i + 3);
    Image image6 = image5;
    Image image7 = m(i + 6);
    if ((i = i / 10 % 1000) == 0 || i == 19 || i == 20 || i == 21)
      return new ng(1, new Image[] { image2, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 
              2, 1, 1, 1, 1, 1, 1, 1 }, , { 0, 0, 0, 0, 1, 1, 1, 1 }, , new byte[1], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 3, 2, 1, 1, 1 }); 
    if (i == 2 || i == 3 || i == 7) {
      (ng2 = new ng(1, new Image[] { image2, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 
              2, 1, 1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1, 2, 2, 3, 3 }, , new byte[1], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 3, 4, 1, 1, 1 })).d = 20;
      ng2.e = -5;
      return ng2;
    } 
    if (i >= 63 && i <= 78) {
      (ng2 = new ng(1, new Image[] { (Image)ng2, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 
              2, 1, 1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1, 2, 2, 3, 3 }, , new byte[1], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 3, 4, 1, 1, 1 })).d = 20;
      ng2.e = -8;
      return ng2;
    } 
    if (i == 1 || i == 14 || i == 16)
      return new ng(1, new Image[] { (Image)ng2, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1 }, , new byte[1], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 1, 1, 1 }); 
    if (i == 4 || i == 12)
      return new ng(1, new Image[] { (Image)ng2, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 0, 0, 1, 1, 1, 1 }, , new byte[1], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 1, 1, 1 }); 
    if (i == 5 || i == 11) {
      (ng2 = new ng(1, new Image[] { (Image)ng2, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 0, 0, 1, 1, 1, 1 }, , new byte[1], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 1, 1, 1 })).d = 20;
      ng2.e = 0;
      return ng2;
    } 
    if (i == 6) {
      (ng2 = new ng(1, new Image[] { (Image)ng2, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 0, 0, 1, 1, 2, 2 }, , new byte[1], new byte[10], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 3, 1, 1, 1 })).d = 30;
      return ng2;
    } 
    if (i == 17 || i == 61) {
      (nn2 = new nn(1, new Image[] { (Image)ng2, image3, (Image)ng2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[1], { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 1, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 0, 0, 1, 1 }, , { 2, 2, 3, 3, 3 }, , { -1 },  }, 4)).b = -27;
      nn2.a = 42;
      return nn2;
    } 
    if (i == 8) {
      (nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
              0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
              1, 1, 1 }, , new byte[4], { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 1, 2, 1, 2 }, image7, new byte[][] { { 0, 1, 1, 2, 2 }, , new byte[3], { -1 },  }, 4)).b = 0;
      nn2.a = 60;
      return nn2;
    } 
    if (i == 10) {
      (nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 1, 1 }, , { 2, 2, 3, 3, 3 }, , { -1 },  }, 4)).b = 35;
      nn2.a = 20;
      return nn2;
    } 
    if (i == 13) {
      (nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 2, 1, 1 }, image7, new byte[][] { { -1 }, , { 0, 0, 1, 1, 2, 2, 3, 3 }, , { -1 },  }, 4)).b = -25;
      nn2.a = 0;
      return nn2;
    } 
    if (i == 9 || i == 15) {
      (nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[1], { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 1, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 1, 1 }, , { 2, 2, 2 }, , { -1 },  }, 3)).b = 0;
      nn2.a = 80;
      return nn2;
    } 
    if (i == 18) {
      (nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1, 1 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 1, 1 }, , { 2, 2, 2 }, , { -1 },  }, 3)).b = -15;
      nn2.a = 10;
      return nn2;
    } 
    if (i == 22 || i == 51) {
      nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 1, 2, 2 }, , { 3, 3, 3 }, , { -1 },  }, 4);
      if (i == 22) {
        nn2.b = -25;
      } else {
        nn2.b = -15;
      } 
      nn2.a = 50;
      return nn2;
    } 
    if (i == 43) {
      (nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1, 1, 1, 1 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 1, 1, 1 }, , { 2, 2, 3, 3, 3 }, , { -1 },  }, 4)).b = 0;
      nn2.a = 50;
      return nn2;
    } 
    if (i == 47) {
      (nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1, 2, 2, 2 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 3, 2, 1, 1 }, image7, new byte[][] { new byte[2], { 1, 1, 1, 1 }, , { -1 },  }, 2)).b = -5;
      nn2.a = 50;
      return nn2;
    } 
    if (i == 30 || i == 31 || i == 32) {
      (nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { -1 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 1, 2, 2 }, , { 3, 3, 3, 3, 3 }, , { -1 },  }, 4)).b = 10;
      nn2.a = 20;
      return nn2;
    } 
    if (i == 24 || i == 33 || i == 34) {
      (nn2 = new nn(1, new Image[] { (Image)nn2, image3, (Image)nn2, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1, 1, 1, 1 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 1, 2, 2 }, , { 3, 3, 3 }, , { -1 },  }, 4)).b = 0;
      nn2.a = 50;
      return nn2;
    } 
    if (i == 100)
      return new nf(1, new Image[] { (Image)nn2, image3, image3, image6, image6, image3 }, new byte[][] { { 
              0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 
              2, 2, 2, 2, 2, 1, 1, 1, 1, 1 }, , { 3, 3, 4, 4 }, , { 0, 0, 0, 1, 1, 2, 2 }, , new byte[8], { 0, 1, 1, 1, 1, 1, -1 }, , { 5, 5, 5, 6, 7, 8 },  }, new int[] { 3, 3, 2, 2, 2, 4 }); 
    if (i == 44 || i == 45 || i == 46 || i == 56 || i == 57 || i == 58 || i == 60 || i == 62) {
      ng1 = new ng(1, new Image[] { (Image)nn2, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 0, 0, 1, 1, 1, 1 }, , new byte[1], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 1, 1, 1 });
      if (this.A == 0) {
        ng1.f = 4;
      } else {
        ng1.f = 8;
      } 
      return ng1;
    } 
    if (i == 23 || i == 25 || i == 26 || i == 27 || i == 28 || i == 29 || i == 35 || i == 36 || i == 37 || i == 38 || i == 39 || i == 40 || i == 41 || i == 42 || i == 48 || i == 49 || i == 50 || i == 52 || i == 53 || i == 54 || i == 55)
      return new ng(1, new Image[] { (Image)ng1, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 0, 0, 1, 1, 1, 1 }, , new byte[1], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 2, 1, 1, 1 }); 
    if (i == 101)
      return ng1 = new ng(1, new Image[] { (Image)ng1, image3, image4, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 
              0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 
              2, 2 }, , new byte[4], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 3, 1, 1, 1 }); 
    if (i == 102)
      return nn1 = new nn(1, new Image[] { (Image)ng1, image3, (Image)ng1, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , { 0, 0, 1, 1, 1, 2, 2 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 3, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 1, 2, 2 }, , { 3, 3, 3 }, , { -1 },  }, 4); 
    if (i == 103)
      return nn1 = new nn(1, new Image[] { (Image)nn1, image3, (Image)nn1, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[7], { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 1, 1 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 2, 1, 2, 1, 1 }, image7, new byte[][] { { 0, 0, 1, 1, 1 }, , { 2, 2, 3, 3 }, , { -1 },  }, 4); 
    if (i == 104)
      return nn1 = new nn(1, new Image[] { (Image)nn1, image3, (Image)nn1, image5, image6 }, new byte[][] { { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 
              2 }, , { 0, 0, 0, 0, 1, 1, 1, 1 }, , { 
              0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
              1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 
              2 }, , new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 3, 2, 3, 1, 1 }, image7, new byte[][] { new byte[5], { 1, 1, 2, 2 }, , { -1 },  }, 3); 
    Image image1 = m(100005);
    image3 = m(100001);
    image4 = m(100004);
    image5 = m(100003);
    image6 = m(100002);
    m(100006);
    return new ng(1, new Image[] { image1, image3, image4, image5, image6 }, new byte[][] { { 
            0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 
            1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 
            2, 1, 1, 1, 1, 1, 1, 1 }, , { 0, 0, 0, 0, 1, 1, 1, 1 }, , new byte[1], new byte[8], { 0, -1, -1, -1, -1, -1, -1 },  }, new int[] { 3, 2, 1, 1, 1 });
  }
  
  private static nk b(lh paramlh, int paramInt) {
    try {
      mb[] arrayOfMb = mb.a(paramlh);
      lc lc = lc.a(paramlh);
      nr nr = nr.a(paramlh);
      mg mg1;
      (mg1 = mb.a(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true)).a(lc);
      mg1.a(nr);
      mg mg2;
      (mg2 = mb.b(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true)).a(lc);
      mg2.a(nr);
      mg mg3;
      (mg3 = mb.c(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true)).a(lc);
      mg3.a(nr);
      mg mg4;
      (mg4 = mb.e(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true)).a(lc);
      mg4.a(nr);
      mg mg5;
      (mg5 = mb.d(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true)).a(lc);
      mg5.a(nr);
      mg mg6;
      (mg6 = mb.f(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true)).a(lc);
      mg6.a(nr);
      mc mc;
      (mc = mb.a(paramlh, (mp.a()).h, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true)).a(lc);
      mc.a(nr);
      return new ni(paramInt, mg1, mg3, mg2, mg4, mg5, mg6, mc, nr);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return null;
    } 
  }
  
  private void c(boolean paramBoolean) {
    mx mx1 = this;
    Image image1 = f.d("/play/hpbar");
    byte[] arrayOfByte;
    h.a(arrayOfByte = f.b("/play/hpbar"), 100);
    Image image2 = f.a(arrayOfByte);
    h.a(arrayOfByte, 150);
    Image image3 = f.a(arrayOfByte);
    h.a(arrayOfByte, -110);
    Image image4 = f.a(arrayOfByte);
    h.a(arrayOfByte, -30);
    Image image5 = f.a(arrayOfByte);
    mx1.C = new Image[] { image1, image2, image3, image4, image5 };
    this.D = f.d("/play/manabar");
    this.E = f.d("/play/powerbar");
    if (paramBoolean) {
      for (byte b = 0; b < this.C.length; b++)
        this.C[b] = Image.createImage(this.C[b], 0, 0, this.C[b].getWidth(), this.C[b].getHeight(), 7); 
      this.D = Image.createImage(this.D, 0, 0, this.D.getWidth(), this.D.getHeight(), 7);
      this.E = Image.createImage(this.E, 0, 0, this.E.getWidth(), this.E.getHeight(), 7);
    } 
    if (oq.o == 1) {
      byte[] arrayOfByte1;
      h.a(arrayOfByte1 = f.b("/play/hpbar"), 160);
      this.F = f.a(arrayOfByte1);
      if (paramBoolean)
        this.F = Image.createImage(this.F, 0, 0, this.F.getWidth(), this.F.getHeight(), 7); 
    } 
  }
  
  public final int[] a() {
    return this.B[0];
  }
  
  public final int[] b() {
    return this.B[3];
  }
  
  public final int[] c() {
    return this.B[1];
  }
  
  public final int[] d() {
    return this.B[4];
  }
  
  public final int[] e() {
    return this.B[2];
  }
  
  public final int[] f() {
    return this.B[5];
  }
  
  public final int[] g() {
    return new int[] { this.a[1].n(), this.a[1].o(), this.a[1].p(), this.a[1].q() };
  }
  
  public final int[] h() {
    return new int[] { this.a[0].n(), this.a[0].o(), this.a[0].p(), this.a[0].q() };
  }
  
  public final nk[] a(int paramInt) {
    return (paramInt == 0) ? this.H : this.I;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield s : Z
    //   4: ifne -> 201
    //   7: aload_0
    //   8: getfield e : [I
    //   11: astore #4
    //   13: aload_0
    //   14: getfield k : I
    //   17: iconst_1
    //   18: if_icmpne -> 27
    //   21: aload_0
    //   22: getfield f : [I
    //   25: astore #4
    //   27: iconst_0
    //   28: istore #5
    //   30: aload_0
    //   31: getfield d : I
    //   34: bipush #10
    //   36: if_icmpge -> 51
    //   39: aload_0
    //   40: getfield d : I
    //   43: iconst_2
    //   44: irem
    //   45: ifne -> 76
    //   48: goto -> 73
    //   51: aload_0
    //   52: getfield d : I
    //   55: bipush #18
    //   57: if_icmpge -> 73
    //   60: aload_0
    //   61: getfield d : I
    //   64: iconst_3
    //   65: isub
    //   66: iconst_3
    //   67: iand
    //   68: istore #5
    //   70: goto -> 76
    //   73: iconst_3
    //   74: istore #5
    //   76: aload_0
    //   77: getfield K : Lk;
    //   80: getfield a : I
    //   83: iconst_1
    //   84: isub
    //   85: istore #6
    //   87: aload_0
    //   88: getfield K : Lk;
    //   91: getfield b : I
    //   94: iconst_1
    //   95: isub
    //   96: istore #7
    //   98: aload_0
    //   99: getfield K : Lk;
    //   102: getfield c : I
    //   105: iconst_1
    //   106: iadd
    //   107: istore #8
    //   109: aload_0
    //   110: getfield K : Lk;
    //   113: getfield d : I
    //   116: iconst_1
    //   117: iadd
    //   118: istore #9
    //   120: iload #5
    //   122: iconst_1
    //   123: isub
    //   124: istore #5
    //   126: iconst_0
    //   127: istore #10
    //   129: goto -> 168
    //   132: aload_1
    //   133: aload #4
    //   135: iload #10
    //   137: iaload
    //   138: invokevirtual setColor : (I)V
    //   141: aload_1
    //   142: iload #6
    //   144: iload #7
    //   146: iload #8
    //   148: iload #9
    //   150: invokevirtual drawRect : (IIII)V
    //   153: iinc #6, -1
    //   156: iinc #7, -1
    //   159: iinc #8, 2
    //   162: iinc #9, 2
    //   165: iinc #10, 1
    //   168: iload #10
    //   170: iload #5
    //   172: if_icmplt -> 132
    //   175: iload #5
    //   177: iflt -> 201
    //   180: aload_1
    //   181: aload #4
    //   183: iload #5
    //   185: iaload
    //   186: iload #6
    //   188: iload #7
    //   190: iload #8
    //   192: iconst_1
    //   193: iadd
    //   194: iload #9
    //   196: iconst_1
    //   197: iadd
    //   198: invokestatic b : (Ljavax/microedition/lcdui/Graphics;IIIII)V
    //   201: iconst_0
    //   202: istore #4
    //   204: iconst_0
    //   205: istore #5
    //   207: goto -> 563
    //   210: aload_0
    //   211: getfield P : [Lmi;
    //   214: iload #5
    //   216: aaload
    //   217: dup
    //   218: astore #11
    //   220: getfield b : I
    //   223: iconst_1
    //   224: if_icmpgt -> 238
    //   227: aload_0
    //   228: getfield M : [I
    //   231: iload #5
    //   233: iaload
    //   234: iconst_2
    //   235: if_icmpge -> 465
    //   238: aload_0
    //   239: getfield P : [Lmi;
    //   242: iload #5
    //   244: aaload
    //   245: aload_1
    //   246: aload_0
    //   247: getfield C : [Ljavax/microedition/lcdui/Image;
    //   250: aload_0
    //   251: getfield B : [[I
    //   254: iload #4
    //   256: iconst_0
    //   257: iadd
    //   258: aaload
    //   259: iconst_0
    //   260: iaload
    //   261: aload_0
    //   262: getfield B : [[I
    //   265: iload #4
    //   267: iconst_0
    //   268: iadd
    //   269: aaload
    //   270: iconst_1
    //   271: iaload
    //   272: aload_0
    //   273: getfield A : B
    //   276: istore #11
    //   278: istore #10
    //   280: istore #9
    //   282: astore #8
    //   284: astore #7
    //   286: dup
    //   287: astore #6
    //   289: getfield c : I
    //   292: dup
    //   293: istore #12
    //   295: iconst_1
    //   296: isub
    //   297: istore #13
    //   299: iload #11
    //   301: ifne -> 383
    //   304: aload #6
    //   306: dup
    //   307: astore #11
    //   309: getfield b : I
    //   312: istore #11
    //   314: aload #8
    //   316: iconst_0
    //   317: aaload
    //   318: invokevirtual getHeight : ()I
    //   321: istore #14
    //   323: aload #7
    //   325: aload #8
    //   327: iload #12
    //   329: aaload
    //   330: iconst_0
    //   331: iconst_0
    //   332: iload #11
    //   334: iload #14
    //   336: iload #9
    //   338: iload #10
    //   340: iconst_0
    //   341: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Image;IIIIIII)V
    //   344: iload #13
    //   346: iflt -> 465
    //   349: aload #7
    //   351: aload #8
    //   353: iload #13
    //   355: aaload
    //   356: iload #11
    //   358: iconst_0
    //   359: aload #6
    //   361: getfield a : I
    //   364: iload #11
    //   366: isub
    //   367: iload #14
    //   369: iload #9
    //   371: iload #11
    //   373: iadd
    //   374: iload #10
    //   376: iconst_0
    //   377: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Image;IIIIIII)V
    //   380: goto -> 465
    //   383: aload #6
    //   385: dup
    //   386: astore #11
    //   388: getfield b : I
    //   391: istore #14
    //   393: aload #8
    //   395: iconst_0
    //   396: aaload
    //   397: invokevirtual getWidth : ()I
    //   400: istore #11
    //   402: aload #8
    //   404: iconst_0
    //   405: aaload
    //   406: invokevirtual getHeight : ()I
    //   409: iload #14
    //   411: isub
    //   412: istore #6
    //   414: aload #7
    //   416: aload #8
    //   418: iload #12
    //   420: aaload
    //   421: iconst_0
    //   422: iload #6
    //   424: iload #11
    //   426: iload #14
    //   428: iload #9
    //   430: iload #10
    //   432: iload #6
    //   434: iadd
    //   435: iconst_0
    //   436: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Image;IIIIIII)V
    //   439: iload #13
    //   441: iflt -> 465
    //   444: aload #7
    //   446: aload #8
    //   448: iload #13
    //   450: aaload
    //   451: iconst_0
    //   452: iconst_0
    //   453: iload #11
    //   455: iload #6
    //   457: iload #9
    //   459: iload #10
    //   461: iconst_0
    //   462: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Image;IIIIIII)V
    //   465: aload_0
    //   466: getfield Q : [Lmi;
    //   469: iload #5
    //   471: aaload
    //   472: aload_1
    //   473: aload_0
    //   474: getfield D : Ljavax/microedition/lcdui/Image;
    //   477: aload_0
    //   478: getfield B : [[I
    //   481: iload #4
    //   483: iconst_1
    //   484: iadd
    //   485: aaload
    //   486: iconst_0
    //   487: iaload
    //   488: aload_0
    //   489: getfield B : [[I
    //   492: iload #4
    //   494: iconst_1
    //   495: iadd
    //   496: aaload
    //   497: iconst_1
    //   498: iaload
    //   499: aload_0
    //   500: getfield A : B
    //   503: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Image;III)V
    //   506: aload_0
    //   507: getfield y : [I
    //   510: iload #5
    //   512: iaload
    //   513: ifgt -> 557
    //   516: aload_0
    //   517: getfield R : [Lmi;
    //   520: iload #5
    //   522: aaload
    //   523: aload_1
    //   524: aload_0
    //   525: getfield E : Ljavax/microedition/lcdui/Image;
    //   528: aload_0
    //   529: getfield B : [[I
    //   532: iload #4
    //   534: iconst_2
    //   535: iadd
    //   536: aaload
    //   537: iconst_0
    //   538: iaload
    //   539: aload_0
    //   540: getfield B : [[I
    //   543: iload #4
    //   545: iconst_2
    //   546: iadd
    //   547: aaload
    //   548: iconst_1
    //   549: iaload
    //   550: aload_0
    //   551: getfield A : B
    //   554: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Image;III)V
    //   557: iinc #4, 3
    //   560: iinc #5, 1
    //   563: iload #5
    //   565: aload_0
    //   566: getfield G : [[Llg;
    //   569: arraylength
    //   570: if_icmplt -> 210
    //   573: getstatic oq.o : B
    //   576: iconst_1
    //   577: if_icmpne -> 626
    //   580: aload_0
    //   581: getfield S : Lmi;
    //   584: ifnull -> 626
    //   587: aload_0
    //   588: getfield T : I
    //   591: ifgt -> 626
    //   594: aload_0
    //   595: getfield S : Lmi;
    //   598: aload_1
    //   599: aload_0
    //   600: getfield F : Ljavax/microedition/lcdui/Image;
    //   603: aload_0
    //   604: getfield B : [[I
    //   607: iconst_5
    //   608: aaload
    //   609: iconst_0
    //   610: iaload
    //   611: aload_0
    //   612: getfield B : [[I
    //   615: iconst_5
    //   616: aaload
    //   617: iconst_1
    //   618: iaload
    //   619: aload_0
    //   620: getfield A : B
    //   623: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Image;III)V
    //   626: aload_0
    //   627: getfield a : [Lnk;
    //   630: iconst_1
    //   631: aaload
    //   632: invokevirtual c : ()I
    //   635: istore #5
    //   637: aload_0
    //   638: getfield L : [Lir;
    //   641: iconst_0
    //   642: aaload
    //   643: ifnull -> 699
    //   646: aload_0
    //   647: getfield L : [Lir;
    //   650: iconst_0
    //   651: aaload
    //   652: aload_1
    //   653: aload_0
    //   654: getfield a : [Lnk;
    //   657: iconst_0
    //   658: aaload
    //   659: invokevirtual n : ()I
    //   662: aload_0
    //   663: getfield a : [Lnk;
    //   666: iconst_0
    //   667: aaload
    //   668: invokevirtual p : ()I
    //   671: iconst_2
    //   672: idiv
    //   673: iadd
    //   674: aload_0
    //   675: getfield a : [Lnk;
    //   678: iconst_0
    //   679: aaload
    //   680: invokevirtual o : ()I
    //   683: aload_0
    //   684: getfield a : [Lnk;
    //   687: iconst_0
    //   688: aaload
    //   689: invokevirtual q : ()I
    //   692: iadd
    //   693: bipush #15
    //   695: isub
    //   696: invokevirtual b : (Ljavax/microedition/lcdui/Graphics;II)V
    //   699: aload_0
    //   700: getfield L : [Lir;
    //   703: iconst_1
    //   704: aaload
    //   705: ifnull -> 761
    //   708: aload_0
    //   709: getfield L : [Lir;
    //   712: iconst_1
    //   713: aaload
    //   714: aload_1
    //   715: aload_0
    //   716: getfield a : [Lnk;
    //   719: iconst_1
    //   720: aaload
    //   721: invokevirtual n : ()I
    //   724: aload_0
    //   725: getfield a : [Lnk;
    //   728: iconst_1
    //   729: aaload
    //   730: invokevirtual p : ()I
    //   733: iconst_2
    //   734: idiv
    //   735: iadd
    //   736: aload_0
    //   737: getfield a : [Lnk;
    //   740: iconst_1
    //   741: aaload
    //   742: invokevirtual o : ()I
    //   745: aload_0
    //   746: getfield a : [Lnk;
    //   749: iconst_1
    //   750: aaload
    //   751: invokevirtual q : ()I
    //   754: iadd
    //   755: bipush #15
    //   757: isub
    //   758: invokevirtual b : (Ljavax/microedition/lcdui/Graphics;II)V
    //   761: iload #5
    //   763: iconst_2
    //   764: if_icmpeq -> 779
    //   767: iload #5
    //   769: iconst_5
    //   770: if_icmpeq -> 779
    //   773: iload #5
    //   775: iconst_1
    //   776: if_icmpne -> 898
    //   779: iconst_0
    //   780: istore #7
    //   782: goto -> 817
    //   785: aload_0
    //   786: getfield a : [Lnk;
    //   789: iconst_0
    //   790: aaload
    //   791: aload_0
    //   792: getfield H : [Lnk;
    //   795: iload #7
    //   797: aaload
    //   798: if_acmpeq -> 814
    //   801: aload_0
    //   802: getfield H : [Lnk;
    //   805: iload #7
    //   807: aaload
    //   808: aload_1
    //   809: iload_2
    //   810: iload_3
    //   811: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;II)V
    //   814: iinc #7, 1
    //   817: iload #7
    //   819: aload_0
    //   820: getfield H : [Lnk;
    //   823: arraylength
    //   824: if_icmplt -> 785
    //   827: aload_0
    //   828: getfield a : [Lnk;
    //   831: iconst_0
    //   832: aaload
    //   833: aload_1
    //   834: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   837: iconst_0
    //   838: istore #7
    //   840: goto -> 875
    //   843: aload_0
    //   844: getfield a : [Lnk;
    //   847: iconst_1
    //   848: aaload
    //   849: aload_0
    //   850: getfield I : [Lnk;
    //   853: iload #7
    //   855: aaload
    //   856: if_acmpeq -> 872
    //   859: aload_0
    //   860: getfield I : [Lnk;
    //   863: iload #7
    //   865: aaload
    //   866: aload_1
    //   867: iload_2
    //   868: iload_3
    //   869: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;II)V
    //   872: iinc #7, 1
    //   875: iload #7
    //   877: aload_0
    //   878: getfield I : [Lnk;
    //   881: arraylength
    //   882: if_icmplt -> 843
    //   885: aload_0
    //   886: getfield a : [Lnk;
    //   889: iconst_1
    //   890: aaload
    //   891: aload_1
    //   892: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   895: goto -> 1014
    //   898: iconst_0
    //   899: istore #7
    //   901: goto -> 936
    //   904: aload_0
    //   905: getfield a : [Lnk;
    //   908: iconst_1
    //   909: aaload
    //   910: aload_0
    //   911: getfield I : [Lnk;
    //   914: iload #7
    //   916: aaload
    //   917: if_acmpeq -> 933
    //   920: aload_0
    //   921: getfield I : [Lnk;
    //   924: iload #7
    //   926: aaload
    //   927: aload_1
    //   928: iload_2
    //   929: iload_3
    //   930: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;II)V
    //   933: iinc #7, 1
    //   936: iload #7
    //   938: aload_0
    //   939: getfield I : [Lnk;
    //   942: arraylength
    //   943: if_icmplt -> 904
    //   946: aload_0
    //   947: getfield a : [Lnk;
    //   950: iconst_1
    //   951: aaload
    //   952: aload_1
    //   953: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   956: iconst_0
    //   957: istore #7
    //   959: goto -> 994
    //   962: aload_0
    //   963: getfield a : [Lnk;
    //   966: iconst_0
    //   967: aaload
    //   968: aload_0
    //   969: getfield H : [Lnk;
    //   972: iload #7
    //   974: aaload
    //   975: if_acmpeq -> 991
    //   978: aload_0
    //   979: getfield H : [Lnk;
    //   982: iload #7
    //   984: aaload
    //   985: aload_1
    //   986: iload_2
    //   987: iload_3
    //   988: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;II)V
    //   991: iinc #7, 1
    //   994: iload #7
    //   996: aload_0
    //   997: getfield H : [Lnk;
    //   1000: arraylength
    //   1001: if_icmplt -> 962
    //   1004: aload_0
    //   1005: getfield a : [Lnk;
    //   1008: iconst_0
    //   1009: aaload
    //   1010: aload_1
    //   1011: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   1014: aload_0
    //   1015: getfield L : [Lir;
    //   1018: iconst_0
    //   1019: aaload
    //   1020: ifnull -> 1076
    //   1023: aload_0
    //   1024: getfield L : [Lir;
    //   1027: iconst_0
    //   1028: aaload
    //   1029: aload_1
    //   1030: aload_0
    //   1031: getfield H : [Lnk;
    //   1034: iconst_0
    //   1035: aaload
    //   1036: invokevirtual n : ()I
    //   1039: aload_0
    //   1040: getfield H : [Lnk;
    //   1043: iconst_0
    //   1044: aaload
    //   1045: invokevirtual p : ()I
    //   1048: iconst_2
    //   1049: idiv
    //   1050: iadd
    //   1051: aload_0
    //   1052: getfield H : [Lnk;
    //   1055: iconst_0
    //   1056: aaload
    //   1057: invokevirtual o : ()I
    //   1060: aload_0
    //   1061: getfield H : [Lnk;
    //   1064: iconst_0
    //   1065: aaload
    //   1066: invokevirtual q : ()I
    //   1069: iadd
    //   1070: bipush #15
    //   1072: isub
    //   1073: invokevirtual c : (Ljavax/microedition/lcdui/Graphics;II)V
    //   1076: aload_0
    //   1077: getfield L : [Lir;
    //   1080: iconst_1
    //   1081: aaload
    //   1082: ifnull -> 1138
    //   1085: aload_0
    //   1086: getfield L : [Lir;
    //   1089: iconst_1
    //   1090: aaload
    //   1091: aload_1
    //   1092: aload_0
    //   1093: getfield H : [Lnk;
    //   1096: iconst_1
    //   1097: aaload
    //   1098: invokevirtual n : ()I
    //   1101: aload_0
    //   1102: getfield H : [Lnk;
    //   1105: iconst_1
    //   1106: aaload
    //   1107: invokevirtual p : ()I
    //   1110: iconst_2
    //   1111: idiv
    //   1112: iadd
    //   1113: aload_0
    //   1114: getfield H : [Lnk;
    //   1117: iconst_1
    //   1118: aaload
    //   1119: invokevirtual o : ()I
    //   1122: aload_0
    //   1123: getfield H : [Lnk;
    //   1126: iconst_1
    //   1127: aaload
    //   1128: invokevirtual q : ()I
    //   1131: iadd
    //   1132: bipush #15
    //   1134: isub
    //   1135: invokevirtual c : (Ljavax/microedition/lcdui/Graphics;II)V
    //   1138: aload_0
    //   1139: getfield h : I
    //   1142: ifle -> 1286
    //   1145: aload_0
    //   1146: getfield h : I
    //   1149: bipush #10
    //   1151: if_icmpgt -> 1286
    //   1154: aload_0
    //   1155: getfield g : I
    //   1158: ifne -> 1171
    //   1161: aload_0
    //   1162: getfield B : [[I
    //   1165: bipush #6
    //   1167: aaload
    //   1168: goto -> 1178
    //   1171: aload_0
    //   1172: getfield B : [[I
    //   1175: bipush #9
    //   1177: aaload
    //   1178: astore #7
    //   1180: aload_0
    //   1181: getfield h : I
    //   1184: bipush #6
    //   1186: if_icmpgt -> 1286
    //   1189: aload_0
    //   1190: getfield b : Lms;
    //   1193: getfield a : Z
    //   1196: ifne -> 1286
    //   1199: aload_0
    //   1200: getfield j : Ljavax/microedition/lcdui/Image;
    //   1203: invokevirtual getWidth : ()I
    //   1206: iconst_5
    //   1207: idiv
    //   1208: istore #8
    //   1210: aload_0
    //   1211: getfield j : Ljavax/microedition/lcdui/Image;
    //   1214: invokevirtual getHeight : ()I
    //   1217: istore #9
    //   1219: bipush #6
    //   1221: aload_0
    //   1222: getfield h : I
    //   1225: isub
    //   1226: iconst_5
    //   1227: irem
    //   1228: istore #5
    //   1230: iconst_2
    //   1231: istore #10
    //   1233: aload_0
    //   1234: getfield g : I
    //   1237: ifne -> 1243
    //   1240: iconst_0
    //   1241: istore #10
    //   1243: aload_1
    //   1244: aload_0
    //   1245: getfield j : Ljavax/microedition/lcdui/Image;
    //   1248: iload #5
    //   1250: iload #8
    //   1252: imul
    //   1253: iconst_0
    //   1254: iload #8
    //   1256: iload #9
    //   1258: iload #10
    //   1260: aload #7
    //   1262: iconst_0
    //   1263: iaload
    //   1264: aload #7
    //   1266: iconst_2
    //   1267: iaload
    //   1268: iconst_2
    //   1269: idiv
    //   1270: iadd
    //   1271: aload #7
    //   1273: iconst_1
    //   1274: iaload
    //   1275: aload #7
    //   1277: iconst_3
    //   1278: iaload
    //   1279: iconst_2
    //   1280: idiv
    //   1281: iadd
    //   1282: iconst_3
    //   1283: invokevirtual drawRegion : (Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   1286: aload_0
    //   1287: getfield v : [Lnc;
    //   1290: arraylength
    //   1291: iconst_1
    //   1292: isub
    //   1293: istore #7
    //   1295: goto -> 1312
    //   1298: aload_0
    //   1299: getfield v : [Lnc;
    //   1302: iload #7
    //   1304: aaload
    //   1305: aload_1
    //   1306: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   1309: iinc #7, -1
    //   1312: iload #7
    //   1314: ifge -> 1298
    //   1317: aload_0
    //   1318: getfield u : [Lnc;
    //   1321: arraylength
    //   1322: iconst_1
    //   1323: isub
    //   1324: istore #7
    //   1326: goto -> 1343
    //   1329: aload_0
    //   1330: getfield u : [Lnc;
    //   1333: iload #7
    //   1335: aaload
    //   1336: aload_1
    //   1337: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   1340: iinc #7, -1
    //   1343: iload #7
    //   1345: ifge -> 1329
    //   1348: return
  }
  
  public final void b(int paramInt) {
    this.a[0].a(0);
  }
  
  public final void i() {
    int i;
    for (i = 0; i < this.H.length; i++)
      this.H[i].i(); 
    for (i = 0; i < this.I.length; i++)
      this.I[i].i(); 
    if (this.L[0] != null)
      this.L[0].i(); 
    if (this.L[1] != null)
      this.L[1].i(); 
    if (!this.s) {
      this.t++;
      if (this.t == 10)
        this.t = 0; 
      if (this.d < 20)
        this.d++; 
    } 
    if (this.h > 0) {
      this.h--;
      if (this.h == 9) {
        if (!this.U && this.a[this.g].c() != 3)
          this.a[this.g].a(this.b.a, this.b.f); 
        if (!this.b.a && this.g == 0)
          ag.a().b(250); 
      } else if (this.h == 15) {
        if (this.b.c) {
          boolean bool = false;
          ms ms1;
          (ms1 = this.b).c = bool;
          ag.a().a(20);
        } 
      } else if (this.h == 0) {
        if (this.i > 0) {
          this.U = true;
        } else {
          this.U = false;
        } 
        this.h = this.i;
        this.i = 0;
      } 
    } 
    for (i = 0; i < this.G.length; i++) {
      if (this.y[i] > 0) {
        this.y[i] = this.y[i] - 1;
      } else if (this.G[i][0].p()) {
        this.y[i] = 1;
      } 
      this.M[i] = this.M[i] + 1;
      if (this.M[i] > 2)
        this.M[i] = 0; 
      if (this.g == i && this.w > 0) {
        this.w--;
      } else {
        this.P[i].a();
        this.Q[i].a();
        this.R[i].a();
      } 
    } 
    for (i = 0; i < this.z.length; i++) {
      lg lg1 = this.G[i][this.N[i]];
      if (0 <= this.G[i][this.N[i]].k()) {
        this.z[i] = this.z[i] + 1;
        if (this.z[i] > 1)
          this.z[i] = 0; 
      } 
    } 
    for (i = this.u.length - 1; i >= 0; i--)
      this.u[i].i(); 
    for (i = this.v.length - 1; i >= 0; i--)
      this.v[i].i(); 
    if (this.x > 0)
      this.x--; 
    if (this.S != null) {
      if (a.k == 0) {
        i = this.E.getWidth();
      } else {
        i = this.E.getHeight();
      } 
      int j;
      if ((j = (int)(this.c.g() * i / this.b.g)) <= 0) {
        j = 1;
      } else if (j > i) {
        j = i;
      } 
      int m = j;
      mi mi1;
      (mi1 = this.S).b = m;
      if (this.V > 0) {
        this.V--;
        if (this.V == 0) {
          this.T = 0;
          return;
        } 
        if (this.T > 0) {
          this.T--;
          return;
        } 
        this.T = 1;
        return;
      } 
      if (this.T > 0) {
        this.T--;
        return;
      } 
      if (j == i)
        this.T = 1; 
    } 
  }
  
  public final void c(int paramInt) {
    if (this.w == 0) {
      this.w = paramInt;
      return;
    } 
    if (this.w < paramInt)
      this.w = this.w + paramInt >> 1; 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield G : [[Llg;
    //   4: iload_1
    //   5: aaload
    //   6: aload_0
    //   7: getfield N : [I
    //   10: iconst_0
    //   11: iaload
    //   12: aaload
    //   13: astore_2
    //   14: iload_1
    //   15: ifne -> 22
    //   18: iconst_1
    //   19: goto -> 23
    //   22: iconst_4
    //   23: istore_1
    //   24: aload_0
    //   25: getfield A : B
    //   28: ifne -> 154
    //   31: aload_0
    //   32: getfield B : [[I
    //   35: iload_1
    //   36: aaload
    //   37: iconst_0
    //   38: iaload
    //   39: aload_0
    //   40: getfield C : [Ljavax/microedition/lcdui/Image;
    //   43: iconst_0
    //   44: aaload
    //   45: invokevirtual getWidth : ()I
    //   48: aload_2
    //   49: invokevirtual n : ()I
    //   52: imul
    //   53: aload_2
    //   54: invokevirtual o : ()I
    //   57: idiv
    //   58: iadd
    //   59: istore_3
    //   60: aload_0
    //   61: getfield B : [[I
    //   64: iload_1
    //   65: aaload
    //   66: iconst_1
    //   67: iaload
    //   68: aload_0
    //   69: getfield B : [[I
    //   72: iload_1
    //   73: aaload
    //   74: iconst_3
    //   75: iaload
    //   76: iconst_2
    //   77: idiv
    //   78: iadd
    //   79: istore_1
    //   80: iconst_0
    //   81: istore_2
    //   82: goto -> 144
    //   85: aload_0
    //   86: getfield v : [Lnc;
    //   89: iload_2
    //   90: aaload
    //   91: invokevirtual m : ()Z
    //   94: ifne -> 141
    //   97: aload_0
    //   98: getfield v : [Lnc;
    //   101: iload_2
    //   102: aaload
    //   103: iload_3
    //   104: iload_1
    //   105: iload_3
    //   106: iconst_5
    //   107: isub
    //   108: bipush #80
    //   110: invokestatic a : (I)I
    //   113: iadd
    //   114: iload_1
    //   115: invokestatic a : ()I
    //   118: bipush #100
    //   120: irem
    //   121: iadd
    //   122: bipush #10
    //   124: invokevirtual a : (IIIII)V
    //   127: aload_0
    //   128: getfield v : [Lnc;
    //   131: iload_2
    //   132: aaload
    //   133: bipush #10
    //   135: invokestatic a : (I)I
    //   138: invokevirtual a : (I)V
    //   141: iinc #2, 1
    //   144: iload_2
    //   145: aload_0
    //   146: getfield v : [Lnc;
    //   149: arraylength
    //   150: if_icmplt -> 85
    //   153: return
    //   154: aload_0
    //   155: getfield B : [[I
    //   158: iload_1
    //   159: aaload
    //   160: iconst_0
    //   161: iaload
    //   162: aload_0
    //   163: getfield B : [[I
    //   166: iload_1
    //   167: aaload
    //   168: iconst_2
    //   169: iaload
    //   170: iconst_2
    //   171: idiv
    //   172: iadd
    //   173: istore_3
    //   174: aload_0
    //   175: getfield B : [[I
    //   178: iload_1
    //   179: aaload
    //   180: iconst_1
    //   181: iaload
    //   182: aload_2
    //   183: invokevirtual o : ()I
    //   186: aload_2
    //   187: invokevirtual n : ()I
    //   190: isub
    //   191: aload_0
    //   192: getfield D : Ljavax/microedition/lcdui/Image;
    //   195: invokevirtual getHeight : ()I
    //   198: imul
    //   199: aload_2
    //   200: invokevirtual o : ()I
    //   203: idiv
    //   204: iadd
    //   205: istore_1
    //   206: iconst_0
    //   207: istore_2
    //   208: goto -> 270
    //   211: aload_0
    //   212: getfield v : [Lnc;
    //   215: iload_2
    //   216: aaload
    //   217: invokevirtual m : ()Z
    //   220: ifne -> 267
    //   223: aload_0
    //   224: getfield v : [Lnc;
    //   227: iload_2
    //   228: aaload
    //   229: iload_3
    //   230: iload_1
    //   231: iload_3
    //   232: invokestatic a : ()I
    //   235: bipush #100
    //   237: irem
    //   238: iadd
    //   239: iload_1
    //   240: iconst_5
    //   241: iadd
    //   242: bipush #80
    //   244: invokestatic a : (I)I
    //   247: isub
    //   248: bipush #10
    //   250: invokevirtual a : (IIIII)V
    //   253: aload_0
    //   254: getfield v : [Lnc;
    //   257: iload_2
    //   258: aaload
    //   259: bipush #10
    //   261: invokestatic a : (I)I
    //   264: invokevirtual a : (I)V
    //   267: iinc #2, 1
    //   270: iload_2
    //   271: aload_0
    //   272: getfield v : [Lnc;
    //   275: arraylength
    //   276: if_icmplt -> 211
    //   279: return
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_3
    //   2: putfield U : Z
    //   5: aload_0
    //   6: aload_0
    //   7: getfield w : I
    //   10: invokevirtual c : (I)V
    //   13: aload_0
    //   14: getfield G : [[Llg;
    //   17: iload_1
    //   18: aaload
    //   19: aload_0
    //   20: getfield N : [I
    //   23: iload_1
    //   24: iaload
    //   25: aaload
    //   26: astore #4
    //   28: aload_0
    //   29: getfield h : I
    //   32: ifgt -> 40
    //   35: aload_0
    //   36: iload_2
    //   37: putfield h : I
    //   40: aload_0
    //   41: getfield h : I
    //   44: iload_2
    //   45: if_icmpge -> 75
    //   48: aload_0
    //   49: iload_2
    //   50: aload_0
    //   51: getfield h : I
    //   54: isub
    //   55: putfield i : I
    //   58: aload_0
    //   59: getfield i : I
    //   62: bipush #6
    //   64: if_icmpge -> 90
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield i : I
    //   72: goto -> 90
    //   75: aload_0
    //   76: aload_0
    //   77: getfield h : I
    //   80: iload_2
    //   81: isub
    //   82: putfield i : I
    //   85: aload_0
    //   86: iload_2
    //   87: putfield h : I
    //   90: iinc #2, -5
    //   93: iload_2
    //   94: ifge -> 99
    //   97: iconst_0
    //   98: istore_2
    //   99: aload_0
    //   100: iload_1
    //   101: putfield g : I
    //   104: iload_1
    //   105: ifne -> 112
    //   108: iconst_0
    //   109: goto -> 113
    //   112: iconst_3
    //   113: istore #6
    //   115: bipush #15
    //   117: istore #7
    //   119: aload_0
    //   120: getfield A : B
    //   123: ifne -> 274
    //   126: aload_0
    //   127: getfield B : [[I
    //   130: iload #6
    //   132: aaload
    //   133: iconst_0
    //   134: iaload
    //   135: aload_0
    //   136: getfield C : [Ljavax/microedition/lcdui/Image;
    //   139: iconst_0
    //   140: aaload
    //   141: invokevirtual getWidth : ()I
    //   144: aload #4
    //   146: invokevirtual m : ()I
    //   149: imul
    //   150: aload #4
    //   152: invokevirtual l : ()I
    //   155: idiv
    //   156: iadd
    //   157: istore #5
    //   159: aload_0
    //   160: getfield B : [[I
    //   163: iload #6
    //   165: aaload
    //   166: iconst_1
    //   167: iaload
    //   168: aload_0
    //   169: getfield B : [[I
    //   172: iload #6
    //   174: aaload
    //   175: iconst_3
    //   176: iaload
    //   177: iconst_2
    //   178: idiv
    //   179: iadd
    //   180: istore #4
    //   182: iconst_0
    //   183: istore #6
    //   185: goto -> 261
    //   188: aload_0
    //   189: getfield u : [Lnc;
    //   192: iload #6
    //   194: aaload
    //   195: invokevirtual m : ()Z
    //   198: ifne -> 258
    //   201: aload_0
    //   202: getfield u : [Lnc;
    //   205: iload #6
    //   207: aaload
    //   208: iload #5
    //   210: iload #4
    //   212: iload #5
    //   214: iconst_5
    //   215: isub
    //   216: bipush #80
    //   218: invokestatic a : (I)I
    //   221: iadd
    //   222: iload #4
    //   224: invokestatic a : ()I
    //   227: bipush #100
    //   229: irem
    //   230: iadd
    //   231: iload_2
    //   232: invokevirtual a : (IIIII)V
    //   235: aload_0
    //   236: getfield u : [Lnc;
    //   239: iload #6
    //   241: aaload
    //   242: bipush #10
    //   244: invokestatic a : (I)I
    //   247: invokevirtual a : (I)V
    //   250: iinc #7, -1
    //   253: iload #7
    //   255: ifle -> 425
    //   258: iinc #6, 1
    //   261: iload #6
    //   263: aload_0
    //   264: getfield u : [Lnc;
    //   267: arraylength
    //   268: if_icmplt -> 188
    //   271: goto -> 425
    //   274: aload_0
    //   275: getfield B : [[I
    //   278: iload #6
    //   280: aaload
    //   281: iconst_0
    //   282: iaload
    //   283: aload_0
    //   284: getfield B : [[I
    //   287: iload #6
    //   289: aaload
    //   290: iconst_2
    //   291: iaload
    //   292: iconst_2
    //   293: idiv
    //   294: iadd
    //   295: istore #5
    //   297: aload_0
    //   298: getfield B : [[I
    //   301: iload #6
    //   303: aaload
    //   304: iconst_1
    //   305: iaload
    //   306: aload #4
    //   308: invokevirtual l : ()I
    //   311: aload #4
    //   313: invokevirtual m : ()I
    //   316: isub
    //   317: aload_0
    //   318: getfield C : [Ljavax/microedition/lcdui/Image;
    //   321: iconst_0
    //   322: aaload
    //   323: invokevirtual getHeight : ()I
    //   326: imul
    //   327: aload #4
    //   329: invokevirtual l : ()I
    //   332: idiv
    //   333: iadd
    //   334: istore #4
    //   336: iconst_0
    //   337: istore #6
    //   339: goto -> 415
    //   342: aload_0
    //   343: getfield u : [Lnc;
    //   346: iload #6
    //   348: aaload
    //   349: invokevirtual m : ()Z
    //   352: ifne -> 412
    //   355: aload_0
    //   356: getfield u : [Lnc;
    //   359: iload #6
    //   361: aaload
    //   362: iload #5
    //   364: iload #4
    //   366: iload #5
    //   368: invokestatic a : ()I
    //   371: bipush #100
    //   373: irem
    //   374: iadd
    //   375: iload #4
    //   377: iconst_5
    //   378: iadd
    //   379: bipush #80
    //   381: invokestatic a : (I)I
    //   384: isub
    //   385: iload_2
    //   386: invokevirtual a : (IIIII)V
    //   389: aload_0
    //   390: getfield u : [Lnc;
    //   393: iload #6
    //   395: aaload
    //   396: bipush #10
    //   398: invokestatic a : (I)I
    //   401: invokevirtual a : (I)V
    //   404: iinc #7, -1
    //   407: iload #7
    //   409: ifle -> 425
    //   412: iinc #6, 1
    //   415: iload #6
    //   417: aload_0
    //   418: getfield u : [Lnc;
    //   421: arraylength
    //   422: if_icmplt -> 342
    //   425: iload_3
    //   426: ifeq -> 547
    //   429: iload_1
    //   430: iconst_1
    //   431: if_icmpne -> 482
    //   434: aload_0
    //   435: getfield a : [Lnk;
    //   438: iconst_0
    //   439: aaload
    //   440: iload_2
    //   441: aload_0
    //   442: getfield b : Lms;
    //   445: getfield a : Z
    //   448: aload_0
    //   449: getfield b : Lms;
    //   452: getfield c : Z
    //   455: aload_0
    //   456: getfield b : Lms;
    //   459: getfield d : Z
    //   462: aload_0
    //   463: getfield b : Lms;
    //   466: getfield e : Z
    //   469: aload_0
    //   470: getfield b : Lms;
    //   473: getfield f : Z
    //   476: invokevirtual a : (IZZZZZ)V
    //   479: goto -> 527
    //   482: aload_0
    //   483: getfield a : [Lnk;
    //   486: iconst_1
    //   487: aaload
    //   488: iload_2
    //   489: aload_0
    //   490: getfield b : Lms;
    //   493: getfield a : Z
    //   496: aload_0
    //   497: getfield b : Lms;
    //   500: getfield c : Z
    //   503: aload_0
    //   504: getfield b : Lms;
    //   507: getfield d : Z
    //   510: aload_0
    //   511: getfield b : Lms;
    //   514: getfield e : Z
    //   517: aload_0
    //   518: getfield b : Lms;
    //   521: getfield f : Z
    //   524: invokevirtual a : (IZZZZZ)V
    //   527: aload_0
    //   528: getfield b : Lms;
    //   531: iconst_0
    //   532: istore_2
    //   533: dup
    //   534: astore_1
    //   535: iload_2
    //   536: putfield c : Z
    //   539: aload_0
    //   540: getfield b : Lms;
    //   543: iconst_0
    //   544: putfield d : Z
    //   547: return
  }
  
  public final void d(int paramInt) {
    if (this.k != paramInt)
      this.d = 0; 
    this.k = paramInt;
  }
  
  public final void a(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  public final void l(int paramInt) {
    if (paramInt == 0) {
      for (paramInt = 0; paramInt < this.H.length; paramInt++)
        this.H[paramInt].d(); 
      return;
    } 
    for (paramInt = 0; paramInt < this.I.length; paramInt++)
      this.I[paramInt].d(); 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4) {
    try {
      int i = 0;
      for (byte b = 0; b < this.J.length; b++) {
        if (this.J[b].equals(paramString)) {
          i = 1;
          break;
        } 
      } 
      if (!i)
        return; 
      lg lg1 = null;
      i = 0;
      int j;
      for (j = 0; j < this.G.length; j++) {
        for (byte b1 = 0; b1 < (this.G[j]).length; b1++) {
          if (this.G[j][b1].j().equals(paramString)) {
            lg1 = this.G[j][b1];
            i = j;
            break;
          } 
        } 
      } 
      if (lg1 == null)
        return; 
      if (paramInt1 >= 0) {
        j = lg1.m();
        int m = lg1.l();
        this.P[i].a(j, paramInt1, m, paramInt4);
      } 
      if (paramInt2 >= 0) {
        j = lg1.n();
        int m = lg1.o();
        this.Q[i].a(j, paramInt2, m, paramInt4);
      } 
      if (paramInt3 >= 0) {
        j = lg1.q();
        int m = lg1.r();
        this.R[i].a(j, paramInt3, m, paramInt4);
      } 
      paramInt2 = paramInt4;
      mi mi1;
      (mi1 = this.P[i]).c = paramInt2;
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void j() {
    this.V = 15;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */