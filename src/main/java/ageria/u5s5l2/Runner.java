package ageria.u5s5l2;


import ageria.u5s5l2.entities.Menu;
import ageria.u5s5l2.entities.Ordine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Autowired
    private ProductConfig products;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("CIAO SONO IL RUNNER");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProductConfig.class);

        Ordine ordine = ctx.getBean(Ordine.class);
        ordine.printOrder();
    }
}
