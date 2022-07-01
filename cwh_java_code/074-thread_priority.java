class MyThr extends Thread{
	MyThr(String name){ super(name); } // just a constructor calling the constructor of thread class.
	@Override
	public void run(){
		while(true) System.out.println("My name is "+this.getName()+" and I am a thread not a threat.");
	}
}

class Main{
	public static void main(String[] args){
		// Ready Queue:
		/*
			JVM maintains a queue of runnable threads.. and which one to run is decided by the threader
			we can also define it.. let's see about priorities

			java.lang.Thread.MIN_PRIORITY = 1
			java.lang.Thread.NORM_PRIORITY = 5 >> Default priofity
			java.lang.Thread.MAX_PRIORITY = 10
		*/
		MyThr t1 = new MyThr("1");
		MyThr t2 = new MyThr("2");
		MyThr t3 = new MyThr("3");
		MyThr t4 = new MyThr("4");
		MyThr t5 = new MyThr("5");
		t3.setPriority(java.lang.Thread.MAX_PRIORITY);
		t2.setPriority(java.lang.Thread.MIN_PRIORITY);
		t1.setPriority(java.lang.Thread.MIN_PRIORITY);
		t4.setPriority(java.lang.Thread.MIN_PRIORITY);
		t5.setPriority(7);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		// Observe this normal execution gives random results everytime.
	}
}
