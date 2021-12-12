import java.util.ArrayList;

public class ALTester{
	
	ArrayList<Integer> bob = new ArrayList<Integer>; 

	public int inOrder(ArrayList<Integer> bob){
	for(int i = 0; i < bob.length - 1; i++){
		compareTo(bob[i], bob[i+1]); } 
	if (
	} 

	public int compareTo(Integer a, Integer b){
        Integer diff = a - b;
     	if (diff == 0) {
       return 0;
     } else if(diff > 0){
       return 1;
     } else {
       return -1;
     }
   }
	
	public static void main(String[] args){
	
	}

}
