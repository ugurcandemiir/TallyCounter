package lab04;

public class Tester {

	public static void main(String[] args) {

		Counter c1 = new Counter();
		c1.click();
		c1.click();
		c1.click();
		Counter c2 = new Counter();
		c2.click();
		c2.click();
		c2.click();
		c2.click();
		System.out.println("c1 has been clicked " + c1 + " times. (expect 3)");
		System.out.println("c2 has been clicked " + c2 + " times. (expect 4)");
		System.out.println("c1 " + (c1.compareTo(c2)>0 ? ">" : "<=") + " c2 (expect <=)");
		c2.reset();
		c2.click();
		System.out.println("c2 has been clicked " + c2 + " times. (expect 1)");
		System.out.println("c1 " + (c1.compareTo(c2)>0 ? ">" : "<=") + " than c2 (expect >)");

		CounterList cl = new CounterList();
		cl.add();
		cl.add();
		cl.add();
		cl.click(0); cl.click(1); cl.click(2);
		cl.click(0); cl.click(2);
		cl.click(2);
		System.out.println("Counterlist cl is : " + cl + " (expect [2,1,3])");
		cl.sort();
		System.out.println("after sort, Counterlist cl is : " + cl + " (expect [1,2,3])");
		try {
			cl.click(3);
		} catch(Exception e) {
			System.out.println("Caught exception: " + e);
		}

	}
}