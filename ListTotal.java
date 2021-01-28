//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
  //Initialize int variable totalSum with value 0
  int totalSum = 0;
  //Start for loop with counter variable i, while i is less than the size of the list, and increment i by one after each iteration
  for(int i = 0; i < ray.size(); i++){
    //Get the value of the element at index i of the list and add it to total
    totalSum += ray.get(i);
  //End loop
  }
  //Return total
  return totalSum;
 }
}