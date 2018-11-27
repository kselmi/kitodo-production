package org.kitodo.dataformat.service;

import org.kitodo.api.dataformat.mets.MdSec;
import org.kitodo.api.dataformat.mets.MetadataAccessInterface;

/**
 * A common description contains common properties of {@code Description} and
 * {@code NestedDescription} elements.
 */
abstract class CommonDescription implements MetadataAccessInterface {
    /**
     * An enumeration of possible meta-data locations in a METS file.
     */
    protected MdSec domain;

    /**
     * The type of the meta-data entry. The type is used to describe the
     * meta-data entry, i.e. whether the value of the entry is about the
     * title,the author or a summary of an intellectual work.
     */
    protected String type;

    @Override
    public MdSec getDomain() {
        return domain;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setDomain(MdSec domain) {
        this.domain = domain;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

}
