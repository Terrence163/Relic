package com.relic.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.BoomButton;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.relic.android.R;
import com.relic.android.db.Main;
import com.relic.android.util.LogUtil;
import com.relic.android.util.MyApplication;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Terrence on 2017/12/18.
 */
public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    private AppCompatButton mbutton_insert;
    private AppCompatButton mbutton_select;
    private AppCompatButton mbutton_updata;

    private BoomMenuButton mBoomMenuButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        数据库创建
        Connector.getDatabase();
//       组件初始化
        init();
    }

    private void init() {
//       设置自定义的ActionBar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // 添加
        mBoomMenuButton = (BoomMenuButton) findViewById(R.id.boom);
        assert mBoomMenuButton != null;
        mBoomMenuButton.setButtonEnum(ButtonEnum.Ham);
        for (int i = 0; i < mBoomMenuButton.getButtonPlaceEnum().buttonNumber(); i++){
            mBoomMenuButton.addBuilder(new HamButton.Builder().normalImageRes(getImageResource(i))
                    .normalTextRes(R.string.text_ham_button_text_normal)
                    .subNormalTextRes(R.string.text_ham_button_sub_text_normal)
                    .pieceColor(Color.WHITE).listener(new OnBMClickListener() {
                @Override
                public void onBoomButtonClick(int index) {
                    Toast.makeText(MyApplication.getContext(), "点击事件成功"+index, Toast.LENGTH_SHORT).show();
                    if(index==0){
                        Intent intent = new Intent(MainActivity.this,AddActivity.class);
                        startActivity(intent);
                    }
                }
            }));
        }


        mbutton_insert = (AppCompatButton) findViewById(R.id.insert_main);
        mbutton_select = (AppCompatButton) findViewById(R.id.select_main);
        mbutton_updata = (AppCompatButton) findViewById(R.id.updata_main);

        mbutton_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date currentDate = new Date();
                String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(currentDate);
                Main main = new Main();
                main.setTitle("问题");
                main.setContext("解决问题内容");

                main.setPubDateTime(nowTime);
                main.setRank(1);
                main.setStatus(false);
                main.setUpload(false);
                main.setType_id(1);
                main.save();
                Toast.makeText(MainActivity.this, "插入数据", Toast.LENGTH_SHORT).show();

            }
        });
        mbutton_updata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "更新数据", Toast.LENGTH_SHORT).show();

            }
        });
        mbutton_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Main> mains = DataSupport.findAll(Main.class);
                Toast.makeText(MainActivity.this, "查询数据:" + mains.size(), Toast.LENGTH_SHORT).show();
                LogUtil.i(TAG, "onClick: Main title" + mains.get(0).getTitle());
                LogUtil.i(TAG, "onClick: Main pubdata" + mains.get(0).getPubDateTime());
                LogUtil.i(TAG, "onClick: Main upload" + mains.get(0).isUpload());
                LogUtil.i(TAG, "onClick: Main type_id" + mains.get(0).getType_id());

            }
        });
    }
    
    private  int[] imageResources = new int[]{
            R.drawable.ic_add,
    };
     private int getImageResource(int i) {
        return imageResources[i];
    }

}
