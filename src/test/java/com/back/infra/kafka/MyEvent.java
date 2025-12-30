package com.back.infra.kafka;

import com.back.standard.event.HaveEventName;

public record MyEvent(String msg) implements HaveEventName {
}
