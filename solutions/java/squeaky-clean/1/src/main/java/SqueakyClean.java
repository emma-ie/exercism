class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        char[] asArray = identifier.toCharArray();
        int arrayLen = asArray.length;
        for (int i = 0; i < arrayLen; i++){
            if (Character.isWhitespace(asArray[i])) {
                asArray[i] = '_';
            } 
            if (asArray[i] == '-') {
                asArray[i + 1] = Character.toUpperCase(asArray[i + 1]);
                continue;
            }
            if (Character.isDigit(asArray[i])) {
                if (asArray[i] == '4') {
                    asArray[i] = 'a';
                }
                else if (asArray[i] == '3') {
                    asArray[i] = 'e';
                }
                else if (asArray[i] == '0') {
                    asArray[i] = 'o';
                }
                else if (asArray[i] == '1') {
                    asArray[i] = 'l';
                }
                else if (asArray[i] == '7') {
                    asArray[i] = 't';
                }
            }
            if (!Character.isDigit(asArray[i]) && !Character.isLetter(asArray[i]) && asArray[i] != '_'){
                continue;
            }
            sb.append(asArray[i]);
        }
        String string = sb.toString();
        return string;
        }
    }

