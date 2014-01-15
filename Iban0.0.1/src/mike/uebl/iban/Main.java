package mike.uebl.iban;
//c t r l shift o

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Main extends Activity {
	
	ImageButton a,b,c,d;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		a = (ImageButton) findViewById(R.id.buttona);
		b = (ImageButton) findViewById(R.id.buttonb);
		c = (ImageButton) findViewById(R.id.buttonc);
		d = (ImageButton) findViewById(R.id.buttond);
		
	new Color();
		//	a.getBackground().setColorFilter(new LightingColorFilter(0x79daf2,0));
		a.setBackgroundColor(Color.rgb(121, 218, 242));
		b.setBackgroundColor(Color.rgb(121, 218, 242));
		c.setBackgroundColor(Color.rgb(121, 218, 242));
		d.setBackgroundColor(Color.rgb(121, 218, 242));
		c.setOnClickListener(
		new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent ourInten = new Intent(Main.this ,mike.uebl.iban.kontrolziffer_pruefen.class);
				startActivity(ourInten);
			}
		});
		d.setOnClickListener(
		new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent ourInten = new Intent(Main.this ,mike.uebl.iban.Impressum.class);
				startActivity(ourInten);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
