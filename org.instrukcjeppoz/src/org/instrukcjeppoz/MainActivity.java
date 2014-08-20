package org.instrukcjeppoz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button systemTypesButton = (Button) findViewById(R.id.main_system_types_button);
		systemTypesButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.main_system_types_button:
			Intent myIntent = new Intent(MainActivity.this, SystemTypesActivity.class);
			startActivity(myIntent);
			break;
		}
	}

}
