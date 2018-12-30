package com.codrata.concisessc_106;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codrata.concisessc_106.DemoApp.MainActivityDemo;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class HowToUseApp extends AppCompatActivity {

    public static final String SAMPLE_FILE = "howtousetheapp.pdf";
    private static final String TAG = WelcomeActivity.class.getSimpleName();
    Integer pageNumber = 0;
    String pdfFileName;
    PDFView pdfView;
    private OnDrawListener onDrawListener;
    private OnLoadCompleteListener onLoadCompleteListener;
    private OnPageChangeListener onPageChangeListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use_app);

        PDFView pdfView = findViewById(R.id.pdfView);


        pdfView.fromAsset(SAMPLE_FILE)
                //.pages(0, 1, 2, 3)// limited to 3 pages for the Demo sample before Activation
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(true)
                .enableDoubletap(true)
                .onPageChange(onPageChangeListener)
                .defaultPage(0)
                .scrollHandle(new DefaultScrollHandle(this))
                .onDraw(onDrawListener)
                // allows to draw something on all pages, separately for every page. Called only for visible pages
                .onDrawAll(onDrawListener)
                .onLoad(onLoadCompleteListener) // called after document is loaded and starts to be rendered
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                .pageFitPolicy(FitPolicy.WIDTH)
                .pageSnap(true) // snap pages to screen boundaries
                .pageFling(true) // make a fling change only a single page like ViewPager
                .nightMode(false) // toggle night mode
                .load();
    }
}
