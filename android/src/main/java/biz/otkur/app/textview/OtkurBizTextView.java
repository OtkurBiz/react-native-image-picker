package biz.otkur.app.textview;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;


public class OtkurBizTextView extends TextView {

    private Context mContext;
    public static  String fontName = "fonts/UkijTuzTom.ttf";

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
        setTypeface(TypeFaces.get(mContext, this.fontName));
    }

    public OtkurBizTextView(Context context) {
        super(context);
        init(context);
    }

    public OtkurBizTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
        convertXMLText(attrs);
    }

    public OtkurBizTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
        convertXMLText(attrs);
    }

    public void init(Context context) {
    	this.mContext =context;
        setTypeface(TypeFaces.get(context, fontName));

    }

    private void convertXMLText(AttributeSet paramAttributeSet){
        if (paramAttributeSet == null)
            return;

        String str = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "text");
        if (str == null)
            return;

        if (str.startsWith("@")) {
            str = mContext.getString(paramAttributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0));
        }
        if (str == null)
            str = "";

        setText(str);
    }
    
    @Override
    public Typeface getTypeface() {
        Typeface tf =TypeFaces.get(mContext, fontName);
        return tf;
    }

	public void setUyghurText(CharSequence text) {
    	String content=(String) text;
        //获取系统sdk 版本号 详情请见 http://developer.android.com/reference/android/os/Build.VERSION_CODES.html
        int systemVersion= Build.VERSION.SDK_INT;
        //content="\u200F"+content;
       // Log.d("androi", "convert version"+systemVersion);
        //判断是否大于4.1
        if (systemVersion<=16){
        	//Log.d("androi", "convert");
        	content= Farsi.Convert(content);
        }
       // content="\uFE82"+content;
    	super.setText(content);
    }

    public void setUyghurText(int id) {
        String content = getResources().getString(id);
    	
        //获取系统sdk 版本号 详情请见 http://developer.android.com/reference/android/os/Build.VERSION_CODES.html
        int systemVersion= Build.VERSION.SDK_INT;

        //判断是否大于4.1
        if (systemVersion<=16){
        	content=Farsi.Convert(content);
        }
       // content="\uFE82"+content;
    	super.setText(content);
    }

    public void setText(String str){
    	String content=str;
        //获取系统sdk 版本号 详情请见 http://developer.android.com/reference/android/os/Build.VERSION_CODES.html
        int systemVersion= Build.VERSION.SDK_INT;
        
       // Log.d("androi", "convert version"+systemVersion);
        //判断是否大于4.1
        if (systemVersion<=16){
        	//Log.d("androi", "convert");
        	content=Farsi.Convert(content);
        }
        //content="\uFE82"+content;
    	super.setText(content);
    }

}