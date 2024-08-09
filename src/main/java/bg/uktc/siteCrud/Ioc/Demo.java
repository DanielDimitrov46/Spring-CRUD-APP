package bg.uktc.siteCrud.Ioc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Demo implements CommandLineRunner {
    private ZooService zooService;

    public Demo(ZooService zooService) {
        this.zooService = zooService;
    }

    @Override
    public void run(String... args) throws Exception {
        zooService.doWork();
    }
}
