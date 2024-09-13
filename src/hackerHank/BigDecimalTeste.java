package hackerHank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BigDecimalTeste {
	
	public static void main(String[] args) {
	
		BigDecimal bd1 = new BigDecimal("0.2");
		BigDecimal bd2 = BigDecimal.valueOf(0.2);
		
		System.out.println(bd1);
		System.out.println(bd2);
		BigDecimal result = bd2.add(bd1);
		
		System.out.println(result);
		
		List<BigDecimal> lista = Arrays.asList(BigDecimal.valueOf(0.2),BigDecimal.valueOf(0.5));
		
		Comparator<BigDecimal> desc = (a, b) -> b.compareTo(a); 
		
		lista.sort(desc);
		
		System.out.println(lista);
			
		
	}
}
