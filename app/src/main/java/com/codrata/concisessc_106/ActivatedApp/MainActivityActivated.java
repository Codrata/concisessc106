package com.codrata.concisessc_106.ActivatedApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.codrata.concisessc_106.DemoApp.MainActivityDemo;
import com.codrata.concisessc_106.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.github.barteksc.pdfviewer.util.FitPolicy;


public class MainActivityActivated extends AppCompatActivity {


    private static final String TAG = MainActivityDemo.class.getSimpleName();
    Integer pageNumber = 0;
    String pdfFileName, SAMPLE_FILE;
    PDFView pdfView;
    int result;
    private OnDrawListener onDrawListener;
    private OnLoadCompleteListener onLoadCompleteListener;
    int currentPage;
    private OnPageChangeListener onPageChangeListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SAMPLE_FILE = getIntent().getExtras().getString("SAMPLE_FILE");



        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_main);

        final PDFView pdfView = findViewById(R.id.pdfViewDemo);
        final EditText pageTo = findViewById(R.id.pageNumber);
        final Button button = findViewById(R.id.goTo);

        int currentNum = pdfView.getCurrentPage();

        String currentPageCount = String.valueOf(currentNum);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int pageNum = Integer.parseInt(pageTo.getText().toString());
                pageNum = pageNum - 1;
                pdfView.jumpTo(pageNum);
            }
        });




        pdfView.fromAsset(SAMPLE_FILE)
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(true)
                .defaultPage(0)
                .enableDoubletap(true)
                .onPageChange(onPageChangeListener)
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
