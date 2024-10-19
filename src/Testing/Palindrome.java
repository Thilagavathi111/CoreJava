package Testing;
import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	public class Palindrome {
		
		String CheckPalindrome(int num) {
			int rem=0, rev=0, temp=num;
			 while(temp!=0) {
				 rem=temp%10;
				 rev=(rev*10)+rem;
				 temp/=10;
				 
			 }
			 if(num==rev)
				return "Number is Palindrome";
			 else
				 return "Not a Palindrome";
				 
			 }
		@Test
		public void PalindromeTest() {
			assertEquals("Number is Palindrome" , CheckPalindrome(1221));
		}
		
		}

