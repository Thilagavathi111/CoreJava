package Testing;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class SumOfDigits {
	public static int sum(int n) {
		int sum=0;
		int t=0;
		while(n!=0) {
			t=n%10;
			sum=sum+t;
			n/=10;
			
		}
		return sum;
	}
@Test
public void SumOfDigit() {
	assertEquals(15, sum(12345));
}
}