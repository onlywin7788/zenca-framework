import com.zenca.service.executor.ServiceEntry;

public class MainEntry {
    public static void main(String[] args) {
        try {
            ServiceEntry entry = new ServiceEntry();
            entry.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
