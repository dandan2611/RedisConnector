package fr.codinbox.redisconnector.connector.redis;

import fr.codinbox.redisconnector.connector.exception.ConnectionInitException;
import org.jetbrains.annotations.NotNull;
import org.redisson.api.RedissonClient;

public interface RedisConnection {

    @NotNull RedissonClient getClient();

    void init() throws ConnectionInitException;

    void shutdown();

    boolean isExitOnFailure();

}
