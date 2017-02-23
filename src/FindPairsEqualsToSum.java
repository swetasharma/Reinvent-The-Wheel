import java.util.Scanner;
/**
arr = [-3,-2,-1,1,2,5,10,11,12,13]
sum = 12
Result = (2,10), (1,11), (-1, 13)

sum = 8
Result = (-2,10), (-3,11)
*/
public class FindPairsEqualsToSum{
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		int n = input.nextInt();*/
		//int[] arrOfInputs = new int[n];
		int[] arrOfInputs = {-3,-2,-1,1,2,3,4,5,7,8,9,10,11,12,13,15};
		/*remove 8 and 9 and keep 5 and 7 you are not getting 5 and 7 in result for sum 12 please check*/
		/*for(int i=0; i < n; i++){
			arrOfInputs[i] = input.nextInt();
		}*/
		System.out.println("Enter the sum");
		//int sum = input.nextInt();
		int sum = 12;
		pairsEqualsToSum(arrOfInputs, sum);
	}
	public static void pairsEqualsToSum(int[] arrOfInputs, int sum) {
		int j = (arrOfInputs.length - 1);
		int i = 0;		
			while( i <= j ){
			if( (arrOfInputs[j] > sum) && (arrOfInputs[i] < 0) && (arrOfInputs[i] + arrOfInputs[j]) != sum){
				i = i + 1;
			}else if((arrOfInputs[j] > sum) && (arrOfInputs[i] < 0) && (arrOfInputs[i] + arrOfInputs[j]) == sum){
				System.out.println("("+arrOfInputs[i] + "," + arrOfInputs[j]+")");
				i = i + 1;
				j = j - 1;
			}else if((arrOfInputs[j] <= sum) && (arrOfInputs[i] > 0) && (arrOfInputs[i] + arrOfInputs[j]) == sum){
				System.out.println("("+arrOfInputs[i] + "," + arrOfInputs[j]+")");
				i = i + 1;
				j = j - 1;
			}else if((arrOfInputs[j] <= sum) && (arrOfInputs[i] > 0) && (arrOfInputs[i] + arrOfInputs[j]) != sum){
				j = j - 1;
			}
		}
	}
}