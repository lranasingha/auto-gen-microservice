package dev.laksitha.autogen.repository;

import dev.laksitha.autogen.tables.records.TerminalRecord;

public interface TerminalRepository {
    TerminalRecord getTerminalById(String id);
}