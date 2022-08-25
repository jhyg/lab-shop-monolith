package labshopmonolith.infra;
import labshopmonolith.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/orders")
@Transactional
public class OrderController {
    @Autowired
    OrderRepository orderRepository;




    @RequestMapping(value = "orders/{id}/test",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order test(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/test2",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order test2(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test2  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test2();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/test3",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order test3(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test3  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test3();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/test4",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order test4(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test4  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test4();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/test5",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order test5(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test5  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test5();
            
            orderRepository.save(order);
            return order;
            
    }
    



    // keep
}
