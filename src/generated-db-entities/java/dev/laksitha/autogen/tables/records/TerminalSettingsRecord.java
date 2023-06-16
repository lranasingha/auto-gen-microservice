/*
 * This file is generated by jOOQ.
 */
package dev.laksitha.autogen.tables.records;


import dev.laksitha.autogen.tables.TerminalSettings;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TerminalSettingsRecord extends UpdatableRecordImpl<TerminalSettingsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.terminal_settings.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.terminal_settings.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.terminal_settings.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.terminal_settings.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.terminal_settings.value</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.terminal_settings.value</code>.
     */
    public String getValue() {
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
        return TerminalSettings.TERMINAL_SETTINGS.ID;
    }

    @Override
    public Field<String> field2() {
        return TerminalSettings.TERMINAL_SETTINGS.NAME;
    }

    @Override
    public Field<String> field3() {
        return TerminalSettings.TERMINAL_SETTINGS.VALUE;
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
        return getValue();
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
        return getValue();
    }

    @Override
    public TerminalSettingsRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public TerminalSettingsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TerminalSettingsRecord value3(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TerminalSettingsRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TerminalSettingsRecord
     */
    public TerminalSettingsRecord() {
        super(TerminalSettings.TERMINAL_SETTINGS);
    }

    /**
     * Create a detached, initialised TerminalSettingsRecord
     */
    public TerminalSettingsRecord(String id, String name, String value) {
        super(TerminalSettings.TERMINAL_SETTINGS);

        setId(id);
        setName(name);
        setValue(value);
    }

    /**
     * Create a detached, initialised TerminalSettingsRecord
     */
    public TerminalSettingsRecord(dev.laksitha.autogen.tables.pojos.TerminalSettings value) {
        super(TerminalSettings.TERMINAL_SETTINGS);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setValue(value.getValue());
        }
    }
}
