import java.io.*;

public class Decoder {

    public static String[] decode() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int size = Integer.parseInt(in.readLine());

            String[] result = new String[(size + 1) / 2];
            int pos = 0;

            for (int i = 0; i < size; i++) {
                String store = in.readLine();

                if (i % 2 == 0) {
                    result[pos] = store;
                    pos++;
                }
            }
            

            return result;
        }
        catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {

        String[] output = decode();

        for (String word : output) {
            System.out.println(word);
        }
    }
}