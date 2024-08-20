class PrintNTo1 {
    public static void main(String[] args) {
        int n=5;
        print(n,n);
    }
    public static void print(int i,int n)
    {
        if(i<1)
            return;
        System.out.println(i);
        print(i-1,n);
    }
}
