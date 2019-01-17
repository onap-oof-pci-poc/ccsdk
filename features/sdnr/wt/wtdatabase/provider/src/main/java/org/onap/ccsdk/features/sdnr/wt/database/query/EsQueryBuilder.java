/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.database.query;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author herbert
 *
 */
public class EsQueryBuilder {

    static public EsQuery getTermQueryBuilder(String reference, String content) {
        QueryBuilder queryBuilder = QueryBuilders.termQuery(reference, content);
        return new EsQueryHolder(queryBuilder);
    }

    static public EsQuery getMatchAllQuery() {
        QueryBuilder queryBuilder = QueryBuilders.matchAllQuery();
        return new EsQueryHolder(queryBuilder);
    }

    static public EsQuery getQueryAandB(String referenceA, String contentA, String referenceB, String contentB) {
        BoolQueryBuilder bq = QueryBuilders.boolQuery();
        bq.must(QueryBuilders.termQuery(referenceA, contentA));
        bq.must(QueryBuilders.termQuery(referenceB, contentB));
        return new EsQueryHolder(bq);
    }

}
