package logic1;

public class DateFashion {
    public int dateFashion(int you, int date) {
        if((you>=8||date>=8) && (you>3 && date>3))
            return 2;
        else if(you<=2||date<=2)
            return 0;
        else
            return 1;
    }
}
