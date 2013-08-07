package au.com.museumvictoria.fieldguide.bunurong.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import au.com.museumvictoria.fieldguide.bunurong.ui.fragments.WebFragment;
import au.com.museumvictoria.fieldguide.bunurong.R;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

/**
 * <p>Loads up the info as web content in an activity.</p>
 * 
 * TODO: make this a popup/dialog instead
 * 
 * @author Ajay Ranipeta <ajay.ranipeta@gmail.com>
 *
 */
public class DisplayInfoActivity extends SherlockFragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		final ActionBar ab = getSupportActionBar();
        ab.setDisplayShowTitleEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayUseLogoEnabled(false);
		ab.setDisplayShowHomeEnabled(false);
		
		Intent intent = getIntent();
		Bundle extras = intent.getExtras();
		
		if (extras != null) {
			
			if (extras.containsKey("pagetitle")) {
				ab.setTitle(extras.getString("pagetitle")); 
			} else {
				ab.setTitle(R.string.park_title);
			}
			
			if (extras.containsKey("pageurl")) {
				Fragment frag = new WebFragment();
				frag.setArguments(extras);
				
				FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
				ft.replace(android.R.id.content, frag);
				ft.commit();
			} else {
				finish();
			}
		} else {
			finish();
		}
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
