
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
  title?: string;
  disablePadding?: boolean;
  width?: string | number;
  disableSorting?: boolean;
  disableFilter?: boolean;
} & ({
  property: string;
  type: ColumnType.custom;
  customControl: React.ComponentType<CustomControl<TData>>;
} | {
  property: keyof TData;
  type?: ColumnType.numeric | ColumnType.text;
});