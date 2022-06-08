package org.example.client;

import java.util.Date;

public class EchoServiceImpl implements EchoService{
    @Override
    public long getRequestTime(String message) {
        System.out.println(message);
        return System.nanoTime();
    }
}
