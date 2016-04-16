package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.jace.testproject.MainActivity;
import com.example.jace.testproject.R;

/**
 * Created by Jace on 4/16/16.
 */

public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView)mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals(tester, "Hello world!");

    }
}
