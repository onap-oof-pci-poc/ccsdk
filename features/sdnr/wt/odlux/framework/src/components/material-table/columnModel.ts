
import * as React from 'react';

export enum ColumnType {
  text,
  numeric,
  boolean,
  custom
}

type CustomControl<TData> = {
  className?: string;
  style?: React.CSSProperties;
  rowData: TData;
}

export type ColumnModel<TData> = {
  title?: string;
  disablePadding?: boolean;
  width?: string | number;
  className?: string;
  style?: React.CSSProperties;
  align?: 'inherit' | 'left' | 'center' | 'right' | 'justify';
  disableSorting?: boolean;
  disableFilter?: boolean;
} & ({
  property: string;
  type: ColumnType.custom;
  customControl: React.ComponentType<CustomControl<TData>>;
} | {
  property: keyof TData;
  type: ColumnType.boolean;
  labels?: { "true": string, "false": string };
} | {
    property: keyof TData;
    type?: ColumnType.numeric | ColumnType.text;
});