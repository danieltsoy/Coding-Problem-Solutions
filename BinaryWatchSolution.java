/**
 * https://leetcode.com/problems/binary-watch/
 * Problem 401. Binary Watch Solution 
 * @danieltsoy
 */
public class BinaryWatchSolution {
    public List<String> readBinaryWatch(int num) {
	
        String strHour = "";
        String strMinute = "";
        String hourMin = "";
        int count = 0;
        List<String> solutions = new ArrayList<String>();
        String solution = "";
        
        for(int hour = 0; hour < 12; hour++){
            for(int minute = 0; minute < 60; minute++){
                
                strHour = Integer.toBinaryString(hour);
                strMinute = Integer.toBinaryString(minute);
                hourMin = strHour + strMinute;
                
                count = hourMin.length() - hourMin.replace("1", "").length();
                
                if(count == num){
                    if(minute < 10){
                        solution = Integer.toString(hour) + ":0" + Integer.toString(minute);
                        solutions.add(solution);
                    } else {
                        solution = Integer.toString(hour) + ":" + Integer.toString(minute);
                        solutions.add(solution);
                    }
                }
            }
        }
        return solutions;
    }
}