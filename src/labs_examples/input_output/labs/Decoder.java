package labs_examples.input_output.labs;

import java.io.*;

public class Decoder {

    public static void main(String[] args) {

        copyDecoder();
        rewriteDecoder();


    }

    //Decodes the file and replaces a and e with - and ~
    public static void copyDecoder(){
        String inputPath = "src/labs_examples/input_output/files/char_data.txt";
        String outputPath = "src/labs_examples/input_output/files/char_data_output.txt";

        FileInputStream input = null;
        FileOutputStream output = null;

        int bytesRead = 0;

        try {

            input = new FileInputStream(inputPath);
            output = new FileOutputStream(outputPath);

            while ((bytesRead = input.read()) != -1) {

                if (((char) bytesRead) == 'a' ){
                    bytesRead = '-';
                } else if (((char) bytesRead) == 'e' ){
                    bytesRead = '~';
                }
                output.write(bytesRead);
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

    //Rewrites the file decoding it to the original state
    public static void rewriteDecoder(){

        String inputPath = "src/labs_examples/input_output/files/char_data_output.txt";
        String outputPath = "src/labs_examples/input_output/files/char_data_rewrite.txt";

        FileInputStream input = null;
        FileOutputStream output = null;

        int bytesRead = 0;

        try {

            input = new FileInputStream(inputPath);
            output = new FileOutputStream(outputPath);

            while ((bytesRead = input.read()) != -1) {

                if (((char) bytesRead) == '-' ){
                    bytesRead = 'a';
                } else if (((char) bytesRead) == '~' ){
                    bytesRead = 'e';
                }
                output.write(bytesRead);
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
