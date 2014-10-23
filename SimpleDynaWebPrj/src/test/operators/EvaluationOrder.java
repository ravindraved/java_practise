package test.operators;

public class EvaluationOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] array = { 4, 8, 16,11 };
			int i = 1;
			System.out.println(array[++i] );
			array[++i] = --i;
			
			
			System.out.println(array[2] );
		

	}

}

/* 
 * 
 * 
 * 
 		
What will be the result of compiling and running the following program?
public class EvaluationOrder { public static void main(String[] args) { int[] array = { 4, 8, 16 }; int i=1; array[++i] = --i; System.out.println(array[0] + array[1] + array[2]); } } Select the one correct answer.
 
a)	13
b)	14
c)	20
d)	21
e)	24

 * 
 * 
 * 
 * */
