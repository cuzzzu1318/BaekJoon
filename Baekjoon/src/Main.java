
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		Map<Integer, String> pokemon = new HashMap<>();
		Map<String, Integer> pokemonNum = new HashMap<>();
		for(int i =1;i<=N;i++) {
			String pm = br.readLine();
			pokemon.put(i, pm);
			pokemonNum.put(pm, i);
		}
		for(int i = 0;i<M;i++) {
			String c = br.readLine();
			if(c.charAt(0)>='A'&&c.charAt(0)<='Z') {
				bw.write(pokemonNum.get(c)+"\n");
			}else {
				bw.write(pokemon.get(Integer.parseInt(c))+"\n");
			}
		}


		
		bw.flush();
		bw.close();
		
	}
	
	
}