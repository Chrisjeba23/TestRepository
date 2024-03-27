package TestNGDemos;

import org.testng.annotations.Test;

public class D06ModularFramework {
	@Test(priority=0)
	public void Test1() {

		System.out.println("test1");
	}
	@Test(priority=1)
	public void Test2() {
		System.out.println("test2");
	}
	@Test(priority=2)
	public void test3() {
		System.out.println("test3");
	}
	@Test(priority=3)
	public void test4() {
		System.out.println("test4");
	}
	@Test(priority=4)
	public void test5() {
		System.out.println("test5");
	}
	@Test(priority=5)
	public void test6() {
		System.out.println("test6");
	}
}
