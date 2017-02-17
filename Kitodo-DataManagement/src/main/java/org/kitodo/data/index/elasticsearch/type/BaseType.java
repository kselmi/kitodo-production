/*
 * (c) Kitodo. Key to digital objects e. V. <contact@kitodo.org>
 *
 * This file is part of the Kitodo project.
 *
 * It is licensed under GNU General Public License version 3 or later.
 *
 * For the full copyright and license information, please read the
 * GPL3-License.txt file that was distributed with this source code.
 */

package org.kitodo.data.index.elasticsearch.type;

import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpEntity;

import org.kitodo.data.index.api.TypeInterface;

/**
 * Abstract class for Type class.
 */
public abstract class BaseType<T> implements TypeInterface<T> {

    @Override
    public abstract HttpEntity createDocument(T baseBean);

    @Override
    public abstract HashMap<Integer, HttpEntity> createDocuments(List<T> baseBeans);
}
