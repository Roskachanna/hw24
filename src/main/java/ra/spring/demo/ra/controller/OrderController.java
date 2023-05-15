package ra.spring.demo.ra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ra.spring.demo.ra.service.OrderService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order ")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public Set <Integer> add(@RequestParam List<Integer> ids) {
        return orderService.add(ids);
    }
    @GetMapping("/get")
    public Set<Integer> get() {
        return orderService.get();
    }
}
