public class BigSib {   

	static String helloMsg; // makes var static

	public static String setHelloMsg (String s){		
		return helloMsg = s;
	}

        public static String greet (String name){
		return(helloMsg + " " +  name);

        }
}
