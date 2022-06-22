package com.example.video;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

public class cacapalavra extends AppCompatActivity {

    private TextView edtTema;
    private TextView edtPalavra;
    private TextView edtDel;

    private Chronometer Crono;

    private EditText edt1, edt2, edt3, edt4, edt5, edt6, edt7, edt8, edt9 , edt10;
    private EditText edt21, edt22, edt23, edt24, edt25, edt26, edt27, edt28, edt29, edt30;
    private EditText edt31, edt32, edt33, edt34, edt35, edt36, edt37, edt38, edt39, edt40;
    private EditText edt41, edt42, edt43, edt44, edt45, edt46, edt47, edt48, edt49, edt50;
    private EditText edt51, edt52, edt53, edt54, edt55, edt56, edt57, edt58, edt59, edt60;
    private EditText edt61, edt62, edt63, edt64, edt65, edt66, edt67, edt68, edt69, edt70;
    private EditText edt71, edt72, edt73, edt74, edt75, edt76, edt77, edt78, edt79, edt80;
    private EditText edt81, edt82, edt83, edt84, edt85, edt86, edt87, edt88, edt89, edt90;


    private TextView btn1, btn2, btn3, btn4;
    private TextView btn21, btn22, btn23, btn24;
    private TextView btn31, btn32, btn33, btn34;
    private TextView btn5;

    private View view;

    private String L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L20;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cacapalavras);

        INICIALIZA();

        Crono.start();
        Crono.setFormat("Tempo - %s");

        Intent Recebedora = getIntent();
        Bundle bundle = Recebedora.getExtras();


        view = new View(getApplicationContext());
        view.setBackgroundResource(R.color.black);

        edtDel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (edtPalavra.getText().length()>0) {
                    edtPalavra.setText(edtPalavra.getText().toString().substring(0, edtPalavra.getText().length() - 1));
                }
            }
        });

                edtTema.setText("Brazilian Week");


                SET_MAP( 1,  1,1, 1,  1,  1,  0,  1,  0,  1,
                        1,1,1,1,1,1,0,1,0,1,
                        1,1,0,1,1,1,0,1,0,1,
                        1,1,0,1,1,1,0,1,0,1,
                        1,1,0,1,1,1,0,1,0,1,
                        0,0,0,0,0,0,0,0,0,0,
                        1,1,0,1,1,1,0,1,0, 1,
                        1,1,0,1,1,1,1,1,1,1);

                L1 = "T";  L2 = "P";  L3 = "O";  L4 = "C"; L20 ="R";
                L5 = "V";  L6 = "E";  L7 = "D";  L8 = "L";
                L9 = "A"; L10 = "N"; L11 = "I"; L12 = "S";

                SET_LETRA( );

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L1);
                    }
                });
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L2);
                    }
                });
                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L3);
                    }
                });
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L4);
                    }
                });
                btn21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L5);
                        if(edtPalavra.getText().toString().equals("Indians")){
                            edt7.setText("I");
                            edt27.setText("N");
                            edt37.setText("D");
                            edt47.setText("I");
                            edt57.setText("A");
                            edt67.setText("N");
                            edt77.setText("S");
                            edtPalavra.setText("");

                        }
                        if(edtPalavra.getText().toString().equals("CARAVEL")){
                            edt9.setText("C");
                            edt29.setText("A");
                            edt39.setText("R");
                            edt49.setText("A");
                            edt59.setText("V");
                            edt69.setText("E");
                            edt79.setText("L");
                            edtPalavra.setText("");

                        }
                        if(edtPalavra.getText().toString().equals("TIradentes")){
                            edt61.setText("T");
                            edt62.setText("I");
                            edt63.setText("R");
                            edt64.setText("A");
                            edt65.setText("D");
                            edt66.setText("E");
                            edt67.setText("N");
                            edt68.setText("T");
                            edt69.setText("E");
                            edt70.setText("S");
                            edtPalavra.setText("");

                        }
                        if(edtPalavra.getText().toString().equals("PEDRO")){
                            edt33.setText("P");
                            edt43.setText("E");
                            edt53.setText("D");
                            edt63.setText("R");
                            edt73.setText("O");
                            edt83.setText("A");
                            edtPalavra.setText("");
                        }
                    }
                });
                btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtPalavra.setText(edtPalavra.getText().toString() + L20);
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L6);
                    }
                });
                btn23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L7);
                    }
                });
                btn24.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L8);
                    }
                });
                btn31.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L9);
                    }
                });
                btn32.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L10);
                    }
                });
                btn33.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L11);
                    }
                });
                btn34.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edtPalavra.setText(edtPalavra.getText().toString() + L12);
                    }
                });

        }

    private void MSG_FINAL( int Ponto) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(cacapalavra.this);
        alertDialogBuilder.setTitle("PARABENS!");
        alertDialogBuilder
                .setPositiveButton("Voltar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent it = new Intent(cacapalavra.this, telaexercicios.class);
                        startActivity(it);
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    private void SET_LETRA( ){

        btn1.setText(L1);   btn2.setText(L2);   btn3.setText(L3);   btn4.setText(L4);  btn5.setText(L20);
        btn21.setText(L5);  btn22.setText(L6);  btn23.setText(L7);  btn24.setText(L8);
        btn31.setText(L9);  btn32.setText(L10); btn33.setText(L11); btn34.setText(L12);
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void SET_MAP( int B1,  int B2,  int B3,  int B4,  int B5,  int B6,  int B7,  int B8,  int B9, int B10,
                          int B21, int B22, int B23, int B24, int B25, int B26, int B27, int B28, int B29, int B30,
                          int B31, int B32, int B33, int B34, int B35, int B36, int B37, int B38, int B39, int B40,
                          int B41, int B42, int B43, int B44, int B45, int B46, int B47, int B48, int B49, int B50,
                          int B51, int B52, int B53, int B54, int B55, int B56, int B57, int B58, int B59, int B60,
                          int B61, int B62, int B63, int B64, int B65, int B66, int B67, int B68, int B69, int B70,
                          int B71,  int B72,  int B73,  int B74,  int B75,  int B76,  int B77,  int B78,  int B79, int B80,
                          int B81, int B82, int B83, int B84, int B85, int B86, int B87, int B88, int B89, int B90) {

        if( B1 == 1 ) edt1.setBackground(view.getBackground());
        if( B21 == 1 ) edt21.setBackground(view.getBackground());
        if( B31 == 1 ) edt31.setBackground(view.getBackground());
        if( B41 == 1 ) edt41.setBackground(view.getBackground());
        if( B51 == 1 ) edt51.setBackground(view.getBackground());
        if( B61== 1 ) edt61.setBackground(view.getBackground());
        if( B71 == 1 ) edt71.setBackground(view.getBackground());
        if( B81 == 1 ) edt81.setBackground(view.getBackground());

        if( B2 == 1 ) edt2.setBackground(view.getBackground());
        if( B22 == 1 ) edt22.setBackground(view.getBackground());
        if( B32 == 1 ) edt32.setBackground(view.getBackground());
        if( B42 == 1 ) edt42.setBackground(view.getBackground());
        if( B52 == 1 ) edt52.setBackground(view.getBackground());
        if( B62== 1 ) edt62.setBackground(view.getBackground());
        if( B72 == 1 ) edt72.setBackground(view.getBackground());
        if( B82 == 1 ) edt82.setBackground(view.getBackground());

        if( B3 == 1) edt3.setBackground(view.getBackground());
        if( B23 == 1 ) edt23.setBackground(view.getBackground());
        if( B33== 1 ) edt33.setBackground(view.getBackground());
        if( B43== 1 ) edt43.setBackground(view.getBackground());
        if( B53== 1 ) edt53.setBackground(view.getBackground());
        if( B63== 1 ) edt63.setBackground(view.getBackground());
        if( B73== 1 ) edt73.setBackground(view.getBackground());
        if( B83== 1 ) edt83.setBackground(view.getBackground());

        if( B4 == 1 ) edt4.setBackground(view.getBackground());
        if( B24 == 1 ) edt24.setBackground(view.getBackground());
        if( B34 == 1 ) edt34.setBackground(view.getBackground());
        if( B44 == 1 ) edt44.setBackground(view.getBackground());
        if( B54 == 1 ) edt54.setBackground(view.getBackground());
        if( B64== 1 ) edt64.setBackground(view.getBackground());
        if( B74 == 1 ) edt74.setBackground(view.getBackground());
        if( B84 == 1 ) edt84.setBackground(view.getBackground());

        if( B5 == 1 ) edt5.setBackground(view.getBackground());
        if( B25 == 1 ) edt25.setBackground(view.getBackground());
        if( B35 == 1 ) edt35.setBackground(view.getBackground());
        if( B45 == 1 ) edt45.setBackground(view.getBackground());
        if( B55 == 1 ) edt55.setBackground(view.getBackground());
        if( B65== 1 ) edt65.setBackground(view.getBackground());
        if( B75 == 1 ) edt75.setBackground(view.getBackground());
        if( B85 == 1 ) edt85.setBackground(view.getBackground());

        if( B6 == 1 ) edt6.setBackground(view.getBackground());
        if( B26 == 1 ) edt26.setBackground(view.getBackground());
        if( B36 == 1 ) edt36.setBackground(view.getBackground());
        if( B46 == 1 ) edt46.setBackground(view.getBackground());
        if( B56 == 1 ) edt56.setBackground(view.getBackground());
        if( B66== 1 ) edt66.setBackground(view.getBackground());
        if( B76 == 1 ) edt76.setBackground(view.getBackground());
        if( B86 == 1 ) edt86.setBackground(view.getBackground());

        if( B7== 1 ) edt7.setBackground(view.getBackground());
        if( B27== 1 ) edt27.setBackground(view.getBackground());
        if( B37== 1 ) edt37.setBackground(view.getBackground());
        if( B47 == 1 ) edt47.setBackground(view.getBackground());
        if( B57 == 1 ) edt57.setBackground(view.getBackground());
        if( B67 == 1 ) edt67.setBackground(view.getBackground());
        if( B77 == 1 ) edt77.setBackground(view.getBackground());
        if( B87 == 1 ) edt87.setBackground(view.getBackground());

        if( B8 == 1) edt8.setBackground(view.getBackground());
        if( B28 == 1 ) edt28.setBackground(view.getBackground());
        if( B38 == 1 ) edt38.setBackground(view.getBackground());
        if( B48 == 1 ) edt48.setBackground(view.getBackground());
        if( B58 == 1 ) edt58.setBackground(view.getBackground());
        if( B68 == 1 ) edt68.setBackground(view.getBackground());
        if( B78 == 1 ) edt78.setBackground(view.getBackground());
        if( B88 == 1 ) edt88.setBackground(view.getBackground());

        if( B9 == 1 ) edt9.setBackground(view.getBackground());
        if( B29 == 1 ) edt29.setBackground(view.getBackground());
        if( B39 == 1 ) edt39.setBackground(view.getBackground());
        if( B49 == 1 ) edt49.setBackground(view.getBackground());
        if( B59 == 1 ) edt59.setBackground(view.getBackground());
        if( B69 == 1 ) edt69.setBackground(view.getBackground());
        if( B79 == 1 ) edt79.setBackground(view.getBackground());
        if( B89 == 1 ) edt89.setBackground(view.getBackground());

        if( B10 == 1 ) edt10.setBackground(view.getBackground());
        if( B30 == 1 ) edt30.setBackground(view.getBackground());
        if( B40 == 1 ) edt40.setBackground(view.getBackground());
        if( B50 == 1 ) edt50.setBackground(view.getBackground());
        if( B60 == 1 ) edt60.setBackground(view.getBackground());
        if( B70 == 1 ) edt70.setBackground(view.getBackground());
        if( B80 == 1 ) edt80.setBackground(view.getBackground());
        if( B90 == 1 ) edt90.setBackground(view.getBackground());
    }
    private void INICIALIZA( ) {

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        edt4 = findViewById(R.id.edt4);
        edt5 = findViewById(R.id.edt5);
        edt6 = findViewById(R.id.edt6);
        edt7 = findViewById(R.id.edt7);
        edt8 = findViewById(R.id.edt8);
        edt9 = findViewById(R.id.edt9);
        edt10 = findViewById(R.id.edt10);

        edt21 = findViewById(R.id.edt21);
        edt22 = findViewById(R.id.edt22);
        edt23 = findViewById(R.id.edt23);
        edt24 = findViewById(R.id.edt24);
        edt25 = findViewById(R.id.edt25);
        edt26 = findViewById(R.id.edt26);
        edt27 = findViewById(R.id.edt27);
        edt28 = findViewById(R.id.edt28);
        edt29 = findViewById(R.id.edt29);
        edt30 = findViewById(R.id.edt30);


        edt31 = findViewById(R.id.edt31);
        edt32 = findViewById(R.id.edt32);
        edt33 = findViewById(R.id.edt33);
        edt34 = findViewById(R.id.edt34);
        edt35 = findViewById(R.id.edt35);
        edt36 = findViewById(R.id.edt36);
        edt37 = findViewById(R.id.edt37);
        edt38 = findViewById(R.id.edt38);
        edt39 = findViewById(R.id.edt39);
        edt40 = findViewById(R.id.edt40);

        edt41 = findViewById(R.id.edt41);
        edt42 = findViewById(R.id.edt42);
        edt43 = findViewById(R.id.edt43);
        edt44 = findViewById(R.id.edt44);
        edt45 = findViewById(R.id.edt45);
        edt46 = findViewById(R.id.edt46);
        edt47 = findViewById(R.id.edt47);
        edt48 = findViewById(R.id.edt48);
        edt49 = findViewById(R.id.edt49);
        edt50 = findViewById(R.id.edt50);

        edt51 = findViewById(R.id.edt51);
        edt52 = findViewById(R.id.edt52);
        edt53 = findViewById(R.id.edt53);
        edt54 = findViewById(R.id.edt54);
        edt55 = findViewById(R.id.edt55);
        edt56 = findViewById(R.id.edt56);
        edt57 = findViewById(R.id.edt57);
        edt58 = findViewById(R.id.edt58);
        edt59 = findViewById(R.id.edt59);
        edt60 = findViewById(R.id.edt60);

        edt61 = findViewById(R.id.edt61);
        edt62 = findViewById(R.id.edt62);
        edt63 = findViewById(R.id.edt63);
        edt64 = findViewById(R.id.edt64);
        edt65 = findViewById(R.id.edt65);
        edt66 = findViewById(R.id.edt66);
        edt67 = findViewById(R.id.edt67);
        edt68 = findViewById(R.id.edt68);
        edt69 = findViewById(R.id.edt69);
        edt70 = findViewById(R.id.edt70);

        edt71 = findViewById(R.id.edt71);
        edt72 = findViewById(R.id.edt72);
        edt73 = findViewById(R.id.edt73);
        edt74 = findViewById(R.id.edt74);
        edt75 = findViewById(R.id.edt75);
        edt76 = findViewById(R.id.edt76);
        edt77 = findViewById(R.id.edt77);
        edt78 = findViewById(R.id.edt78);
        edt79 = findViewById(R.id.edt79);
        edt80 = findViewById(R.id.edt80);

        edt81 = findViewById(R.id.edt81);
        edt82 = findViewById(R.id.edt82);
        edt83 = findViewById(R.id.edt83);
        edt84 = findViewById(R.id.edt84);
        edt85 = findViewById(R.id.edt85);
        edt86 = findViewById(R.id.edt86);
        edt87 = findViewById(R.id.edt87);
        edt88 = findViewById(R.id.edt88);
        edt89 = findViewById(R.id.edt89);
        edt90 = findViewById(R.id.edt90);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);

        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);
        btn34 = findViewById(R.id.btn34);

        edtTema = findViewById(R.id.edtTema);
        edtPalavra = findViewById(R.id.edtPalavra);
        edtDel = findViewById(R.id.edtDel);

        Crono = findViewById(R.id.Crono);
    }
     }