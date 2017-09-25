package com.example.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 朱梦光 on 2017/9/25.
 */
@Component
public class SchedulerTask {

    private int count = 0;

    @Scheduled(cron = "0/3 * * * * ?")
    private void process(){

        System.out.println("这是定时任务: "+(count++));
    }




}
