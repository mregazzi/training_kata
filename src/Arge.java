class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p){
            years ++;
            p0 = p0 + (int)(p0 * (percent/100)) + aug;
        }
        return years;
    }
}