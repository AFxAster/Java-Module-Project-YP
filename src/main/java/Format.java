public class Format {
    public String getEnding(int n) {
        if (11 <= n % 100 && n % 100 <= 14) {
            return "рублей";
        } else if (n % 10 == 1) {
            return "рубль";
        } else if (2 <= n % 10 && n % 10 <= 4) {
            return "рубля";
        }
        return "рублей";
    }

    public double round(double n, int decimalPlace) {
        return Math.round(n * Math.pow(10, decimalPlace)) / Math.pow(10, decimalPlace);
    }
}
