package test.inner_class;

public class TestQ2Outer {
	int enclosing_int;
	public String showOuterOutput() {
		return "Outer.showOuterOutput";
	}
	public static class TestQ2Inner {
		public static void showInnerOutput(){
			System.out.println("Outer.Inner.showInnerOutput.. edit on w10");
			
		}
		public void showMoreInnerOutput() {
			System.out.println("Outer.Inner.showMoreInnerOutput");
			TestQ2Outer testQ2Outer = new TestQ2Outer();
			System.out.println(testQ2Outer.showOuterOutput());
		}
	}


}


/*

Which are true about a static nested class? (Choose all that apply.)
a.	You must have a reference to an instance of the enclosing class in order to instantiate it
b.	It does not have access to non-static members of the enclosing class
c.	Its variables and methods must be static
d.	If the outer class is named MyOuter, and the nested class is named MyInner, it can be instantiated using new MyOuter.MyInner();


B and C are correct Answer.

*/