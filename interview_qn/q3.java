import java.util.*;

public class q3 {
    private static int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Convert seconds back to time string (hh:mm:ss)
    private static String secondsToTime(int totalSeconds) {
        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

    public static String findShortestDuration(String[] times) {
        int n = times.length;
        ArrayList<Integer> timeInSeconds = new ArrayList<>();

        // Convert all times to seconds
        for (String time : times) {
            timeInSeconds.add(timeToSeconds(time));
        }

        // Calculate all pairwise differences
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int difference = Math.abs(timeInSeconds.get(i) - timeInSeconds.get(j));
                minDifference = Math.min(minDifference, difference);
            }
        }

        // Convert the minimum difference back to time format
        return secondsToTime(minDifference);
    }

    public static void main(String[] args) {
        String[] times = {"12:34:55", "1:12:13", "8:12:15"};
        String result = findShortestDuration(times);
        System.out.println("Output: " + result);
    }
}

// Print the shortest duration between the time.

// Input: 3
//  {12:34:55, 1:12:13, 8:12:15}
// Output: 4:22:40
// Explanation: 
// 	12:34:55 - 8:12:15 = 4:22:40
// 	12:34:55 - 1:12:13 = 11:22:42
// 	8:12:15 - 1:12:13 = 7:0:02	
