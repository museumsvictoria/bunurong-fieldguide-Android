package au.com.museumvictoria.fieldguide.bunurong.provider;

import java.util.ArrayList;

import android.content.res.Resources;
import au.com.museumvictoria.fieldguide.bunurong.util.ImageWorker.ImageWorkerAdapter;
import au.com.museumvictoria.fieldguide.bunurong.util.Utilities;
import au.com.museumvictoria.fieldguide.bunurong.R;

public class Images {
	
	private static final String TAG = "Bunurong.Provider.Images";
	
    // file:///android_asset/data/images/park/gallery/full/Kayaking.jpg
    public static String[] imageUrls = new String[] {
        Utilities.GALLERY_IMAGES_FULL_PATH + "Boating.jpg",
        Utilities.GALLERY_IMAGES_FULL_PATH + "Kayaking.jpg",
    };
    public static String[] imageThumbUrls = new String[] {
    	Utilities.GALLERY_IMAGES_THUMBNAILS_PATH + "thumb_Boating.jpg",
    	Utilities.GALLERY_IMAGES_THUMBNAILS_PATH + "thumb_Kayaking.jpg",
    };
    public static String[] imageDescrptions = new String[] {
        "Boating__Credit MV",
        "Kayaking__Credit MV",
    };
    
    public static void loadImages(Resources res, int galleryId) {
		ArrayList<String> thumbImages = new ArrayList<String>();
		ArrayList<String> fullImages = new ArrayList<String>();
		
    	if (galleryId == R.array.list_images_maps) {
    		String[] tmpImages = res.getStringArray(galleryId);
    		for (String img : tmpImages) {
    			String thumbName = img.substring(0,2) + "_sq.jpg";
    			thumbImages.add(Utilities.MAPS_IMAGES_THUMBNAILS_PATH + thumbName);
    			fullImages.add(Utilities.MAPS_IMAGES_FULL_PATH + img);
    		}
    	} else {
    		String[] tmpImages = res.getStringArray(R.array.list_images_gallery);
    		for (String img : tmpImages) {
    			String thumbName = img.substring(0,2) + "_sq.jpg";
    			String fullName = img.substring(0,2) + ".jpg";
    			thumbImages.add(Utilities.GALLERY_IMAGES_THUMBNAILS_PATH + thumbName);
    			fullImages.add(Utilities.GALLERY_IMAGES_FULL_PATH + fullName);
    		}
    	}
    	
		
		imageThumbUrls = thumbImages.toArray(new String[thumbImages.size()]);
		imageUrls = fullImages.toArray(new String[fullImages.size()]);
    }
    
    public static void loadSpeciesImages(String[] imageList, String[] descriptions) {
//    	ArrayList<String> fullImages = new ArrayList<String>();
//    	for (String img : imageList) {
//			fullImages.add("data/images/species/full/" + img);
//		}
//    	imageUrls = fullImages.toArray(new String[fullImages.size()]);
    	
    	imageUrls = imageList; 
    	imageDescrptions = descriptions; 
    }

    /**
     * Simple static adapter to use for images.
     */
    public final static ImageWorkerAdapter imageWorkerUrlsAdapter = new ImageWorkerAdapter() {
        @Override
        public Object getItem(int num) {
            return Images.imageUrls[num];
        }

        @Override
        public int getSize() {
            return Images.imageUrls.length;
        }
    };

    /**
     * Simple static adapter to use for image thumbnails.
     */
    public final static ImageWorkerAdapter imageThumbWorkerUrlsAdapter = new ImageWorkerAdapter() {
        @Override
        public Object getItem(int num) {
            return Images.imageThumbUrls[num];
        }

        @Override
        public int getSize() {
            return Images.imageThumbUrls.length;
        }
    };

}
