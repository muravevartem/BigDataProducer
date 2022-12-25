package com.muravev.bigdataproducer.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class Producer {
    private final KafkaTemplate<String, SensorData> kafkaTemplate;

    @Scheduled(fixedDelay = 100)
    public void produce() {

        SensorData data = new SensorData(
                UUID.randomUUID(),
                String.valueOf(RandomUtils.nextInt(1, 1000)),
                String.valueOf(RandomUtils.nextInt(1, 100)),
                RandomUtils.nextDouble(12., 14.),
                RandomUtils.nextDouble(100., 1000.),
                RandomUtils.nextDouble(0., 8.),
                RandomUtils.nextDouble(2., 8.),
                RandomUtils.nextDouble(85., 102.),
                RandomUtils.nextDouble(0., 40.),
                LocalDateTime.now()
        );

        log.info("Sending data of {}", data.number());

        kafkaTemplate.send(
                "transport-base-sensor",
                data.number(),
                data
        );
    }
}
