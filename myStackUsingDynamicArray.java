import java.util.*;
class myStackUsingDynamicArray{

    private dynamicArray A;
    private int top;
    //Other variables to be defined by student
    
    public myStackUsingDynamicArray(){
        A = new dynamicArray();
        top=0;
        //Othe initializations to be done by student
    }
    
    //This method should return the size of the stack
    public int getSize(){
        //To be written by student
        return(top);
    }
    
    //This should implement the push operation of stack
    public void push(int value){
        //To be written by student
        if(top==A.getSize())
        {
            A.doubleSize();
           
        }
        try{
        A.modifyElement(value,top++);
            }
        catch(Exception e){e.printStackTrace();System.exit(0);}
        // System.out.println(top);


    }
    
    //This should implement the pop operation of stack.
    //This method should throw an exception in case the stack is empty.
    public int pop() throws Exception{
        int save=0;
        if(getSize()<=0)
            { System.out.println("stack is empty"); throw new Exception();
            }
     else {   //To be written by student
         

        try{save= A.getElement(--top);}
        catch(Exception e){e.printStackTrace();System.exit(0);}
            }  

    if(A.getSize()>2*getSize())
        {
           A.halveSize();
             
        }
                // System.out.println(A.getSize()+" "+getSize());
        return(save);
    }
    public void Multipop(int k) throws Exception
    {
        if(getSize()>=k)
        {
            top=top-k;
        
         while(A.getSize()>2*getSize() && A.getSize()>1)
            {
                 A.halveSize();
             
            }
        }
        else{
            System.out.println("Eements are less than k");
         throw new EmptyStackException();
        }
    }
}