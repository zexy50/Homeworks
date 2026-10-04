public class arraytask2 {
    public static void main(String[] args) {
        int[] numbers = new int [args.length];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = Integer.parseInt(args[i]);
            sum = sum+numbers[i];
            
            
        }
        System.out.println(sum);
    }
}