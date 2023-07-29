package org.example.selenium.luma_ui.enums;

import lombok.Getter;

public enum RegistrationForm {
    oskarFirstName("Oskar"),
    oskarLastName("Baiasov"),
    oskarEmail("baiasov24@gmail.com"),
    oskarPassword("Nomad123@"),

   oskarConfirmPassword("Nomad123@");



    @Getter
    String credential;
    RegistrationForm(String credential){this.credential = credential;
    }
}
