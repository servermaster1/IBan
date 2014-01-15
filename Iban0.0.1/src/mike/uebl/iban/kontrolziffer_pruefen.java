package mike.uebl.iban;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kontrolziffer_pruefen extends Activity{

	Button a;
	private EditText mText;
	private TextView display;
	final Context cont = this;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kontrolziffer_pruefen);
		a = (Button) findViewById(R.id.button1);
		a.setOnClickListener(
			new View.OnClickListener() {

				@Override
				public void onClick(View v) {
				mText = (EditText) findViewById(R.id.editText1);
				String text = mText.getText().toString();	
				display = (TextView) findViewById(R.id.tv);
				try {
					int kz = Iban.Testiban(text);
					if(kz == 1){
						display.setText("Der IBan ist Korrekt!");
					}else{
						display.setText("Die Kontrollziffer ist Falsch! \n Richtig währe " + kz);
					}
				} catch (WrongIban e) {
					
					//e.printStackTrace();
					AlertDialog.Builder builder = new AlertDialog.Builder(kontrolziffer_pruefen.this);
		            	builder.setTitle("Der IBan enthält unerlaubte zeichen");
		            	builder.setNeutralButton("OK", null);
		            	AlertDialog bui = builder.create();
		            	bui.show();
		            	display.setText("");
				}
				}
		});
	}
	

}

