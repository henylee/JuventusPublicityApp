package tjeit.co.kr.juventuspublicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import tjeit.co.kr.juventuspublicapp.util.ServerUtil;

public class SignUpActivity extends BaseActivity {

    private android.widget.EditText idEdt;
    private android.widget.EditText pwEdt;
    private android.widget.EditText nameEdt;
    private android.widget.EditText phoneEdt;
    private android.widget.Button signupBtn;
    private EditText addressEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isIDOk = !idEdt.getText().toString().equals("");
                if (!isIDOk) {
                    Toast.makeText(mContext, "아이디를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                boolean isPwOk = !pwEdt.getText().toString().equals("");
                if (!isPwOk) {
                    Toast.makeText(mContext, "비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                boolean isNameOk = !nameEdt.getText().toString().equals("");
                if (!isNameOk) {
                    Toast.makeText(mContext, "이름을 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                boolean isPhoneNumOk = !phoneEdt.getText().toString().equals("");
                if (!isPhoneNumOk) {
                    Toast.makeText(mContext, "전화번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                boolean isAddressOk = !addressEdt.getText().toString().equals("");
                if (!isPhoneNumOk) {
                    Toast.makeText(mContext, "주소를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                ServerUtil.sign_up(mContext, idEdt.getText().toString(), pwEdt.getText().toString(), nameEdt.getText().toString(), phoneEdt.getText().toString(), addressEdt.getText().toString(), new ServerUtil.JsonResponseHandler() {
                    @Override
                    public void onResponse(JSONObject json) {
                        Toast.makeText(mContext, "회원가입 성공!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.signupBtn = (Button) findViewById(R.id.signupBtn);
        this.addressEdt = (EditText) findViewById(R.id.addressEdt);
        this.phoneEdt = (EditText) findViewById(R.id.phoneEdt);
        this.nameEdt = (EditText) findViewById(R.id.nameEdt);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.idEdt = (EditText) findViewById(R.id.idEdt);
    }
}
