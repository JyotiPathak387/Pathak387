package demo;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int coll=sc.nextInt();
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("1");
			}
			System.out.println("");
		}
	}

}
