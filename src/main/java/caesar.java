class caesar {

    //    Encrypting code for the text

    caesar Caesar;

    public caesar() {
        Caesar = new caesar();
    }


    public static String encrypt(String plainText, int shift) {
        if (shift>26) {
            shift = shift%26;
        }
        else if (shift<0) {
            shift = (shift%26)+26;
        }

        String cipherText = "";
        int length = plainText.length();
        for(int i = 0; i<length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
               if (Character.isLowerCase(ch)) {
                   char c = (char)(ch + shift);
                   if (c >'z') {
                       cipherText += (char)(ch - (26-shift));
                   }
                   else {
                       cipherText += c;
                   }

               }
               else if (Character.isUpperCase(ch)) {
                   char c = (char)(ch + shift);
                   if (c>'Z') {
                       cipherText += (char)(ch - (26-shift));
                   }
                   else {
                       cipherText += c;
                   }

               }

            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }


//    Decrypting code for the text
    public static String decrypt(String plainText, int shift) {
        if (shift>26) {
            shift = shift%26;
        }
        else if (shift<0) {
            shift = (shift%26)+26;
        }

        String cipherText = "";
        int length = plainText.length();
        for(int i = 0; i<length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char)(ch - shift);
                    if (c < 'a') {
                        cipherText += (char)(ch + (26-shift));
                    }
                    else {
                        cipherText += c;
                    }

                }
                else if (Character.isUpperCase(ch)) {
                    char c = (char)(ch - shift);
                    if (c>'A') {
                        cipherText += (char)(ch + (26-shift));
                    }
                    else {
                        cipherText += c;
                    }

                }

            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }



//    Prints out Encrypted Text

    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String cipher = encrypt(text,2);
        System.out.println("Cipher Text: " + cipher);


//        Displays Decrypted Text
        String decrypted = decrypt(cipher, 2);
        System.out.println("Decrypted Text: " + decrypted);

    }
}