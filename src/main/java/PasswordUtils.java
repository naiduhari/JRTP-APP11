import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordUtils {
	
	public static String encode(String Text) {
		Encoder encoder= Base64.getEncoder();
		return encoder.encodeToString(Text.getBytes());
		
	}
	
	public static String decode(String encodeText) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode=decoder.decode(encodeText);
		return new String(decode);
	}
	
	public static void main(String[] args) {
		String encode=PasswordUtils.encode("harikrishna");
		System.out.println(encode);
		
		
		String decode =PasswordUtils.decode(encode);
		System.out.println(decode);
	}

}
