import java.lang.String;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args)  {

		try {

			// 5. average of squares of an int array
			Arrays.stream(new int[] {2, 4, 6, 8, 10})
				.map(x -> x * x).mapToDouble(x -> x)
				.average()
				.ifPresent(System.out::println);
			
 
		} 

		catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
