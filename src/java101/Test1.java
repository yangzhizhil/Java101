package java101;

public class Test1 extends Thread {
	@Override
	public void run () {
		//TODO Auto-generated method stub
		// super.run();
		for (int i=0;i<2000;i++) {
			System.out.println(i+ "+++���߳�+++");
		}
	}

	public static void main(String[] args) {
		Test1 thread =new Test1();
		// TODO Auto-generated method stub
for (int i=0; i<=2000; i++) {
	System.out.println(i + "---���߷���---");
}
}
}
