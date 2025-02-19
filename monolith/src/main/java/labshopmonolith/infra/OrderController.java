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
    public Order test2222(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test2222  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test2222();
            
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
    



    @RequestMapping(value = "orders/{id}/test6",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order test6(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test6  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test6();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/test777",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order test777(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test777  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test777();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/test88",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order test88(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test88  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test88();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/test999",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order test999(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/test999  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.test999();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/testaa",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order testaa(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/testaa  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.testaa();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/testbb",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order testbb(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/testbb  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.testbb();
            
            orderRepository.save(order);
            return order;
            
    }
    



    // keep
}
