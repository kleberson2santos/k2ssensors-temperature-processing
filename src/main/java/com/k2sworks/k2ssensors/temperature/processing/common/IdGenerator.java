package com.k2sworks.k2ssensors.temperature.processing.common;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedEpochGenerator;

import java.util.UUID;

public class IdGenerator {

    private static final TimeBasedEpochGenerator timeBasedEpochGenerator =
            Generators.timeBasedEpochGenerator();

    private IdGenerator() {
    }

    public static UUID generateTimeBasedUUID() {
        return timeBasedEpochGenerator.generate();
    }
}
