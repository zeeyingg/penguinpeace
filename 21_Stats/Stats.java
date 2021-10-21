/*
DISCO
* Using a 0 as a test case in both geoMean examples resulted in unexpected outputs.
	System.out.println(driver.geoMean(0, 1, 2)) should have been 0, but outputted 1.
* Math.cbrt() - cube roots values

QCC
* Why did using a 0 as a test case result in a 1?
* Our initital code for geoMean of 3 parameters didn't work. Here it is below:

  public static double geoMean(double a, double b, double c) {
        double geoMean = Math.pow((a * b * c), 1/3);
        return geoMean;
  }
Why?
* And how come that error didn't manifest with 2 parameter geoMean functions?

*/

public class Stats{


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
		int geoMean = (int) Math.pow((a * b), 1/2);
		return geoMean;
	}

        public double geoMean(double a, double b){
                double geoMean = Math.pow((a * b), 1/2);
                return geoMean;
        }

	public static int max(int a, int b, int c) {
  		if ((a > b) && (a > c)){
      			return a;
  		} else if ((b > a) && (b > c)) {
    			return b;
  		} else {
    			return c;
  		}
	}


	public static double max(double a, double b, double c) {
  		if ((a > b) && (a > c)){
      			return a;
  		} else if ((b > a) && (b > c)) {
    			return b;
  		} else {
    			return c;
  		}
	}

	public static double geoMean(double a, double b, double c) {
        	double geoMean = Math.cbrt(a*b*c);
        	return geoMean;
  	}

	public static int geoMean(int a, int b, int c){
		int geoMean = (int) Math.cbrt(a*b*c);
                return geoMean;
	}
	public static void main(String[] args){
                Stats drive = new Stats();
                System.out.println(drive.mean(6,4) + "...should be 5");
                System.out.println(drive.mean(6.0, 4.0) + "...should be 5.0");
                System.out.println(drive.mean(5.0, 5.0) + "...should be 5.0");
                System.out.println(drive.max(1, 0) + "...should be 1");
                System.out.println(drive.max(1.0, 0.0) + "...should be 1.0");
                System.out.println(drive.max(1, 1) + "...should be 1");
                System.out.println(drive.geoMean(1, 1) + "...should be 1");
                System.out.println(drive.geoMean(1.0, 1.0) + "...should be 1.0");
		System.out.println(drive.max(0, 1, 2) + "...should be 2");
		System.out.println(drive.max(0.0, 1.0, 2.0) + "...should be 2.0");
		System.out.println(drive.geoMean(1, 1, 27) + "...should be 3");
		System.out.println(drive.geoMean(1.0,1.0, 27.0) + "...should be 3.0");         

	}
}
