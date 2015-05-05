import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no_of_testcase=s.nextInt();
		int cycles;
		int height;
		String output="";
		for(int i=1;i<=no_of_testcase;i++)
		{
			height=1;
			cycles=s.nextInt();
			for(int j=1;j<=cycles;j++){
				if(j%2==1)height*=2;
				else height+=1;
			}
			output+=height+"\n";
		}
		System.out.print(output);
    }
}