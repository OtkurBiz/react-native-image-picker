package biz.otkur.app.textview;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

public class TypeFaces{

private static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();

	public static Typeface get(Context c, String name){
		synchronized(cache){
			Typeface t ;
			if(!cache.containsKey(name)){
				
				//if(name.equalsIgnoreCase("UKIJQolyazma.ttf")){
					t= Typeface.createFromAsset(
							c.getAssets(),name);
//				}else{
//				t= Typeface.createFromAsset(
//						c.getAssets(),"UkijTuzTom.ttf");
//				}
				cache.put(name, t);
			}
			return cache.get(name);
		}
	}

}