// Some basic terminologies
/*
	Multiprocessing and multithreading are used to achieve multitasking.
	
	!Multiuser: You know what it is..
	!Multitasking: You know what it is..
	!Porcesses: Ek hi OS mein mutltiple processes to achieve a well defined task each.. HEAVY-WEIGHT.
	!Threads: Ek hi porcess ke andar simultaneously hone wale different tasks.. are threads.. LIGHT-WEIGHT.

	suppose you watching video on chrome while downloading porn and tg is running in background too..
	chrome and telegarm are processes in os..
	downloading porn and watching video are threads within the process of chrome.

	Basicaly threads are used for light-weight independent execution within a single process.
	
	CONCURRENCY v/s PARALLELISM
		Concurrency: 
			- Managing multiple tasks but doing only on of them at a time.
			- like coding and chatting to your gf.. when you don't code you go to gf..
			then come back to your code.. you are doing both tasks.. but not at the same time
		Parallelism:
			- Learning Java language.
			- Learning AppDev.
				AppDev seekhte seekhte hum java bhi seekh rahe hain.. dono kaam ek saath at a time ho
				rahe hain.

	NOTE: Multithreading helps us to achive CONCURRENCY not PARALLELISM.
	that is har thread ko chala kar toh rakhega.. lekin jese hi koi wait karayega.. usse chhorke doosre par 
	focus karne lag jayega toh aise koodta kaadta.. ek time par ek thread ko hi dekhta hua kaam karega cpu hamara.
*/

// Methods to create a thread:
/*
	- By extending a Thread class
	- By implementing a Runnable Interface
*/

// Method 1:
class MyThread extends Thread{
	@Override // run is being overridden which is in Thread.java file
	// run has to be overridden, it's an abstract method
	public void run(){
		while (true)
			System.out.println("0");
	}
}
class YetAnotherThread extends Thread{
	@Override
	public void run(){
		while (true)
			System.out.println("1");
	}
}

// Method 2:
class MyThreadRunnable implements Runnable{
	public void run(){
		while (true)
			System.out.println("0");
	}
}
class YetAnotherThreadRunnable implements Runnable{
	public void run(){
		while (true)
			System.out.println("1");
	}
}

// Life cycle of a thread
/*
	1) New: Object has been created but the start method hasn't been invoked yet.
	2) Runnable: star() method has been invoked it's on the list of being selected along with others by the threader.
	3) Running: When it's the one being currently executed by the threader.
	4) Non-Runnable: Whne it was running earlier.. but needs some input from a server.. so it's kept in bg.. not eligble to run
	but still active as soon as it gets the input from the server it's put into Runnable stage
	--> 2>3>4 keeps on repeating if needed.
	5) Terminated: Lines of code inside the run() are completed.
*/

class Main{
	public static void main(String[] args){
		// Method 1 implementation
		// The objects of these classes gives us a loaded gun ready to be fired(to call start() method).
		/*
		MyThread gun1=new MyThread();	
		YetAnotherThread gun2=new YetAnotherThread();	
		gun1.start(); // to start thread we call the start method which will call the run method internally
		gun2.start();
		*/

		// Method 2 implementation
		// The objects of these classes gives us a bullet, we have to load it first in order to fire(to call the start() method).
		MyThreadRunnable bullet1=new MyThreadRunnable();
		// objects created by thread class gives us an unloaded gun.
		Thread gun1=new Thread(bullet1); // loading the gun by giving the bullet1 as argument // New
		YetAnotherThreadRunnable bullet2=new YetAnotherThreadRunnable();
		Thread gun2=new Thread(bullet2); // loading the gun // New
		gun1.start(); // Runnable
		gun2.start(); // Runnable
	}
}
