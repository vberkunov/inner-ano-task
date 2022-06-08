package org.example.client;

import net.anotheria.anoprise.metafactory.Service;
import org.distributeme.annotation.DistributeMe;

@DistributeMe
public interface HelloWorldService extends Service {
    void printMessage(String message);
}
