public class DyanmicStack extends CustomStack{
    public DyanmicStack(){
        super();
    }
    public DyanmicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int value) {
        //this take care of stak is full

        if(this.isFull()){
            int temp[]=new int[data.length*2];

            //copy all previous stack
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];

            }
            data=temp;
        }
//at this point we know data is not full
//insert item

        return super.push(value);
    }
}
