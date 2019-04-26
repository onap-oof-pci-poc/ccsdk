export interface AccessFlags {
  "read": boolean,
  "write": boolean,
  "create": boolean
}

export interface ViewElementBase {
  "id": string;
  "label": string;
  "viewId": string;
  "leafrefPath": string;
  "accessFlags": AccessFlags;
  "description": string;
}

export interface ViewElementString extends ViewElementBase {
  "uiType": "string";
}

export interface ViewElementNumber extends ViewElementBase {
  "uiType": "number";
  "min"?: number;
  "max"?: number;
  "unit"?: string;
  "format"?: string;
}

export interface ViewElementBoolean extends ViewElementBase {
  "uiType": "boolean";
  "trueValue"?: string;
  "falseValue"?: string;
}

export interface ViewElementObject extends ViewElementBase {
  "uiType": "object";
  "viewId": string;
}

export interface ViewElementSelection extends ViewElementBase {
  "uiType": "selection";
  "multiSelect"?: boolean
  "options": {
    "key": string,
    "value": string,
    "description": string
  }[],
}

export interface ViewElementList extends ViewElementBase {
  "uiType": "list",
  "listType": "object" | "string" | "number",
  "viewId": string,
}

export type ViewElement =
  | ViewElementString
  | ViewElementNumber
  | ViewElementBoolean
  | ViewElementObject
  | ViewElementSelection
  | ViewElementList;

export interface ViewSpecification {
  "id": string;
  "parentView": string;
  "name": string;
  "language": string;
  "title"?: string;
  "url": string;
  "dataPath": string;
  "elements": ViewElement[];
}

