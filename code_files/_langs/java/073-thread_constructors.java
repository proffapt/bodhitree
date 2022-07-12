class MyThr extends Thread{
	MyThr(String name){ super(name); } // just a constructor calling the constructor of thread class.
	@Override
	public void run(){
		// int i = 0;
		// while(i<6900) { System.out.println("0"); i++; }
		System.out.println("Thank you");
	}
}

class Main{
	public static void main(String[] args){
		// we have seen void constructor and Runnable constructor in previous code..
		MyThr thread = new MyThr("proffapt"); // string Constructor	
		System.out.println("The state of this thread is "+thread.getState()); // getting state of the thread
		thread.start();
		System.out.println("Name of currently running thread: "+Thread.currentThread().getName()); // currentThread is a method
		System.out.println("The state of this thread is "+thread.getState()); // getting state of the thread
		System.out.println("The id of this thread was "+thread.getId()); // getting id of the thread
		System.out.println("Name of currently running thread: "+Thread.currentThread().getName()); // currentThread is a method
		System.out.println("The name of this thread was "+thread.getName()); // getting name of the thread
		System.out.println("The state of this thread is "+thread.getState()); // getting state of the thread
	}
}
