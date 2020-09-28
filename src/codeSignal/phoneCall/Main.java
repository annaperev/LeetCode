package codeSignal.phoneCall;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.firstNotRepeatingCharacter("ababcababacaba"));



        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("test-22.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;
            JSONArray solutions = (JSONArray) jsonObject.get("a");
            Object[] o = solutions.toArray();
            int [] a = new int [o.length];
            for (int i=0; i<o.length;i++){
                a[i] = Integer.valueOf(o[i].toString());
            }

            System.out.println(LocalDateTime.now());
//            Solution solution = new Solution();
//            System.out.println(solution.firstDuplicate(a));
            System.out.println(LocalDateTime.now());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}
