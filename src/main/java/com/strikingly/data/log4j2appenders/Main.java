package com.strikingly.data.log4j2appenders;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
//        System.setProperty("log4j.configurationFile","log4j.properties");
        Random r = new Random();
        for (int i = 0; i < 10; i++)
            logger.error(JSON.toJSONString(new LogError("dime-streaming", 3, "event=cannot_count_record reason=log_test1" + r.nextInt(), System.currentTimeMillis()), new SerializeConfig(true)));
    }
}
