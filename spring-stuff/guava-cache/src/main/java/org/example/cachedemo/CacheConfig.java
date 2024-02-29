package org.example.cachedemo;

import com.google.common.cache.CacheBuilder;
import java.util.concurrent.TimeUnit;
import org.springframework.cache.Cache;
import org.springframework.cache.guava.GuavaCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    @Bean
    public Cache transformCache() {
        return new GuavaCache("transformCache", CacheBuilder.newBuilder()
                .expireAfterWrite(5, TimeUnit.SECONDS)
                .build());
    }


}
