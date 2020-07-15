import com.sun.jna.Library;
import com.sun.jna.Native;

interface HelloLib extends Library {
  // loadLibrary�̑������͂��Ƃō쐬����lib***.so��***�ƈ�v������B
  HelloLib INSTANCE = (HelloLib) Native.loadLibrary("hello", HelloLib.class);

  // C�̊֐����ƈ�v������
  void hello();
}

public class HelloJNA {
  public static void main(String[] args){
    System.out.println("Hello World!!");
    HelloLib hello = HelloLib.INSTANCE;
    hello.hello();
  }
}