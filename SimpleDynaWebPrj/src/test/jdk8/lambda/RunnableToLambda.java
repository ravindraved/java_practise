package test.jdk8.lambda;

public class RunnableToLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using anonymous innerclass

        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !..via anonymous inner class");
            }
        };


        new Thread(race1).start();
	}

}
