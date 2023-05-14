/*
 * This file is generated by jOOQ.
 */
package dev.laksitha.autogen.tables.records;


import dev.laksitha.autogen.tables.Terminal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TerminalRecord extends UpdatableRecordImpl<TerminalRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.terminal.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.terminal.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.terminal.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.terminal.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.terminal.status</code>.
     */
    public void setStatus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.terminal.status</code>.
     */
    public String getStatus() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Terminal.TERMINAL.ID;
    }

    @Override
    public Field<String> field2() {
        return Terminal.TERMINAL.NAME;
    }

    @Override
    public Field<String> field3() {
        return Terminal.TERMINAL.STATUS;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getStatus();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getStatus();
    }

    @Override
    public TerminalRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public TerminalRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TerminalRecord value3(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public TerminalRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TerminalRecord
     */
    public TerminalRecord() {
        super(Terminal.TERMINAL);
    }

    /**
     * Create a detached, initialised TerminalRecord
     */
    public TerminalRecord(String id, String name, String status) {
        super(Terminal.TERMINAL);

        setId(id);
        setName(name);
        setStatus(status);
    }

    /**
     * Create a detached, initialised TerminalRecord
     */
    public TerminalRecord(dev.laksitha.autogen.tables.pojos.Terminal value) {
        super(Terminal.TERMINAL);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setStatus(value.getStatus());
        }
    }
}