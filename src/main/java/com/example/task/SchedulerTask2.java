package com.example.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 朱梦光 on 2017/9/25.
 */
@Component
public class SchedulerTask2 {



    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime(){
        System.out.println("现在时间: "+sdf.format(new Date()));
    }


}
