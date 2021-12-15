import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingDemo {
	public static void main(String[] args) {
		
		String Password="Vaadalkjd@123";
		System.out.println(Password);
		
		
		Encoder encoder=Base64.getEncoder();
		String encoded=encoder.encodeToString(Password.getBytes());
		System.out.println(encoded);
		
		Decoder decoder=Base64.getDecoder();
		byte[] decoded=decoder.decode(encoded.getBytes());
		System.out.println(new String(decoded));
	}

}
