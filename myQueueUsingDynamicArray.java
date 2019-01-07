class myQueueUsingDynamicArray{

    private dynamicArray A;
    private int top;
    private int rear;
    //Other variables to be defined by student
    
    public myQueueUsingDynamicArray(){
        A = new dynamicArray();
        top=0;
        rear=0;
        //Othe initializations to be done by student
    }
        //To be written by student
    
    //This method should return the number of elements in the queue
    public int getSize(){
        return(rear-top);

    }
    
    //This should implement the enqueue operation of Queue
    public void enqueue(int value){
        //To be written by student
        if(rear==A.getSize())
        {
            A.doubleSize();
           
        }
       try{
        A.modifyElement(value,rear++);
            }
        catch(Exception e){e.printStackTrace();System.exit(0);}




    }
    
    //This should implement the dequeue operation of Queue
    //This method should throw an exception in case the queue is empty.
    public int dequeue() throws Exception{
        //To be written by student
        int save=0;
        if(getSize()<=0)
        {
            System.out.println("queue is empty"); throw new Exception();
        }
        else{
            try{save=A.getElement(top++);}
            catch(Exception e){e.printStackTrace();System.exit(0);}
        }   
         if(A.getSize()>2*getSize())
        {
            for(int i=top;i<rear;i++)
            {
                try {A.modifyElement(A.getElement(i),i-top);}
                  catch(Exception e){e.printStackTrace();System.exit(0);}
            }
            A.halveSize();
            
            rear=rear-top;
            top=0;
           

        }  
         // System.out.println(A.getSize()+" "+getSize());
        return(save); 

        }

        


    }
