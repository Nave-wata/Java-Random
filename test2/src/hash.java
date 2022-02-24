import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hash {
    public static void main(String[] args) {
        String etPass = "hoge";
        MessageDigest sha256 = null;
        try {
            sha256 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] sha256_result = sha256.digest(etPass.getBytes());
        String result = String.format("%x04", new BigInteger(1, sha256_result));
        System.out.println("result: " + result);
    }
}
