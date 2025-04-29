package com.k2sworks.k2ssensors.temperature.processing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.UUID;

public class UUIDv7Test {

    @Test
    void shouldGenerateUUIDv7()  {
        UUID uuid1 = IdGenerator.generateTimeBaseUUID();

        OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid1);
        OffsetDateTime currentDateTime = OffsetDateTime.now();

        Assertions.assertThat(uuidDateTime.getMinute()).isEqualTo(currentDateTime.getMinute());
    }
}
