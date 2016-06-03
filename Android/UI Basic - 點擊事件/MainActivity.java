package teamfour.basicui1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etPasswd;
    private EditText etPhone;
    private EditText etAge;
    private Button btClear;
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews(){
        etName = (EditText) findViewById(R.id.etName);
        etPasswd = (EditText) findViewById(R.id.etPasswd);
        etPhone = (EditText) findViewById(R.id.etPhone);
        etAge = (EditText) findViewById(R.id.etAge);
        btClear = (Button) findViewById(R.id.btClear);
        tvMessage = (TextView) findViewById(R.id.tvMessage);

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.setText(null);
                etPasswd.setText(null);
                etPhone.setText(null);
                etAge.setText(null);
                tvMessage.setText(null);
            }
        });
    }

    public void onSubmitClick(View view){
        String name = etName.getText().toString().trim();
        String passwd = etPasswd.getText().toString().trim();
        String phone = etPhone.getText().toString().trim();
        String age = etAge.getText().toString().trim();

        String text = "";
        text += "User Name = " + name + "\n";
        text += "Passwd = " + passwd + "\n";
        text += "Phone = " + phone + "\n";
        text += "Age = " + age + "\n";
        tvMessage.setText(text);
    }
}
