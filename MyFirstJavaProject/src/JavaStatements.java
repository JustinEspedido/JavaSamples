
public class JavaStatements {

	private static int[] numbers = {2, 30, 25, 15 ,20, 15, 30, 2};
	
	public static void main(String[] args) {
		//display number 30 and 15 if the array index number has a value of 30
		//display not equal to 30 or 15 if the array index number is not 30 and 15
		
		/*for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] == 30 && numbers[i] == 15) //if ("condition = boolean")
				System.out.println(numbers[i]);
			else
				System.out.println("Not equal to 30 or 15");
		}*/
		
		String name = "Hatdog";
		
		switch (name) 
		{
			case "Hatdog": 
			{
				System.out.println("day 1");
				break;
			}
			case "Eggs":
			{
				System.out.println("day 2");
				break;
			}
			case "Cheese":
			{
				System.out.println("day 3");
				break;
			}
			default:
				System.out.println("Out of day count");
		}
	}

}
