package com.k2sworks.k2ssensors.temperature.processing;

import com.k2sworks.k2ssensors.temperature.processing.common.IdGenerator;
import com.k2sworks.k2ssensors.temperature.processing.common.UUIDv7Utils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.UUID;

public class UUIDv7Test {

    @Test
    void shouldGenerateUUIDv7()  {
        UUID uuid1 = IdGenerator.generateTimeBasedUUID();

        OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid1);
        OffsetDateTime currentDateTime = OffsetDateTime.now();

        Assertions.assertThat(uuidDateTime.getMinute()).isEqualTo(currentDateTime.getMinute());
    }
}
