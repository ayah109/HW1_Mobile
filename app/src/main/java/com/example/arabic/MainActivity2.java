package com.example.arabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imageView;

    private void setCheckboxValuesForButton(CheckBox[] checkBoxes, String[] values) {
        for (int i = 0; i < checkBoxes.length; i++) {
            checkBoxes[i].setText(values[i]);
        }
    }

    public CheckBox checkBox1;
    public CheckBox checkBox2;
    public CheckBox checkBox3;
    public CheckBox checkBox4;
    public CheckBox checkBox5;
    public CheckBox checkBox6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageView2);

        // get references to all the buttons
        Button buttonA = findViewById(R.id.button_a);
        Button buttonB = findViewById(R.id.button_b);
        Button buttonC = findViewById(R.id.button_c);
        Button buttonD = findViewById(R.id.button_d);
        Button buttonE = findViewById(R.id.button_e);
        Button buttonF = findViewById(R.id.button_f);
        Button buttonG = findViewById(R.id.button_g);
        Button buttonH = findViewById(R.id.button_h);
        Button buttonI = findViewById(R.id.button_i);
        Button buttonJ = findViewById(R.id.button_j);
        Button buttonK = findViewById(R.id.button_k);
        Button buttonL = findViewById(R.id.button_l);
        Button buttonM = findViewById(R.id.button_m);
        Button buttonN = findViewById(R.id.button_n);
        Button buttonO = findViewById(R.id.button_o);
        Button buttonP = findViewById(R.id.button_p);
        Button buttonQ = findViewById(R.id.button_q);
        Button buttonR = findViewById(R.id.button_r);
        Button buttonS = findViewById(R.id.button_s);
        Button buttonT = findViewById(R.id.button_t);
        Button buttonU = findViewById(R.id.button_u);
        Button buttonV = findViewById(R.id.button_v);
        Button buttonW = findViewById(R.id.button_w);
        Button buttonX = findViewById(R.id.button_x);
        Button buttonY = findViewById(R.id.button_y);
        Button buttonZ = findViewById(R.id.button_z);
        Button buttonwaw = findViewById(R.id.button_za);
        Button buttonyaa = findViewById(R.id.button_ze);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox4);
        checkBox4 = findViewById(R.id.checkBox7);
        checkBox5 = findViewById(R.id.checkBox6);
        checkBox6 = findViewById(R.id.checkBox5);

        TextView myTextView = findViewById(R.id.textView);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity2.this, "أحسنت يا بطل", Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity2.this, R.raw.clap);
                    mp.start();
                }
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity2.this, "أحسنت يا بطل", Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity2.this, R.raw.clap);
                    mp.start();
                }
            }
        });
        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity2.this, "أحسنت يا بطل", Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity2.this, R.raw.clap);
                    mp.start();
                }
            }
        });


        // set click listeners for all the buttons
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.j);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الجيم");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_A_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);

                MediaPlayer mp1 = MediaPlayer.create(MainActivity2.this, R.raw.gem);
                mp1.start();
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.the);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الثاء");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_B_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }


        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.t);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف التاء");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_C_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.b);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الباء");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_D_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.a);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الألف");
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_E_VALUES);
                MediaPlayer mp2 = MediaPlayer.create(MainActivity2.this, R.raw.alef);
                mp2.start();


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Start the RecyclerView activity here
                        Intent intent = new Intent(MainActivity2.this, RecyclerViews.class);
                        startActivity(intent);
                    }
                }, 3000); // 5000 milliseconds = 5 seconds
            }
        });

        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.r);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الراء");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_F_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.th);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الذال");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_G_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.d);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الدال");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_H_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.kh);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الخاء");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_I_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.h);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الحاء");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_J_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.da);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الضاد");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_K_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.sa);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الصاد");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_L_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });


        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.sh);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الشين");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_M_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.s);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف السين");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_N_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.z);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الزاي");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_O_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.fa);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الفاء");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_P_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.gh);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الغين");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_Q_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.aa);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف العين");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_R_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.tha);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الظاء");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_S_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.ta);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الطاء");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_T_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.n);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف النون");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_U_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.m);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الميم");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_V_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.l);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف اللام");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_W_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.k);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الكاف");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_X_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.ka);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف القاف");
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_Y_VALUES);
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
            }
        });

        buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.ha);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الهاء");
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_Z_VALUES);
            }
        });

        buttonwaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.o);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الواو");
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_waw_VALUES);
            }
        });

        buttonyaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.e);
                myTextView.setText("ضع اشارة صح بجانب الكلمة التي تحتوي على حرف الياء");
                checkBox4.setVisibility(View.VISIBLE);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox5.setVisibility(View.VISIBLE);
                checkBox6.setVisibility(View.VISIBLE);
                setCheckboxValuesForButton(new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4, checkBox5, checkBox6}, checkBoxValues.BUTTON_ya_VALUES);
            }
        });
    }
}