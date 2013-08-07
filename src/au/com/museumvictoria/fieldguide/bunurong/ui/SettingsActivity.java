package au.com.museumvictoria.fieldguide.bunurong.ui;

import android.os.Bundle;
import au.com.museumvictoria.fieldguide.bunurong.R;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.actionbarsherlock.view.MenuItem;

/**
 * The Settings activity
 * 
 * TODO: Update to use more native methods or use a fragment instead
 * 
 * @author Ajay Ranipeta <ajay.ranipeta@gmail.com>
 *
 */
public class SettingsActivity extends SherlockPreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

//		ActionBar actionBar = getActionBar();
//		actionBar.setDisplayHomeAsUpEnabled(true);
//		actionBar.setDisplayShowHomeEnabled(false);
//
//		// Display the fragment as the main content.
//		getFragmentManager().beginTransaction()
//				.replace(android.R.id.content, new SettingsFragment()).commit();
		
		
		final ActionBar ab = getSupportActionBar();
        ab.setDisplayShowTitleEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayUseLogoEnabled(false);
		ab.setDisplayShowHomeEnabled(false);
		
		addPreferencesFromResource(R.xml.preferences);

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
