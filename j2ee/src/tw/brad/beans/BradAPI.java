package tw.brad.beans;

import tw.brad.j2ee.BCrypt;

public class BradAPI {
	public static String getLottery() {
		return "" + (int)(Math.random()*49+1);
	}
	
	public static String sayYa(String name) {
		return "Ya! " + name;
	}
	
	public static String getHeaderFilename(String header) {
		int start = header.indexOf("filename");
		String temp = header.substring(start+10);
		String filename = temp.substring(0, temp.lastIndexOf('"'));
		//System.out.println(filename);
		
		int s1 = filename.lastIndexOf("\\");
		String retFile = null;
		if (s1 >= 0) {
			retFile = filename.substring(s1+1);
		}else {
			retFile = filename;
		}
		return retFile;
	}
	public static boolean ckPasswd(String org, String cPasswd) {
		boolean isRight = false;
		if (cPasswd.startsWith("$2a$")) {
			isRight = BCrypt.checkpw(org, cPasswd);
		}
		
		return isRight;
		
	}
	
}
