package isitpartytime.frostapplications;

import java.util.Date;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class IsitpartytimeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Init();
    }
    
    private void Init(){
    	TextView text = (TextView) findViewById(R.id.Text);
    	Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Helvetica Regular.ttf");
    	text.setTypeface(font);
    	Date date = new Date();
    	if(date.getHours() >= 21 || date.getHours() <= 4){
    		text.setText("YES");
    	}
    }
}