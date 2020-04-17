/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class Main {
     public static void main(int arr[], int n){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>n){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        main(arr,3);
    }
}   
