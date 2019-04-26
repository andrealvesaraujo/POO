package Questão1;

public class StringUtils {
	// Questão 2:
	public int quantasVezes(String s, String r) {
		String r2 = " " + r + " ";
		String s2 = s.replaceAll(r, r2);
		String[] str = s2.split(" ");
		int cont = 0;
		for (int i = 0; i < str.length; i++) {
			if (r.equals(str[i])) {
				cont++;
			}
		}
		return cont;
	}

	// Questão 2:
	public boolean isPalindroma(String s) {
		char[] c = s.toCharArray();
		String r = "";
		for (int i = c.length - 1; i >= 0; i--) {
			r += c[i];
		}
		return s.equalsIgnoreCase(r);
	}

}