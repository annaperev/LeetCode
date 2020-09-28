package codeSignal.phoneCall;

public class Soloution {
    int phoneCall(int min1, int min2_10, int min11, int s) {
        int duration  = 0;
        if (s - min1 >= 0){
            s -= min1;
            duration++;
        } else return duration;

        while (s - min2_10 >=0 && duration<=10){
            s-= min2_10;
            duration++;
        }

        while (s - min11 >= 0){
            s -=min11;
            duration++;
        }

        return duration;
    }

}
