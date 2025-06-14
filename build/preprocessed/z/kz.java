import java.io.DataOutputStream;
import java.io.OutputStream;

final class kz implements kn {
  private DataOutputStream b;
  
  public kz(OutputStream paramOutputStream) {
    this.b = new DataOutputStream(paramOutputStream);
  }
  
  public final void a() {
    if (this.b != null) {
      this.b.close();
      this.b = null;
    } 
  }
  
  final void a(kx paramkx, short paramShort) {
    if (this.b == null)
      return; 
    byte[] arrayOfByte;
    if ((arrayOfByte = paramkx.a()) != null) {
      int i = 6 + arrayOfByte.length;
      this.b.writeInt(i);
      this.b.writeByte(1);
      this.b.write(kn.a, 0, 4);
      this.b.writeByte(paramShort);
      this.b.write(arrayOfByte, 0, arrayOfByte.length);
      ks.h += 6 + arrayOfByte.length;
    } else {
      this.b.writeInt(10);
      this.b.writeByte(1);
      this.b.write(kn.a, 0, 4);
      this.b.writeByte(paramShort);
      ks.h += 10;
    } 
    this.b.flush();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */