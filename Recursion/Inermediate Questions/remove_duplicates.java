//remove duplicates from string

public class remove_duplicates{
    public static boolean map[] = new boolean[26];
    public static void removeDup(String str, int idx, String new_str){
        //base case
        if(idx == str.length()){
            System.out.println(new_str);
            return;
        }

        //will hold the current character
        char currChar = str.charAt(idx);
        
        //if the character is already present in the map, then we will not add it to the new string
        //currChar-1 is converting character to index from 0-25
        //map[currChar-'a'] == true means that the character is already present in the map
        if(map[currChar-'a']==true){
            removeDup(str,idx+1,new_str);
        }else{
            //if the character is not present in the map, then we will add it to the new string
            new_str += currChar;
            //we will mark the character as true in the map which we have added to the new string
            map[currChar-'a'] = true;
            removeDup(str,idx+1,new_str);
        }
    }
    public static void main(String args[]){
        String str = "axbcxxada";
        removeDup(str,0,"");
    }
}

// Time Complexity: O(n) where n is the length of the string