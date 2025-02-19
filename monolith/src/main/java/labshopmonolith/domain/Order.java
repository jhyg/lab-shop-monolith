package labshopmonolith.domain;

import labshopmonolith.domain.OrderPlaced;
import labshopmonolith.MonolithApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private Double amount;

    @PostPersist

    public static OrderRepository repository() {
        OrderRepository orderRepository = MonolithApplication.applicationContext.getBean(
            OrderRepository.class
        );
    }
    
    public void onPostPersist(){
        // test !!! 
        // !@# !@#!@#
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        labshopmonolith.external.Inventory inventory = new labshopmonolith.external.Inventory();
        // mappings goes here
        //test ! ! ! @ !@ @!@@! 
        MonolithApplication.applicationContext.getBean(labshopmonolith.external.InventoryService.class)
            .decreaseInventory(inventory);


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){
        // test ! ! !! !
        // Get request from Inventory
        //labshopmonolith.external.Inventory inventory =
        //    Application.applicationContext.getBean(labshopmonolith.external.InventoryService.class)
        //    .getInventory(/** mapping value needed */);

    }


    public void test2222(){
    }
    public void test2(){
    }
    public void test3(){
    }
    public void test4(){
    }
    public void test5(){
    }
    public void test6(){
    }
    public void test777(){
    }
    public void test88(){
    }
    public void test999(){
    }
    public void testaa(){
    }
    public void testbb(){
    }



}
