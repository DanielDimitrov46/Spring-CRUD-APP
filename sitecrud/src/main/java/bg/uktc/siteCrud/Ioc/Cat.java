package bg.uktc.siteCrud.Ioc;

public class Cat  implements Animal{

    @Override
    public void makeNoise() {
        System.out.println("mew mew");
    }
}
