import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	
	
	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testAddMediumPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testAddLargePositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testAddZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testAddSmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testAddMediumNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-100));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testAddLargeNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractSmallPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractMediumPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractLargePositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractSmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractMediumNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-100));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractLargeNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testMultiplySmallPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testMultiplyMediumPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testMultiplyLargePositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testMultiplyZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testMultiplySmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testMultiplyMediumNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-100));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testMultiplyLargeNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testDivideSmallPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testDivideMediumPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testDivideLargePositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testDivideZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testDivideSmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}

}
