public class CatDog {
    public boolean catDog(String str) {
        int a=0,b=0;
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("cat")) a++;
            if(str.substring(i,i+3).equals("dog")) b++;
        }
        return a==b;
    }
}
