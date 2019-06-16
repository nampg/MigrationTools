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
			
//			Charset charsetFrom = Charset.forName("CP037");
			Charset charsetFrom1 = Charset.forName("x-Fujitsu-EBCDIC");
			Charset charsetFrom2 = Charset.forName("x-Fujitsu-EBCDIK");
			Charset charsetFrom3 = Charset.forName("x-Fujitsu-ASCII");
			Charset charsetFrom4 = Charset.forName("x-Fujitsu-JEF");
			Charset charsetFrom5 = Charset.forName("x-Fujitsu-JEF-EBCDIC");
			Charset charsetFrom6 = Charset.forName("x-Fujitsu-JEF-EBCDIK");
			Charset charsetFrom7 = Charset.forName("x-Fujitsu-JEF-ASCII");
			Charset charsetFrom8 = Charset.forName("x-Fujitsu-JEF-HanyoDenshi");
			Charset charsetFrom9 = Charset.forName("x-Fujitsu-JEF-HanyoDenshi-EBCDIC");
			Charset charsetFrom10 = Charset.forName("x-Fujitsu-JEF-HanyoDenshi-EBCDIK");
			Charset charsetFrom11 = Charset.forName("x-Fujitsu-JEF-HanyoDenshi-ASCII");
			
			Charset charsetFrom = charsetFrom5;
			Charset charsetTo = Charset.forName("UTF-8");
			
			
			File fileIn = new File("C:/Users/Administrator/Desktop/TestEncode/JEF/out.dat");
			File fileOut = new File("C:/Users/Administrator/Desktop/TestEncode/JEF/out1.dat");
			File fileOutUtf8 = new File("C:/Users/Administrator/Desktop/TestEncode/JEF/revertUtf8.dat");
			byte[] getBytes = {};
	        getBytes = new byte[(int) fileIn.length()];
	        InputStream is = new FileInputStream(fileIn);
	        is.read(getBytes);
	        is.close();
	        String start = new String(getBytes, charsetFrom);
	        
	        System.out.println("clgv1:  "+start);
	        
	        byte[] bytes1 = start.getBytes(charsetFrom);
	        OutputStream os = new FileOutputStream(fileOut);
	        os.write(bytes1);
	        os.close();
	        String newStr1 = new String(bytes1);
	        System.out.println(newStr1);
	        
	        OutputStream osUtf8 = new FileOutputStream(fileOutUtf8);
	        osUtf8.write(start.getBytes(charsetTo));
	        osUtf8.close();
			
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
