package com.rookisland.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/* A simple calculator that I decided to code for Android after having to do the same
 * thing for an iOS course.
 *
 * @author Ryan Martin (2015)
 */

public class MainActivity extends ActionBarActivity {

    private String operand;  // class variable used to store operand
    private double firstNum;  // the first number in the expression to get evaluated
    private boolean isDouble;

    public MainActivity() {  // constructor
        firstNum = 0;
        operand = "";
        isDouble = false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

/* ---------------------------------------------------------------------------------------------- */

    /* * button handler functions below * */

    /* Numerical button handlers here */
    public void bOne(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (tView.getText().toString().equals("0")) {  // entering first or second number

            tView.setText("1");
        }
        else {  // append current text string with "1" and set correct variable

            tView.setText(tView.getText().toString() + "1");
        }
    }

    public void bTwo(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (tView.getText().toString().equals("0")) {

            tView.setText("2");
        }
        else {  // append current text string with "2"

            tView.setText(tView.getText().toString() + "2");
        }
    }

    public void bThree(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (tView.getText().toString().equals("0")) {

            tView.setText("3");
        }
        else {  // append current text string with "3"

            tView.setText(tView.getText().toString() + "3");
        }
    }

    public void bFour(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (tView.getText().toString().equals("0")) {

            tView.setText("4");
        }
        else {  // append current text string with "4"

            tView.setText(tView.getText().toString() + "4");
        }
    }

    public void bFive(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (tView.getText().toString().equals("0")) {

            tView.setText("5");
        }
        else {  // append current text string with "5"

            tView.setText(tView.getText().toString() + "5");
        }
    }

    public void bSix(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (tView.getText().toString().equals("0")) {

            tView.setText("6");
        }
        else {  // append current text string with "6"

            tView.setText(tView.getText().toString() + "6");
        }
    }

    public void bSeven(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (tView.getText().toString().equals("0")) {

            tView.setText("7");
        }
        else {  // append current text string with "7"

            tView.setText(tView.getText().toString() + "7");
        }
    }

    public void bEight(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (tView.getText().toString().equals("0")) {

            tView.setText("8");
        }
        else {  // append current text string with "8"

            tView.setText(tView.getText().toString() + "8");
        }
    }

    public void bNine(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (tView.getText().toString().equals("0")) {

            tView.setText("9");
        }
        else {  // append current text string with "9"

            tView.setText(tView.getText().toString() + "9");
        }
    }

    public void bZero(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (!tView.getText().toString().equals("0")) {

            tView.setText(tView.getText().toString() + "0");
        }
    }

    public void bDot(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (!tView.getText().toString().contains(".")) tView.setText(tView.getText().toString() + ".");
        isDouble = true;
    }

    /* Clear, Delete and Equals button handlers here */

    public void bClear(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        tView.setText("0");
        firstNum = 0.0;
        operand = "";
        isDouble = false;
    }

    public void bDel(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (!tView.getText().toString().equals("0")) {

            if (tView.getText().toString().contains(".")) isDouble = false;
            tView.setText("0");
        }
        else if (!operand.equals("")) {

            operand = "";
        }
        else if (firstNum != 0.0) {

            if (Double.toString(firstNum).contains(".")) isDouble = false;
            firstNum = 0.0;
        }
    }

    /* Remaining button event handlers here */

    public void bPlus(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        firstNum = Double.parseDouble(tView.getText().toString());
        tView.setText("");
        operand = "+";
    }

    public void bMinus(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        firstNum = Double.parseDouble(tView.getText().toString());
        tView.setText("");
        operand = "-";
    }

    public void bMultiply(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        firstNum = Double.parseDouble(tView.getText().toString());
        tView.setText("");
        operand = "*";
    }

    public void bDivide(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        firstNum = Double.parseDouble(tView.getText().toString());
        tView.setText("");
        operand = "/";
        isDouble = true;  // we don't want integer division
    }

    public void bSwitchSign(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (!tView.getText().toString().equals("0")) {

            double num = -1.0 * Double.parseDouble(tView.getText().toString());
            tView.setText(Double.toString(num));
        }
    }

    public void bOneOverX(View v) {

        TextView tView = (TextView) findViewById(R.id.textView);
        double num = 1.0 / Double.parseDouble(tView.getText().toString());
        tView.setText(Double.toString(num));
        isDouble = true;
    }

    public void bSqrt(View v) {

        TextView tView = (TextView) findViewById(R.id.textView);
        double num = Math.sqrt(Double.parseDouble(tView.getText().toString()));
        if ((int)num == num) tView.setText(Integer.toString((int) num));
        else {

            tView.setText(Double.toString(num));
            isDouble = true;
        }
    }

    public void bXSquared(View v) {

        TextView tView = (TextView) findViewById(R.id.textView);
        double num = Math.pow(Double.parseDouble(tView.getText().toString()), 2);
        tView.setText((isDouble) ? Double.toString(num) : Integer.toString((int) num));
    }

    public void bXCubed(View v) {

        TextView tView = (TextView) findViewById(R.id.textView);
        double num = Math.pow(Double.parseDouble(tView.getText().toString()), 3);
        tView.setText((isDouble) ? Double.toString(num) : Integer.toString((int) num));
    }

    public void bXtoPowOfY(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        firstNum = Double.parseDouble(tView.getText().toString());
        tView.setText("0");
        operand = "x^y";
    }

    public void bEquals(View v) {
        TextView tView = (TextView) findViewById(R.id.textView);
        if (!tView.getText().toString().equals("") && !operand.equals("")) {
            double secondNum = Double.parseDouble((tView.getText().toString()));
            double finalNum = 0;
            switch(operand) {

                case "+":
                    finalNum = firstNum + secondNum;
                    break;
                case "-":
                    finalNum = firstNum - secondNum;
                    break;
                case "*":
                    finalNum = firstNum * secondNum;
                    break;
                case "/":
                    finalNum = firstNum / secondNum;
                    break;
                case "x^y":
                    finalNum = (int) Math.pow(firstNum, secondNum);
                    break;
                default:
                    break;
            }
            tView.setText((isDouble) ? Double.toString(finalNum) : Integer.toString((int) finalNum));
            isDouble = false;
        }
    }
}





