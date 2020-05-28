package com.wei.spring.async.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class SyncConfiguration {

    @Bean(name = "scorePoolTaskExecutor")
    public ThreadPoolTaskExecutor getScorePoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        //设置核心线程数
        threadPoolTaskExecutor.setCorePoolSize(10);
        //线程池最大线程数量，只有缓存队列满了之后才会申请核心线程
        threadPoolTaskExecutor.setMaxPoolSize(100);
        //缓存队列数量
        threadPoolTaskExecutor.setQueueCapacity(50);
        //最大空闲时间
        threadPoolTaskExecutor.setKeepAliveSeconds(200);
        //线程名称
        threadPoolTaskExecutor.setThreadNamePrefix("score-");

        //当核心线程到达最大且缓存已满，则会采取拒绝策略
       // ThreadPoolExecutor.AbortPolicy：丢弃任务并抛出异常
       // ThreadPoolExecutor.CallerRunsPolicy：丢弃任务但不抛出异常
       // ThreadPoolExecutor.DiscardOldestPolicy：丢弃队列最前面的任务，然后重新尝试执行任务（重复此过程）
       // ThreadPoolExecutor.DiscardPolicy：重复添加当前任务自动重复调用execute()方法，直到成功
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;

    }
}
