package test.jdk8.lambda;

public class RunnableToLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using anonymous innerclass

		Runnable race1 = new Runnable() {
			public void run() {
				System.out.println("Hello world !");
			}
		};

		
		new Thread(race1).start();
	}

}
