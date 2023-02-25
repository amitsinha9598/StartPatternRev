package looping;

public class StartPatternRev {

	public static void main(String[] args) {
		System.out.println("Ex1 .........\n"); 
		for(int i=1;i <=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
		System.out.println("Ex2 .........\n"); 
		for(int i=1;i <=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" "+j);
				
			}
			System.out.println();
		}
		
		System.out.println("Ex3 .........\n"); 
		for(int i=1;i <=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" "+i);
				
			}
			System.out.println();
		}
		
		System.out.println("Ex4 .........\n"); 
		for(int i=5;i >=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j);
				
			}
			System.out.println();
		}
		
		System.out.println("Ex5 .........\n"); 
		for(int i=5;i >=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i);
				
			}
			System.out.println();
		}
		
		System.out.println("Ex6 .........\n"); 
		for(char i = 'F';i >='A';i--) {
			for(char j='A';j<=i;j++) {
				System.out.print(" "+j);
				
			}
			System.out.println();
		}
	}

}