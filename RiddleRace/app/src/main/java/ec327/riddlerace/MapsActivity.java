package ec327.riddlerace;

import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;



public class MapsActivity extends FragmentActivity implements GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener,GoogleMap.OnMapClickListener, LocationListener {


    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
////    List<LatLng> locationList;
    private LocationClient myLocationClient;
//    protected Context context;
//    LocationManager locationManager;
//    private Polyline line;
    LatLng latLng;
//    private ArrayList<LatLng> routePoints;
//    String provider;
//    protected String latitude, longitude;
//    protected boolean gps_enabled, network_enabled;
    private static final LocationRequest REQUEST = LocationRequest.create()
            .setInterval(5000)
            .setFastestInterval(16)
            .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
//    Criteria myCriteria;


    View h1;
    View h11;

    View h2;
    View h21;

    View h3;
    View h31;

    View h4;
    View h41;

    View h5;
    View h51;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
//        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
//        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
//        Criteria criteria = new Criteria();
        myLocationClient = new LocationClient(this,this,this);
//



    }
//    /**
//     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
//     * installed) and the map has not already been instantiated.. This will ensure that we only ever
//     * call  once when {@link #mMap} is not null.
//     * <p/>
//     * If it isn't installed {@link SupportMapFragment} (and
//     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
//     * install/update the Google Play services APK on their device.
//     * <p/>
//     * A user can return to this FragmentActivity after following the prompt and correctly
//     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
//     * have been completely destroyed during this process (it is likely that it would only be
//     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
//     * method in {@link #onResume()} to guarantee that it will be called.
//     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                mMap.setMyLocationEnabled(true);
//
                myLocationClient = new LocationClient(getApplicationContext(), this, this);
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.getUiSettings().setMyLocationButtonEnabled(false);
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
//
            }
        }
    }


//    @Override
    public void onConnected(Bundle bundle) {
        myLocationClient.requestLocationUpdates(REQUEST, this);
        Toast.makeText(this, "Connected to Google Play Services", Toast.LENGTH_SHORT).show();

    }

//
//
    @Override
    public void onDisconnected(){
    Toast.makeText(this,"Disconnected from Google Play Services", Toast.LENGTH_SHORT).show();
    }
//
    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
//        if(connectionResult.hasResolution()) {
//            try{
//                connectionResult.startResolutionForResult(this,CONNECTION_FAILURE_RESOLUTION_REQUEST);
//            }
//            catch(IntentSender.SendIntentException e) {
//                e.printStackTrace();
//            }
//        }
//        else {
////            showErrorDialog(connectionResult.getErrorCode());
//        }

    }
//    /**
//     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
//     * just add a marker near Africa.
//     * <p/>
//     * This should only be called once and when we are sure that {@link #mMap} is not null.
//     */
    private void drawMarker(Location location, int number) {
//        mMap.clear();
        LatLng currentPosition = new LatLng(location.getLatitude(), location.getLongitude());
        Marker marker = mMap.addMarker(new MarkerOptions().position(currentPosition).draggable(true).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
                .snippet("Lat:" + location.getLatitude() + "Lng:" + location.getLongitude()));
        LatLng loc1 = new LatLng(location.getLatitude(), location.getLongitude());
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(loc1, 18));
        onInfoWindowClick(marker,number);
    }
//
    public void onInfoWindowClick(Marker marker, int number) {
        Intent intent = new Intent(this, MainActivity.class);
//        intent.putExtra("position", marker.getPosition());
//        Bundle bundle = new Bundle();
        switch (number) {
            case 0:
                intent.putExtra("VAL", 0);
                break;
            case 1:
                intent.putExtra("VAL", 1);
                break;
            case 2:
                intent.putExtra("VAL", 2);
                break;
            case 3:
                intent.putExtra("VAL", 3);
                break;
            case 4:
                intent.putExtra("VAL", 4);
                break;
            case 5:
                intent.putExtra("VAL", 5);
                break;
            case 6:
                intent.putExtra("VAL", 6);
                break;
            case 7:
                intent.putExtra("VAL", 7);
                break;
            case 8:
                intent.putExtra("VAL", 8);
                break;
            case 9:
                intent.putExtra("VAL", 9);
                break;
            case 10:
                intent.putExtra("VAL", 10);
                break;

        }
//        intent.putExtras(bundle);
        startActivity(intent);
    }
//
//




    @Override
    public void onLocationChanged(Location location) {
        if (mMap != null && myLocationClient.getLastLocation() != location) {


            zoomLocation(location.getLatitude(), location.getLongitude());
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            latLng = new LatLng(latitude,longitude);
//            Toast.makeText(MapsActivity.this, latitude + "" + longitude, Toast.LENGTH_LONG).show();
//            Toast.makeText(MainActivity.this,
//                    location.getLatitude() + "" + location.getLongitude(),
//                    Toast.LENGTH_LONG).show();
            PolylineOptions pathOptions = new PolylineOptions().width(5).color(Color.BLUE).geodesic(true);
            pathOptions.add(latLng);
            Polyline line = mMap.addPolyline(pathOptions);
           // googleMap.addPolyline(new PolylineOptions().add(new LatLng(Double.parseDouble(YOUR PREVIOUS LATITUDE VALUE), Double.parseDouble(YOUR PREVIOUS LONGITUDE VALUE), new LatLng(Double.parseDouble(YOUR LATEST LATITUDE VALUE), Double.parseDouble(YOUR LATEST LONGITUDE VALUE).width(5)     .color(getResources().getColor(R.color.BLACK)).geodesic(true));



            if/*(latitude <= 42.351016 && latitude >= 42.350715 && longitude <= -71.103494 && longitude >= -71.104133)*/
                   //SHELTON
                (latitude <= 42.351358 && latitude >= 42.349789 && longitude <= -71.095814  && longitude >=-71.097938)
            {
                //BU Pub
                drawMarker(location, 0);

//
            }
            else if (latitude >= 42.349117 && latitude <= 42.349274 && longitude >= -71.096439 && longitude <= -71.095953 )
            {
                //barnes and noble
                drawMarker(location, 1);
            }
            else if (latitude >= 42.351455 && latitude <= 42.352242 && longitude >= -71.118483 && longitude <= -71.117220 )
            {
                //agganis
                drawMarker(location, 2);
            }
            else if (latitude >=42.348893 && latitude <= 42.349319 && longitude >= -71.102766 && longitude <= -71.101748)
            {
                //com beach
                drawMarker(location, 3);
            }
            else if (latitude <= 42.349438 && latitude >= 42.349361 && longitude <= -71.102987 && longitude >= -71.103160)
            {
                //Warren Starbucks
                drawMarker(location, 4);
            }
            else if (latitude >= 42.353062 && latitude <= 42.353423 && longitude <= -71.107385 && longitude >= -71.108083)
            {
                //Boat House
                drawMarker(location, 5);
            }
            else if (latitude <= 42.350563 && latitude >= 42.350413 && longitude <= -71.106301 && longitude >= -71.106624)
            {
                //Marsh Chapel
                drawMarker(location, 6);
            }
            else if(latitude <= 42.353175 && latitude >= 42.35236 && longitude <= -71.117593 && longitude >= -71.118095)
            {
                //Stuvi2
                drawMarker(location, 7);
            }
            else if (latitude >= 42.348659 && latitude <= 42.349174 && longitude <= -71.106683 && longitude >= -71.106876)
            {
                //South Bridge
                drawMarker(location, 8);
            }
            else if (latitude <= 42.350796 && latitude >= 42.350633 && longitude <= -71.108358 && longitude >= -71.108677 )
            {
                //GSU
                drawMarker(location, 9);
            }
        }

    }




        private void zoomLocation(double lat, double lng) {
        changeCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(new LatLng(lat, lng))
                .bearing(0)
                .zoom(18)
                .tilt(25)
                .build()), new GoogleMap.CancelableCallback(){
            @Override
            public void onFinish(){

            }
            @Override
            public void onCancel() {

            }
                });
         }


        private void changeCamera(CameraUpdate update, GoogleMap.CancelableCallback callback){
            mMap.moveCamera(update);
         }




    @Override
    protected void onResume() {
        super.onResume();
//        setUpMapIfNeeded();
//        createLocationClient();
        myLocationClient.connect();

    }


    protected void onPause()
    {
        super.onPause();
            myLocationClient.disconnect();

    }

    public void onMapClick(LatLng point) {
//        mMap.animateCamera(CameraUpdateFactory.newLatLng(point));
        CameraPosition cameraPosition = new CameraPosition.Builder().target(point).zoom(7).build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }




}


