import java.util.Scanner;
/**
arr = [-3,-2,-1,1,2,5,10,11,12,13]
sum = 12
Result = (2,10), (1,11), (-1, 13)

sum = 8
Result = (-2,10)
*/
public class FindPairsEqualsToSum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arrOfInputs = new int[n];
		for(int i=0; i < n; i++){
			arrOfInputs[i] = input.nextInt();
		}
		System.out.println("Enter the sum");
		int sum = input.nextInt();
		pairsEqualsToSum(arrOfInputs, sum);
	}
	public static void pairsEqualsToSum(int[] arrOfInputs, int sum) {
		int j = (arrOfInputs.length - 1);
		for(int i = 0; i <= j; i++, j--){
			System.out.println("in while "+ i +" "+j);
			if( (arrOfInputs[i] + arrOfInputs[j]) == sum ){		
				//System.out.println("in first if");
				System.out.println("("+arrOfInputs[i] + "," + arrOfInputs[j]+")");
			}else if( (arrOfInputs[j] > sum) && (arrOfInputs[i] < 0) ){
				i = i + 1;
				//System.out.println("in second if");
			}else if( (arrOfInputs[j] > sum) && (arrOfInputs[i] >= 0) ){
				j = j - 1;
				//System.out.println("in third if");
			}
		}
	}
}
