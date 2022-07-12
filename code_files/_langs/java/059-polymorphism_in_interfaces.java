interface Camera{
	void takeSnap();
	void recordVideo();
}

interface Wifi{
	String[] getNetworks();
	void connectToNetwork(String network);
}

class Phone{
	void makeCall(int number){ System.out.println("Calling..."+number); }
	void pickCall(){ System.out.println("Connecting the call.."); }
}

class SmartPhone extends Phone implements Camera, Wifi{
	public void takeSnap(){ System.out.println("Taking the snap.."); }
	public void recordVideo(){ System.out.println("Recording a video.."); };
	public String[] getNetworks(){ 
		String[] wifi_networks = { "matrix", "BlackHole", "Venom"};
		return wifi_networks;
	}
	public void connectToNetwork(String network){ System.out.println("Connecting to the ntwork with SSID: "+network); }
	// void pickCall(){ System.out.println("Picking the call.."); }
}

class Main{
	public static void main(String[] args){
		// polymorphism via dynamic method dispatch
		Camera cam = new SmartPhone(); // SmartPhone only to be used as a camera.
		/*
			Since there's no common method being overridden in the SubClass{SmartPhone}
			from the super class(Camera).. only methods you can spawn are from 
			the super class.. that is camera.. nothing else from smartphone
		*/
		cam.takeSnap();
		// cam.connectToNetwork("dejaVU"); --> NOT ALLOWED
		Phone p = new SmartPhone();
		p.pickCall();
		SmartPhone s = new SmartPhone();
		for (String i: s.getNetworks())
			System.out.println(i);
		// This is basic polymorphism.. it's object of SmartPhone but can be used as cam only.
	}
}
