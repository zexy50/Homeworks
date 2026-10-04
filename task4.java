public class task4{
	public static void main(String[] args){
		String s = args[0];
		int sum = 0;

		for (int i = 0;i<s.length();i++){
			char d = s.charAt(i);
			if (d =='a'|| d =='A'){
				sum = sum+1;
			}
			
		}
		System.out.println(sum);
	}
}