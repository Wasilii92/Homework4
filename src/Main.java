public class Main {
    public static void main(String[] args) {
        int age=14;
        if (age<18) {System.out.println("Если возраст человека равен "+age+", то возраст совершеннолетия еще не наступил, нужно подождать");}
        else {System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");}
        int temperature1=10;
        if (temperature1<5) {System.out.println("На улице "+temperature1+" градусов, нужно надеть шапку");}
        else {System.out.println("На улице "+temperature1+" градусов, можно идти без шапки");}
        int speed=50;
        if (speed>60){System.out.println("Если скорость "+speed+" придется заплатить штраф");}
        else{System.out.println("Если скорость "+speed+" можно ездить спокойно");}
        int age1=20;
        System.out.print("Если возраст человека равен "+age1);
        if(age>2&&age1<=6){System.out.println(", то ему нужно ходить в детский сад");}
        if(age1>=7&&age1<17){System.out.println(", то ему нужно ходитьв школу");}
        if(age1>=18&&age1<24){System.out.println(", то ему нужно ходить в университет");}
        if(age>=24){System.out.println(", то ему нужно ходить на работу");}
        int ageBaby=4;
        boolean parent=true;
        {System.out.print("Возраст ребенка равен "+ageBaby+", то ему");}
        if (ageBaby<5||(ageBaby>5&&ageBaby<14&&parent==false)){System.out.println(" нельзя кататься на аттракционе");}
        if((ageBaby>=5&&ageBaby<14&&parent==true)){System.out.println(" можно кататься на аттракционе в сопровождении взрослого");}
        if(ageBaby>=14){System.out.println("можно кататься на аттракционе без сопровождения взрослого");}
        int zanMesta=53;
        int svobMesta=102-zanMesta;
        int svobSidMesta=60-zanMesta;
        if(zanMesta>=102){System.out.println("В вагоне мест нет");}
        else {System.out.println("В вагоне "+svobMesta+" свободных мест");}
        if (zanMesta>=60){System.out.println("Сидячих мест нет");}
        else {System.out.println("Есть "+svobSidMesta+" сидячих мест");}
        int one=1;
        int two=2;
        int three=3;
        int max=one;
        if (one>two) {if (one>three){max=one;}
        else max=three;}
        else {if (two>one) {if (two>three)  {max=two;}
        else max=three;}}
        System.out.println("Наибольшее число "+max);
    }
}