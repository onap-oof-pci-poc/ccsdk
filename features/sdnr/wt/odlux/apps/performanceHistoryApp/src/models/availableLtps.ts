  export type Ltp = {
    key: string
  }

  export type Bucket={ 
    buckets: Ltp[]
  }

/**
 * Represents distinct available ltps using elasticsearch aggregations structure.
 */
  export type DistinctLtp = {
    "uuid-interface": Bucket
  }
