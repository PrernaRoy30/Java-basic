import Calculator.ArithmeticOperaton;
import Calculator.Sq;

class cal
{
   public static void main(String args[])
   {
	Calculator.ArithmeticOperaton A = new Calculator.ArithmeticOperaton();

	System.out.println(A.add(20,10));
	System.out.println(A.sub(20,10));
	System.out.println(A.mul(20,10));
	System.out.println(A.div(20,10));

	Calculator.Sq S = new Calculator.Sq();

	System.out.println(S.square(2.0,5.0));
	System.out.println(S.squareroot(25.0));
   }
}
		

		