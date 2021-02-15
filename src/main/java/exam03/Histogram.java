package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {
    public String createHistogram(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();

        String line;

        while ((line = reader.readLine()) != null) {
            int i = Integer.parseInt(line);

            buildTheString(sb, i);
        }
        return sb.toString();
    }

    private void buildTheString(StringBuilder sb, int i) {
        for (int h = 0; h < i; h++) {
            sb.append("*");
        }
        sb.append("\n");
    }
}
