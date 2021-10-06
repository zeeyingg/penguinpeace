public class BigSib {   

	private String helloMsg; 

	//constructor 
	public BigSib (String msg){		
		 helloMsg = msg;
	}

        public String greet (String name){
		return(helloMsg + " " +  name);

        }
}
