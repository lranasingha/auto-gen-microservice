package dev.laksitha.autogen.service;

import dev.laksitha.autogen.repository.TerminalRepository;
import dev.laksitha.autogen.tables.records.TerminalRecord;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TerminalServiceTest {

    @Test
    void should_return_terminal_response_when_get_terminal_by_id() {
        var terminalRepository = mock(TerminalRepository.class);
        when(terminalRepository.getTerminalById("1"))
                .thenReturn(new TerminalRecord("1", "Terminal 1", "some description", "ACTIVE"));
        var terminalService = new TerminalService(terminalRepository);

        var terminal = terminalService.getTerminalById("1");

        assertNotNull(terminal);
        assertEquals("1", terminal.id());
    }
}