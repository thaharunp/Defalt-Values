class Test{
     static int a; //static variable
            int b=200; //instance varible

            public static void main(String args[]){

            System.out.println(a);
            System.out.println(Test.a);


           //using object /ref variable /instance
            Test t1=new Test();
            System.out.println(t1.a);


            }

}