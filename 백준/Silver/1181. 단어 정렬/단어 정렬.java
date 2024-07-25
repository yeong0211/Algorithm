import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
   
    	int n = Integer.parseInt(br.readLine());
    	String [] arr = new String[n];
    	for(int i=0;i<n;i++) {
    		arr[i] = br.readLine();
    	}
    	
    	// 길이 비교 -> 문자 비교를 위해 sort 메서드의 인자로 comparator 재정의
    	Arrays.sort(arr, new Comparator<String>() {
    		public int compare(String s1, String s2) {
				
    			if(s1.length()==s2.length()) return s1.compareTo(s2);
    			else return s1.length()-s2.length();
			}});
    	
    	sb.append(arr[0]).append('\n');
    	for(int i=1;i<n;i++) {
    		if(!arr[i].equals(arr[i-1])) sb.append(arr[i]).append('\n');
    	}
    	System.out.println(sb);
    }
}