//The main idea is to store the last seen positions of current (i-th) characters in both strings.
//If previously stored positions are different then we know that the fact
//they're occuring in the current i-th position simultaneously is a mistake.
//We could use a map for storing but as we deal with chars which are basically
//ints and can be used as indices we can do the whole thing with an array.
//
//Check the code below. Happy coding!


public class Solution {
	public static boolean isIsomorphic(String s1, String s2) {
        int[] m = new int[512];
        for(int j = 0 ; j < m.length; j++)
        				System.out.print(m[j]);

        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i)+256])
            				return false;
            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;

            if(i == 0){
            	System.out.println();
            	System.out.print(s1.charAt(i));
            	System.out.print((int)s1.charAt(i));
            	System.out.println();
            	System.out.print(s2.charAt(i));
            	System.out.print((int)s2.charAt(i) + 256);
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isIsomorphic("egg","add"))
			System.out.println("true");
	}

}
