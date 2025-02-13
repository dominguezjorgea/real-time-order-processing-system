package com.itnovit.order_service.controller;

import com.itnovit.order_service.entity.Order;
import com.itnovit.order_service.event.OrderCreatedEvent;
import com.itnovit.order_service.repository.OrderRepository;
import com.itnovit.order_service.service.OrderEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;
    private final OrderEventPublisher eventPublisher;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order savedOrder = orderRepository.save(order);
        eventPublisher.publishOrderCreatedEvent(
                new OrderCreatedEvent(savedOrder.getId(), savedOrder.getProduct(), savedOrder.getQuantity())
        );
        return ResponseEntity.ok(savedOrder);
    }
}
