
public class Main {
    public static void main(String[] args){
        int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int suma=0;
        for(int i=0;i<months.length;i++)
        {
            System.out.println("Luna "+months[i]+" are "+month_days[i]+"zile");
             if(month_days[i]==31)
                System.out.println("Luna "+months[i]+" are 31 de zile");
            if(month_days[i]<31)
                 System.out.println("Luna "+months[i]+" are "+month_days[i]+" zile");
            if(month_days[i]<31)
                suma=suma+month_days[i];
             String abbreviatedMonth = months[i].substring(0, 3);
            System.out.println("Luna " + abbreviatedMonth + " Ziua " + month_days[i] )
        }
        System.out.println("suma lunilor cu mai putin de 31 de zile este "+suma);
    }
}

