import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PasswordVerify {

    public  ValidationResult verifyPassword(String password) {
        boolean isValid = password.length() >= 8 && dosNumeros(password) &&
                lletraMayus(password) && caracSpecial(password);
        StringBuilder errorMessage = new StringBuilder();
        if (!isValid) {
            if (password.length() < 8) {
                errorMessage.append("La contrasenya ha de tenir almenys 8 caràcters\n");
            }
            if (!dosNumeros(password)) {
                errorMessage.append("La contrasenya ha de contenir almenys 2 números\n");
            }
            if (!lletraMayus(password)) {
                errorMessage.append("La contrasenya ha de contenir almenys una lletra majúscula\n");
            }
            if (!caracSpecial(password)) {
                errorMessage.append("La contrasenya ha de contenir almenys un caràcter especial\n");
            }
        }
        return new ValidationResult(isValid, errorMessage.toString());
    }

    private boolean dosNumeros(String password) {
        int contarNumero = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                contarNumero++;
                if (contarNumero == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean lletraMayus(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean caracSpecial(String password) {
        String specialCharacters = "!@#$%^&*()-+";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}




