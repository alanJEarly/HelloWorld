package GameMaker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InputMap {
    public static Map<String, String> map() {
        SetUp setUp = new SetUp(); // Instantiate the SetUp object

        String fileName = setUp.inputMap; // Use the inputMap property from the SetUp object

        Map<String, String> directionMap = new HashMap<>();

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Check if the line contains '~', and if so, ignore the line
                if (line.contains("~")) {
                    continue;
                }

                String[] commandData = line.split(">");
                if (commandData.length == 2) {
                    String command = commandData[0].trim();
                    String action = commandData[1].trim().replace("\\n", "\n");
                    command=command.toLowerCase();
                    action=action.toLowerCase();
                    directionMap.put(command, action);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return directionMap; // Return the HashMap with custom commands and their actions
    }
}

