package com.example.json_parsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        uni objetuni = new uni("superior",222);
//        Gson obj = new Gson();
//        String result = obj.toJson(objetuni);
//        TextView tv = findViewById(R.id.myTV);
//
//
//        String myjson = "{ \"name\":ali , \"dob\":21,\"phone\":0120120}";
//        User objuser = obj.fromJson(myjson,User.class);
////        tv.setText("Name:"+objuser.getName()+"\n"+"Phone:"+objuser.getPhone()+"\n");
//        Gson obj = new Gson();
//        uni myuni = new uni("superior",2002,new uniDepart("CS"));
//        String nestedJsonstring = obj.toJson(myuni);
//        TextView tv = findViewById(R.id.myTV);
//        tv.setText(nestedJsonstring);
//
//        subject sub = new subject("MAd");
//        User myuser = new User("ali",12,233,sub);
//        String objetserilized = obj.toJson(myuser);
//        tv.setText(objetserilized);
//
//
//
//
//        String newMyJson = "{\"name\":\"Hamza\",\"dob\":3,\"phone\":21212,\"subj\":{\"nam\":\"MAD\"}}";
//        User objuser = obj.fromJson(newMyJson,User.class);
//
//        tv.setText("Name : "+objuser.getName()+"\nSubject : "+objuser.getSubj().getName());
        Gson obj = new Gson();

//
//        String Arraystring = "[{\"nam\":\"MAD\"},{\"nam\":\"WAD\"}]";
//        subject[] subjects = obj.fromJson(Arraystring,subject[].class);
//
//        String objectJson = "\"subjname\":\"Maths\",\"q1\":{\"que\":\"6+7\",\"opt1\":[\"2\",\"3\",\"15\"]}";
//
//        Quiz myquiz = obj.fromJson(objectJson,Quiz.class);
        String[] ar = {"2","32","1"};
        Quiz myquiz1 = new Quiz("Maths",new Question("2+2",ar));
     String myjson = obj.toJson(myquiz1);
//        String myjson2 = "\"q1\":{\"opt1\":[\"Or\",\"Is\",\"My name\",],\"que\":\"This -- a good girl\"},\"subjname\":\"English\"";
//        Quiz myquiz2 = obj.fromJson(myjson2,Quiz.class);
       String str =  "{\"q1\":{\"opt1\":[\"2\",\"32\",\"1\"],\"que\":\"2+2\"},\"subjname\":\"Maths\"}";
            Quiz my = obj.fromJson(str,Quiz.class);



    }
}
