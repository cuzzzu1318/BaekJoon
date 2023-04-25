
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ;i<T;i++) {
			String[] s = br.readLine().split(" ");
			int H = Integer.parseInt(s[0]);
			int W = Integer.parseInt(s[1]);
			int N = Integer.parseInt(s[2]);
			
			String floor = Integer.toString(N%H);
			String room = Integer.toString(N/H+1);
			if(floor.equals("0")) {
				floor = s[0];
				room = "1";
			}
			
			if(room.length()==1) {
				room = "0"+room;
			}
			bw.write(floor+room+"\n");
			
			
		}
		
		bw.flush();
		bw.close();
		
	}
	
	
}