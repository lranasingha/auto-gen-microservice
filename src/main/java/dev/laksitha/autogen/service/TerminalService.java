package dev.laksitha.autogen.service;

import dev.laksitha.autogen.model.Terminal;
import dev.laksitha.autogen.model.TerminalStatus;
import dev.laksitha.autogen.repository.TerminalRepository;
import org.jooq.Record;
import org.springframework.stereotype.Service;

@Service
public class TerminalService {

    //inject terminal repository
    private final TerminalRepository terminalRepository;

    //constructor injection
    public TerminalService(TerminalRepository terminalRepository) {
        this.terminalRepository = terminalRepository;
    }

    //get terminal by id method
    public Terminal getTerminalById(String id) {
        //check if id is null
        if (id == null) {
            throw new IllegalArgumentException("Terminal id cannot be null");
        }

        return terminalRepository.getTerminalById(id).map(this::mapTerminalRecordToTerminalModel);
    }

    private Terminal mapTerminalRecordToTerminalModel(final Record record) {
        //map terminal record to terminal model
        return new Terminal(
                record.get("id", String.class),
                record.get("name", String.class),
                TerminalStatus.valueOf(record.get("status", String.class))
        );
    }
}
