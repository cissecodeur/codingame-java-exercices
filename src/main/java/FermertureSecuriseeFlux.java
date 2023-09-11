import java.io.BufferedReader;
import java.io.Reader;
import java.io.IOException;

public class FermertureSecuriseeFlux {

    /*  Sujet :
    Question
           StreamPrinter.print(Reader reader) n'est pas robuste.
            Améliorez StreamPrinter.print(Reader reader)
   */
    /**
     * Reads from the given reader and print to stdout.
     */
    void print(Reader reader) {
        try (BufferedReader br = new BufferedReader(reader)) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            System.out.print(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    void printGoodVersion(Reader reader) throws IOException {
        try (BufferedReader br = new BufferedReader(reader)) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            System.out.print(sb.toString());
        }
    }

}
