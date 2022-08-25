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
// @RequestMapping(value="/inventories")
@Transactional
public class InventoryController {
    @Autowired
    InventoryRepository inventoryRepository;




    @RequestMapping(value = "inventories/{id}/decreaseinventory",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Inventory decreaseInventory(@PathVariable(value = "id") Long id, @RequestBody DecreaseInventoryCommand decreaseInventoryCommand, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /inventory/decreaseInventory  called #####");
            Optional<Inventory> optionalInventory = inventoryRepository.findById(id);
            
            optionalInventory.orElseThrow(()-> new Exception("No Entity Found"));
            Inventory inventory = optionalInventory.get();
            inventory.decreaseInventory(decreaseInventoryCommand);
            
            inventoryRepository.save(inventory);
            return inventory;
            
    }
    



    @RequestMapping(value = "inventories/{id}/inventorytest",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Inventory inventoryTest(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /inventory/inventoryTest  called #####");
            Optional<Inventory> optionalInventory = inventoryRepository.findById(id);
            
            optionalInventory.orElseThrow(()-> new Exception("No Entity Found"));
            Inventory inventory = optionalInventory.get();
            inventory.inventoryTest();
            
            inventoryRepository.save(inventory);
            return inventory;
            
    }
    



    @RequestMapping(value = "inventories/{id}/intest2",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Inventory intest2(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /inventory/intest2  called #####");
            Optional<Inventory> optionalInventory = inventoryRepository.findById(id);
            
            optionalInventory.orElseThrow(()-> new Exception("No Entity Found"));
            Inventory inventory = optionalInventory.get();
            inventory.intest2();
            
            inventoryRepository.save(inventory);
            return inventory;
            
    }
    



    // keep
}
