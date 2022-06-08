package org.example.client;

import net.anotheria.anoprise.metafactory.Service;
import org.distributeme.annotation.DistributeMe;
import org.distributeme.annotation.FailBy;
import org.distributeme.core.failing.RetryCallOnce;


@DistributeMe
@FailBy(strategyClass = RetryCallOnce.class)
public interface EchoService extends Service {
    long getRequestTime(String message);
}
