package bg.uktc.siteCrud.Ioc;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;

public class Dog implements Animal, BeanNameAware, DisposableBean {

    private boolean superDog;

    public Dog() {
        this(false);
    }

    public Dog(boolean superDog) {
        this.superDog = superDog;
    }

    @Override
    public void makeNoise() {
        if (superDog) {
            System.out.println("Super bark super bakr");
        }else{
            System.out.println("bark bakr");
        }

    }
    @PostConstruct
    public void afterInit(){
        System.out.println("Dog is ready to bite!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("This dog name is: "+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Dog is about to die...! Bye!");
    }
}
