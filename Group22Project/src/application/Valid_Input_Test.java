package application;

public class Valid_Input_Test {

	public static void main(String[] args) {
		
		
		Valid_Input test_me = new Valid_Input();
		
		
		//I have three methods at the moment, getElement, getSymbol and Test
		
		//Test will return the element if the proper element was inputed.
		//Test will return a symbol if the symbol was inputted. 
		
		
		//getSymbol will get the symbol of a real element
		//getElement will het the element of a real symbol 
		
		System.out.println(test_me.getElement("FE"));
		
		System.out.println(test_me.getElement("MG"));
		
		
		System.out.println(test_me.getSymbol("IRON"));
		
		System.out.println(test_me.getSymbol("mAGnesium"));
		
		
		System.out.println(test_me.getElement("Nothing"));
		
		System.out.println(test_me.getSymbol("Nothing"));
		
		System.out.println(test_me.getAtomicWeight("Fe"));
		
		System.out.println(test_me.getAtomicWeight("mAGnesium"));
		
	}

}
