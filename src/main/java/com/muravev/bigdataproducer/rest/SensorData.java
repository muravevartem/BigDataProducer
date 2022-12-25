package com.muravev.bigdataproducer.rest;

import java.util.UUID;

public record SensorData(
        String number,
        String route,
        double voltage,
        double pw,
        double tempIn,
        double hydraulic,
        double temp,
        double speed

) {
}
