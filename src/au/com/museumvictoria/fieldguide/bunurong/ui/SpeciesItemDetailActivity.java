package au.com.museumvictoria.fieldguide.bunurong.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import au.com.museumvictoria.fieldguide.bunurong.ui.fragments.SpeciesItemDetailFragment;
import au.com.museumvictoria.fieldguide.bunurong.util.Utilities;
import au.com.museumvictoria.fieldguide.bunurong.R;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

/**
 * An activity representing a single Item detail screen. This activity is only
 * used on handset devices. On tablet-size devices, item details are presented
 * side-by-side with a list of items in a {@link SpeciesItemListActivity}.
 * <p>
 * This activity is mostly just a 'shell' activity containing nothing more than
 * a {@link SpeciesItemDetailActivity}.
 * 
 * @author Ajay Ranipeta <ajay.ranipeta@gmail.com>
 * 
 */
public class SpeciesItemDetailActivity extends SherlockFragmentActivity {
	
	private static final String TAG = "SpeciesItemDetailActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_item_detail);
		
		// Show the Up button in the action bar.
		//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		final ActionBar ab = getSupportActionBar();
        ab.setDisplayShowTitleEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayUseLogoEnabled(false);
		ab.setDisplayShowHomeEnabled(false);

		if (savedInstanceState == null) {
			Bundle arguments = new Bundle();
			arguments.putString(Utilities.SPECIES_IDENTIFIER, getIntent().getStringExtra(Utilities.SPECIES_IDENTIFIER)); 
			SpeciesItemDetailFragment fragment = new SpeciesItemDetailFragment();
			fragment.setArguments(arguments); 
			getSupportFragmentManager().beginTransaction().add(R.id.item_detail_container, fragment).commit();
		}
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void displayInfo(View view) {
		
		switch (view.getId()) {
		case R.id.heading_threatened_status:
			
			Bundle extras = new Bundle();
			extras.putString("pagetitle", "About Threatened Status");
			extras.putString("pageurl", "aboutthreatenedstatus");
			Intent infoIntent = new Intent(this, DisplayInfoActivity.class);
			infoIntent.putExtras(extras); 
			startActivity(infoIntent); 
			
			break;

		default:
			break;
		}
	}

}
