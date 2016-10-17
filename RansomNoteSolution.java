/**
 * https://leetcode.com/problems/ransom-note/
 * Problem 383. Ransom Note
 * @danieltsoy
 */
public class RansomNoteSolution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();
        int confirmed = 0;

        for(int i = 0; i < ransomArray.length; i++){
            
            innerloop:
            for(int j = 0; j < magazineArray.length; j++){
                if(ransomArray[i] == magazineArray[j]){
                    confirmed++;
                    magazineArray[j] = 0;
                    break innerloop;
                }
            }
            
        }
        
        if (confirmed == ransomArray.length){
            return true;
        } else { 
            return false;    
        }
        
        
    }
}