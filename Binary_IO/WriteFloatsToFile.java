import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFloatsToFile {

    public static void main(String[] args) throws IOException {
        String fileName = "floats.dat";
        int numFloats = 100;
        float min = 1.0f;
        float max = 100.0f;

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int i = 0; i < numFloats; i++) {
                float randomFloat = (float) (Math.random() * (max - min)) + min;
                dataOutputStream.writeFloat(randomFloat);
            }
            System.out.println("100 floats written to " + fileName + " successfully!");
        }
    }
}

