package com.muravev.bigdataproducer.rest;

import java.time.LocalDateTime;
import java.util.UUID;

public record SensorData(
        UUID id,
        String number,
        String route,
        double voltage,
        double pw,
        double tempIn,
        double hydraulic,
        double temp,
        double speed,
        LocalDateTime time
) {
}
