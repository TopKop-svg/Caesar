public class Offset {

    public String coderString (String str, int key) {

        char[] code = str.toCharArray();
        char[] result = new char[code.length];
        OUT:
        for (int i = 0; i < str.length(); i++) {
            IN:
            switch (code[i]) {
                case ' ':
                case ',':
                case '.':
                case '!':
                case '?':
                case '=':
                    result[i] = code[i];
                    continue OUT;
                default:
                    if(key > 0)
                        result[i] = (char) (((code[i] - 1040 + key) % 64) + 1040);
                    else
                        result[i] = (char) (((code[i] - 1103 + key) % 64) + 1103);
            };


        }
        return new String(result);
    }
}
