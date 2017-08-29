import java.util.*;
import java.io.*;

/*
	Testing code \\ for personal use only
*/

public class Iamgroot
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(new File("input.txt"));

		int[][] sample_data = new int[10][10];
		int[] Answers = new int[10];
		int i = 0; int j = 0;

		//default print //
		for(int tc=0;tc<10;tc++)
		{
			for(i=0;i<sample_data.length;i++)
			{
				for(j=0;j<sample_data[0].length;j++)
				{
					sample_data[i][j] = sc.nextInt();

					if(sample_data[i][j] == 1){
						//check if there is another one nearby
						System.out.print("[[1!]] "+sample_data[i][j] +" ");
					}else{
						System.out.print("["+i+"]["+j+"] "+sample_data[i][j] +" ");
					}
					// System.out.print("["+i+"]["+j+"] "+sample_data[i][j] +" ");
					// System.out.print(sample_data[i][j] +" ");
				}
				System.out.print("\n");
			}

			System.out.print("#"+tc);
			// System.out.println("Hello World!");

			for(i=0;i<sample_data.length;i++)
			{
				for(j=0;j<sample_data[0].length;j++){
					if(sample_data[j][i] == 1){
						Answers[i] = Answers[i] + 1;
					}
				}
				System.out.print(" ["+i+"]" + Answers[i]);
				Answers[i] = 0;
			}
			System.out.println("");
		}
		
	}

}