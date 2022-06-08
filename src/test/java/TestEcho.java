import org.distributeme.core.ServiceLocator;
import org.example.client.EchoService;


import java.util.Date;

public class TestEcho {
    public static void main(String a[]){
        EchoService service = ServiceLocator.getRemote(EchoService.class);
        while (true) {
            long currentTime = System.nanoTime();
            String message = "Request send at " + currentTime;
            long requestTime = service.getRequestTime(message);
            System.out.println("Took: " + ((requestTime - currentTime) / 1000000) + "ms");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
