package ConversaoMedidas;

public class ConversaoDeMedidas {

    public static double metrosJardas(double me){
        if(me>0){
            me = me * 1.09361;
        }
        return me;
    }

    public static double metrosKm(double me){
        if(me>0){
            me = me * 0.001;
        }
        return me;
    }

    public static double metrosMilhas(double me){
        if(me>0){
            me = me * 0.000621371;
        }
        return me;
    }

    public static double milhasKm(double mi){
        if(mi>0){
            mi = mi * 1.60934;
        }
        return mi;
    }

    public static  double milhasJardas(double mi){
        if(mi>0){
            mi = mi * 1760;
        }
        return mi;
    }
}
