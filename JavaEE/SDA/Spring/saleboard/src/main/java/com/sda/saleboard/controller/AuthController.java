package com.sda.saleboard.controller;

import com.sda.saleboard.model.UserRole;
import com.sda.saleboard.model.dto.AuthenticationDto;
import com.sda.saleboard.model.dto.seller.BasicSellerDto;
import com.sda.saleboard.model.dto.seller.LoginSellerDto;
import com.sda.saleboard.service.SellerService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.Optional;

import static com.sda.saleboard.config.JWTFilter.AUTHORITIES_KEY;
import static com.sda.saleboard.config.JWTFilter.SECRET;

@RestController
@CrossOrigin
public class AuthController {

    private SellerService sellerService;

    @Autowired
    public AuthController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @PostMapping(path = "/authenticate")
    public ResponseEntity<AuthenticationDto> authenticate(@RequestBody LoginSellerDto dto) {
        Optional<BasicSellerDto> sellerOptional = sellerService.loginUser(dto);

        if(sellerOptional.isPresent()){
            BasicSellerDto seller = sellerOptional.get();

            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET);
            Key signingKey  = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

            String token = Jwts.builder()
                    .setSubject(seller.getEmail())
                    .setIssuedAt(new Date())
                    .claim(AUTHORITIES_KEY, UserRole.values())
                    .signWith(signatureAlgorithm, signingKey )
                    .compact();

            return ResponseEntity.ok(new AuthenticationDto(token, seller));
        }

        return ResponseEntity.badRequest().build();
    }
}
