package wecaht.my060701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

/**
 *  AbsoluteLayout 绝对布局
 *  TableLayout  表格布局 使用GridView代替
 *  FrameLayout 帧布局
 *  LinearLayout 线性布局 线性 垂直 水平
 *  RelativeLayout 相对布局最灵活
 *
 * 尽量多使用LinearLayout和RelativeLayout  不适用 AbsoluteLayout
 * 相同情况下 使用LinearLayout代替RelativeLayout
 */
public class MainActivity extends AppCompatActivity {
    private TextView mTitle;
    private Button mButton;
    private ViewStub mStub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTitle = (TextView) findViewById(R.id.title);
        mTitle.setText("自定义布局");
        mButton = (Button) findViewById(R.id.button);
        mStub = (ViewStub) findViewById(R.id.stub);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStub.inflate();
            }
        });
    }
}
