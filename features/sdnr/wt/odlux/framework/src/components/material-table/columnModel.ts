
import * as React from 'react';

export enum ColumnType {
  text,
  numeric,
  custom
}

type CustomControl<TData> = {
  rowData: TData
}

export type ColumnModel<TData> = {
  property: string ;
  title?: string;
  type?: ColumnType;
  disablePadding?: boolean;
  width?: string | number;
  disableSorting?: boolean;
  disableFilter?: boolean;
  customControl?: React.ComponentType<CustomControl<TData>>;  
}