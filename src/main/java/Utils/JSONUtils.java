package Utils;

import org.json.JSONObject;

public class JSONUtils {

    public static  String getJSONValue(String json, String key) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getString(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}