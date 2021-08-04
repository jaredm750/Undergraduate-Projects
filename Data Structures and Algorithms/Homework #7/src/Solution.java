import java.util.*;
class Solution {
    public static void main(String []args) {
        int [][] prerequisite1 = {{1,0}};
        int [][] prerequisite2 = {{1,0},{0,1}};

        //PRINTS TRUE IF POSSIBLE & FALSE IS NOT POSSIBLE
        System.out.println("[1,0]");
        System.out.println(canFinish(2,prerequisite1));
        System.out.println("[[1,0],[0,1]]");
        System.out.println(canFinish(2,prerequisite2));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        int[]inDegree = new int[numCourses];

        for(int i = 0; i < prerequisites.length ; i++){
            int val1 = prerequisites[i][1];
            int val2 = prerequisites[i][0];
            if(!map.containsKey(val1)){
                map.put(val1,new ArrayList());
            }
            map.get(val1).add(val2);
            inDegree[val2] = inDegree[val2] + 1;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < numCourses ; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        int[] ans = new int[numCourses];
        int count = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            ans[count++] = curr;
            List<Integer> currList = map.get(curr);
            if(currList == null){
                continue;
            }
            for(int i = 0 ; i < currList.size() ; i++){
                int curr1 = currList.get(i);
                inDegree[curr1] -= 1;
                if(inDegree[curr1] == 0){
                    q.add(1);
                }
            }
        }
        return (count == numCourses) ;
    }
}