package com.example.empublite;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends Activity implements TextWatcher {

	private TextView selection;
	private AutoCompleteTextView edit;

	private static final String[] items = { "lorem", "ipsum", "dolor", "sit",
			"amet", "consectetuer", "adipiscing", "elit", "morbi", "vel",
			"ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel",
			"erat", "placerat", "ante", "porttitor", "sodales", "pellentesque",
			"augue", "purus" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		selection = (TextView) findViewById(R.id.selection);
		edit = (AutoCompleteTextView) findViewById(R.id.edit);
		edit.addTextChangedListener(this);
		edit.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, items));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void afterTextChanged(Editable arg0) {
		selection.setText(edit.getText());
	}

	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
			int arg3) {
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		
	}

}
