package com.itnovit.order_service.event;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreatedEvent {
    private Long orderId;
    private String product;
    private Integer quantity;
}
