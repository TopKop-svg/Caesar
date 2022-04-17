import java.util.Arrays;

public class BruteMethod {

    public  void FindKey(String str, String keyWord) {
        char[] inputString = str.toCharArray();
        char[] inputKeyWord = keyWord.toCharArray();
        char[] buf = new char[24];
        Offset offset = new Offset();

        for (int key = -50; key < 50; key++) {
            for (int j = 0, k = 0; k < inputString.length; j++, k++) {
                String valueOffset = offset.coderString(str, key);
                char[] valueOffsetArray = valueOffset.toCharArray();

                if (valueOffsetArray[k] == ' ') {
                    buf = Arrays.copyOf(buf, j);
                    if (Arrays.toString(buf).equals(Arrays.toString(inputKeyWord))){
                        System.out.print("Необходимый ключ: " + key);
                        break;
                    } else {
                        System.out.println("Ключ не найден");

                    }
                    buf = new char[24];
                    j = -1;
                } else {
                    buf[j] = valueOffsetArray[k];
                }
            }
        }
    }
}
