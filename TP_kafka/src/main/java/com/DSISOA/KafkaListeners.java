package com.DSISOA;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
@KafkaListener(
    topics = "DSISOA",
    groupId="groupId"
)
    void listener(String data){
        System.out.println("Listener Recieved: "+data+"");
    }
}
