package tw.brad.j2ee;

public class BradAPI {

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
	
}
