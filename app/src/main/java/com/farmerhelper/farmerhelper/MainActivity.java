package com.farmerhelper.farmerhelper;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button locationButton, cropButton;
    TextView locationTextView, soilTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cropButton = findViewById(R.id.button_crop_details);
        locationTextView = findViewById(R.id.textView2);
        soilTextView = findViewById(R.id.textView4);
        locationButton = findViewById(R.id.button_get_location);

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Map<String, String> map = new HashMap<>();
                map.put("Bengaluru", "Black Soil");
                map.put("Vijayapura", "Black Soil");
                map.put("Gulbarga", "Black Soil");
                map.put("Belgam", "Black Soil");
                map.put("Bijapur", "Black Soil");
                map.put("Bidhar", "Black Soil");
                map.put("Raichur", "Black Soil");
                map.put("Ballary", "Black Soil");
                map.put("Shinoli", "Black Soil");
                map.put("Sulga", "Black Soil");
                map.put("Desur", "Black Soil");
                map.put("Kadoli", "Black Soil");
                map.put("Sambra", "Black Soil");
                map.put("Marihal", "Black Soil");
                map.put("Bhalki", "Black Soil");
                map.put("Aurad", "Black Soil");
                map.put("Shrimali", "Black Soil");
                map.put("Belura", "Black Soil");
                map.put("Kanamadi", "Black Soil");
                map.put("Nagathan", "Black Soil");
                map.put("Basavakalyan", "Black Soil");
                map.put("Athani", "Black Soil");
                map.put("Chitradurga", "Black Soil");
                map.put("Achave", "Laterite Soil");
                map.put("Honnaver", "Laterite Soil");
                map.put("Bhatkal", "Laterite Soil");
                map.put("Baindur", "Laterite Soil");
                map.put("Kollur", "Laterite Soil");
                map.put("Kundapur", "Laterite Soil");
                map.put("Padu", "Laterite Soil");
                map.put("Padubidri", "Laterite Soil");
                map.put("Kateel", "Laterite Soil");
                map.put("Adyar", "Laterite Soil");
                map.put("Ullal", "Laterite Soil");
                map.put("Nitte", "Laterite Soil");
                map.put("Mandarthi", "Laterite Soil");
                map.put("Humnabad", "Laterite Soil");
                map.put("Kalaburgi", "Laterite Soil");
                map.put("Sedam", "Laterite Soil");
                map.put("Murudeshwar" , "Laterite Soil");
                map.put("Kumta", "Laterite Soil");
                map.put("Ankola", "Laterite Soil");
                map.put("Gokarna" , "Laterite Soil");
                map.put("Udupi" , "Laterite Soil");
                map.put("Mangalore" , "Laterite Soil");

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
                        checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION)
                                != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 1000);
                } else {
                    LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                    Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    try {
                        String city = userLocation(location.getLatitude(), location.getLongitude());
                        locationTextView.setText(city);
                        soilTextView.setText(map.get(city));
                    } catch (Exception e) {
                        e.printStackTrace();
                        locationTextView.setText("Bengaluru");
                        soilTextView.setText("Black Soil");
                    }
                }
            }
        });

        cropButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CropDetailsActivity.class);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 1000: {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                    @SuppressLint("MissingPermission") Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    try {
                        String city = userLocation(location.getLatitude(), location.getLongitude());
                        locationTextView.setText(city);
                    } catch (Exception e) {
                        e.printStackTrace();
                        locationTextView.setText("Bengaluru");
                        soilTextView.setText("Black Soil");
                    }
                } else {
                    locationTextView.setText("Bengaluru");
                    soilTextView.setText("Black Soil");
                }
            }
        }
    }

    private String userLocation(double lat, Double lon) {
        String cityName = "";
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
        List<Address> addresses;
        try {
            addresses = geocoder.getFromLocation(lat, lon, 10);
            if (addresses.size() > 0) {
                for (Address a : addresses) {
                    if (a.getLocality() != null && a.getLocality().length() > 0) {
                        cityName = a.getLocality();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityName;
    }
}
