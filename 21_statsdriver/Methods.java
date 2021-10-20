

public class Methods{


	public static int mean(int a, int b){
		int meanOutput = ((a+b)/2);	
		return meanOutput; 
	}
	

	public static double mean(double a, double b){
		double doubleOutput = ((a+b)/2);
		return doubleOutput;
	}

	
	public static int max(int a, int b){
		if (a == b) {
			return a;		
		} else if (a > b) {
			return a;	
		} else {
			return b;
		}
	}

	
	public double max(double a, double b){
	       if (a == b) {
                        return a;               
                } else if (a > b) {
                        return a;       
                } else {
                        return b;
                }
        }


	public int geoMean(int a, int b){
		int geoMean = Math.pow((a * b), 1/2);
		return geoMean;
	}

        public double geoMean(double a, double b){
                double geoMean = Math.pow((a * b), 1/2);
                return geoMean;
        }

}
