import java.lang.Math; // used for abs

public class Time{
  public static void main(String[] args){
    int hour = 15;
    int minute = 36;
    int second = 46;
    int seconds_ina_day = 86400;

    int current_hour = 16;
    int current_minute = 10;
    int current_second = 15;

    System.out.print("\n");
    System.out.print("Number of seconds since midnight: ");
    int seconds_since_midnight = ((hour * 60 * 60) + (minute * 60) + second);
    System.out.println(seconds_since_midnight);

    System.out.print("Number of seconds remaining in the day: ");
    System.out.println(seconds_ina_day - seconds_since_midnight);

    System.out.print("Percentage of the day that has passed: ");
    int percent_passed = (seconds_since_midnight * 100)/seconds_ina_day;
    System.out.println(percent_passed + "%");

    System.out.print("Elapsed time: ");
    int elapsed_hour = Math.abs(current_hour - hour);
    int elapsed_minute = Math.abs(current_minute - minute);
    int elapsed_second = Math.abs(current_second - second);
    System.out.println(elapsed_hour + ":" + elapsed_minute + ":" + elapsed_second);

    System.out.print("\n");
  }

}
