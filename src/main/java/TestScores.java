/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class TestScores {    
double []arr=new double[100];

public TestScores(double[] arr) {

super();

this.arr = arr;

}

public double getAverage(){

double sum=0;

for(int i=0;i<arr.length;i++){

if(arr[i]<1 || arr[i]>100){

throw new IllegalArgumentException("Element: "+i+" Score: "+arr[i]);

}else{

sum=sum+arr[i];

}

}

return sum/(double)arr.length;

}

}
