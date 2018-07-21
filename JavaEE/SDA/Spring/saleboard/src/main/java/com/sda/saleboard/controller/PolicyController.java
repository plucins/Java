package com.sda.saleboard.controller;

import com.sda.saleboard.model.dto.policy.ListPolicyByDateDto;
import com.sda.saleboard.model.dto.policy.PolicyRegisterDto;
import com.sda.saleboard.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/policy")
public class PolicyController {

    private PolicyService policyService;

    @Autowired
    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @PostMapping
    public ResponseEntity<PolicyRegisterDto> registerPolicy(@RequestBody PolicyRegisterDto dto) {
        Optional<PolicyRegisterDto> policy = policyService.registerPolicy(dto);

        if (policy.isPresent()) {
            return ResponseEntity.ok(policy.get());
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping
    public ResponseEntity<List<PolicyRegisterDto>> listPolicy() {
        return ResponseEntity.ok(policyService.getAllPolicies());
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<PolicyRegisterDto> updatePolicy(@PathVariable Long id, @RequestBody PolicyRegisterDto dto){
        Optional<PolicyRegisterDto> policy = policyService.updatePolicy(id, dto);

        if(policy.isPresent()){
            return ResponseEntity.ok(policy.get());
        }

        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity removePolicy(@PathVariable Long id) {

        return policyService.removePolicy(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @PostMapping(path = "/listByDate")
    public ResponseEntity<List<PolicyRegisterDto>> listPolicyByUserAndDate(@RequestBody ListPolicyByDateDto dto){
       return ResponseEntity.ok(policyService.listPolicyByUserAndDate(dto));
    }

    @GetMapping(path = "/limit/{number}")
    public ResponseEntity<List<PolicyRegisterDto>> getListPolicesLimitByNumber(@PathVariable Long number){
        return ResponseEntity.ok(policyService.getListPolicesLimitByNumber(number));
    }
}
