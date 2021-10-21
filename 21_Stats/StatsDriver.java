public class StatsDriver{
	public static void main(String[] args){
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
