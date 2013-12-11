package mike.uebl.iban;
//c t r l shift o
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
	
	Button a,b,c,d,e;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		a = (Button) findViewById(R.id.buttona);
		b = (Button) findViewById(R.id.buttonb);
		c = (Button) findViewById(R.id.buttonc);
		d = (Button) findViewById(R.id.buttond);
		e = (Button) findViewById(R.id.buttone);
		
		c.setOnClickListener(
		new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent ourInten = new Intent(Main.this ,mike.uebl.iban.kontrolziffer_pruefen.class);
				startActivity(ourInten);
			}
		});
		e.setOnClickListener(
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
