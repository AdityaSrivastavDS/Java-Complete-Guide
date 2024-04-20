class static_keyword {
    static int multi(int x, int y){
        return x*y;
    }
    static int div(int x, int y){
        return x/y;
    }
}
class use{
    public static void main(String args[]){
        int res1;
        int res2;

        res1 = static_keyword.multi(5,6);
        System.out.println(res1);;
        res2 = static_keyword.div(8,4);
        System.out.println(res2);
    }
}
