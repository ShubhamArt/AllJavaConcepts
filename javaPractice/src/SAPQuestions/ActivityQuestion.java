package SAPQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActivityQuestion {
    //You are given n activities with their start and finish times. Select the maximum number of activities
    // that can be performed by a single person,
    //assuming that a person can only work on a single activity at a time.
    //Input: [(2, 5), (1, 3),  (4, 7), (3, 4), (5, 6), (6, 10)]
    public static void main(String[] args) {
        int[][] activities ={{2, 5}, {1, 3},  {4, 7}, {3, 4}, {5, 6}, {6, 10}};

        // Sort activities based on their finish times
        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));
        List<int[]> selectedActivities = new ArrayList<>();
        int lastFinishTime = 0;

        // Iterate through sorted activities and select non-overlapping ones
        for (int[] activity : activities) {
            if (activity[0] >= lastFinishTime) {
                selectedActivities.add(activity);
                lastFinishTime = activity[1];
            }
        }
        for (int[] activity : selectedActivities) {
            System.out.println("(" + activity[0] + ", " + activity[1] + ")");
        }
        System.out.println("Maximum number of activities that can be performed: " + selectedActivities.size());

    }
}
