package preIntermediate;

public class Task10 {
	
	public int [] findMaxSum (int [] ar){
		int[] arrayGreatest9 = new int[9];
		int maxResult = 0;
		int result = 0;
		for (int i=0; i < ar.length-8; i++) {
		result = (ar[i] * ar[i+1] * ar[i+2] * ar[i+3] * ar[i+4] *ar[i+5] * ar[i+6] * ar[i+7] * ar[i+8]);
		if (result > maxResult) {
			maxResult = result;
			arrayGreatest9[0] = ar[i];
			arrayGreatest9[1] = ar[i+1];
			arrayGreatest9[2] = ar[i+2];
			arrayGreatest9[3] = ar[i+3];
			arrayGreatest9[4] = ar[i+4];
			arrayGreatest9[5] = ar[i+5];
			arrayGreatest9[6] = ar[i+6];
			arrayGreatest9[7] = ar[i+7];
			arrayGreatest9[8] = ar[i+8];
		}
		}
		return arrayGreatest9;
	}
	public int maxSum (int [] ar){
		int[] arrayGreatest9 = new int[9];
		int maxResult = 0;
		int result = 0;
		for (int i=0; i < ar.length-8; i++) {
		result = (ar[i] * ar[i+1] * ar[i+2] * ar[i+3] * ar[i+4] *ar[i+5] * ar[i+6] * ar[i+7] * ar[i+8]);
		if (result > maxResult) {
			maxResult = result;
			arrayGreatest9[0] = ar[i];
			arrayGreatest9[1] = ar[i+1];
			arrayGreatest9[2] = ar[i+2];
			arrayGreatest9[3] = ar[i+3];
			arrayGreatest9[4] = ar[i+4];
			arrayGreatest9[5] = ar[i+5];
			arrayGreatest9[6] = ar[i+6];
			arrayGreatest9[7] = ar[i+7];
			arrayGreatest9[8] = ar[i+8];
		}
		}
		return maxResult;
	}
	public static void main (String[] args){
		System.out.println("The three adjacent digits in the 1000-digit number that have the greatest product"
				+ "are 9 × 9 × 8 = 648.\n"
				+ "731671765313306249192251196744265747423553491949349698352031277450632623957831\n"
				+ "801698480186947885184385861560789112949495459501737958331952853208805511125406\n"
				+ "987471585238630507156932909632952274430435576689664895044524452316173185640309\n"
				+ "871112172238311362229893423380308135336276614282806444486645238749303589072962\n"
				+ "904915604407723907138105158593079608667017242712188399879790879227492190169972\n"
				+ "088809377665727333001053367881220235421809751254540594752243525849077116705560\n"
				+ "136048395864467063244157221553975369781797784617406495514929086256932197846862\n"
				+ "248283972241375657056057490261407972968652414535100474821663704844031998900088\n"
				+ "952434506585412275886668811642717147992444292823086346567481391912316282458617\n"
				+ "866458359124566529476545682848912883142607690042242190226710556263211111093705\n"
				+ "442175069416589604080719840385096245544436298123098787992724428490918884580156\n"
				+ "166097919133875499200524063689912560717606058861164671094050775410022569831552\n"
				+ "0005593572972571636269561882670428252483600823257530420752963450\n"
				+ "\n"
				+ "Find the nine adjacent digits in the 1000-digit number that have the greatest product.\n"
				+ "What is the value of this product?\n"
				+ " ");
        System.out.println("======================= Solution ==============================");
		int[] ar = new int[] {7,3,1,6,7,1,7,6,5,3,1,3,3,0,6,2,4,9,1,9,2,2,5,1,1,9,6,7,4,4,2,6,5,7,4,7,4,2,3,5,5,3,4,9,1,
				9,4,9,3,4,9,6,9,8,3,5,2,0,3,1,2,7,7,4,5,0,6,3,2,6,2,3,9,5,7,8,3,1,8,0,1,6,9,8,4,8,0,1,8,6,9,4,7,8,8,5,1,
				8,4,3,8,5,8,6,1,5,6,0,7,8,9,1,1,2,9,4,9,4,9,5,4,5,9,5,0,1,7,3,7,9,5,8,3,3,1,9,5,2,8,5,3,2,0,8,8,0,5,5,1,
				1,1,2,5,4,0,6,9,8,7,4,7,1,5,8,5,2,3,8,6,3,0,5,0,7,1,5,6,9,3,2,9,0,9,6,3,2,9,5,2,2,7,4,4,3,0,4,3,5,5,7,6,
				6,8,9,6,6,4,8,9,5,0,4,4,5,2,4,4,5,2,3,1,6,1,7,3,1,8,5,6,4,0,3,0,9,8,7,1,1,1,2,1,7,2,2,3,8,3,1,1,3,6,2,2,
				2,9,8,9,3,4,2,3,3,8,0,3,0,8,1,3,5,3,3,6,2,7,6,6,1,4,2,8,2,8,0,6,4,4,4,4,8,6,6,4,5,2,3,8,7,4,9,3,0,3,5,8,
				9,0,7,2,9,6,2,9,0,4,9,1,5,6,0,4,4,0,7,7,2,3,9,0,7,1,3,8,1,0,5,1,5,8,5,9,3,0,7,9,6,0,8,6,6,7,0,1,7,2,4,2,
				7,1,2,1,8,8,3,9,9,8,7,9,7,9,0,8,7,9,2,2,7,4,9,2,1,9,0,1,6,9,9,7,2,0,8,8,8,0,9,3,7,7,6,6,5,7,2,7,3,3,3,0,
				0,1,0,5,3,3,6,7,8,8,1,2,2,0,2,3,5,4,2,1,8,0,9,7,5,1,2,5,4,5,4,0,5,9,4,7,5,2,2,4,3,5,2,5,8,4,9,0,7,7,1,1,
				6,7,0,5,5,6,0,1,3,6,0,4,8,3,9,5,8,6,4,4,6,7,0,6,3,2,4,4,1,5,7,2,2,1,5,5,3,9,7,5,3,6,9,7,8,1,7,9,7,7,8,4,
				6,1,7,4,0,6,4,9,5,5,1,4,9,2,9,0,8,6,2,5,6,9,3,2,1,9,7,8,4,6,8,6,2,2,4,8,2,8,3,9,7,2,2,4,1,3,7,5,6,5,7,0,
				5,6,0,5,7,4,9,0,2,6,1,4,0,7,9,7,2,9,6,8,6,5,2,4,1,4,5,3,5,1,0,0,4,7,4,8,2,1,6,6,3,7,0,4,8,4,4,0,3,1,9,9,
				8,9,0,0,0,8,8,9,5,2,4,3,4,5,0,6,5,8,5,4,1,2,2,7,5,8,8,6,6,6,8,8,1,1,6,4,2,7,1,7,1,4,7,9,9,2,4,4,4,2,9,2,
				8,2,3,0,8,6,3,4,6,5,6,7,4,8,1,3,9,1,9,1,2,3,1,6,2,8,2,4,5,8,6,1,7,8,6,6,4,5,8,3,5,9,1,2,4,5,6,6,5,2,9,4,
				7,6,5,4,5,6,8,2,8,4,8,9,1,2,8,8,3,1,4,2,6,0,7,6,9,0,0,4,2,2,4,2,1,9,0,2,2,6,7,1,0,5,5,6,2,6,3,2,1,1,1,1,
				1,0,9,3,7,0,5,4,4,2,1,7,5,0,6,9,4,1,6,5,8,9,6,0,4,0,8,0,7,1,9,8,4,0,3,8,5,0,9,6,2,4,5,5,4,4,4,3,6,2,9,8,
				1,2,3,0,9,8,7,8,7,9,9,2,7,2,4,4,2,8,4,9,0,9,1,8,8,8,4,5,8,0,1,5,6,1,6,6,0,9,7,9,1,9,1,3,3,8,7,5,4,9,9,2,
				0,0,5,2,4,0,6,3,6,8,9,9,1,2,5,6,0,7,1,7,6,0,6,0,5,8,8,6,1,1,6,4,6,7,1,0,9,4,0,5,0,7,7,5,4,1,0,0,2,2,5,6,
				9,8,3,1,5,5,2,0,0,0,5,5,9,3,5,7,2,9,7,2,5,7,1,6,3,6,2,6,9,5,6,1,8,8,2,6,7,0,4,2,8,2,5,2,4,8,3,6,0,0,8,2,
				3,2,5,7,5,3,0,4,2,0,7,5,2,9,6,3,4,5,0};
		Task10 One = new Task10();
		System.out.println("The greatest product is");
		beginner.Task1.showArray((One.findMaxSum(ar)));
		System.out.println("Sum = " + One.maxSum(ar));
		
	}
}