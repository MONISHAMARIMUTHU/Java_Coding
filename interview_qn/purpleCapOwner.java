import java.util.*;

public class purpleCapOwner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 
        sc.close();
        String[] values = input.split(",");
        double[] heights = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            heights[i] = Double.parseDouble(values[i].trim());
        }
        Arrays.sort(heights);
        int midIndex = heights.length / 2;
        double purpleCapOwner = heights[midIndex];
        System.out.println(purpleCapOwner);
    }
}
// 1.Persons with random height enter the room , we need to find the person
// who has purple cap
// ● If all the persons are standing in ascending orders of height, then the
// middle person is the one who owns purple cap.
// ● Array input will be always in odd number of persons.
// **Note : We should not get Array Size as input, only array values as input
// Sample Input- [5.5, 4.3, 5.7, 5.2, 5.1, 6.2, 6.1]
// Sample output- 5.5