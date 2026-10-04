public class arraytask6 {
	public static void main(String[] args){
		int[] s = new int[args.length-1];
		int target = Integer.parseInt(args[0]);
		boolean num = false;
		for (int i =1 ;i< s.length;i++){
			s[i] = Integer.parseInt(args[i]);
			if (s[i] == target){
				num = true;
			}

		}
		System.out.println(num);
	}
}