package ec327.riddlerace;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;





public class FinishRace extends Activity {


   /* ImageView Photo1, Photo2, Photo3, Photo4, Photo5, Photo6, Photo7, Photo8, Photo9, Photo10;
    Button c;
    View s;
    View s2;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_race);

        //c = (Button) findViewById(R.id.choose);

/*
        Photo1 = (ImageView) findViewById(R.id.photo1);
        Photo2 = (ImageView) findViewById(R.id.photo2);
        Photo3 = (ImageView) findViewById(R.id.photo3);
        Photo4 = (ImageView) findViewById(R.id.photo4);
        Photo5 = (ImageView) findViewById(R.id.photo5);
        Photo6 = (ImageView) findViewById(R.id.photo6);
        Photo7 = (ImageView) findViewById(R.id.photo7);
        Photo8 = (ImageView) findViewById(R.id.photo8);
        Photo9 = (ImageView) findViewById(R.id.photo9);
        Photo10 = (ImageView) findViewById(R.id.photo10);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }


        });
        s = findViewById(R.id.mainMenu);
        s.setVisibility(View.GONE);

//        s2 = findViewById(R.id.choose);
//        s2.setVisibility(View.VISIBLE);
    }

*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_finish_race, menu);
        return true;
    }

//    private void selectImage() {
//
//        final CharSequence[] options = {"Choose from Gallery"};
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(FinishRace.this);
//
//        builder.setItems(options, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int item) {
//
//                Intent intent = new   Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                startActivityForResult(intent, 2);
//
//            }
//        });
//        builder.show();
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == RESULT_OK) {
//            if (requestCode == 1) {
//                File f = new File(Environment.getExternalStorageDirectory().toString());
//                for (File temp : f.listFiles()) {
//                    if (temp.getName().equals("temp.jpg")) {
//                        f = temp;
//                        break;
//                    }
//                }
//                try {
//                    Bitmap bitmap;
//                    BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
//
//                    bitmap = BitmapFactory.decodeFile(f.getAbsolutePath(),
//                            bitmapOptions);
//
//                    Photo1.setImageBitmap(bitmap);
////                    Photo2.setImageBitmap(bitmap);
////                    Photo3.setImageBitmap(bitmap);
////                    Photo4.setImageBitmap(bitmap);
////                    Photo5.setImageBitmap(bitmap);
////                    Photo6.setImageBitmap(bitmap);
////                    Photo7.setImageBitmap(bitmap);
////                    Photo8.setImageBitmap(bitmap);
////                    Photo9.setImageBitmap(bitmap);
////                    Photo10.setImageBitmap(bitmap);
//
//                    String path = android.os.Environment
//                            .getExternalStorageDirectory()
//                            + File.separator
//                            + "Phoenix" + File.separator + "default";
//                    f.delete();
//                    OutputStream outFile = null;
//                    File file = new File(path, String.valueOf(System.currentTimeMillis()) + ".jpg");
//                    try {
//                        outFile = new FileOutputStream(file);
//                        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, outFile);
//                        outFile.flush();
//                        outFile.close();
//                    } catch (FileNotFoundException e) {
//                        e.printStackTrace();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            } else if (requestCode == 2) {
//
//                Uri selectedImage = data.getData();
//                String[] filePath = { MediaStore.Images.Media.DATA };
//                Cursor c = getContentResolver().query(selectedImage,filePath, null, null, null);
//                c.moveToFirst();
//                int columnIndex = c.getColumnIndex(filePath[0]);
//                String picturePath = c.getString(columnIndex);
//                c.close();
//                Bitmap thumbnail = (BitmapFactory.decodeFile(picturePath));
//                Log.w("path of image from gallery......******************.........", picturePath+"");
//
//
//            }
//        }
//    }
}