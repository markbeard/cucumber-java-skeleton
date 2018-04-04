package password;

public class Password {

    private String passValue;

    public void setPassValue(String pv) {
        passValue = pv;
    }

    public String getPassValue() {
        return passValue;
    }

    public boolean validateLength(int minLength) {

        boolean lengthResponse = true;

        if(passValue.length() < minLength) {
            lengthResponse = false;
        }

        return lengthResponse;
    }

    public boolean validateHasNumber(int minNumbers) {

        boolean numberResponse = true;
        int numberCount = 0;

        for (int i = 0; i < passValue.length(); i++) {
            if(Character.isDigit(passValue.charAt(i))) {
                numberCount++;
            }
        }
        if(numberCount < minNumbers) {
            numberResponse = false;
        }

        return numberResponse;
    }


    public boolean validateHasLower(int minLowers) {

        boolean lowerResponse = true;
        int lowerCount = 0;

        for (int i = 0; i < passValue.length(); i++) {
            if(Character.isLowerCase(passValue.charAt(i))) {
                lowerCount++;
            }
        }
        if(lowerCount < minLowers) {
            lowerResponse = false;
        }

        return lowerResponse;
    }

    public boolean validateHasUpper(int minUppers) {

        boolean upperResponse = true;
        int upperCount = 0;

        for (int i = 0; i < passValue.length(); i++) {
            if(Character.isUpperCase(passValue.charAt(i))) {
                upperCount++;
            }
        }
        if(upperCount < minUppers) {
            upperResponse = false;
        }

        return upperResponse;
    }

}
