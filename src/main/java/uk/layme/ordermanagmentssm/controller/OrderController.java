package uk.layme.ordermanagmentssm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.layme.ordermanagmentssm.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("new")
    public String newOrder() {
        orderService.newOrder();
        return "New order";
    }

    @PostMapping("pay")
    public String payOrder() {
        orderService.payOrder();
        return "Pay order";
    }

    @PostMapping("ship")
    public String shipOrder() {
        orderService.shipOrder();
        return "Ship order";
    }

    @PostMapping("complete")
    public String completeOrder() {
        orderService.completeOrder();
        return "Complete order";
    }
}
