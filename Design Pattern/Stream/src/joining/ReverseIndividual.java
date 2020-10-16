package joining;

import java.util.Arrays; 
import java.util.stream.Collectors; 
  
// This code is contributed by Mayank Sharma 
public class ReverseIndividual { 
  
    public static void main(String[] args) { 
  
        String str = "Welcome to GFG"; 
          
        // Splitting the string based on space and reverse each part 
        // and then join 
        String result = Arrays.asList(str.split(" ")) 
                .stream() 
                .map(s -> new StringBuilder(s).reverse()) 
                .collect(Collectors.joining(" ")); 
  
        System.out.println(result); 
  
    } 
  
} 