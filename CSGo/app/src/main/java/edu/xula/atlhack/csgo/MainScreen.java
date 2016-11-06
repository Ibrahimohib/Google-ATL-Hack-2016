package edu.xula.atlhack.csgo;

import android.*;
import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Random;

public class MainScreen extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Marker source,destination;

    LocationManager locationManager;

    LocationListener locationListener;
    private ImageView CSButton;

    private String[] challenges = {"Java", "C++", "HTML", "JavaScript", "Python"};
    private int iterator = -1;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 1) {

            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                    {

                        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

                    }

                }

            }

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        CSButton = (ImageView) findViewById(R.id.cslogo);
        CSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skills(v);
            }
        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        createMarkers(mMap);
        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

                //LatLng userLocation = new LatLng(location.getLatitude(), location.getLongitude());

                //mMap.clear();
                //mMap.addMarker(new MarkerOptions().position(userLocation).title("Your Location").icon(BitmapDescriptorFactory.fromResource(R.drawable.ajene)));
                //mMap.moveCamera(CameraUpdateFactory.newLatLng(userLocation));



            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }
        };

        if (Build.VERSION.SDK_INT < 23) {

            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

        } else {

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);

            } else {

                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

                Location lastKnownLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

                LatLng userLocation = new LatLng(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                mMap.clear();

                mMap.addMarker(new MarkerOptions().position(userLocation).title("Your Location").icon(BitmapDescriptorFactory.fromResource(R.drawable.ajene)));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(userLocation));




            }


        }

        mMap.moveCamera(CameraUpdateFactory.zoomTo(18));

        
//        LatLng testLocation1 = new LatLng(33.768047, -84.401206);
//        LatLng testLocation2 = new LatLng(33.766789, -84.400530);
//        source = mMap.addMarker(new MarkerOptions()
//                .position(testLocation1)
//                .title("Java")
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.java)));
//
//        destination= mMap.addMarker(new MarkerOptions()
//                .position(testLocation2)
//                .title("HTML")
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.html)));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener()
        {

            @Override
            public boolean onMarkerClick(Marker arg0) {
                if(arg0.getTitle().equals("Java")) { // if marker source is clicked
                    Toast.makeText(MainScreen.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                    arg0.setVisible(false);
                }else if(arg0.getTitle().equals("HTML")){
                    Toast.makeText(MainScreen.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                    arg0.setVisible(false);
                }
                return true;
            }

        });



    }

    public void createMarkers(GoogleMap googleMap) {
        final android.os.Handler handler = new android.os.Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                if (ContextCompat.checkSelfPermission(MainScreen.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(MainScreen.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);

                } else {

                    Location lastKnownLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

                    //LatLng userLocation = new LatLng(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());

                    Random random = new Random();
                    int direction = random.nextInt(4);
                    Double lat;
                    Double lon;
                    if(direction == 0){
                        lat = lastKnownLocation.getLatitude() + (random.nextDouble() * .0009);
                        lon = lastKnownLocation.getLongitude() + (random.nextDouble() * .0009);
                    }else if(direction == 1){
                        lat = lastKnownLocation.getLatitude() - (random.nextDouble() * .0009);
                        lon = lastKnownLocation.getLongitude() - (random.nextDouble() * .0009);
                    }else if(direction == 2){
                        lat = lastKnownLocation.getLatitude() + (random.nextDouble() * .0009);
                        lon = lastKnownLocation.getLongitude() - (random.nextDouble() * .0009);
                    }else{
                        lat = lastKnownLocation.getLatitude() - (random.nextDouble() * .0009);
                        lon = lastKnownLocation.getLongitude() + (random.nextDouble() * .0009);
                    }

                    LatLng test = new LatLng(lat, lon);
                    //Toast.makeText(MainScreen.this, "Hello World", Toast.LENGTH_LONG).show();
                    //mMap.addMarker(new MarkerOptions().position(test).title("Test").icon(BitmapDescriptorFactory.fromResource(R.drawable.html)));
                    if(iterator == 4){
                        iterator = 0;
                    }else{
                        iterator++;
                    }
                    String icon = challenges[iterator];

                    if(icon.equals("Java")){
                        mMap.addMarker(new MarkerOptions()
                                .position(test)
                                .title("Java")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.java)));
                    }else if(icon.equals("HTML")){
                        mMap.addMarker(new MarkerOptions()
                                .position(test)
                                .title("HTML")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.html)));
                    }else if(icon.equals("Python")){
                        mMap.addMarker(new MarkerOptions()
                                .position(test)
                                .title("Python")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.python)));
                    }else if(icon.equals("JavaScript")){
                        mMap.addMarker(new MarkerOptions()
                                .position(test)
                                .title("JavaScript")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.javascript)));
                    }else if(icon.equals("C++")){
                        mMap.addMarker(new MarkerOptions()
                                .position(test)
                                .title("C++")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.cplusplus)));
                    }


//                    mMap.addMarker(new MarkerOptions()
//                            .position(test)
//                            .title("HTML")
//                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.html)));
                    handler.postDelayed(this, 2500);

                    mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener()
                    {

                        @Override
                        public boolean onMarkerClick(Marker arg0) {
                            if(arg0.getTitle().equals("Java")) { // if marker source is clicked
                                Toast.makeText(MainScreen.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                                arg0.setVisible(false);
                            }else if(arg0.getTitle().equals("HTML")){
                                Toast.makeText(MainScreen.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                                arg0.setVisible(false);
                            }else if(arg0.getTitle().equals("Python")){
                                Toast.makeText(MainScreen.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                                arg0.setVisible(false);
                            }else if(arg0.getTitle().equals("JavaScript")){
                                Toast.makeText(MainScreen.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                                arg0.setVisible(false);
                            }else if(arg0.getTitle().equals("C++")){
                                Toast.makeText(MainScreen.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                                arg0.setVisible(false);
                            }
                            return true;
                        }

                    });
                }
            }

        }, 3000);

    }

    public void skills(View view){

        startActivity(new Intent(MainScreen.this, SkillPage.class));
    }


}
