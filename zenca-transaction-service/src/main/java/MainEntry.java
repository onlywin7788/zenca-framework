import com.zenca.service.executor.ServiceEntry;
import com.zenca.service.state.StateManager;

public class MainEntry {
    public static void main(String[] args) {

        final int EXECUTOR_POLL_TIME = 3000; // ms

        try {
            // state manager
            StateManager stateManager = new StateManager();
            Thread t_stateManager = new Thread(stateManager);
            t_stateManager.start();

            ServiceEntry entry = new ServiceEntry();

            while(true) {
                entry.execute();
                Thread.sleep(EXECUTOR_POLL_TIME);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
