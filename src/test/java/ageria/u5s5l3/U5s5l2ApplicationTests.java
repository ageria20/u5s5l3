package ageria.u5s5l3;

import ageria.u5s5l3.entities.*;
import ageria.u5s5l3.enums.StatoOrdine;
import ageria.u5s5l3.enums.TableStatus;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class U5s5l2ApplicationTests {
private Ordine order;
private static List<Product> productList;

	@BeforeAll
	static void setUp(){
		System.out.println("INIZIALIZZO TUTTO");
	}

	@BeforeEach
	 void setUpTesting(){
		Topping ham = new Topping("ham");
		Topping wrustel = new Topping("ham");
		Pizza hamPizza = new Pizza(5.99, "Ham Pizza", 600, ham);
		Pizza wrustelPizza = new Pizza(6.99, "Wrustel Pizza", 800, wrustel);

		Drink coke = new Drink("Coke", 2.00, 12, 0.33);

		productList = new ArrayList<>();
		productList.add(hamPizza);
		productList.add(wrustelPizza);
		productList.add(coke);

		Tavolo tb1 = new Tavolo(1, TableStatus.LIBERO, 6);
		order = new Ordine(tb1, productList, 25, StatoOrdine.SERVITO, 6, LocalDateTime.now());
	}

	@Test
	void checkOrder(){
		double total = order.getTotal();
		order.printOrder();
		assertEquals(26.98, total);
	}

	@ParameterizedTest
	@CsvSource({"26.98"})
	void checkOrderIsOk( double expectedTotal){
		double getTotal = order.getTotal();
		order.printOrder();
		assertEquals(expectedTotal, getTotal);
	}

	@AfterAll
	static void clear(){
		System.out.println("PULISCO TUTTO");
		productList.clear();
		System.out.println(productList);

	}
}
