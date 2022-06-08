import org.distributeme.core.ServiceLocator;
import org.example.client.HelloWorldService;

import java.util.Date;

public class Test {
    public static void main(String a[]){
        HelloWorldService service =  ServiceLocator.getRemote(HelloWorldService.class);
        String message = "Hello world at "+new Date(System.currentTimeMillis());
        System.out.println("Server should print out following message now: "+message);
        service.printMessage(message);
    }
}
