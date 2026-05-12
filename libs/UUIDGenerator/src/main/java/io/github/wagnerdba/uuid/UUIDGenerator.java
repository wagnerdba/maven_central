package io.github.wagnerdba.uuid;

import com.github.f4b6a3.uuid.UuidCreator;

import java.util.UUID;

public class UUIDGenerator {

    private UUIDGenerator() {
    }

    public static String generateV4() {
        return UUID.randomUUID().toString();
    }

    public static String generateV7() {
        return UuidCreator.getTimeOrderedEpoch().toString();
    }

}
