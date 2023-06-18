package dev.laksitha.autogen.api;

import dev.laksitha.autogen.model.Terminal;
import dev.laksitha.autogen.model.TerminalStatus;
import dev.laksitha.autogen.service.TerminalService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/terminal-settings")
public class TerminalSettingsController {
    //inject terminal service

    @ApiOperation(value = "Get settings terminal by id")
    @GetMapping("/{id}")
    //return response entity
    @ResponseBody
    public ResponseEntity<TerminalsSettingsResponse> getTerminalSettingsById(@PathVariable("id") String id) {
        return ResponseEntity.ok(new TerminalsSettingsResponse("-", "-", "-"));
    }

    public record TerminalsSettingsResponse(String id, String name, String value) {
    }
}
