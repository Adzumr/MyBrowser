package adzumrjada.mybrowser;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Heart on 8/25/2017.
 */

class newWebViewClient extends WebViewClient {

    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
