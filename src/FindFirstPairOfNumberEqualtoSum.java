import java.util.Scanner;
public class FindFirstPairOfNumberEqualtoSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arrOfInputs = new int[n];
		//int[] arrOfInputs = {-1,1,2,5,10,11,12,13};
		for(int i=0; i < n; i++){
			arrOfInputs[i] = input.nextInt();
		}
		System.out.println("Enter the sum");
		int sum = input.nextInt();
		//int sum = 12;
		firstPairEqualsToSum(arrOfInputs, sum);
	}
	
	public static void firstPairEqualsToSum(int[] arrOfInputs, int sum) {
		int l = 0;
		int r = arrOfInputs.length - 1;
		while(l < r){
			if(arrOfInputs[l] + arrOfInputs[r] == sum){
				System.out.println(arrOfInputs[l] +","+ arrOfInputs[r]);
				break;
			}else if((arrOfInputs[l] + arrOfInputs[r]) < sum ){
				l++;
			}else{
				r--;
			}
		}
	}
}
