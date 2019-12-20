import java.util.*;


import expression.*;

import java.lang.*;
import java.io.*;


public class MyTest{
    public static void main(String[] args){
        ExpressionB a = new Const(-1000000000);
        ExpressionB b = new Const(-1000000000);

        System.out.println(a.equals(b));
    }
}
