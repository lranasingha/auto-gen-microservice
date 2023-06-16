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
    private final TerminalService terminalService;

    public TerminalSettingsController(final TerminalService terminalService) {
        this.terminalService = terminalService;
    }

    @ApiOperation(value = "Get terminal by id")
    @GetMapping("/{id}")
    //return response entity
    @ResponseBody
    public ResponseEntity<TerminalResponse> getTerminalById(@PathVariable("id") String id) {
        Terminal terminalById = terminalService.getTerminalById(id);
        return ResponseEntity.ok(new TerminalResponse(terminalById.id(), terminalById.name(), terminalById.status()));
    }

    public record TerminalResponse(String id, String name, TerminalStatus terminalStatus) {
    }
}
