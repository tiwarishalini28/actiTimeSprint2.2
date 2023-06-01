package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class E {
	@Test
	public void a() {
	System.out.println("Hi");

}
	
	@Test(enabled = false)  //to disabled any case we use enabled = false
	public void b() {
	System.out.println("will u go for a date");

}
	
	@Test
	public void c() {
		System.out.println("Bye");

}
}