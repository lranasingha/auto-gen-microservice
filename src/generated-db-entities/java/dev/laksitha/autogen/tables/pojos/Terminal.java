/*
 * This file is generated by jOOQ.
 */
package dev.laksitha.autogen.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Terminal implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String status;

    public Terminal() {}

    public Terminal(Terminal value) {
        this.id = value.id;
        this.name = value.name;
        this.status = value.status;
    }

    public Terminal(
        String id,
        String name,
        String status
    ) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    /**
     * Getter for <code>public.terminal.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.terminal.id</code>.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.terminal.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.terminal.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>public.terminal.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>public.terminal.status</code>.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Terminal other = (Terminal) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Terminal (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}