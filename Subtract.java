package expression;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Subtract extends ExpressionB{
  ExpressionB a;
  ExpressionB b;

  public Subtract(ExpressionB a, ExpressionB b){
      super.a = a;
      super.b = b;
  }


  public double evaluate(double value){
    return super.a.evaluate(value) - super.b.evaluate(value);
  }

  public int evaluate(int value){
    int a = super.a.evaluate(value);
    int b = super.b.evaluate(value);

    return a-b;
  }

  
  public String toString(){
    StringBuilder sb = new StringBuilder();

    sb.append("(");
    sb.append(super.a.toString());
    sb.append(" - ");
    sb.append(super.b.toString());
    sb.append(")");

    return sb.toString();
  }

  public String toMiniString(){
    StringBuilder sb = new StringBuilder();

    sb.append(this.a.toMiniString());
    sb.append(" - ");
    sb.append(this.b.toMiniString());

    return sb.toString();
  }

  public boolean equals(Object ex){
    if(!(ex instanceof Subtract))
        return false;
    
    ExpressionB expression = (ExpressionB)ex;

    if(!super.a.equals(expression.a) || !super.b.equals(expression.b))
        return false;
        
    return true;
  }
}
