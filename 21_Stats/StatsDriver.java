public class StatsDriver{
	public static void main(String[] args){
		Stats drive = new Stats();
		System.out.println(drive.mean(6,4) + "...should be 5" );
		System.out.println(drive.mean(6.0, 4.0) + "...should be 5.0");
		System.out.println(drive.mean(5.0, 5.0) + "...should be 5.0");
		System.out.println(drive.max(1, 0) + "...should be 1");
		System.out.println(drive.max(1.0, 0.0) + "...should be 1.0");
		System.out.println(drive.max(1, 1) + "...should be 1");
		System.out.println(drive.geoMean(1, 1) + "...should be 1");
		System.out.println(drive.geoMean(1.0, 1.0) + "...should be 1.0");		
	}
}		
