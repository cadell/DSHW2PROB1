/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

public class MyClass {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int l = 0;
        int r = arr.length-1;
        System.out.println(search(arr,l,r,5));
    }
    public static int search(int[] arr, int l,int r,int x)
    {
        int mid1 = l +(r-l)/3;
        int mid2 = mid1+(r-l)/3;
        
        if(r < l) return -1;
        if(x == arr[mid1]) return mid1;
        if(x == arr[mid2]) return mid2;
        
        if(x < arr[mid1])
        {
            // r = mid1-1;
            return search(arr, l, mid1-1,x);
        }
        else if(x > arr[mid2])
        {
            // l = mid2+1;
            return search(arr,mid2+1,r,x);
        }
        else
        {
            // r = mid1-1;
            // l = mid2+1;
            return search(arr,mid2+1,mid1-1,x);
        }
    }
}
