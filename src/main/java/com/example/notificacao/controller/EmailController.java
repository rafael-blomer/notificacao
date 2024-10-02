package com.example.notificacao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notificacao.business.EmailService;
import com.example.notificacao.business.dto.TarefasDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

	private final EmailService service;
	
	@PostMapping
	public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTO dto) {
		service.enviaEmail(dto);
		return ResponseEntity.ok().build();
	}
	
}
