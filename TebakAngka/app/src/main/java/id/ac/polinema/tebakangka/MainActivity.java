package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText numberinput;
	private Button guest, reset;
	int random=0;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		numberinput=findViewById(R.id.number_input);
		guest=findViewById(R.id.guess_button);
		reset=findViewById(R.id.reset_button);
		initRandomNumber();

		// TODO: bind layout di sini
	}

	// TODO: generate angka random di sini
	private int initRandomNumber() {
		random=(int)(Math.random()*100);
		return random;

	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		int number = Integer.parseInt(String.valueOf(numberinput.getText()));
		if(number>random){
			Toast.makeText(this, "tebakan Anda terlalu besar!",Toast.LENGTH_SHORT).show();
		}else if(number<random){
			Toast.makeText(this, "tebakan Anda terlalu kecil!",Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(this, "tebakan Anda benar!",Toast.LENGTH_SHORT).show();
		}


	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		numberinput.setText("");
		initRandomNumber();
	}
}
