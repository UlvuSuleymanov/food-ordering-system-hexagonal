package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.valueobject.BaseId;

import java.util.UUID;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
