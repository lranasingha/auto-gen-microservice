package dev.laksitha.autogen.repository;

import dev.laksitha.autogen.tables.records.TerminalRecord;
import org.springframework.stereotype.Repository;

@Repository
public class TerminalRepositoryImpl implements TerminalRepository {
    @Override
    public TerminalRecord getTerminalById(final String id) {
        return new TerminalRecord(id, "Terminal " + id, "ACTIVE");
    }
}
