class In{

    public static void main(String[]args){

        In i = new In();
        In.Test t = i.new Test();
        t.use();
    }
    class Test{
         void use{
            Systrm.out.println("Hello UDF");
        }
    }
}