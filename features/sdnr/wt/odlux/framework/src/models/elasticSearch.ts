export type Result<TSource extends {}> = {
  aggregations: TSource;
  took: number;
  timed_out: boolean;
  _shards: {
    total: number;
    successful: number;
    failed: number;
  };
  hits: {
    total: number;
    max_score: number;
    hits?: (HitEntry<TSource>)[] | null;
  };
}

export type HitEntry<TSource extends {}> = {
  _index: string;
  _type: string;
  _id: string;
  _score: number;
  _source: TSource;
}

type ActionResponse ={
  _index: string;
  _type: string;
  _id: string;
  _shards: {
    total: number,
    successful: number,
    failed: number
    },

}

export type PostResponse = ActionResponse & {
  created: boolean
}

export type DeleteResponse = ActionResponse & {
  found: boolean
}

