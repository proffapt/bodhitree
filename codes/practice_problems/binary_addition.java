class Main{
	public static void main(String[] args){
		System.out.println(addBinary("11", "1"));
	}
	    static String addBinary(String a, String b) {
        String result = "";
        int diff = a.length()>b.length() ? a.length()-b.length() : b.length()-a.length();
        for (int i=0; i<diff; i++){
            if (a.length()>b.length()){
                b = "0"+b;
            } else if (a.length()<b.length()){
                a = "0" + a;
            }
        }
				System.out.println(a+" "+b);
        for(int i=a.length()-1; i > -1 ; i--){
            if(Character.toString(a.charAt(i)).equals("0") && Character.toString(b.charAt(i)).equals("0")) result = "0"+result;
            else if((Character.toString(a.charAt(i)).equals("1") && 
									Character.toString(b.charAt(i)).equals("0")) || 
								(Character.toString(a.charAt(i)).equals("0") && 
								 Character.toString(b.charAt(i)).equals("1"))) result = "1"+result;
            else result = "10"+result;
        }
        return result;
    }
}
