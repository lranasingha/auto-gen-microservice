package dev.laksitha.autogen.repository;

import dev.laksitha.autogen.model.Terminal;
import dev.laksitha.autogen.tables.records.TerminalRecord;

public interface TerminalRepository {
    TerminalRecord getTerminalById(String id);

    void create(Terminal terminal);
}