package test.inner_class;

public class TestQ2Client {
	
	public static void main(String[] args) {
		TestQ2Outer.TestQ2Inner.showInnerOutput();
		TestQ2Outer.TestQ2Inner testQ2Inner = new TestQ2Outer.TestQ2Inner();
		testQ2Inner.showMoreInnerOutput();
        System.out.println("hello...ss ");
    }


}
