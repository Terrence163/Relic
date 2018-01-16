package com.relic.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.relic.android.R;
import com.relic.android.util.ActivityCollector;

public class AddActivity extends BaseActivity {

    private Toolbar mToolbar;
    private TextView mTextViewActivityTitle;
    private EditText mEditTextFirstAdd;
    private TextView mTextViewFirstAdd;
    private EditText mEditTextSecondAdd;
    private TextView mTextViewSecondAdd;
    private ListPopupWindow mListPopupWindow;
    private Button mButtonConfirmAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        init();
        Activity activity = ActivityCollector.getActivity("activity.MainActivity");
        if( activity != null){
            activity.finish();
        }
    }

    /**
     * 控件初始化
     */
    private void init() {
//        设置自定义的ActionBar
        mToolbar = (Toolbar) findViewById(R.id.mybar_app_bar_template);
        mToolbar.setTitle("");

        mToolbar.setNavigationIcon(R.drawable.back);
        setSupportActionBar(mToolbar);
//        返回事件
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
//      设置activity标题
        mTextViewActivityTitle = (TextView) findViewById(R.id.title_app_bar_template);
        mTextViewActivityTitle.setText(R.string.addactivit_title);
//      添加主标题
        mTextViewFirstAdd = (TextView) findViewById(R.id.tv1_add_template_1);
        mTextViewFirstAdd.setText(R.string.addactivity_text_1);
        mEditTextFirstAdd = (EditText) findViewById(R.id.et1_add_template_1);
        mEditTextFirstAdd.setHint(R.string.addactivity_edit_text_hint_1);
//      所属标签
        mTextViewSecondAdd = (TextView) findViewById(R.id.tv2_add_template_1);
        mTextViewSecondAdd.setText(R.string.addactivity_text_2);
        mEditTextSecondAdd = (EditText) findViewById(R.id.et2_add_template_1);
        mEditTextSecondAdd.setHint(R.string.addactivity_edit_text_hint_2);
        mEditTextSecondAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getX() >= (mEditTextSecondAdd.getWidth() - mEditTextSecondAdd.getCompoundDrawables()[2].getBounds().width())) {
                        mEditTextSecondAdd.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(R.drawable.ic_shrink), null);
                        showListPopulWindow();
                        return true;
                    }
                }
                return false;
            }
        });
//   确定添加按钮
        mButtonConfirmAdd = (Button) findViewById(R.id.button1_add_template_1);
        mButtonConfirmAdd.setText(R.string.addactivity_button_1);
//        TODO 重写点击事件
        mButtonConfirmAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddActivity.this, "点击事件正常", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent(AddActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }


    /**
     * 显示下拉框与重写ListPopulWindow 的onItemClickListener，onDismissListener事件
     */
    private void showListPopulWindow() {

// TODO 假数据，以后会换成真数据，标签数据
        final String[] list = {"item1", "item2", "item3", "item4"};

        mListPopupWindow = new ListPopupWindow(this);
        mListPopupWindow.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list));
        mListPopupWindow.setAnchorView(mEditTextSecondAdd);
        mListPopupWindow.setModal(true);
        mListPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mEditTextSecondAdd.setText(list[position]);
                mListPopupWindow.dismiss();
            }
        });
        mListPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                mEditTextSecondAdd.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(R.drawable.ic_unflod), null);
            }
        });
        mListPopupWindow.show();
    }
}
