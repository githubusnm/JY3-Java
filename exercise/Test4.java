public class Test4
{
	public static void main(String[] args) 
	{
		int oddsum = 0;
		int evensum = 0;
		String str = "692116851128";
		for(int i = 0;i < str.length();i+=2){
			char char1 = str.charAt(i);
			oddsum += char1 - 48;
		}
		for(int i = 1;i < str.length();i+=2){
			char char2 = str.charAt(i);
			evensum += char2 - 48;
		}
		System.out.println(oddsum);
		System.out.println(evensum);
		int sum = 0;
		sum = oddsum + evensum *3;
		System.out.println(sum);
		System.out.println(sum%10);
		System.out.println(10 - sum % 10);
		System.out.println((10 - sum % 10) % 10);
		
	}
}
