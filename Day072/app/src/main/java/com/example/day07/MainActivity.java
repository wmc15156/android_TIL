package com.example.day07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    @Override
    // Activity가 생성될 때 자동으로 호출된다.
    // 화면 회전이 발생했을 대 자동으로 호출된다.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(this);

        Log.d("test", "onCreate 호출");
    }

    @Override
    // OnCreate 메서드 호출 이후에 자동으로 호출
    // Activity가 정지 상태가 되었다가 활동상태로 돌아올때 호출(홈 버튼 누를때 정지가됨)
    protected void onStart() {
        super.onStart();
        Log.d("test", "on Start");
    }

    @Override
    // onStart 메서드가 호출된 이후에 자동으로 호출된다.
    // Activity가 일시정지 되었다가 다시 돌아 올때 호출(현재 activity에 팝업창 같은게 떳을때)
    protected void onResume() {
        super.onResume();

        Log.d("test", "onResume 호출");
    }

    @Override
    // Activity가 정지상태가 되었다가 활동상태로 돌아갈때 onStart 메서드전에 호출된다.
    protected void onRestart() {
        super.onRestart();
        Log.d("test", "onRestart 호출");
    }

    @Override
    // Activity가 일시정지 상태가 될때 호출된다.
    // 화면상에서 완전히 사라지거나 현재화면 위에 작은 팝업창 같은것이 나타날 때 호출
    protected void onPause() {
        super.onPause();
        Log.d("test", "onPause 호출");
    }

    @Override
    // Activity가 화면에서 사라질 때 호출된다.
    protected void onStop() {
        super.onStop();
        Log.d("test", "onStop 호출");
    }

    @Override
    // 현재 Activity의 수행이 완전히 종료되어 메모리상에서 제거될때 호출;
    protected void onDestroy() {
        super.onDestroy();

        Log.d("test", "onDestroy 호출");
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));

        startActivity(intent);
    }
}