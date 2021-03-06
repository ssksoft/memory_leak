import com.sun.jna.Library;
import com.sun.jna.Native;

interface HelloLib extends Library {
  // loadLibraryの第一引数はあとで作成するlib***.soの***と一致させる。
  HelloLib INSTANCE = (HelloLib) Native.loadLibrary("hello", HelloLib.class);

  // Cの関数名と一致させる
  void hello();
}

public class HelloJNA {
  public static void main(String[] args){
    System.out.println("Hello World!!");
    HelloLib hello = HelloLib.INSTANCE;
    hello.hello();
  }
}