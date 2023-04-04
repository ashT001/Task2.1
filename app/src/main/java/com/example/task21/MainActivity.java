package com.example.task21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button convertButton;
    Spinner sourceMeasurement;
    Spinner destinationMeasurement;
    TextView finalConversion;
    EditText amountInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertButton = findViewById(R.id.convertbutton);
        sourceMeasurement = findViewById(R.id.sourcemeasurement);
        destinationMeasurement = findViewById(R.id.destinationmeasurement);
        finalConversion = findViewById(R.id.finalconversion);
        amountInput = findViewById(R.id.amountinput);


        convertButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){


                String sourceType = sourceMeasurement.getSelectedItem().toString();
                String destinationType = destinationMeasurement.getSelectedItem().toString();
                String amountStr = String.valueOf(amountInput.getText()); // This and next line can be put into one but
                double amount = Double.parseDouble(amountStr);            //There has to be an easier way to do this
                double calc = 0;                                            //change Foot to Feet -- everywhere

                if(sourceType.equals("Centimeter")){
                    if(destinationType.equals("Inch")){             //CM > Inch
                        calc = amount/2.54;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) + " Inches!"); //
                    }
                    if(destinationType.equals("Foot")){             //CM > Ft
                        calc = amount/30.48;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) + " Feet!"); // last part of code can be modularized ala {destinationType} instead of hardcoded - change later
                    }
                    if(destinationType.equals("Yard")){             //CM > Yd
                        calc = amount/91.44;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) +" Yards!");
                    }
                    if(destinationType.equals("Mile")){             //CM > Mi
                        calc = amount/160900;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) + " Miles!");
                    }
                    if(destinationType.equals("Kilometer")){             //CM > Km
                        calc = amount/100000;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) + " Kilometers!");
                    }

                }

                if(sourceType.equals("Inch")){
                    if(destinationType.equals("Centimeter")){             //Inch > CM
                        calc = amount*2.54;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) + " Centimeters!"); // casting to int from double source - bad?
                    }
                    if(destinationType.equals("Foot")){             //Inch > Ft
                        calc = amount/12;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) + " Feet!"); //
                    }
                    if(destinationType.equals("Yard")){             //Inch > Yd
                        calc = amount/36;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) +" Yards!");
                    }
                    if(destinationType.equals("Mile")){             //Inch > Mi
                        calc = amount/63360;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) + " Miles!");
                    }
                    if(destinationType.equals("Kilometer")){             //Inch > Km
                        calc = amount/39370;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText((calc) + " Kilometers!");
                    }

                }

                if(sourceType.equals("Foot")){
                    if(destinationType.equals("Centimeter")){             //Foot > CM
                        calc = amount*30.48;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Centimeters!");
                    }
                    if(destinationType.equals("Inch")){             //Foot > In
                        calc = amount*12;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Inches!");
                    }
                    if(destinationType.equals("Yard")){             //Foot > Yd
                        calc = amount/3;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) +" Yards!");
                    }
                    if(destinationType.equals("Mile")){             //Foot > Mi
                        calc = amount/5280;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Miles!");
                    }
                    if(destinationType.equals("Kilometer")){             //Foot > Km
                        calc = amount/3281;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Kilometers!");
                    }

                }

                if(sourceType.equals("Yard")){
                    if(destinationType.equals("Centimeter")){             //Yard > CM
                        calc = amount*91.44;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Centimeters!");
                    }
                    if(destinationType.equals("Inch")){             //Yard > In
                        calc = amount*36;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Inches!");
                    }
                    if(destinationType.equals("Foot")){             //Yard > Ft
                        calc = amount*3;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) +" Feet!");
                    }
                    if(destinationType.equals("Mile")){             //Yard > Mi
                        calc = amount/1760;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Miles!");
                    }
                    if(destinationType.equals("Kilometer")){             //Yard > Km
                        calc = amount/1094;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Kilometers!");
                    }

                }

                if(sourceType.equals("Mile")){
                    if(destinationType.equals("Centimeter")){             //Mile > CM
                        calc = amount*160900;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Centimeters!");
                    }
                    if(destinationType.equals("Inch")){             //Mile > In
                        calc = amount*63360;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Inches!");
                    }
                    if(destinationType.equals("Foot")){             //Mile > Ft
                        calc = amount*5280;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) +" Feet!");
                    }
                    if(destinationType.equals("Yard")){             //Mile > Yard
                        calc = amount*1760;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Yards!");
                    }
                    if(destinationType.equals("Kilometer")){             //Mile > Km
                        calc = amount*1.609;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Kilometers!");
                    }

                }

                if(sourceType.equals("Kilometer")){
                    if(destinationType.equals("Centimeter")){             //Km > CM
                        calc = amount*100000;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Centimeters!");
                    }
                    if(destinationType.equals("Inch")){             //Km > In
                        calc = amount*39370;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Inches!");
                    }
                    if(destinationType.equals("Foot")){             //Km > Ft
                        calc = amount*3281;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) +" Feet!");
                    }
                    if(destinationType.equals("Yard")){             //Km > Yard
                        calc = amount*1094;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Yards!");
                    }
                    if(destinationType.equals("Mile")){             //Km > Mile
                        calc = amount/1.609;
                        Log.d("mylog", String.valueOf(calc));
                        finalConversion.setText(Double.toString(calc) + " Miles!");
                    }

                }
                    if(sourceType.equals("Pound")){
                        if(destinationType.equals("Kilogram")){
                            {            //LB > KG
                                calc = amount/2.205;
                                Log.d("mylog", String.valueOf(calc));
                                finalConversion.setText(Double.toString(calc) + " Kilograms!!");
                            }
                        }
                    }

                if(sourceType.equals("Kilogram")){
                    if(destinationType.equals("Pound")){
                        {            //KG > LB
                            calc = amount*2.205;
                            Log.d("mylog", String.valueOf(calc));
                            finalConversion.setText(Double.toString(calc) + " Pounds!!");
                        }
                    }
                }

                if(sourceType.equals("Celsius")){
                    if(destinationType.equals("Kelvin")){
                        {            //C > K
                            calc = amount+273.15;
                            Log.d("mylog", String.valueOf(calc));
                            finalConversion.setText(Double.toString(calc) + " Kelvin!!");
                        }
                    }
                }

                if(sourceType.equals("Kelvin")){
                    if(destinationType.equals("Celsius")){
                        {            //K > C
                            calc = amount-273.15;
                            Log.d("mylog", String.valueOf(calc));
                            finalConversion.setText(Double.toString(calc) + " Celsius!!");
                        }
                    }
                }

            }


        });




    }

}