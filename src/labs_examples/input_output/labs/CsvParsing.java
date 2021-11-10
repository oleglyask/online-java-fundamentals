package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvParsing {

    public static void main(String[] args) {

        BufferedWriter output = null;

        String path = "src/labs_examples/input_output/files/family_members.csv";

        ArrayList<FamilyMember> members = new ArrayList<>();
        String line = new String();

        try (BufferedReader input = new BufferedReader(new FileReader(path))){

            while ((line = input.readLine()) != null){

                String[] values = line.split(",");
                members.add(initializeMember(values));

            }

        } catch (IOException exc){
            exc.printStackTrace();
        }

        for (FamilyMember member : members){
            System.out.println(member.toString());
        }


    }

    public static FamilyMember initializeMember(String[] values){

        FamilyMember person = new FamilyMember();

        person.setName(values[0]);
        person.setRank(values[1]);
        person.setFavColor(values[2]);
        person.setAge(Integer.parseInt(values[3]));

        return person;

    }

}
