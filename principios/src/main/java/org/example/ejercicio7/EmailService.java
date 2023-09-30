package org.example.ejercicio7;

import java.util.regex.Pattern;

public class EmailService {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public void sendEmail(String destinationAddress, String subject, String content) throws Exception {
        validateAddress(destinationAddress);

        // TODO: Send email to destinationAddess with subject and content
        System.out.println("Send email to destinationAddess with subject and content");
    }

    public void validateAddress(String address) throws Exception {
        if (!VALID_EMAIL_ADDRESS_REGEX.matcher(address).matches()) {
            throw new Exception("La dirección de email no es valida");
        }
    }


}