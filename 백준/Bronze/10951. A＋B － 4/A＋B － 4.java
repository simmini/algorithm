

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

	 int a=0;
	 int b=0;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 StringBuilder sb=new StringBuilder();
	 String str;
	 while((str=br.readLine())!=null) {
	 StringTokenizer st=new StringTokenizer(str," ");
	 a=Integer.parseInt(st.nextToken());
	 b=Integer.parseInt(st.nextToken());
	 sb.append(a+b).append("\n");
	 }
	 System.out.println(sb);

	}
}
