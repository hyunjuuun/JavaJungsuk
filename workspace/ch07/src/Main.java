import java.util.*;

// "/a/a_v2.x", "/b/a.x", "/c/t.z", "/d/a/t.x", "/e/z/t_v1.z", "k/k/k/a_v9.x"

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String param = sc.nextLine();
		StringTokenizer st = new StringTokenizer(param, ", ");
		
		String[] files = new String[st.countTokens()];
		int n = 0;
		
		while(st.hasMoreTokens()) {
			files[n] = st.nextToken();
			n++;
		}
		
		for(String file: files)
			System.out.println(file);
		
		String[] files_ = new String[files.length];
		
		
		for(int i=0; i<files_.length; i++) {
			StringBuilder sb  = new StringBuilder(files[i]);
			files_[i] = sb.reverse().toString();
		}
		
		ArrayList<String> arrayList = new ArrayList<>();
		ArrayList<Integer> countList = new ArrayList<>();
		int count = 0;
		
		for(String file: files_) {

			int end=4;
			for(int i=4; i<file.length(); i++) {
				if(file.charAt(i) == '/') {
					end = i;
					break;
				}
			}
			
			String origin = file.substring(0,end) + "\"";
			origin = origin.substring(0,3) + origin.substring(origin.length()-2,origin.length());
			StringBuilder sb = new StringBuilder();
			sb.append(origin);
			sb.reverse();
			System.out.println(sb);

			origin = sb.toString();
			
			count++;
			if(!arrayList.contains(origin)) {
				arrayList.add(origin);
			}
			else {
				countList.add(count);
				count = 0;
			}
				
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\"");
		
		int i=0;
		
		for(String file: arrayList) {
			sb.append(file).append(", ").append(countList.get(i)).append("\"");;
			
			if(i != arrayList.size())
				sb.append(", ");
			i++;
		}
		
		System.out.println(sb);
		
		
			
		
		
		
		
	}
}

