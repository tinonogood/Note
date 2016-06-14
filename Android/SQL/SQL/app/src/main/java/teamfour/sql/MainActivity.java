package teamfour.sql;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private ImageView ivSpot;
    private TextView tvRowCount;
    private TextView tvId;
    private TextView tvName;
    private TextView tvWeb;
    private TextView tvPhone;
    private TextView tvAddress;
    private List<Spot> spotList;
    private int index;
    private MySQLiteOpenHelper helper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        if (helper == null) {
            helper = new MySQLiteOpenHelper(this);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        askPermissions();
        spotList = helper.getAllSpots();
        showSpots(0);
    }

    private void findViews() {
        ivSpot = (ImageView) findViewById(R.id.ivSpot);
        tvRowCount = (TextView) findViewById(R.id.tvRowCount);
        tvId = (TextView) findViewById(R.id.tvId);
        tvName = (TextView) findViewById(R.id.tvName);
        tvWeb = (TextView) findViewById(R.id.tvWeb);
        tvPhone = (TextView) findViewById(R.id.tvPhone);
        tvAddress = (TextView) findViewById(R.id.tvAddress);

        tvWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String web = tvWeb.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
                startActivity(intent);
            }
        });

        tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNo = tvPhone.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"
                        + phoneNo));
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(intent);
            }
        });
    }

    private void showSpots(int index) {
        if (spotList.size() > 0) {
            Spot spot = spotList.get(index);
            Bitmap image = BitmapFactory.decodeByteArray(spot.getImage(), 0,
                    spot.getImage().length);
            ivSpot.setImageBitmap(image);
            tvId.setText(Integer.toString(spot.getId()));
            tvName.setText(spot.getName());
            tvWeb.setText(spot.getWeb());
            tvPhone.setText(spot.getPhone());
            tvAddress.setText(spot.getAddress());
            tvRowCount.setText((index + 1) + "/" + spotList.size());
        } else {
            ivSpot.setImageResource(R.mipmap.ic_launcher);
            tvId.setText(null);
            tvName.setText(null);
            tvWeb.setText(null);
            tvPhone.setText(null);
            tvAddress.setText(null);
            tvRowCount.setText(" 0/0 " + getString(R.string.msg_NoDataFound));
        }
    }

    public void onNextClick(View view) {
        index++;
        if (index >= spotList.size()) {
            index = 0;
        }
        showSpots(index);
    }

    public void onBackClick(View view) {
        index--;
        if (index < 0) {
            index = spotList.size() - 1;
        }
        showSpots(index);
    }

    public void onInsertClick(View view) {
        Intent intent = new Intent(this, InsertActivity.class);
        startActivity(intent);
    }

    public void onUpdateClick(View view) {
        if (spotList.size() <= 0) {
            Toast.makeText(this, R.string.msg_NoDataFound,
                    Toast.LENGTH_SHORT).show();
            return;
        }
        int id = Integer.parseInt(tvId.getText().toString());
        Intent intent = new Intent(this, UpdateActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("id", id);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void onDeleteClick(View view) {
        if (spotList.size() <= 0) {
            Toast.makeText(this, R.string.msg_NoDataFound,
                    Toast.LENGTH_SHORT).show();
            return;
        }
        int id = Integer.parseInt(tvId.getText().toString());
        int count = helper.deleteById(id);
        Toast.makeText(this, count + " " + getString(R.string.msg_RowDeleted),
                Toast.LENGTH_SHORT).show();
        spotList = helper.getAllSpots();
        showSpots(0);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (helper != null) {
            helper.close();
        }
    }


    private static final int REQ_PERMISSIONS = 0;
//    呼叫此方法開啟permission請求對話框,給user同意授權
    private void askPermissions() {
    //        取得READ_EXTERNAL_STORAGE, CALL_PHONE的授權, 看需要何種授權改String[] permissions即可
        String[] permissions = {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.CALL_PHONE
        };

        Set<String> permissionsRequest = new HashSet<>();
        for (String permission : permissions) {
            int result = ContextCompat.checkSelfPermission(this, permission);
            if (result != PackageManager.PERMISSION_GRANTED) {
                permissionsRequest.add(permission);
            }
        }

        if (!permissionsRequest.isEmpty()) {
            ActivityCompat.requestPermissions(this,
                    permissionsRequest.toArray(new String[permissionsRequest.size()]),
                    REQ_PERMISSIONS);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQ_PERMISSIONS:
                String text = "";
                for (int i = 0; i < grantResults.length; i++) {
                    if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {
                        text += permissions[i] + "\n";
                    }
                }
                if (!text.isEmpty()) {
                    text += getString(R.string.text_NotGranted);
                    Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
