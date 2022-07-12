class MyThr extends Thread{
	MyThr(String name) { super(name); }
	@Override
	public void run(){
		int i = 0;
		while(i<6969) { System.out.println("Thank you, "+this.getName()); i++; }
	}
}

class YAThr extends Thread{
	YAThr(String name) { super(name); }
	@Override
	public void run(){
		while(true) {
			System.out.println("Fuck you, "+this.getName());
			// This will make the thread sleep for 60 miliseconds.. just after fuck you statement is printed once..
			// again Exceptions handled inside a try catch block..
			try { Thread.sleep(60); }
			catch(InterruptedException e){ e.printStackTrace(); }
		}
	}
}

class YATOnceAgain extends Thread{
	YATOnceAgain(String name){ super(name); }
	@Override
	public void run(){
		while(true) System.out.println("Suck my D, "+this.getName());
	}
}

class Main{
	public static void main(String[] args){
		MyThr t1 = new MyThr("chinch pokli");	
		YAThr t2 = new YAThr("aaloo");
		YATOnceAgain t3 = new YATOnceAgain("bc");
		// To make sure t2 and t3 doesn't start till t1 has ended.. you do..
		t1.start();
		try{
			t1.join(); // might have given error.. since it is possible that before joining the t1 thread was terminated.. thus handled via try.. catch.. handling.
		}
		catch(Exception e){
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}
