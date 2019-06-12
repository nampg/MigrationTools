package mytools;
import java.io.File;
import java.nio.charset.Charset;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("file.encoding"));
		try {
//			String someStringValue = "xxxxxxxxxああああああｄｓｆｇｓｄｆｇｓｄぁｋｌ；ｓx";
//			byte[] bytes = someStringValue.getBytes("Cp037"); // convert to EBCDIC bytes
//			OutputStream os = new FileOutputStream(new File("C:/Users/Administrator/Desktop/xxxx/clgv_JEF.dat"));
//			os.write(bytes);
         
//			BufferedReader b_reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:/Users/Administrator/Desktop/xxxx/clgv_JEF.dat")),"Cp037"));
//			
//			String xxx = b_reader.readLine();
//			System.out.println(xxx);
			
			
			
			File file = new File("C:/Users/Administrator/Desktop/xxxx/clgv_JEF.dat");
			byte[] getBytes = {};
	        getBytes = new byte[(int) file.length()];
	        InputStream is = new FileInputStream(file);
	        is.read(getBytes);
	        is.close();
	        String start = new String(getBytes);
//	        String start = new String(getBytes, "CP037");
	        
	        Charset charsetFrom = Charset.forName("Cp1047");
	        Charset charsetTo = Charset.forName("UTF-8");
	        System.out.println("clgv1:  "+start);
	        System.out.println("clgv2:  "+convertTO(start, charsetFrom, charsetTo));
	        
	        byte[] bytes1 = start.getBytes("UTF-8");
	        String newStr1 = new String(bytes1);
	        System.out.println(newStr1);
	        
	        
			
//			OutputStream os = new FileOutputStream(new File("C:/Users/Administrator/Desktop/xxxx/xxxx2.dat"));
//			os.write(bytes1);
	        
			
//			Charset charsetEBCDIC = Charset.forName("UTF-8");
//	        Charset charsetACSII = Charset.forName("CP037");
//	        Charset charsetACSII = Charset.forName("US-ASCII");

//	        String ebcdic = "あああああああｓだｓだｓｄじゃｓｋｄ";
//	        System.out.println("String EBCDIC: " + ebcdic);
//	        System.out.println("String converted to ASCII: " + convertTO(ebcdic, charsetEBCDIC, charsetACSII));
//
//	        String ascII = convertTO(ebcdic, charsetEBCDIC, charsetACSII);
//	        System.out.println("String ASCII: " + ascII);
//	        System.out.println("String converted to EBCDIC: " + convertTO(ascII, charsetACSII, charsetEBCDIC));
	        
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
	public static String convertTO(String dados, Charset encondingFrom, Charset encondingTo) {
        return new String(dados.getBytes(encondingFrom), encondingTo);
    }

}
