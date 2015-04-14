package com.maxiran.maxiran.game2048;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;
public class GameView extends GridLayout{

    public GameView(Context context,AttributeSet attrs,int defStyle) {
        super(context, attrs, defStyle);
        initGameView();
    }

    public GameView(Context context) {
        super(context);
        initGameView();
        }

    public GameView(Context context, AttributeSet attrs){
        super(context, attrs);
        initGameView();
            }

    private void initGameView(){
        setOnTouchListener(new OnTouchListener(){
            private float startX,startY,offsetX,offsetY;
            public boolean onTouch(View v,MotionEvent event){
               switch (event.getAction()){
                   case MotionEvent.ACTION_DOWN:
                       startX = event.getX();
                       startY = event.getY();
                       break;
                   case MotionEvent.ACTION_UP:
                       offsetX = event.getX()-startX;
                       offsetY = event.getY()-startY;

                       if (Math.abs(offsetX)>Math.abs(offsetY)){
                           if (offsetX<-5){
                              swipeLeft();
                           }else if (offsetX>5){
                              swipeRight();
                           }
                       }else {
                           if (offsetY<-5){
                              swipeUp();
                           }else if (offsetY>5){
                              swipeDown();
                           }
                       }
                       break;
               }
                return true;
            }
        });
    }

    private void swipeLeft(){

    }
    private void swipeRight(){

    }
    private void swipeUp(){

    }
    private void swipeDown(){

    }
        }
