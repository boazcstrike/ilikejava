import java.util.*;
import java.io.*;

public class Iamgroot{
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(new File("input.txt"));

		int[][] sample_data = new int[10][10];
		int[] Answers = new int[10];
		int i = 0; int j = 0;

		for(int tc=0;tc<10;tc++){
			for(i=0;i<sample_data.length;i++){
				for(j=0;j<sample_data[0].length;j++){
					sample_data[i][j] = sc.nextInt();
					System.out.print("["+i+"]["+j+"] "+sample_data[i][j] +" ");
					// System.out.print(sample_data[i][j] +" ");
				}
				System.out.print("\n");
			}
			System.out.print("#"+tc);
			// System.out.println("Hello World!");

			for(i=0;i<sample_data.length;i++){
				Answers[i] = 0;
				System.out.print(" " + Answers[i]);
			}
		System.out.println("");	
		}

	}
}