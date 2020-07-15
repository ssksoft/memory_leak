import com.sun.jna.Library;
import com.sun.jna.Native;

interface HelloLib extends Library {
  // loadLibrary‚Ì‘æˆêˆø”‚Í‚ ‚Æ‚Åì¬‚·‚élib***.so‚Ì***‚Æˆê’v‚³‚¹‚éB
  HelloLib INSTANCE = (HelloLib) Native.loadLibrary("hello", HelloLib.class);

  // C‚ÌŠÖ”–¼‚Æˆê’v‚³‚¹‚é
  void hello();
}

public class HelloJNA {
  public static void main(String[] args){
    System.out.println("Hello World!!");
    HelloLib hello = HelloLib.INSTANCE;
    hello.hello();
  }
}