package googlemap.bhavik.git.com.logansquarecustomparsing;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bluelinelabs.logansquare.LoganSquare;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import googlemap.bhavik.git.com.logansquarecustomparsing.model.PriceStandardListItem;

public class MainActivity extends AppCompatActivity {

    public  String URL_USER_HELPER = "https://mobile4.mateco.de/UserServiceGzip/api/userhelper/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = null;
        try {
            url = URL_USER_HELPER +"salesservice/token=" + URLEncoder.encode(getToken().trim(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // for volley
        callMainServiceUsingVolley(url);
    }
    private void callMainServiceUsingVolley(final String url){
        JsonObjectRequest req = new JsonObjectRequest(Request.Method.GET, url,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(final JSONObject response) {
                        Log.e(" ###### "," response of volley : "+response);
                        try
                        {
                            new Thread(new Runnable()
                            {
                                @Override
                                public void run()
                                {
                                    try
                                    {
                                        List<PriceStandardListItem> listOfOfflineStandardPrice = new ArrayList<>();
                                        googlemap.bhavik.git.com.logansquarecustomparsing.model.Response response2 = new googlemap.bhavik.git.com.logansquarecustomparsing.model.Response();
                                        response2  = LoganSquare.parse(response.toString(),googlemap.bhavik.git.com.logansquarecustomparsing.model.Response.class);
                                        listOfOfflineStandardPrice = response2.getPriceStandardList();
                                        Log.e(""," arraylis size : "+listOfOfflineStandardPrice.size());
                                    }
                                    catch (Exception ex)
                                    {
                                        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
                                        ex.printStackTrace();
                                        Log.e(""," exception : "+ex.toString());
                                    }
                                }
                            }).start();

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                            Log.e(""," exception : "+ex.toString());
                        }
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(""," exception : "+error.toString());
            }
        });

        Volley.newRequestQueue(MainActivity.this).add(req);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
    public  String getToken()
    {
        long unixTime = System.currentTimeMillis() / 1000L;
        String stringtoConvert = "7ORM054AjZwAS3fJ:" + unixTime;
        byte[] data = stringtoConvert.getBytes();
        return Base64.encodeToString(data, Base64.DEFAULT);
    }
}
