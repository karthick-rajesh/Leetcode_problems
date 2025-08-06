public class pattern{
    public void pattern3(){
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public void pattern4(){
        for(int i=5;i>0;i--){
            int count =1;
            for(int j=0;j<i;j++){
                System.out.print(count++);

            }System.out.println();
        }
    }
    public void pattern5(){
        for(int i=0;i<6;i++){
            for(int j = 0;j<6-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern obj = new pattern();
       // obj.pattern3();
        //obj.pattern4();
        obj.pattern5();
    }
}
