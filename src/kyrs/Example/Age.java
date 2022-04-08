package kyrs.Example;

public class Age {
    public static void main(String[] args) {
        int vasyaAge = 35;
        int katyaAge = 10;
        int mishaAge = 15;

        int min = 0;
        int middle = 0;
        int max = 0;
        if (mishaAge > katyaAge && mishaAge > vasyaAge) {
            if (katyaAge > vasyaAge){
                min = vasyaAge;
                middle = katyaAge;
            }else {
                min = katyaAge;
                middle = vasyaAge;
            }
            max = mishaAge;
        }
        if ( katyaAge > mishaAge && katyaAge > vasyaAge) {
            if (mishaAge > vasyaAge){
                min = vasyaAge;
                middle = mishaAge;
            }else {
                min = mishaAge;
                middle = vasyaAge;
            }
            max = katyaAge;
        }
        if (vasyaAge > katyaAge && vasyaAge > mishaAge) {
            if (katyaAge > mishaAge){
                min = mishaAge;
                middle = katyaAge;
            }else {
                min = katyaAge;
                middle = mishaAge;
            }
            max = vasyaAge;
        }
        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);
    }
}
