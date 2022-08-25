package labshopmonolith.infra;
import labshopmonolith.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderHateoasProcessor implements RepresentationModelProcessor<EntityModel<Order>>  {

    @Override
    public EntityModel<Order> process(EntityModel<Order> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test").withRel("test"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test2").withRel("test2"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test3").withRel("test3"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test4").withRel("test4"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test5").withRel("test5"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test6").withRel("test6"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test777").withRel("test777"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test88").withRel("test88"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test999").withRel("test999"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/testaa").withRel("testaa"));

        
        return model;
    }
    
}
