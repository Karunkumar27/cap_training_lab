package lab3;
import java.util.HashMap;

public class Ex3_4 {

		public static HashMap<Character, Integer> countCharacter(char[] arr){
			HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
			for (char item : arr) {
				if (charCount.containsKey(item)) {
					charCount.put(item, charCount.get(item)+1);
				}
				else {
					charCount.put(item, 1);
				}
			}
			return charCount;
		}
		
		public static void main(String[] args) {
			char[] arr = {'c', 'h', 'a', 'r', 'a', 'r', 'r', 'a', 'y'};
			System.out.println(countCharacter(arr));
		}

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 /*   public static void main(String[] args) {
	        //input String
	        CountChars.eachCharacterCount ("eetutorialssspointtt");
	      }
	        
	      public static void eachCharacterCount (String str){
	        char[] stringArray;
	        do{
	          stringArray = str.toCharArray();
	          char chr = stringArray[0];
	          int count = 1;
	          for(int i = 1; i < stringArray.length; i++){
	            if(chr == stringArray[i]){
	              count++;
	            }
	          }
	          // remove count for space or tab
	          if(((chr != ' ') && (chr != '\t'))){
	            System.out.println(chr + " - " + count);
	          }
	    
	          str = str.replace(""+chr, "");
	          
	          // terminate the loop 
	          // if string is of length 0 
	          if(str.length() == 0) {
	            break;
	          }
	        }while(stringArray.length > 1);	
	      }
	}*/