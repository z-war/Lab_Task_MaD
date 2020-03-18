package com.example.json_parsing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {
    NavigationView objectnavigationview;
    DrawerLayout objectDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        uni objetuni = new uni("superior",222);
//
//        String result = obj.toJson(objetuni);
//        TextView tv = findViewById(R.id.myTV);
//
//

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
//        Gson obj = new Gson();

//
//        String Arraystring = "[{\"nam\":\"MAD\"},{\"nam\":\"WAD\"}]";
//        subject[] subjects = obj.fromJson(Arraystring,subject[].class);
//
//        String objectJson = "\"subjname\":\"Maths\",\"q1\":{\"que\":\"6+7\",\"opt1\":[\"2\",\"3\",\"15\"]}";
//
//        Quiz myquiz = obj.fromJson(objectJson,Quiz.class);
//        String[] ar = {"2","32","1"};
//        Quiz myquiz1 = new Quiz("Maths",new Question("2+2",ar));
//     String myjson = obj.toJson(myquiz1);
//        String myjson2 = "\"q1\":{\"opt1\":[\"Or\",\"Is\",\"My name\",],\"que\":\"This -- a good girl\"},\"subjname\":\"English\"";
//        Quiz myquiz2 = obj.fromJson(myjson2,Quiz.class);
//       String str =  "{\"q1\":{\"opt1\":[\"2\",\"32\",\"1\"],\"que\":\"2+2\"},\"subjname\":\"Maths\"}";
//            Quiz my = obj.fromJson(str,Quiz.class);
//            Gson exposedg = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//            String exposed = exposedg.toJson(myquiz1);
//allwork();

    serialization();
    deserialization();
    allwork();
    }

    public void deserialization()
    {
        Gson obj = new Gson();
        String myjson = "{ \"name\":ali , \"dob\":21,\"phone\":0120120}";

        User objuser = obj.fromJson(myjson,User.class);

    }

    public void serialization()
    {
        Gson obj = new Gson();
        subject sbj = new subject("Name");
        User obj2 = new User("Haider",22,1231243 ,sbj );
        String json = obj.toJson(obj2);

    }

    public void allwork()
    {
        try {
            objectnavigationview = findViewById(R.id.NavigationView);
            objectDrawerLayout = findViewById(R.id.drawer);
            objectnavigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    if(item.getItemId()== R.id.item_1)
                    {
                        Toast.makeText(MainActivity.this, "First Song Playing", Toast.LENGTH_SHORT).show();
                        closeMyDrawer();
                        return true;
                    }
                    else if(item.getItemId()== R.id.item2)
                    {
                        Toast.makeText(MainActivity.this, "Second Song Playing", Toast.LENGTH_SHORT).show();
                        closeMyDrawer();
                        return true;

                    }
                    return false;
                }
            });
        }catch (Exception e)
        {
            Toast.makeText(this, "Error in All Work"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void closeMyDrawer()
    {
        try
        {
            objectDrawerLayout.closeDrawer(GravityCompat.START);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "closeMyDrawer:"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
