package chapter4;

public class PR_123_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int n = 1, m = 1;
		for (n = 1; n<=9; n++) {
				for(m = 1; m<=9; m++) {
					if(n >= m) break;
				System.out.println(n + "*" + m + "=" + n*m);
			}
}
}
}