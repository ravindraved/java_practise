package test.operators;

public class SwitchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwitchEg().test(5);
		

	}

	void test(int x) {
		switch (x) {
		case 1: System.out.println("Case 1");
		case 2:System.out.println("Case 2");
		case 0:System.out.println("Case 0");
		default:System.out.println("Case default");
		case 4:System.out.println("Case 4");
		}
		
	}

}


/*


 		
What, if anything, is wrong with the following code?
void test(int x) { switch (x) { case 1: case 2: case 0: default: case 4: } } Select the one correct answer
 
a)	The variable x does not have the right type for a switch expression.
b)	The case label 0 must precede case label 1.
c)	Each case section must end with a break statement.
d)	The body of the switch statement must contain at least one statement.
e)	There is nothing wrong with the code.

*/
