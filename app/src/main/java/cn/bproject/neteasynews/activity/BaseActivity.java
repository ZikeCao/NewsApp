package cn.bproject.neteasynews.activity;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by CaoZike on 2021/12/08.
 */

public class BaseActivity extends AppCompatActivity{

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}
