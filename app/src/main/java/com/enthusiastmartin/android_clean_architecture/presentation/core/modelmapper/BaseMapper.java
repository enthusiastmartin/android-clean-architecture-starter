package com.enthusiastmartin.android_clean_architecture.presentation.core.modelmapper;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by martin on 8/1/17.
 */

/**
 * Base Model Mapper class for model mapping between different layers
 *
 * @param <Output> output type
 * @param <Input> input type
 */
public abstract class BaseMapper<Output, Input> {

    /**
     * Transform input item into output item
     *
     * @param item input item
     * @return @Output type
     */
    public abstract @NonNull Output transform(Input item);

    /**
     * Transforms collection of input items
     *
     * @param inputCollection input to tranform
     * @return @Output output collection, empty collection
     */
    public @NonNull Collection<Output> transform(Collection<Input> inputCollection) {
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
