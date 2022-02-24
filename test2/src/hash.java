import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hash {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String etPass = "hoge";
        MessageDigest sha256 = null;
        for (int i = 0; i < 100; i++) {

            try {
                sha256 = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            byte[] sha256_result = sha256.digest(etPass.getBytes());
            String result = String.format("%x04", new BigInteger(1, sha256_result));
        }
        long end = System.currentTimeMillis();
        System.out.println("result: " + (end - start));
    }
}
