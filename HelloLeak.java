import com.sun.jna.Library;
import com.sun.jna.Native;

interface LeakMemory extends Library{
    LeakMemory INSTANCE = (LeakMemory) Native.loadLibrary("leak_memory", LeakMemory.class);

    int leak_memory();
}

public class HelloLeak{
    public static void main(String[] args){
        LeakMemory leak_memory = LeakMemory.INSTANCE;
        leak_memory.leak_memory();
    }
}