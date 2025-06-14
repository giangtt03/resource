import java.util.Random;

public final class cv {
  private static Random a = new Random(System.currentTimeMillis());
  
  public static final int a(int paramInt) {
    return a.nextInt(paramInt);
  }
  
  public static final int a() {
    return a.nextInt();
  }
  
  public static final int a(int paramInt1, int paramInt2) {
    return a.nextInt(paramInt2 - paramInt1 + 1) + paramInt1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */