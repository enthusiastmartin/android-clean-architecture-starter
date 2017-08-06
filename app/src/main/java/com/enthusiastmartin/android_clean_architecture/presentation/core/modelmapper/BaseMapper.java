package com.enthusiastmartin.android_clean_architecture.presentation.core.modelmapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by martin on 8/1/17.
 */

public abstract class BaseMapper<Output, Input> {

    public abstract Output transform(Input item);

    public Collection<Output> transform(Collection<Input> inputCollection) {
        Collection<Output> outputCollection;

        if (inputCollection != null && !inputCollection.isEmpty()) {
            outputCollection = new ArrayList<>();
            for (Input item : inputCollection) {
                outputCollection.add(transform(item));
            }
        } else {
            outputCollection = Collections.emptyList();
        }

        return outputCollection;
    }
}
