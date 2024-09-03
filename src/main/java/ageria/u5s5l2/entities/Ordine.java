package ageria.u5s5l2.entities;

import ageria.u5s5l2.enums.StatoOrdine;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

public class Ordine {

    private Tavolo tavolo;
    private List<Product> productList;
    private long numeroOrdine;
    private StatoOrdine statoOrdine;
    private int coperti;
    private LocalDateTime oraAcquisizione;
    private double total;

    public Ordine(Tavolo tavolo, List<Product> productList, long numeroOrdine, StatoOrdine statoOrdine, int coperti, LocalDateTime oraAcquisizione, double total) {
        this.tavolo = tavolo;
        this.productList = productList;
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.coperti = coperti;
        this.oraAcquisizione = oraAcquisizione;
        this.total = total;
    }


    public double orderCheck(double prezzoCoperto){
        double getTotalPrices =  this.productList.stream()
                .mapToDouble(product -> product.getPrice())
                .sum();
        return this.total = getTotalPrices +(prezzoCoperto * this.coperti);
    }

    public void printOrder(){
        System.out.println("-------------------------");
        System.out.println("ORDERS n: "+ this.numeroOrdine);
        System.out.println("-------------------------");

        System.out.println("Tavolo" + this.tavolo.getTbNum());
        System.out.println("Date" + this.oraAcquisizione);
        this.productList.forEach(System.out::println);
        System.out.println("Numero coperti: " + this.coperti);
        System.out.println("Totale: " + this.total);

    }
}
