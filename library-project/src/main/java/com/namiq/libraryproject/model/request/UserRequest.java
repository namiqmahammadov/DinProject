    package com.namiq.libraryproject.model.request;


    import jakarta.validation.constraints.Email;
    import jakarta.validation.constraints.NotBlank;
    import jakarta.validation.constraints.Pattern;
    import jakarta.validation.constraints.Size;
    import lombok.*;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder


    public class UserRequest {

        @NotBlank(message = "Ad və soyad boş ola bilməz")
        @Size(min = 3, max = 60, message = "Ad və soyad 3-60 simvol aralığında olmalıdır")
        private String fullName;

        @NotBlank(message = "Email boş ola bilməz")
        @Email(message = "Email düzgün deyil")
        private String email;

        @NotBlank(message = "Telefon nömrəsi boş ola bilməz")
        @Pattern(
                regexp = "^(\\+994|0)(50|51|55|70|77)\\d{7}$",
                message = "Telefon nömrəsi düzgün deyil"
        )
        private String phoneNumber;

        private Boolean isActive;

    }
