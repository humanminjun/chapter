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
	System.out.println("���� :" +sum);
	
	double avg = (double) sum / scores.length;
	System.out.println("��� :" +avg);
	System.out.println("�ְ����� :" +max);
	System.out.println("�������� :"  +min);
	
	
	}

}
