package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아_알파벳_ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'c') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == '=') {
						i++;
					} else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			} else if (str.charAt(i) == 'd') {

				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == 'z') {
						if (str.length() - 2 > i) {
							if (str.charAt(i + 2) == '=') {
								i=i+2;
							}

						}
					} else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			} else if (str.charAt(i) == 'l') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			} else if (str.charAt(i) == 'n') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}

			} else if (str.charAt(i) == 's') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}

			} else if (str.charAt(i) == 'z') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			count++;
		}
		System.out.println(count);
	}
}
