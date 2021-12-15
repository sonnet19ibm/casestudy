import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class TestLifeCycle {
	private ArrayList<String> basket;
	
	public static void setup() {
		System.out.println("excuctes before all testcases");
	}
	
	public static void teardown() {
		System.out.println("executes after all testcases");
	}
	
	public void setupEach() {
		basket =new ArrayList<>();
		System.out.println("executes before each test case");
	}
	
	public void teardownEach() {
		basket=null;
		System.out.println("Excecutes after each test case");
		
	}
	
	public void testEmptyBasket() {
		System.out.println("Testing empty basket");
		assertTrue(basket.isEmpty());
	}
	

	public void testOneTeam() {
		//basket.add("apple")
		System.out.println("testing basket with one item");
		assertEquals(1,basket.size());
	}

}
