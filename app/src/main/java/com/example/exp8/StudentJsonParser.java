package com.example.exp8;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
public class StudentJsonParser {
    public static List<Student> getObjectFromJson(String json) {
        List<Student> students;
        if (json == null || json.isEmpty()) {
            Log.e("JSON", "Input JSON is null or empty");
            return new ArrayList<>();
        }
        try {
            JSONArray jsonArray = new JSONArray(json);
            students = new ArrayList<>();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = new JSONObject();
                jsonObject = (JSONObject) jsonArray.get(i);
                Student student = new Student();
                student.setID(jsonObject.getInt("id"));
                student.setName(jsonObject.getString("name"));
                student.setAge(jsonObject.getDouble("age"));
                students.add(student);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        return students;
    }
}

