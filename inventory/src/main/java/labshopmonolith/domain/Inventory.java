package labshopmonolith.domain;

import labshopmonolith.InventoryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Inventory_table")
@Data

public class Inventory  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long stock;

    @PostPersist
    public void onPostPersist(){
    }

    public static InventoryRepository repository(){
        // test !!
        //test22
        InventoryRepository inventoryRepository = InventoryApplication.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }



    public void decreaseInventory(DecreaseInventoryCommand decreaseInventoryCommand){
    }
    public void inventoryTest(){
    }
    public void intest2(){
    }



}
