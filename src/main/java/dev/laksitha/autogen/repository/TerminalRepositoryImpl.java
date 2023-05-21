package dev.laksitha.autogen.repository;

import dev.laksitha.autogen.model.Terminal;
import dev.laksitha.autogen.tables.records.TerminalRecord;
import org.springframework.stereotype.Repository;

@Repository
public class TerminalRepositoryImpl implements TerminalRepository {
    @Override
    public TerminalRecord getTerminalById(final String id) {
        return new TerminalRecord(id, "Terminal " + id, "", "ACTIVE");
    }

    @Override
    public void create(final Terminal terminal) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
