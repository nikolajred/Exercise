package http.developer.alexanderklimov.ru;

public class ExtractAllDigitsFromAString {
    public static void main(String[] args) {
        String [] strins = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        StringBuilder stringBuilder = new StringBuilder("Васька123 имел 9 жизней. 8 марта он подарил Мурке 5 мышей.");
        for (int i = 0; i <strins.length ; i++) {
            while (stringBuilder.indexOf(strins[i]) != -1){
              int pos = stringBuilder.indexOf(strins[i]);
                stringBuilder.deleteCharAt(pos);
            }

        }
        System.out.println(stringBuilder);
    }
}
