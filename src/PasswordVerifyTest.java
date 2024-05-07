import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    @Test
    public void test1(){
        String password = "";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());
    }

    @Test
    public void test2(){
        String password = "hola";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());
    }

    @Test
    public void test3(){
        String password = "\"holacaracola";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());

    }

    @Test
    public void test4(){
        String password = "hola12";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());

    }

    @Test
    public void test5(){
        String password = "holA";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());

    }

    @Test
    public void test6(){
        String password = "hola!";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" , result.getErrorMessage());

    }

    @Test
    public void test7(){
        String password = "holA!";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" , result.getErrorMessage());
    }

    @Test
    public void test8(){
        String password = "hola12!";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" , result.getErrorMessage());
    }

    @Test
    public void test9(){
        String password = "hola12A";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());
    }

    @Test
    public void test10(){
        String password = "holacaracola12";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());

    }

    @Test
    public void test11(){
        String password = "ho12A!";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" , result.getErrorMessage());
    }

    @Test
    public void test12(){
        String password = "holacaracolaA!";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de contenir almenys 2 números\n" , result.getErrorMessage());
    }

    @Test
    public void test13(){
        String password = "holacaracola12!";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de contenir almenys una lletra majúscula\n" , result.getErrorMessage());
    }

    @Test
    public void test14(){
        String password = "holacaracola12A";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());
    }

    @Test
    public void test15(){
        String password = "hola";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());
    }

    @Test
    public void test16(){
        String password = "hola";
        PasswordVerify verifier = new PasswordVerify();
        ValidationResult result = verifier.verifyPassword(password);

        assertFalse(result.isValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial\n", result.getErrorMessage());

    }




}