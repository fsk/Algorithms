package org.fsk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ToJSON<T> {

    public void fromResultToJSON(Result<T> result) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);


        File jsonFile = new File("result.json");
        Map<String, Object> resultMap = new HashMap<>();

        if (jsonFile.exists()) {
            resultMap = mapper.readValue(jsonFile, Map.class);
        }

        String mapKey = result.getQuestion() + " => " + result.getMethodName() +
                " == " + result.getExecutionTime() + "NS";

        resultMap.put(mapKey, result);

        mapper.writeValue(jsonFile, resultMap);

        System.out.println("Update JSON File");

    }

}
