package com.ecore.roles.exception;

import static java.lang.String.format;

public class ResourceExistsException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -4296290676122300036L;

    public <T> ResourceExistsException(Class<T> resource) {
        super(format("%s already exists", resource.getSimpleName()));
    }

    public <T> ResourceExistsException(Class<T> resource, String message) {
        super(format("Invalid '%s' object. %s", resource.getSimpleName(), message));
    }
}
