package com.quis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioGroup;


public class ProjectQuis1Activity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	Button btn_OK;
	EditText edit_NIRM, edit_NAMA;
	TextView tv_NIRM, tv_NAMA;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn_OK = (Button) findViewById (R.id.btnOK);
        edit_NIRM = (EditText) findViewById (R.id.editNIRM);
        edit_NAMA = (EditText) findViewById (R.id.editNAMA);
        tv_NIRM = (TextView)  findViewById (R.id.tvNIRM);
        tv_NAMA = (TextView)  findViewById (R.id.tvNAMA);
        
        btn_OK.setOnClickListener(this);       
    }
    
    public void onClick(view v){
    	RadioGroup rg_PS= (RadioGroup) findViewById (R.id.rpProgramStudi);
    	TextView tv_PS = (TextView) findViewById (R.id.tvPS);
    	
    	int id_rb = rg_PS.getCheckedRadioButtonId();
    	
    	if (v== btn_OK){
    		tv_NIRM.setText("Nirm : " + edit_NIRM.getText());
    		tv_NAMA.setText("Nama : " + edit_NAMA.getText());
    	}	else {
    		finish();
    	}
    	
    	if (id_rb == R.id.rbSI){
    		tv_PS.setText("ProgramStudi: Sistem Informasi");
    	}	else if (id_rb== R.id.rbSK){
    		tv_PS.setText("ProgramStudi: Sistem Komputer");
    	}	else if (id_rb== R.id.rbMI){
    		tv_PS.setText("ProgramStudi: Manajemen Informatika"); 		
    	}	else if (id_rb== R.id.rbTK){
    		tv_PS.setText("ProgramStudi: Teknik Komputer");
    	}
    }
}