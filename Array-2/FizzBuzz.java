public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] a=new String[end-start];
        int i=0;
        for(int j=start;j<end;j++){
            if(j%5==0 && j%3==0)
                a[i++]="FizzBuzz";
            else if(j%5==0)
                a[i++]="Buzz";
            else if(j%3==0)
                a[i++]="Fizz";
            else
                a[i++]=String.valueOf(j);
        }
        return a;
    }
}
