import java.io.DataOutputStream;
import java.io.OutputStream;

final class en implements eg {
  private DataOutputStream a;
  
  private dv b;
  
  public en(OutputStream paramOutputStream) {
    this.a = new DataOutputStream(paramOutputStream);
  }
  
  public final void a() {
    if (this.a != null)
      try {
        this.a.close();
        this.a = null;
        return;
      } catch (Exception exception) {} 
  }
  
  final void a(el paramel, short paramShort) {
    if (this.a == null)
      return; 
    byte[] arrayOfByte = paramel.a();
    int i = 0;
    if (arrayOfByte != null) {
      this.a.writeByte(4);
      this.a.write(eg.C, 0, 4);
      this.a.writeInt(arrayOfByte.length);
      this.a.writeByte(paramShort);
      this.a.write(arrayOfByte, 0, arrayOfByte.length);
      i = 0 + 10 + arrayOfByte.length;
    } else {
      this.a.writeByte(4);
      this.a.write(eg.C, 0, 4);
      this.a.writeInt(0);
      this.a.writeByte(paramShort);
      i += 10;
    } 
    if (this.b != null)
      this.b.b(i); 
    this.a.flush();
  }
  
  public final void a(dv paramdv) {
    this.b = paramdv;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\en.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */