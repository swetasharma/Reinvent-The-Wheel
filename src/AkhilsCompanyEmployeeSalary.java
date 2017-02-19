import java.util.Scanner;
public class AkhilsCompanyEmployeeSalary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] rating = new int[n];
		for(int i = 0; i < n; i++){
			rating[i] = input.nextInt();
		}		
		employeeSalary(rating);
	}
	public static void employeeSalary(int ratings[]) {
		int[] salary = new int[ratings.length];
		salary[0] = 1;
		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i - 1] > ratings[i] && salary[i - 1] == 1) {
				int j = i - 1;
				salary[i] = 1;
				while (j >= 0 && ratings[j] > ratings[j + 1] && salary[j] <= salary[j+1]) {
					salary[j] = salary[j + 1] + 1;
					j--;
				}
			} else if (ratings[i - 1] > ratings[i] && salary[i - 1] > 1) {
				salary[i] =  1;
			} else if (ratings[i - 1] == ratings[i]) {
				salary[i] = 1;
			} else if (ratings[i - 1] < ratings[i]) {
				salary[i] = salary[i - 1] + 1;
			}
		}
		int total = 0;
		for (int i = 0; i < salary.length; i++)
		{ 
			total = total + salary[i];
		}
		System.out.println(total);
	}
}