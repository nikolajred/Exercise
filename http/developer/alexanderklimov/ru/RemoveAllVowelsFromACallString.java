package http.developer.alexanderklimov.ru;

public class RemoveAllVowelsFromACallString {
    public static void main(String[] args) {
        String[] strings = {"a", "e", "i", "o", "u", "y", "A", "B", "I", "O", "U", "Y"};
        StringBuilder stringBuilder = new StringBuilder("What would happen if we completely lost the Amazon rain forest to the fires? Comment whatever comes to your mind.");
        System.out.println("String bafore: " + "\n" + stringBuilder);
        for (int i = 0; i < strings.length; i++) {
            while (stringBuilder.indexOf(strings[i]) != -1) {
                int pos = stringBuilder.indexOf(strings[i]);
                stringBuilder.deleteCharAt(pos);

            }
        }

        System.out.println("String after: " + "\n" + stringBuilder);
    }
}
