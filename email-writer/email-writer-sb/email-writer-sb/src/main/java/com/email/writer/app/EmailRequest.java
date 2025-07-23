package com.email.writer.app;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent; //content of email for which we are crafting reply for
    private String tone; //tone of email to be generated
}
