package tw.org.iii.possystem;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ActMain extends AppCompatActivity {

    int cup=0,price=0,smoney=0,plusmoney=0,paymoney=0,allbcup=0,allgcup=0,allmcup=0,alltotal=0,Mincup=0;
    String today="" ,todayall="", alllist="";
    boolean black=false,green = false,milk=false;
    private View.OnClickListener blacktea_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            price = 20;
            lblst2.setText("20");
            today += "紅茶";
            black=true;
        }
    };
    private View.OnClickListener greentea_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            price = 20;
            lblst2.setText("20");
            today += "綠茶";
            green=true;
        }
    };
    private View.OnClickListener milktea_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            price = 35;
            lblst2.setText("35");
            today += "奶茶";
            milk=true;
        }
    };
    private View.OnClickListener btn1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(black == true || green == true || milk == true){
                cup = 1;
                lblst2.setText(String.valueOf(price*cup));
            }else{
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("尚未選擇飲料");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }

        }
    };
    private View.OnClickListener btn2_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(black == true || green == true || milk == true){
                cup = 2;
                lblst2.setText(String.valueOf(price*cup));
            }else{
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("尚未選擇飲料");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }
        }
    };
    private View.OnClickListener btn3_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(black == true || green == true || milk == true){
                cup = 3;
                lblst2.setText(String.valueOf(price*cup));
            }else{
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("尚未選擇飲料");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }
        }
    };
    private View.OnClickListener btn4_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(black == true || green == true || milk == true){
                cup = 4;
                lblst2.setText(String.valueOf(price*cup));
            }else{
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("尚未選擇飲料");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }
        }
    };
    private View.OnClickListener btn5_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(black == true || green == true || milk == true){
                cup = 5;
                lblst2.setText(String.valueOf(price*cup));
            }else{
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("尚未選擇飲料");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }
        }
    };
    private View.OnClickListener btn6_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(black == true || green == true || milk == true){
                cup = 6;
                lblst2.setText(String.valueOf(price*cup));
            }else{
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("尚未選擇飲料");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }
        }
    };
    private View.OnClickListener btn7_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(black == true || green == true || milk == true){
                cup = 7;
                lblst2.setText(String.valueOf(price*cup));
            }else{
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("尚未選擇飲料");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }
        }
    };
    private View.OnClickListener btn8_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(black == true || green == true || milk == true){
                cup = 8;
                lblst2.setText(String.valueOf(price*cup));
            }else{
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("尚未選擇飲料");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }
        }
    };
    private View.OnClickListener btn9_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(black == true || green == true || milk == true){
                cup = 9;
                lblst2.setText(String.valueOf(price*cup));
            }else{
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("尚未選擇飲料");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }
        }
    };
    private View.OnClickListener btnOK_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(cup ==0 && price == 0){
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("未選擇飲料及杯數");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }else if(cup == 0 && price >0){
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("未選擇杯數");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }else{
                if(black == true){
                    allbcup += cup;
                    black = false;
                }else if (green == true){
                    allgcup += cup;
                    green = false;
                }
                else if (milk == true){
                    allmcup += cup;
                    milk = false;
                }

                today += "   " + cup + "杯  ";

                sweetcheck();
                icecheck();

                if(lbltotal.length() != 0){
                    smoney = Integer.valueOf(lbltotal.getText().toString());
                    lbltotal.setText(String.valueOf((cup*price)+smoney));
                }else
                {
                    lbltotal.setText(String.valueOf(cup*price));
                }

                today += "    "+String.valueOf(cup*price) + "元";

                todayall += today+"\n";

                price = 0;
                cup = 0;
                smoney=0;
                today = "";
                lblst2.setText("");
                sweet.clearCheck();
                ice.clearCheck();
            }

        }
    };

    private View.OnClickListener btnMin_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(cup ==0 && price == 0){
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("未選擇飲料及杯數");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }else if(cup == 0 && price >0){
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("未選擇杯數");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }else{
                if(black == true){
                    allbcup -= cup;
                    black = false;
                }else if (green == true){
                    allgcup -= cup;
                    green = false;
                }
                else if (milk == true){
                    allmcup -= cup;
                    milk = false;
                }

                today += "    "+cup+"杯   ";
                sweetcheck();
                icecheck();

                Mincup =   Integer.valueOf(lblst2.getText().toString());
                smoney = Integer.valueOf(lbltotal.getText().toString());
                lbltotal.setText(String.valueOf(smoney-Mincup));
                today += "    "+String.valueOf(cup*price) + "元 (扣除)";
                todayall += today+"\n";
                price = 0;
                cup = 0;
                smoney=0;
                today = "";
                lblst2.setText("");
                sweet.clearCheck();
                ice.clearCheck();
            }
        }
    };

    private View.OnClickListener btntotal_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            alllist += "紅茶 : " + allbcup + "  " +  allbcup*20  ;
            alllist += "\n綠茶 : " + allgcup + "  " + allgcup*20 ;
            alllist += "\n奶茶 : " + allmcup + "  " + allmcup*35 ;
            alllist += "\n----------------------------\n總銷售額 : " + alltotal;

            builder = new AlertDialog.Builder(ActMain.this);
            builder.setTitle("今日總銷售");
            builder.setMessage(alllist);
            builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    allbcup = 0 ;
                    allgcup = 0;
                    allmcup = 0;
                    alltotal = 0;
                    alllist ="";
                    return;
                }
            });
            Dialog dialog = builder.create();
            dialog.show();//呈現對話視窗
        }
    };
    private View.OnClickListener btnCheckout_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(todayall == ""){
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("通知");
                builder.setMessage("目前沒有訂單");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }else{
                if(txtpay.length() == 0 ){
                    builder = new AlertDialog.Builder(ActMain.this);
                    builder.setTitle("提醒");
                    builder.setMessage("尚未收款");
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            return;
                        }
                    });
                    Dialog dialog = builder.create();
                    dialog.show();//呈現對話視窗
                }
                else{
                    plusmoney =Integer.valueOf(lbltotal.getText().toString());
                    paymoney =Integer.valueOf( txtpay.getText().toString());
                    if(paymoney < plusmoney){
                        builder = new AlertDialog.Builder(ActMain.this);
                        builder.setTitle("提醒");
                        builder.setMessage("支付金額不足 "+(plusmoney-paymoney)+" 元");
                        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                return;
                            }
                        });
                        Dialog dialog = builder.create();
                        dialog.show();//呈現對話視窗
                    }else{

                        alltotal +=plusmoney;
                        todayall +="---------------------------------------------------------\n總額 :"+plusmoney ;
                        todayall += "     收款 :" + paymoney;
                        todayall += "\n應找 :" + (paymoney-plusmoney);

                        lbltotal.setText("");
                        smoney=0;

                        builder = new AlertDialog.Builder(ActMain.this);
                        builder.setTitle("訂單明細");
                        builder.setMessage(todayall);
                        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                txtpay.setText("");
                                return;
                            }
                        });
                        Dialog dialog = builder.create();
                        dialog.show();//呈現對話視窗
                        todayall="";
                    }
                }
            }


        }
    };
    private View.OnClickListener btnCancel_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            price = 0;
            cup = 0;
            smoney=0;
            today = "";
            lblst2.setText("");
            sweet.clearCheck();
            ice.clearCheck();
        }
    };
    private CompoundButton.OnCheckedChangeListener cheked =new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, final boolean isChecked) {
            if(isChecked == true){
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("優惠活動");
                builder.setMessage("買五送一活動於明年1月開始");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        checkSale.setChecked(false);
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();//呈現對話視窗
            }else
            {

            }
        }
    };

    private void icecheck() {
        if(rbtnless.isChecked() == true){
            today += "少冰";
        }else if(rbtnmicro.isChecked() == true){
            today += "微冰";
        }
        else if(rbtngowith.isChecked() == true){
            today += "去冰";
        }else{
            today += "正常冰";
        }
    }

    private void sweetcheck() {
        if(rbtn3.isChecked() == true){
            today += "   3分糖";
        }else if(rbtn5.isChecked() == true){
            today += "   5分糖";
        }
        else if(rbtn8.isChecked() == true){
            today += "   8分糖";
        }else if(rbtnNo.isChecked() == true){
            today += "   無糖";
        }else{
            today += "   全糖";
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();
    }

    private void InitialComponent() {
        blacktea = findViewById(R.id.btnBlackTea);
        blacktea.setOnClickListener(blacktea_click);
        greentea = findViewById(R.id.btnGreenTea);
        greentea .setOnClickListener(greentea_click);
        milktea = findViewById(R.id.btnMilkTea);
        milktea .setOnClickListener( milktea_click);
        btn1 = findViewById(R.id.btn1);
        btn1 .setOnClickListener( btn1_click);
        btn2 = findViewById(R.id.btn2);
        btn2 .setOnClickListener( btn2_click);
        btn3= findViewById(R.id.btn3);
        btn3 .setOnClickListener( btn3_click);
        btn4 = findViewById(R.id.btn4);
        btn4 .setOnClickListener( btn4_click);
        btn5 = findViewById(R.id.btn5);
        btn5 .setOnClickListener( btn5_click);
        btn6 = findViewById(R.id.btn6);
        btn6  .setOnClickListener( btn6_click);
        btn7 = findViewById(R.id.btn7);
        btn7 .setOnClickListener( btn7_click);
        btn8= findViewById(R.id.btn8);
        btn8 .setOnClickListener( btn8_click);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener( btn9_click);
        btnOK = findViewById(R.id.btnOK);
        btnOK .setOnClickListener( btnOK_click);
        btnMin = findViewById(R.id.btnMin);
        btnMin .setOnClickListener( btnMin_click);
        btntotal = findViewById(R.id.btntotal);
        btntotal.setOnClickListener( btntotal_click);
        btnCheckout = findViewById(R.id.btnCheckout);
        btnCheckout .setOnClickListener( btnCheckout_click);
        rbtn3 = findViewById(R.id.rbtn3);
        rbtn5 = findViewById(R.id.rbtn5);
        rbtn8 = findViewById(R.id.rbtn8);
        rbtnNo = findViewById(R.id.rbtnNo);
        rbtnless = findViewById(R.id.rbtnless);
        rbtnmicro= findViewById(R.id.rbtnmicro);
        rbtngowith = findViewById(R.id.rbtngowith);
        lbltotal = findViewById(R.id.lbltotal);
        lblst2 = findViewById(R.id.lblst2);
        txtpay = findViewById(R.id.txtpay);
        sweet = findViewById(R.id.sweet);
        ice = findViewById(R.id.ice);
        btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(btnCancel_click);
        checkSale = findViewById(R.id.checkSale);
        checkSale.setOnCheckedChangeListener(cheked);
    }

    Button blacktea,greentea,milktea,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnOK,btnMin,btntotal,btnCheckout,btnCancel;
    RadioButton rbtn8,rbtn5,rbtn3,rbtnNo,rbtnless,rbtnmicro,rbtngowith;
    TextView lbltotal,lblst2;
    EditText txtpay;
    CheckBox checkSale;
    AlertDialog.Builder builder;
    RadioGroup sweet,ice;


}
