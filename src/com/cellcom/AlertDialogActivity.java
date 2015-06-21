package com.cellcom;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//对话框测试
public class AlertDialogActivity extends Activity {

	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alert_dialog);
		setTitle(getString(R.string.AlertDialogActivity_title));
		
		button1=(Button)findViewById(R.id.button1);
		button2=(Button)findViewById(R.id.button2);
		button3=(Button)findViewById(R.id.button3);
		button4=(Button)findViewById(R.id.button4);
		
		//第一种对话框
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Builder builder=new AlertDialog.Builder(AlertDialogActivity.this);
				builder.setIcon(R.drawable.alert_dialog_icon);
				builder.setTitle(getString(R.string.AlertDialogActivity_button1_title));
				builder.setMessage(getString(R.string.AlertDialogActivity_button1_msg));
				builder.setPositiveButton(getString(R.string.AlertDialogActivity_button1_opt1), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(AlertDialogActivity.this, getString(R.string.AlertDialogActivity_button1_opt1_msg), Toast.LENGTH_SHORT).show();
					}
				});
				builder.setNegativeButton(getString(R.string.AlertDialogActivity_button1_opt2), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(AlertDialogActivity.this, getString(R.string.AlertDialogActivity_button1_opt2_msg), Toast.LENGTH_SHORT).show();
					}
				});
				builder.show();
			}
		});
		
		//第二种对话框
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				new Builder(AlertDialogActivity.this)
				.setIcon(R.drawable.alert_dialog_icon)
				.setTitle(getString(R.string.AlertDialogActivity_button2_title))
				.setMessage(getString(R.string.AlertDialogActivity_button2_msg))
				.setPositiveButton(getString(R.string.AlertDialogActivity_button2_opt1), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(AlertDialogActivity.this, getString(R.string.AlertDialogActivity_button2_opt1_msg), Toast.LENGTH_SHORT).show();
					}
				})
				.setNeutralButton(getString(R.string.AlertDialogActivity_button2_opt2), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(AlertDialogActivity.this, getString(R.string.AlertDialogActivity_button2_opt2_msg), Toast.LENGTH_SHORT).show();
					}
				})
				.setNegativeButton(getString(R.string.AlertDialogActivity_button2_opt3), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(AlertDialogActivity.this, getString(R.string.AlertDialogActivity_button2_opt3_msg), Toast.LENGTH_SHORT).show();
					}
				})
				.show();
			}
		});
		
		//第三种按钮
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				LayoutInflater inflater=LayoutInflater.from(AlertDialogActivity.this);
				final View textEntryView=inflater.inflate(R.layout.alert_dialog_text_entry, null);
				
				final EditText usernameET=(EditText)textEntryView.findViewById(R.id.username_value);
				final EditText passwordET=(EditText)textEntryView.findViewById(R.id.password_value);
				//final String username=usernameET.getText().toString();
				
				new Builder(AlertDialogActivity.this)
				.setIcon(R.drawable.alert_dialog_icon)
				.setTitle(getString(R.string.AlertDialogActivity_button3_title))
				.setView(textEntryView)
				.setPositiveButton(getString(R.string.AlertDialogActivity_button3_opt1), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(AlertDialogActivity.this, getString(R.string.UserNameEqual)+usernameET.getText().toString()+getString(R.string.PasswordEqual)+passwordET.getText().toString(), Toast.LENGTH_LONG).show();
					}
				})
				.setNegativeButton(getString(R.string.AlertDialogActivity_button3_opt2), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(AlertDialogActivity.this, getString(R.string.AlertDialogActivity_button3_opt2_msg), Toast.LENGTH_SHORT).show();
					}
				})
				.show();
			}
		});
		
		//第四种对话框
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ProgressDialog dialog=new ProgressDialog(AlertDialogActivity.this);
				dialog.setTitle(getString(R.string.AlertDialogActivity_button4_title));
				dialog.setMessage(getString(R.string.AlertDialogActivity_button4_msg));
				dialog.show();
			}
		});
	}
}
