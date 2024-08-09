package bg.uktc.siteCrud.cats;

import bg.uktc.siteCrud.cats.Service.OwnerService;
import bg.uktc.siteCrud.cats.model.dto.CreateOwnerDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatDemo implements CommandLineRunner {
    private OwnerService ownerService;
    public CatDemo(OwnerService ownerService){
        this.ownerService = ownerService;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("its working");

        System.out.println("Everything should be fine!!!!!!!");
        ownerService.createOwner(new CreateOwnerDTO().
                setOwnerName("Daniel").setCatNames(List.of("Karaman", "Buba")))   ;
    }
}
