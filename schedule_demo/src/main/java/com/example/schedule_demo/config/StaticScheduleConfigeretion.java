package com.example.schedule_demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class StaticScheduleConfigeretion {

    //    或直接指定时间间隔，例如：5秒
    @Scheduled(cron = "0/5 * * * * ?")
//    或
//    @Scheduled(fixedRate = 5000)
    private void scheduleTast1() {
        System.out.println("每隔5秒钟输出一次！");
    }


}
