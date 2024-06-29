public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int c[]=new int[2];
        if(a.length>=2){
            c[0]=a[0];
            c[1]=a[1];
        }
        else if(a.length==1){
            c[0]=a[0];
            c[1]=b[0];
        }
        else{
            c[0]=b[0];
            c[1]=b[1];
        }
        return c;
    }
}
