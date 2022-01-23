class number{
    private int num1;
    private int num2;

    public number(){
        
        num1 = 0;
        num2 = 0;
    }

    public number(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getnum1(){
        return num1;
    }
    
    public int getnum2(){
        return num2;
    }

    public void setnum1(int num1){
        this.num1 = num1;
    }

    public void setnum2(int num2){
        this.num2 = num2;
    }

    public void print(){
        System.out.println("This is number method");
    }
}

class sum extends number{

    private int Tot;

    public sum(){

        Tot = 0;
    }

    public sum(int Tot){

        this.Tot = Tot;
    }

    public int getTot(){
        return Tot;
    }

    public void setTot(int Tot){
        this.Tot = Tot;
    }

    public void cal(){
        Tot = getnum1() + getnum2();
    }

    public void print(){
        System.out.println("Total "+Tot);
    }
}

class test{
    public static void main(String args[]){
         
        sum ob = new sum();

        ob.setnum1(10);
        ob.setnum2(20);
        ob.cal();
        ob.print();
    }
}