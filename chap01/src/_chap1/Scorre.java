package _chap1;

import java.util.Scanner;

public class Scorre {

	public static void main(String[] args) {
	int[] scores = { 98, 70, 45, 60, 83 } ;
	int max = 0;
	int min = 0;
	int sum = 0;
	for(int i = 0; i<scores.length; i++) {
		sum += scores[i];
		if(scores[i] > max)
			max = scores[i];
		if(scores[i] < min)
			min = scores[i];
	}
	System.out.println("총점 :" +sum);
	
	double avg = (double) sum / scores.length;
	System.out.println("평균 :" +avg);
	System.out.println("최고점수 :" +max);
	System.out.println("최저점수 :"  +min);
	
	
	}

}
