package AccoDemo1;

public interface Calculator {

	public Integer add(Integer a, Integer b);
	public Integer subtract(Integer a, Integer b);
	public Long multiply(Integer a, Integer b);
	public Integer divide(Integer a, Integer b) throws ArithmeticException;
}
