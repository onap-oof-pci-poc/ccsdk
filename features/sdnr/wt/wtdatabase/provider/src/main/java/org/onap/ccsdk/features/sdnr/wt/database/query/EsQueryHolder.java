/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.database.query;

import org.elasticsearch.index.query.QueryBuilder;

/**
 * @author herbert
 *
 */
public class EsQueryHolder implements EsQuery {

    QueryBuilder queryBuilder;

    EsQueryHolder(QueryBuilder queryBuilder) {
        this.queryBuilder = queryBuilder;
    }

    @Override
    public QueryBuilder getQueryBuilder() {
        return queryBuilder;
    }

}
