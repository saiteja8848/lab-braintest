package service;

public class PersonalityCalculator {

	public String findYourBrainType(String options) {
		int[] data = findAnswers(options);
		String result="";
		int A= data[0]+data[1]+data[2]+data[4]+data[7]+data[9]+data[10]+data[11]+data[13]+data[17]+data[19];
		int B = data[3] +data[6]+data[6] + data[8] + data[12] + data[14] + data[15] +data[16]+ data[18]; 
		int X = 66 - A + B;
		if(X>=20&&X<=55) {
			result="leftbrained";
		}
		else if(X>=56&&X<=64) {
			result="noclearpreference";
		}
		else
			if(X>=65&&X<=100) {
				result="rightbrained";
			}
		for(int k=0;k<data.length;k++) {
			System.out.println("The answer for the question -"+(k+1)+" is "+data[k]);
		}
		System.out.println("Your total score is "+X);
		System.out.println("You are "+result);
		System.out.println();
		return result;		
	}

	public int[] findAnswers(String options) {
		String[] data = options.split(",");
		int[] a = new int[data.length];
		int j=0;
        for(int i=0;i<data.length;i++) {
        	a[j++]=Integer.parseInt(data[i]);
        }	
		return a;
	}

}