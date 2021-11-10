package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        String inputPath = "src/labs_examples/input_output/files/char_data.txt";
        String outputPath = "src/labs_examples/input_output/files/char_data_output.txt";

        BufferedInputStream input = null;
        BufferedOutputStream output = null;

        byte[] buffer = new byte[5];
        int bytesRead = 0;

        try {

            input = new BufferedInputStream(new FileInputStream(inputPath));
            output = new BufferedOutputStream(new FileOutputStream(outputPath));

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer);
            }
        } catch(IOException exc){
            exc.printStackTrace();
        } finally {
            try {
                if (input != null){
                    input.close();
                }
                if (output != null){
                    output.close();
                }
            } catch(IOException exc){
                exc.printStackTrace();
            }

        }
    }
}