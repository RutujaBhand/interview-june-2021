package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int binary[] = new int[40];    
     int index = 0;    
     while(n> 0){    
       binary[index++] = n%2;    
       n= n/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
    return "";
  }
}
