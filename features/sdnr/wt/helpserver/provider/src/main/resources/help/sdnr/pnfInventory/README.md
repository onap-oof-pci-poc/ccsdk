# Inventory

The application offers basic inventory management of devices supporting ONF-TR-512. 

The view displays the inventory data of the network element - basically serial-numbers and part-numbers are displaced according to the containment of the equipment.

##### Inventory Export:

As the default pagination size is set to 10, when you export the data only first 10 rows or the first 10 filtered rows shown on the page will be exported to a file.
The inventory export allows the export of up to 1000 entries, when the pagination size is increased to 1000. 
So, It is recommended to change the pagination size 'Rows per page' to 1000 if you want to export the complete Inventory data. 

To export the Inventory data:
The behaviour is different depending on the browser:

a) Some browsers allows you to save the file with the predefined name export.csv. In case your browser does not offer this function please use 'Save as..' 
   option and define the filename with extension csv. 

b) Some browsers saves the file automatically with the alphanumeric name without an extension. In such case please go to the downloaded file location and rename the file
   with the extension after the download. (eg: export_file.csv)

