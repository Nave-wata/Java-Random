import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class hash {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String etPass = "hoge";
        MessageDigest sha256 = null;
        try {
            sha256 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10000; i++) {
            byte[] sha256_result = sha256.digest(etPass.getBytes());
            etPass = String.format("%x04", new BigInteger(1, sha256_result));
        }
        System.out.println(etPass);

        long end = System.currentTimeMillis();
        System.out.println("result: " + ((double) (end - start) / 1000));
    }
}
