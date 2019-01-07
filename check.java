import java.io.*;

public class check{
   
 
    public static  void main(String args[]){
    	myStackUsingDynamicArray S=  new myStackUsingDynamicArray();
        for(int i=0;i<10;i++)
        {
            S.push(i);
        }
        for(int i=0;i<11;i++)
        {
           try{S.pop();
           System.out.println(S.getSize());}
             catch(Exception e){}
        }
        S.push(1);
         try{
           System.out.println(S.pop());}
             catch(Exception e){}
        
        



        // for(int i=0;i<6;i++)
        // {
            
        //   try{  System.out.println(S.pop());}
        //     catch(Exception e){e.printStackTrace();System.exit(0);}

        // }
        // dynamicArray b= new dynamicArray();
        // try{b.getElement(5);}
        // catch(Exception e){e.printStackTrace();System.exit(0);}

    	
    	
    }
    
























    
}
