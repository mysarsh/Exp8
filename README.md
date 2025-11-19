# 📱 Android Lab - Experiment 8: Asynchronous Data Fetching and JSON Parsing

## ✨ Overview

This Android experiment demonstrates how to **fetch JSON data asynchronously from a web API** and parse it into Java objects to be displayed on the UI. The app uses `AsyncTask` to handle background network operations and a custom parser to convert JSON data into `Student` objects.

---

## 🧩 Project Structure

```
com.example.exp8/
│
├── MainActivity.java              # Main UI logic, handles button click and displays student data
├── ConnectionAsyncTask.java       # AsyncTask that handles the background HTTP connection
├── HttpManager.java               # Utility class for making HTTP GET requests
├── Student.java                   # POJO representing student data (id, name, age)
├── StudentJsonParser.java         # Parses JSON array string into List<Student>
└── res/layout/activity_main.xml   # Layout file for the main activity
```

---

## 📌 Features

- Fetches JSON data from a remote URL using `HttpURLConnection`.
- Parses the JSON array into a list of `Student` objects.
- Displays student information dynamically using `TextView` elements.
- Uses `ProgressBar` to indicate loading state.
- Updates button text based on connection state.

---

## 🛠️ How It Works

1. **User clicks "Get Data" button** in `MainActivity`.
2. `ConnectionAsyncTask` is executed with the API URL.
3. The `HttpManager` performs a GET request and returns raw JSON data.
4. JSON is parsed using `StudentJsonParser` into a list of `Student` objects.
5. `MainActivity` dynamically creates `TextView`s and displays each student.

---

## 🔗 API Endpoint Used

```
https://mocki.io/v1/4c97a1a6-5996-4476-a7b6-334e062e424f
```

The response is expected to be a JSON array with objects like:
```json
[
  {
    "id": 1,
    "name": "Alice",
    "age": 20
  },
  {
    "id": 2,
    "name": "Bob",
    "age": 22
  }
]
```

---

## 🖼️ UI Layout (activity_main.xml)

- **Button**: Triggers data fetching
- **ProgressBar**: Shown during loading
- **LinearLayout**: Populated dynamically with `TextView`s for each student

---

## 🧪 Testing

1. Run the app on an emulator or Android device.
2. Tap the **"Get Data"** button.
3. Watch the **progress bar** appear and disappear.
4. See **student data** displayed below the button.

---

## ✅ Expected Output

After tapping the button, you should see:

```
Student{
ID= 1
name= Alice
age= 20.0
}

Student{
ID= 2
name= Bob
age= 22.0
}
...
```

---

## 📦 Requirements

- Android Studio
- Internet permission in `AndroidManifest.xml`:
```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

---