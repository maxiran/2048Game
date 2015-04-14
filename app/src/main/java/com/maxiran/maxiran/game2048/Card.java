package com.maxiran.maxiran.game2048;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * 定义单个卡片的布局为FrameLayout
 */
public class Card extends FrameLayout {

      public Card(Context context){
          super(context);
          /**
           * 设定TextView属性
           */
            label = new TextView(getContext());
            label.setTextSize(32);
            label.setBackgroundColor(0x33ffffff);
            label.setGravity(Gravity.CENTER);
            LayoutParams lp = new LayoutParams(-1,-1);
            lp.setMargins(10,10,0,0 );
          /**
           * 将属性添加到Card中去
           */
            addView(label,lp);

          setNum(0);
      }
    private int num = 0;

    public void setNum(int num) {
        this.num = num;
        if(num<=0){
            label.setText("");
        }else {
            label.setText(num+"");
        }
    }

    public int getNum() {
        return num;
    }

    public boolean equals(Card o) {
        return getNum()==o.getNum();
    }

    private TextView label;
}
