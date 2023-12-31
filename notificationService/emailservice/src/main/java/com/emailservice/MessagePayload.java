package com.emailservice;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessagePayload {
    
    private Integer messageId;
	private String email;
	private String subject;
	private String messageBody;


}
