export type MediatorServer = {
   _id: string;
   name: string;
   url: string;
} 

export type XmlFileInfo = {
   filename: string;
   version: string;
} 

export type MediatorServerVersionInfo = {
   mediator: string;
   server: string;
   nexmls: XmlFileInfo[]; 
} 

export type ODLConfig = {
   User: string;
   Password: string;
   Port: number;
   Protocol: "http" | "https";
   Server: string;
   Trustall: boolean;
}; 

export const BusySymbol = Symbol("Busy");

export type MediatorConfig = {
   Name: string;
   DeviceIp: string;
   DevicePort: number;
   DeviceType: number;
   TrapPort: number;
   NcUsername: string;
   NcPassword: string;
   NcPort: number;
   NeXMLFile: string;
   ODLConfig: ODLConfig[];
}

export type MediatorConfigResponse = MediatorConfig & {
   IsNCConnected: boolean;
   IsNeConnected: boolean;
   autorun: boolean;
   fwactive: boolean;
   islocked: boolean;
   ncconnections:{}[];
   pid: number;
   // extended properties
   [BusySymbol]: boolean;
} 

export type MediatorServerDevice = {
  id: number;       // DeviceType
  device: string; 
  vendor: string;
  version: string;
  xml: string;      // NeXMLFile
}