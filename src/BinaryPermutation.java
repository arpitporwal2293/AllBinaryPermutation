
public class BinaryPermutation {

	public static void allBinaryPermutation(int length, String prefix){
		//base case when the prefix is of required length
		if(length == 0){
			System.out.println(prefix);
		}else{
			//reduce the length and perform both case with 0 and 1
			allBinaryPermutation(length -1, prefix+"0");
			allBinaryPermutation(length -1, prefix+"1");
		}
	}
	
	public static void main(String[] args) {
		allBinaryPermutation(4, "");
	}
	
}
