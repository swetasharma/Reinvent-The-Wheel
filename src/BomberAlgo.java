/**
 * 
 * @author Sweta Sharma
 * The Bomber algo does not like 3 or more consecutive characters in a given string to be same
 * For example: If the given string is "adbcccbbd" the bomber algo will first bomb "ccc" and then "bbb", so the final output string will become
 * "add". The bomber algo will destroy the characters only if there are 3 or more coninuous occurence of same characters in string.
 * Write a code of the bomber algo. The method takes a string as an input and returns bombed string as an output
 * Input aaabcccdee
 * Output bdee
 * Input abcdeeeeddcbfgf
 * Output abccbfgf
 */

public class BomberAlgo {
	public static void main(String[] args) {
		char[] input = {'a','d', 'b', 'c', 'c', 'c', 'b', 'b', 'd'};
		bombAlgo(input);	
	}
	public static void bombAlgo(char[] input){
		while(input.length > 0){
			int firstPointer  = 0;
			int secondPointer = 1;
			char[] arrRemovedRepetitiveCharacters = null;
			while( firstPointer < input.length ){
				System.out.println(firstPointer + "------------" + secondPointer);
				if(input[firstPointer] != input[secondPointer]){
					firstPointer  = firstPointer + 1;
					secondPointer = secondPointer + 1;
					if((secondPointer - firstPointer) > 1){
						arrRemovedRepetitiveCharacters = removeConsecutiveCharacter(input, firstPointer, secondPointer - 1);
						for(int i = 0; i < arrRemovedRepetitiveCharacters.length; i++){
							System.out.print(arrRemovedRepetitiveCharacters[i]);
						}
						System.out.println("-----------------first round done------------");
						break;
					}
				}else{
					secondPointer = secondPointer + 1;
				}						
			}
			input = arrRemovedRepetitiveCharacters;
		}			
	}
	public static char[] removeConsecutiveCharacter(char[] input, int startPosition, int endPosition){
		System.out.println("In removeconsecutive character");
		int size = input.length - ((endPosition - startPosition) + 1);
		//System.out.println(size + "The value of size is" + input.length + endPosition + startPosition);
		char[] arrRemovedRepetitiveCharacters = new char[size];
		int j = 0;
		for(int i = 0; i < input.length; i++){
			if(i < (startPosition - 1)){
				arrRemovedRepetitiveCharacters[j] = input[i];
				j = j + 1;
			}else{
				if( i >= (endPosition) ){
					arrRemovedRepetitiveCharacters[j] = input[i];
					j = j + 1;
				}
			}			
		}	
		return arrRemovedRepetitiveCharacters;
	}	
}
