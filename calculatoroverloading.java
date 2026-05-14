class calculatoroverloading{
    int add(int a , int b){
        return a + b;
    }
    int add(int a , int b , int c){
        return a + b + c;
    }
    double add(double a , double b){
        return a + b;
    }
    public static void main(String[]args){
        calculator obj = new calculator ();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2,3,4));
        System.out.println(obj.add(2.5,3.5));
    }
}